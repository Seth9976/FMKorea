package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class p {
    static abstract class a {
        static boolean a(NotificationManager notificationManager0) {
            return notificationManager0.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager0) {
            return notificationManager0.getImportance();
        }
    }

    static class b implements e {
        final String a;
        final int b;
        final String c;
        final Notification d;

        b(String s, int v, String s1, Notification notification0) {
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = notification0;
        }

        @Override  // androidx.core.app.p$e
        public void a(INotificationSideChannel iNotificationSideChannel0) {
            iNotificationSideChannel0.notify(this.a, this.b, this.c, this.d);
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
        }
    }

    static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName0, IBinder iBinder0) {
            this.a = componentName0;
            this.b = iBinder0;
        }
    }

    static class d implements ServiceConnection, Handler.Callback {
        static class androidx.core.app.p.d.a {
            final ComponentName a;
            boolean b;
            INotificationSideChannel c;
            ArrayDeque d;
            int e;

            androidx.core.app.p.d.a(ComponentName componentName0) {
                this.b = false;
                this.d = new ArrayDeque();
                this.e = 0;
                this.a = componentName0;
            }
        }

        private final Context f;
        private final HandlerThread g;
        private final Handler h;
        private final Map i;
        private Set j;

        d(Context context0) {
            this.i = new HashMap();
            this.j = new HashSet();
            this.f = context0;
            HandlerThread handlerThread0 = new HandlerThread("NotificationManagerCompat");
            this.g = handlerThread0;
            handlerThread0.start();
            this.h = new Handler(handlerThread0.getLooper(), this);
        }

        private boolean a(androidx.core.app.p.d.a p$d$a0) {
            if(p$d$a0.b) {
                return true;
            }
            Intent intent0 = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(p$d$a0.a);
            boolean z = this.f.bindService(intent0, this, 33);
            p$d$a0.b = z;
            if(z) {
                p$d$a0.e = 0;
                return p$d$a0.b;
            }
            Log.w("NotifManCompat", "Unable to bind to listener " + p$d$a0.a);
            this.f.unbindService(this);
            return p$d$a0.b;
        }

        private void b(androidx.core.app.p.d.a p$d$a0) {
            if(p$d$a0.b) {
                this.f.unbindService(this);
                p$d$a0.b = false;
            }
            p$d$a0.c = null;
        }

        private void c(e p$e0) {
            this.j();
            for(Object object0: this.i.values()) {
                ((androidx.core.app.p.d.a)object0).d.add(p$e0);
                this.g(((androidx.core.app.p.d.a)object0));
            }
        }

        private void d(ComponentName componentName0) {
            androidx.core.app.p.d.a p$d$a0 = (androidx.core.app.p.d.a)this.i.get(componentName0);
            if(p$d$a0 != null) {
                this.g(p$d$a0);
            }
        }

        private void e(ComponentName componentName0, IBinder iBinder0) {
            androidx.core.app.p.d.a p$d$a0 = (androidx.core.app.p.d.a)this.i.get(componentName0);
            if(p$d$a0 != null) {
                p$d$a0.c = Stub.asInterface(iBinder0);
                p$d$a0.e = 0;
                this.g(p$d$a0);
            }
        }

        private void f(ComponentName componentName0) {
            androidx.core.app.p.d.a p$d$a0 = (androidx.core.app.p.d.a)this.i.get(componentName0);
            if(p$d$a0 != null) {
                this.b(p$d$a0);
            }
        }

        private void g(androidx.core.app.p.d.a p$d$a0) {
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + p$d$a0.a + ", " + p$d$a0.d.size() + " queued tasks");
            }
            if(p$d$a0.d.isEmpty()) {
                return;
            }
            if(this.a(p$d$a0) && p$d$a0.c != null) {
                e p$e0;
                while((p$e0 = (e)p$d$a0.d.peek()) != null) {
                    try {
                        if(Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + p$e0);
                        }
                        p$e0.a(p$d$a0.c);
                        p$d$a0.d.remove();
                        continue;
                    }
                    catch(DeadObjectException unused_ex) {
                    }
                    catch(RemoteException remoteException0) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + p$d$a0.a, remoteException0);
                        break;
                    }
                    if(!Log.isLoggable("NotifManCompat", 3)) {
                        break;
                    }
                    Log.d("NotifManCompat", "Remote service has died: " + p$d$a0.a);
                    break;
                }
                if(!p$d$a0.d.isEmpty()) {
                    this.i(p$d$a0);
                }
                return;
            }
            this.i(p$d$a0);
        }

        public void h(e p$e0) {
            this.h.obtainMessage(0, p$e0).sendToTarget();
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            switch(message0.what) {
                case 0: {
                    this.c(((e)message0.obj));
                    return true;
                }
                case 1: {
                    this.e(((c)message0.obj).a, ((c)message0.obj).b);
                    return true;
                }
                case 2: {
                    this.f(((ComponentName)message0.obj));
                    return true;
                }
                case 3: {
                    this.d(((ComponentName)message0.obj));
                    return true;
                }
                default: {
                    return false;
                }
            }
        }

        private void i(androidx.core.app.p.d.a p$d$a0) {
            if(this.h.hasMessages(3, p$d$a0.a)) {
                return;
            }
            int v = p$d$a0.e;
            p$d$a0.e = v + 1;
            if(v + 1 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + p$d$a0.d.size() + " tasks to " + p$d$a0.a + " after " + p$d$a0.e + " retries");
                p$d$a0.d.clear();
                return;
            }
            int v1 = (1 << v) * 1000;
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + v1 + " ms");
            }
            Message message0 = this.h.obtainMessage(3, p$d$a0.a);
            this.h.sendMessageDelayed(message0, ((long)v1));
        }

        private void j() {
            Set set0 = p.e(this.f);
            if(set0.equals(this.j)) {
                return;
            }
            this.j = set0;
            List list0 = this.f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                if(set0.contains(resolveInfo0.serviceInfo.packageName)) {
                    ComponentName componentName0 = new ComponentName(resolveInfo0.serviceInfo.packageName, resolveInfo0.serviceInfo.name);
                    if(resolveInfo0.serviceInfo.permission == null) {
                        hashSet0.add(componentName0);
                    }
                    else {
                        Log.w("NotifManCompat", "Permission present on component " + componentName0 + ", not adding listener record.");
                    }
                }
            }
            for(Object object1: hashSet0) {
                ComponentName componentName1 = (ComponentName)object1;
                if(!this.i.containsKey(componentName1)) {
                    if(Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName1);
                    }
                    androidx.core.app.p.d.a p$d$a0 = new androidx.core.app.p.d.a(componentName1);
                    this.i.put(componentName1, p$d$a0);
                }
            }
            Iterator iterator2 = this.i.entrySet().iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                Map.Entry map$Entry0 = (Map.Entry)object2;
                if(!hashSet0.contains(map$Entry0.getKey())) {
                    if(Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + map$Entry0.getKey());
                    }
                    this.b(((androidx.core.app.p.d.a)map$Entry0.getValue()));
                    iterator2.remove();
                }
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName0);
            }
            c p$c0 = new c(componentName0, iBinder0);
            this.h.obtainMessage(1, p$c0).sendToTarget();
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName0);
            }
            this.h.obtainMessage(2, componentName0).sendToTarget();
        }
    }

    interface e {
        void a(INotificationSideChannel arg1);
    }

    private final Context a;
    private final NotificationManager b;
    private static final Object c;
    private static String d;
    private static Set e;
    private static final Object f;
    private static d g;

    static {
        p.c = new Object();
        p.e = new HashSet();
        p.f = new Object();
    }

    private p(Context context0) {
        this.a = context0;
        this.b = (NotificationManager)context0.getSystemService("notification");
    }

    public boolean a() {
        if(Build.VERSION.SDK_INT >= 24) {
            return a.a(this.b);
        }
        AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
        int v = this.a.getApplicationInfo().uid;
        try {
            Method method0 = AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            Integer integer0 = (Integer)AppOpsManager.class.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            integer0.intValue();
            return ((int)(((Integer)method0.invoke(appOpsManager0, integer0, v, "com.fmkorea.m.fmk")))) == 0;
        }
        catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException unused_ex) {
            return true;
        }
    }

    public void b(int v) {
        this.c(null, v);
    }

    public void c(String s, int v) {
        this.b.cancel(s, v);
    }

    public static p d(Context context0) {
        return new p(context0);
    }

    public static Set e(Context context0) {
        String s = Settings.Secure.getString(context0.getContentResolver(), "enabled_notification_listeners");
        synchronized(p.c) {
            if(s != null && !s.equals(p.d)) {
                String[] arr_s = s.split(":", -1);
                HashSet hashSet0 = new HashSet(arr_s.length);
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    ComponentName componentName0 = ComponentName.unflattenFromString(arr_s[v1]);
                    if(componentName0 != null) {
                        hashSet0.add(componentName0.getPackageName());
                    }
                }
                p.e = hashSet0;
                p.d = s;
            }
            return p.e;
        }
    }

    public void f(int v, Notification notification0) {
        this.g(null, v, notification0);
    }

    public void g(String s, int v, Notification notification0) {
        if(p.i(notification0)) {
            this.h(new b("com.fmkorea.m.fmk", v, s, notification0));
            this.b.cancel(s, v);
            return;
        }
        this.b.notify(s, v, notification0);
    }

    private void h(e p$e0) {
        synchronized(p.f) {
            if(p.g == null) {
                p.g = new d(this.a.getApplicationContext());
            }
            p.g.h(p$e0);
        }
    }

    private static boolean i(Notification notification0) {
        Bundle bundle0 = m.a(notification0);
        return bundle0 != null && bundle0.getBoolean("android.support.useSideChannel");
    }
}

