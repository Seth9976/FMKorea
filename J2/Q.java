package j2;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import l2.B.b;
import l2.B.e.d.c;
import l2.B;
import l2.C;
import q2.i;
import r2.d;
import r2.e;

public class q {
    private final Context a;
    private final y b;
    private final a c;
    private final d d;
    private final i e;
    private static final Map f;
    static final String g;

    static {
        HashMap hashMap0 = new HashMap();
        q.f = hashMap0;
        hashMap0.put("armeabi", 5);
        hashMap0.put("armeabi-v7a", 6);
        hashMap0.put("arm64-v8a", 9);
        hashMap0.put("x86", 0);
        hashMap0.put("x86_64", 1);
        q.g = "Crashlytics Android SDK/18.4.0";
    }

    public q(Context context0, y y0, a a0, d d0, i i0) {
        this.a = context0;
        this.b = y0;
        this.c = a0;
        this.d = d0;
        this.e = i0;
    }

    private l2.B.a a(l2.B.a b$a0) {
        if(this.e.b().b.c && this.c.c.size() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.c.c) {
                arrayList0.add(l2.B.a.a.a().d(((f)object0).c()).b(((f)object0).a()).c(((f)object0).b()).a());
            }
            C c0 = C.a(arrayList0);
            return l2.B.a.a().c(b$a0.c()).e(b$a0.e()).g(b$a0.g()).i(b$a0.i()).d(b$a0.d()).f(b$a0.f()).h(b$a0.h()).j(b$a0.j()).b(c0).a();
        }
        return l2.B.a.a().c(b$a0.c()).e(b$a0.e()).g(b$a0.g()).i(b$a0.i()).d(b$a0.d()).f(b$a0.f()).h(b$a0.h()).j(b$a0.j()).b(null).a();
    }

    private b b() {
        return B.b().j("18.4.0").f(this.c.a).g(this.b.a().c()).e(this.b.a().d()).c(this.c.f).d(this.c.g).i(4);
    }

    public l2.B.e.d c(l2.B.a b$a0) {
        int v = this.a.getResources().getConfiguration().orientation;
        return l2.B.e.d.a().f("anr").e(b$a0.i()).b(this.i(v, this.a(b$a0))).c(this.k(v)).a();
    }

    public l2.B.e.d d(Throwable throwable0, Thread thread0, String s, long v, int v1, int v2, boolean z) {
        int v3 = this.a.getResources().getConfiguration().orientation;
        e e0 = new e(throwable0, this.d);
        return l2.B.e.d.a().f(s).e(v).b(this.j(v3, e0, thread0, v1, v2, z)).c(this.k(v3)).a();
    }

    public B e(String s, long v) {
        return this.b().k(this.s(s, v)).a();
    }

    // 去混淆评级： 低(25)
    private static int f() {
        if(TextUtils.isEmpty("arm64-v8a")) {
            return 7;
        }
        Integer integer0 = (Integer)q.f.get("arm64-v8a");
        return integer0 == null ? 7 : ((int)integer0);
    }

    private l2.B.e.d.a.b.a g() {
        return l2.B.e.d.a.b.a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    private C h() {
        return C.c(new l2.B.e.d.a.b.a[]{this.g()});
    }

    private l2.B.e.d.a i(int v, l2.B.a b$a0) {
        return b$a0.c() == 100 ? l2.B.e.d.a.a().b(Boolean.FALSE).f(v).d(this.n(b$a0)).a() : l2.B.e.d.a.a().b(Boolean.TRUE).f(v).d(this.n(b$a0)).a();
    }

    private l2.B.e.d.a j(int v, e e0, Thread thread0, int v1, int v2, boolean z) {
        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = j2.i.j(this.c.e, this.a);
        if(activityManager$RunningAppProcessInfo0 != null) {
            return activityManager$RunningAppProcessInfo0.importance == 100 ? l2.B.e.d.a.a().b(Boolean.FALSE).f(v).d(this.o(e0, thread0, v1, v2, z)).a() : l2.B.e.d.a.a().b(Boolean.TRUE).f(v).d(this.o(e0, thread0, v1, v2, z)).a();
        }
        return l2.B.e.d.a.a().b(null).f(v).d(this.o(e0, thread0, v1, v2, z)).a();
    }

    private c k(int v) {
        j2.e e0 = j2.e.a(this.a);
        Float float0 = e0.b();
        int v1 = e0.c();
        boolean z = j2.i.p(this.a);
        long v2 = j2.i.t();
        long v3 = j2.i.a(this.a);
        long v4 = j2.i.b(Environment.getDataDirectory().getPath());
        return c.a().b((float0 == null ? null : float0.doubleValue())).c(v1).f(z).e(v).g(v2 - v3).d(v4).a();
    }

    private l2.B.e.d.a.b.c l(e e0, int v, int v1) {
        return this.m(e0, v, v1, 0);
    }

    private l2.B.e.d.a.b.c m(e e0, int v, int v1, int v2) {
        String s = e0.b;
        String s1 = e0.a;
        StackTraceElement[] arr_stackTraceElement = e0.c;
        int v3 = 0;
        if(arr_stackTraceElement == null) {
            arr_stackTraceElement = new StackTraceElement[0];
        }
        e e1 = e0.d;
        if(v2 >= v1) {
            e e2 = e1;
            while(e2 != null) {
                e2 = e2.d;
                ++v3;
            }
        }
        l2.B.e.d.a.b.c.a b$e$d$a$b$c$a0 = l2.B.e.d.a.b.c.a().f(s).e(s1).c(C.a(this.q(arr_stackTraceElement, v))).d(v3);
        if(e1 != null && v3 == 0) {
            b$e$d$a$b$c$a0.b(this.m(e1, v, v1, v2 + 1));
        }
        return b$e$d$a$b$c$a0.a();
    }

    private l2.B.e.d.a.b n(l2.B.a b$a0) {
        return l2.B.e.d.a.b.a().b(b$a0).e(this.v()).c(this.h()).a();
    }

    private l2.B.e.d.a.b o(e e0, Thread thread0, int v, int v1, boolean z) {
        return l2.B.e.d.a.b.a().f(this.y(e0, thread0, v, z)).d(this.l(e0, v, v1)).e(this.v()).c(this.h()).a();
    }

    private l2.B.e.d.a.b.e.b p(StackTraceElement stackTraceElement0, l2.B.e.d.a.b.e.b.a b$e$d$a$b$e$b$a0) {
        long v = 0L;
        long v1 = stackTraceElement0.isNativeMethod() ? Math.max(stackTraceElement0.getLineNumber(), 0L) : 0L;
        String s = stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName();
        String s1 = stackTraceElement0.getFileName();
        if(!stackTraceElement0.isNativeMethod() && stackTraceElement0.getLineNumber() > 0) {
            v = (long)stackTraceElement0.getLineNumber();
        }
        return b$e$d$a$b$e$b$a0.e(v1).f(s).b(s1).d(v).a();
    }

    private C q(StackTraceElement[] arr_stackTraceElement, int v) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
            arrayList0.add(this.p(arr_stackTraceElement[v1], l2.B.e.d.a.b.e.b.a().c(v)));
        }
        return C.a(arrayList0);
    }

    private l2.B.e.a r() {
        return l2.B.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    // 去混淆评级： 低(20)
    private l2.B.e s(String s, long v) {
        return l2.B.e.a().m(v).j(s).h("Crashlytics Android SDK/18.4.0").b(this.r()).l(this.u()).e(this.t()).i(3).a();
    }

    private l2.B.e.c t() {
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        int v = q.f();
        long v1 = j2.i.t();
        long v2 = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
        boolean z = j2.i.z();
        int v3 = j2.i.n();
        String s = Build.MANUFACTURER;
        String s1 = Build.PRODUCT;
        return l2.B.e.c.a().b(v).f(Build.MODEL).c(Runtime.getRuntime().availableProcessors()).h(v1).d(v2).i(z).j(v3).e(s).g(s1).a();
    }

    private l2.B.e.e u() {
        return l2.B.e.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(j2.i.A()).a();
    }

    private l2.B.e.d.a.b.d v() {
        return l2.B.e.d.a.b.d.a().d("0").c("0").b(0L).a();
    }

    private l2.B.e.d.a.b.e w(Thread thread0, StackTraceElement[] arr_stackTraceElement) {
        return this.x(thread0, arr_stackTraceElement, 0);
    }

    private l2.B.e.d.a.b.e x(Thread thread0, StackTraceElement[] arr_stackTraceElement, int v) {
        return l2.B.e.d.a.b.e.a().d(thread0.getName()).c(v).b(C.a(this.q(arr_stackTraceElement, v))).a();
    }

    private C y(e e0, Thread thread0, int v, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this.x(thread0, e0.c, v));
        if(z) {
            for(Object object0: Thread.getAllStackTraces().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                Thread thread1 = (Thread)map$Entry0.getKey();
                if(!thread1.equals(thread0)) {
                    StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])map$Entry0.getValue();
                    arrayList0.add(this.w(thread1, this.d.a(arr_stackTraceElement)));
                }
            }
        }
        return C.a(arrayList0);
    }
}

