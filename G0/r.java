package g0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r {
    private final String a;
    private final o b;
    private final Executor c;
    private final Context d;
    private int e;
    public c f;
    private k g;
    private final j h;
    private final AtomicBoolean i;
    private final ServiceConnection j;
    private final Runnable k;
    private final Runnable l;

    public r(Context context0, String s, Intent intent0, o o0, Executor executor0) {
        public static final class a extends c {
            final r b;

            a(r r0, String[] arr_s) {
                this.b = r0;
                super(arr_s);
            }

            @Override  // g0.o$c
            public boolean b() {
                return true;
            }

            @Override  // g0.o$c
            public void c(Set set0) {
                z3.k.e(set0, "tables");
                if(this.b.j().get()) {
                    return;
                }
                try {
                    k k0 = this.b.h();
                    if(k0 != null) {
                        Object[] arr_object = set0.toArray(new String[0]);
                        z3.k.c(arr_object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        k0.s(this.b.c(), ((String[])arr_object));
                    }
                }
                catch(RemoteException remoteException0) {
                    Log.w("ROOM", "Cannot broadcast invalidation", remoteException0);
                }
            }
        }


        public static final class b extends g0.j.a {
            final r f;

            b(r r0) {
                this.f = r0;
                super();
            }

            @Override  // g0.j
            public void c(String[] arr_s) {
                z3.k.e(arr_s, "tables");
                this.f.d().execute(() -> {
                    z3.k.e(this.f, "this$0");
                    z3.k.e(arr_s, "$tables");
                    this.f.e().j(((String[])Arrays.copyOf(arr_s, arr_s.length)));
                });
            }

            // 检测为 Lambda 实现
            private static final void x(r r0, String[] arr_s) [...]
        }


        public static final class g0.r.c implements ServiceConnection {
            final r f;

            g0.r.c(r r0) {
                this.f = r0;
                super();
            }

            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
                z3.k.e(componentName0, "name");
                z3.k.e(iBinder0, "service");
                k k0 = g0.k.a.v(iBinder0);
                this.f.m(k0);
                Runnable runnable0 = this.f.i();
                this.f.d().execute(runnable0);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName0) {
                z3.k.e(componentName0, "name");
                Runnable runnable0 = this.f.g();
                this.f.d().execute(runnable0);
                this.f.m(null);
            }
        }

        z3.k.e(context0, "context");
        z3.k.e(s, "name");
        z3.k.e(intent0, "serviceIntent");
        z3.k.e(o0, "invalidationTracker");
        z3.k.e(executor0, "executor");
        super();
        this.a = s;
        this.b = o0;
        this.c = executor0;
        Context context1 = context0.getApplicationContext();
        this.d = context1;
        this.h = new b(this);
        this.i = new AtomicBoolean(false);
        g0.r.c r$c0 = new g0.r.c(this);
        this.j = r$c0;
        this.k = () -> r.n(this);
        this.l = () -> r.k(this);
        Object[] arr_object = o0.h().keySet().toArray(new String[0]);
        z3.k.c(arr_object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.l(new a(this, ((String[])arr_object)));
        context1.bindService(intent0, r$c0, 1);
    }

    // 检测为 Lambda 实现
    public static void a(r r0) [...]

    // 检测为 Lambda 实现
    public static void b(r r0) [...]

    public final int c() {
        return this.e;
    }

    public final Executor d() {
        return this.c;
    }

    public final o e() {
        return this.b;
    }

    public final c f() {
        c o$c0 = this.f;
        if(o$c0 != null) {
            return o$c0;
        }
        z3.k.p("observer");
        return null;
    }

    public final Runnable g() {
        return this.l;
    }

    public final k h() {
        return this.g;
    }

    public final Runnable i() {
        return this.k;
    }

    public final AtomicBoolean j() {
        return this.i;
    }

    private static final void k(r r0) {
        z3.k.e(r0, "this$0");
        c o$c0 = r0.f();
        r0.b.m(o$c0);
    }

    public final void l(c o$c0) {
        z3.k.e(o$c0, "<set-?>");
        this.f = o$c0;
    }

    public final void m(k k0) {
        this.g = k0;
    }

    private static final void n(r r0) {
        z3.k.e(r0, "this$0");
        k k0 = r0.g;
        if(k0 != null) {
            try {
                r0.e = k0.d(r0.h, r0.a);
                c o$c0 = r0.f();
                r0.b.b(o$c0);
            }
            catch(RemoteException remoteException0) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", remoteException0);
            }
        }
    }
}

