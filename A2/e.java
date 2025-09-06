package a2;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.os.v;
import com.facebook.internal.q;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import d2.g;
import d2.o;
import d2.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z2.f;

public class e {
    public interface a {
        void onBackgroundStateChanged(boolean arg1);
    }

    static class b implements BackgroundStateChangeListener {
        private static AtomicReference a;

        static {
            b.a = new AtomicReference();
        }

        static void a(Context context0) {
            b.b(context0);
        }

        private static void b(Context context0) {
            if(context0.getApplicationContext() instanceof Application) {
                Application application0 = (Application)context0.getApplicationContext();
                if(b.a.get() == null) {
                    b e$b0 = new b();
                    if(q.a(b.a, null, e$b0)) {
                        BackgroundDetector.initialize(application0);
                        BackgroundDetector.getInstance().addListener(e$b0);
                    }
                }
            }
        }

        @Override  // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized(e.k) {
                for(Object object1: new ArrayList(e.l.values())) {
                    e e0 = (e)object1;
                    if(e0.e.get()) {
                        e0.x(z);
                    }
                }
            }
        }
    }

    static class c extends BroadcastReceiver {
        private final Context a;
        private static AtomicReference b;

        static {
            c.b = new AtomicReference();
        }

        public c(Context context0) {
            this.a = context0;
        }

        static void a(Context context0) {
            c.b(context0);
        }

        private static void b(Context context0) {
            if(c.b.get() == null) {
                c e$c0 = new c(context0);
                if(q.a(c.b, null, e$c0)) {
                    context0.registerReceiver(e$c0, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            synchronized(e.k) {
                for(Object object1: e.l.values()) {
                    ((e)object1).o();
                }
            }
            this.c();
        }
    }

    private final Context a;
    private final String b;
    private final l c;
    private final o d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final x g;
    private final B2.b h;
    private final List i;
    private final List j;
    private static final Object k;
    static final Map l;

    static {
        e.k = new Object();
        e.l = new androidx.collection.a();
    }

    protected e(Context context0, String s, l l0) {
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.a = (Context)Preconditions.checkNotNull(context0);
        this.b = Preconditions.checkNotEmpty(s);
        this.c = (l)Preconditions.checkNotNull(l0);
        m m0 = FirebaseInitProvider.b();
        N2.c.b("Firebase");
        N2.c.b("ComponentDiscovery");
        List list0 = g.c(context0, ComponentDiscoveryService.class).b();
        N2.c.a();
        N2.c.b("Runtime");
        d2.o.b o$b0 = o.m(e2.l.f).d(list0).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(d2.c.s(context0, Context.class, new Class[0])).b(d2.c.s(this, e.class, new Class[0])).b(d2.c.s(l0, l.class, new Class[0])).g(new N2.b());
        if(v.a(context0) && FirebaseInitProvider.c()) {
            o$b0.b(d2.c.s(m0, m.class, new Class[0]));
        }
        o o0 = o$b0.e();
        this.d = o0;
        N2.c.a();
        this.g = new x(() -> this.u(context0));
        this.h = o0.c(f.class);
        this.g((boolean z) -> this.v(z));
        N2.c.a();
    }

    // 检测为 Lambda 实现
    public static void a(e e0, boolean z) [...]

    // 检测为 Lambda 实现
    public static G2.a b(e e0, Context context0) [...]

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof e)) {
            return false;
        }
        String s = ((e)object0).l();
        return this.b.equals(s);
    }

    public void g(a e$a0) {
        this.h();
        if(this.e.get() && BackgroundDetector.getInstance().isInBackground()) {
            e$a0.onBackgroundStateChanged(true);
        }
        this.i.add(e$a0);
    }

    private void h() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    public Object i(Class class0) {
        this.h();
        return this.d.a(class0);
    }

    public Context j() {
        this.h();
        return this.a;
    }

    public static e k() {
        synchronized(e.k) {
            e e0 = (e)e.l.get("[DEFAULT]");
            if(e0 != null) {
                ((f)e0.h.get()).l();
                return e0;
            }
        }
        throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
    }

    public String l() {
        this.h();
        return this.b;
    }

    public l m() {
        this.h();
        return this.c;
    }

    public String n() {
        return Base64Utils.encodeUrlSafeNoPadding(this.l().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(this.m().c().getBytes(Charset.defaultCharset()));
    }

    private void o() {
        if(!v.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + this.l());
            c.a(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + this.l());
        boolean z = this.t();
        this.d.p(z);
        ((f)this.h.get()).l();
    }

    public static e p(Context context0) {
        l l0;
        synchronized(e.k) {
            if(e.l.containsKey("[DEFAULT]")) {
                return e.k();
            }
            l0 = l.a(context0);
            if(l0 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
        }
        return e.q(context0, l0);
    }

    public static e q(Context context0, l l0) {
        return e.r(context0, l0, "[DEFAULT]");
    }

    public static e r(Context context0, l l0, String s) {
        e e0;
        b.a(context0);
        String s1 = e.w(s);
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(e.k) {
            Preconditions.checkState(!e.l.containsKey(s1), "FirebaseApp name " + s1 + " already exists!");
            Preconditions.checkNotNull(context0, "Application context cannot be null.");
            e0 = new e(context0, s1, l0);
            e.l.put(s1, e0);
        }
        e0.o();
        return e0;
    }

    public boolean s() {
        this.h();
        return ((G2.a)this.g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(this.l());
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }

    private G2.a u(Context context0) {
        return new G2.a(context0, this.n(), ((y2.c)this.d.a(y2.c.class)));
    }

    private void v(boolean z) {
        if(!z) {
            ((f)this.h.get()).l();
        }
    }

    private static String w(String s) {
        return s.trim();
    }

    private void x(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for(Object object0: this.i) {
            ((a)object0).onBackgroundStateChanged(z);
        }
    }
}

