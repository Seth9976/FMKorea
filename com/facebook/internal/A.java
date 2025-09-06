package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.e;
import com.facebook.h;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.TWR;
import z3.g;
import z3.k;

public final class a {
    public static final class com.facebook.internal.a.a {
        private com.facebook.internal.a.a() {
        }

        public com.facebook.internal.a.a(g g0) {
        }

        private final a a(a a0) {
            a0.b = System.currentTimeMillis();
            this.j(a0);
            return a0;
        }

        private final a b(Context context0) {
            a a0 = this.c(context0);
            if(a0 == null) {
                a0 = this.d(context0);
                return a0 == null ? new a() : a0;
            }
            return a0;
        }

        private final a c(Context context0) {
            try {
                boolean z = false;
                if(!this.h(context0)) {
                    return null;
                }
                Method method0 = F.A("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class});
                if(method0 != null) {
                    Object object0 = F.H(null, method0, new Object[]{context0});
                    if(object0 != null) {
                        Method method1 = F.z(object0.getClass(), "getId", new Class[0]);
                        Method method2 = F.z(object0.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                        if(method1 != null && method2 != null) {
                            a a0 = new a();
                            a0.a = (String)F.H(object0, method1, new Object[0]);
                            Boolean boolean0 = (Boolean)F.H(object0, method2, new Object[0]);
                            if(boolean0 != null) {
                                z = boolean0.booleanValue();
                            }
                            a0.e = z;
                            return a0;
                        }
                    }
                }
                return null;
            }
            catch(Exception exception0) {
            }
            F.U("android_id", exception0);
            return null;
        }

        private final a d(Context context0) {
            c a$c0 = new c();
            Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent0.setPackage("com.google.android.gms");
            if(context0.bindService(intent0, a$c0, 1)) {
                try {
                    b a$b0 = new b(a$c0.a());
                    a a0 = new a();
                    a0.a = a$b0.v();
                    a0.e = a$b0.w();
                    return a0;
                }
                catch(Exception exception0) {
                    F.U("android_id", exception0);
                }
                finally {
                    context0.unbindService(a$c0);
                }
            }
            return null;
        }

        public final a e(Context context0) {
            Cursor cursor2;
            a a2;
            Cursor cursor1;
            Cursor cursor0;
            Uri uri0;
            k.e(context0, "context");
            a a0 = this.b(context0);
            try {
                if(k.a(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new e("getAttributionIdentifiers cannot be called on the main thread.");
                }
                a a1 = this.f();
                if(a1 != null && System.currentTimeMillis() - a1.b < 3600000L) {
                    return a1;
                }
                ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo providerInfo1 = context0.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if(providerInfo0 == null) {
                label_15:
                    if(providerInfo1 == null) {
                        uri0 = null;
                    }
                    else {
                        String s1 = providerInfo1.packageName;
                        k.d(s1, "wakizashiProviderInfo.packageName");
                        uri0 = j.a(context0, s1) ? Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider") : null;
                    }
                }
                else {
                    String s = providerInfo0.packageName;
                    k.d(s, "contentProviderInfo.packageName");
                    if(j.a(context0, s)) {
                        uri0 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        goto label_24;
                    }
                    goto label_15;
                }
            label_24:
                String s2 = this.g(context0);
                if(s2 != null) {
                    a0.d = s2;
                }
                if(uri0 == null) {
                    return this.a(a0);
                }
                cursor0 = context0.getContentResolver().query(uri0, new String[]{"aid", "androidid", "limit_tracking"}, null, null, null);
                goto label_37;
            label_32:
                cursor1 = null;
                goto label_53;
            }
            catch(Exception exception0) {
                goto label_32;
            }
            catch(Throwable throwable0) {
            }
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        label_37:
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst()) {
                        int v = cursor0.getColumnIndex("aid");
                        int v1 = cursor0.getColumnIndex("androidid");
                        int v2 = cursor0.getColumnIndex("limit_tracking");
                        a0.c = cursor0.getString(v);
                        if(v1 > 0 && v2 > 0 && a0.j() == null) {
                            a0.a = cursor0.getString(v1);
                            a0.e = Boolean.parseBoolean(cursor0.getString(v2));
                        }
                        goto label_46;
                    }
                    goto label_48;
                }
                catch(Exception exception1) {
                    goto label_51;
                }
                catch(Throwable throwable1) {
                    goto label_62;
                }
            label_46:
                cursor0.close();
                return this.a(a0);
            }
            try {
            label_48:
                a2 = this.a(a0);
                goto label_67;
            }
            catch(Exception exception1) {
            label_51:
                cursor1 = cursor0;
                exception0 = exception1;
                try {
                label_53:
                    F.V(a.f, "Caught unexpected exception in getAttributionId(): " + exception0);
                }
                catch(Throwable throwable0) {
                    cursor2 = cursor1;
                    goto label_64;
                }
                if(cursor1 != null) {
                    cursor1.close();
                }
                return null;
            }
            catch(Throwable throwable1) {
            label_62:
                cursor2 = cursor0;
                throwable0 = throwable1;
            }
        label_64:
            if(cursor2 != null) {
                cursor2.close();
            }
            throw throwable0;
        label_67:
            if(cursor0 != null) {
                cursor0.close();
            }
            return a2;
        }

        public final a f() {
            return a.g;
        }

        private final String g(Context context0) {
            PackageManager packageManager0 = context0.getPackageManager();
            return packageManager0 == null ? null : packageManager0.getInstallerPackageName("com.fmkorea.m.fmk");
        }

        private final boolean h(Context context0) {
            Method method0 = F.A("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[]{Context.class});
            if(method0 != null) {
                Object object0 = F.H(null, method0, new Object[]{context0});
                return object0 instanceof Integer && k.a(object0, 0);
            }
            return false;
        }

        public final boolean i(Context context0) {
            k.e(context0, "context");
            a a0 = this.e(context0);
            return a0 != null && a0.n();
        }

        private final void j(a a0) {
            a.g = a0;
        }
    }

    static final class b implements IInterface {
        public static final class com.facebook.internal.a.b.a {
            private com.facebook.internal.a.b.a() {
            }

            public com.facebook.internal.a.b.a(g g0) {
            }
        }

        private final IBinder f;
        public static final com.facebook.internal.a.b.a g;

        static {
            b.g = new com.facebook.internal.a.b.a(null);
        }

        public b(IBinder iBinder0) {
            k.e(iBinder0, "binder");
            super();
            this.f = iBinder0;
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this.f;
        }

        public final String v() {
            Parcel parcel0 = Parcel.obtain();
            k.d(parcel0, "Parcel.obtain()");
            Parcel parcel1 = Parcel.obtain();
            k.d(parcel1, "Parcel.obtain()");
            try {
                parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f.transact(1, parcel0, parcel1, 0);
                parcel1.readException();
                return parcel1.readString();
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
        }

        public final boolean w() {
            Parcel parcel0 = Parcel.obtain();
            k.d(parcel0, "Parcel.obtain()");
            Parcel parcel1 = Parcel.obtain();
            k.d(parcel1, "Parcel.obtain()");
            try {
                parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                parcel0.writeInt(1);
                this.f.transact(2, parcel0, parcel1, 0);
                parcel1.readException();
                if(parcel1.readInt() == 0) {
                    z = false;
                }
                return z;
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
        }
    }

    static final class c implements ServiceConnection {
        private final AtomicBoolean f;
        private final BlockingQueue g;

        public c() {
            this.f = new AtomicBoolean(false);
            this.g = new LinkedBlockingDeque();
        }

        public final IBinder a() {
            if(this.f.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object object0 = this.g.take();
            k.d(object0, "queue.take()");
            return (IBinder)object0;
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            if(iBinder0 != null) {
                try {
                    this.g.put(iBinder0);
                }
                catch(InterruptedException unused_ex) {
                }
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
        }
    }

    private String a;
    private long b;
    private String c;
    private String d;
    private boolean e;
    private static final String f;
    private static a g;
    public static final com.facebook.internal.a.a h;

    static {
        a.h = new com.facebook.internal.a.a(null);
        a.f = a.class.getCanonicalName();
    }

    // 去混淆评级： 低(20)
    public final String j() {
        return !h.v() || !h.d() ? null : this.a;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.c;
    }

    public static final a m(Context context0) {
        return a.h.e(context0);
    }

    public final boolean n() {
        return this.e;
    }

    public static final boolean o(Context context0) {
        return a.h.i(context0);
    }
}

