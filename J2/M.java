package j2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g2.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.c;
import k2.i;
import l2.D;
import o2.f;
import q2.d;

class m {
    private final Context a;
    private final u b;
    private final p c;
    private final i d;
    private final k e;
    private final y f;
    private final f g;
    private final a h;
    private final c i;
    private final g2.a j;
    private final h2.a k;
    private final N l;
    private s m;
    private q2.i n;
    final TaskCompletionSource o;
    final TaskCompletionSource p;
    final TaskCompletionSource q;
    final AtomicBoolean r;
    static final FilenameFilter s;

    static {
        m.s = (File file0, String s) -> m.K(file0, s);
    }

    m(Context context0, k k0, y y0, u u0, f f0, p p0, a a0, i i0, c c0, N n0, g2.a a1, h2.a a2) {
        this.n = null;
        this.o = new TaskCompletionSource();
        this.p = new TaskCompletionSource();
        this.q = new TaskCompletionSource();
        this.r = new AtomicBoolean(false);
        this.a = context0;
        this.e = k0;
        this.f = y0;
        this.b = u0;
        this.g = f0;
        this.c = p0;
        this.h = a0;
        this.d = i0;
        this.i = c0;
        this.j = a1;
        this.k = a2;
        this.l = n0;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    private String B() {
        SortedSet sortedSet0 = this.l.o();
        return sortedSet0.isEmpty() ? null : ((String)sortedSet0.first());
    }

    private static long C() [...] // 潜在的解密器

    static List D(g g0, String s, f f0, byte[] arr_b) {
        File file0 = f0.o(s, "user-data");
        File file1 = f0.o(s, "keys");
        List list0 = new ArrayList();
        list0.add(new j2.g("logs_file", "logs", arr_b));
        list0.add(new x("crash_meta_file", "metadata", g0.g()));
        list0.add(new x("session_meta_file", "session", g0.f()));
        list0.add(new x("app_meta_file", "app", g0.a()));
        list0.add(new x("device_meta_file", "device", g0.c()));
        list0.add(new x("os_meta_file", "os", g0.b()));
        list0.add(m.P(g0));
        list0.add(new x("user_meta_file", "user", file0));
        list0.add(new x("keys_file", "keys", file1));
        return list0;
    }

    private InputStream E(String s) {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        if(classLoader0 == null) {
            g2.f.f().k("Couldn\'t get Class Loader");
            return null;
        }
        InputStream inputStream0 = classLoader0.getResourceAsStream(s);
        if(inputStream0 == null) {
            g2.f.f().g("No version control information found");
            return null;
        }
        return inputStream0;
    }

    private static long F(long v) [...] // Inlined contents

    String G() {
        InputStream inputStream0 = this.E("META-INF/version-control-info.textproto");
        if(inputStream0 == null) {
            return null;
        }
        g2.f.f().b("Read version control info");
        return Base64.encodeToString(m.R(inputStream0), 0);
    }

    // 检测为 Lambda 实现
    void H(q2.i i0, Thread thread0, Throwable throwable0) [...]

    void I(q2.i i0, Thread thread0, Throwable throwable0, boolean z) {
        class b implements Callable {
            final long a;
            final Throwable b;
            final Thread c;
            final q2.i d;
            final boolean e;
            final m f;

            b(long v, Throwable throwable0, Thread thread0, q2.i i0, boolean z) {
                this.a = v;
                this.b = throwable0;
                this.c = thread0;
                this.d = i0;
                this.e = z;
                super();
            }

            public Task a() {
                class j2.m.b.a implements SuccessContinuation {
                    final Executor a;
                    final String b;
                    final b c;

                    j2.m.b.a(Executor executor0, String s) {
                        this.a = executor0;
                        this.b = s;
                        super();
                    }

                    public Task a(d d0) {
                        String s = null;
                        if(d0 == null) {
                            g2.f.f().k("Received null app settings, cannot send reports at crash time.");
                            return Tasks.forResult(null);
                        }
                        Task task0 = m.this.N();
                        N n0 = m.this.l;
                        Executor executor0 = this.a;
                        if(b.this.e) {
                            s = this.b;
                        }
                        return Tasks.whenAll(new Task[]{task0, n0.x(executor0, s)});
                    }

                    @Override  // com.google.android.gms.tasks.SuccessContinuation
                    public Task then(Object object0) {
                        return this.a(((d)object0));
                    }
                }

                long v = m.b(this.a);
                String s = m.this.B();
                if(s == null) {
                    g2.f.f().d("Tried to write a fatal exception while no session was open.");
                    return Tasks.forResult(null);
                }
                m.this.c.a();
                m.this.l.s(this.b, this.c, s, v);
                m.this.w(this.a);
                m.this.t(this.d);
                h h0 = new h(m.this.f);
                m.this.v(h0.toString());
                if(!m.this.b.d()) {
                    return Tasks.forResult(null);
                }
                Executor executor0 = m.this.e.c();
                return this.d.a().onSuccessTask(executor0, new j2.m.b.a(this, executor0, s));
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        synchronized(this) {
            g2.f.f().b("Handling uncaught exception \"" + throwable0 + "\" from thread " + thread0.getName());
            b m$b0 = new b(this, System.currentTimeMillis(), throwable0, thread0, i0, z);
            Task task0 = this.e.i(m$b0);
            try {
                V.f(task0);
            }
            catch(TimeoutException unused_ex) {
                g2.f.f().d("Cannot send reports. Timed out while fetching settings.");
            }
            catch(Exception exception0) {
                g2.f.f().e("Error handling uncaught exception", exception0);
            }
        }
    }

    boolean J() {
        return this.m != null && this.m.a();
    }

    private static boolean K(File file0, String s) {
        return s.startsWith(".ae");
    }

    List L() {
        return this.g.f(m.s);
    }

    private Task M(long v) {
        class j2.m.h implements Callable {
            final long a;
            final m b;

            j2.m.h(long v) {
                this.a = v;
                super();
            }

            public Void a() {
                Bundle bundle0 = new Bundle();
                bundle0.putInt("fatal", 1);
                bundle0.putLong("timestamp", this.a);
                m.f(m.this).a("_ae", bundle0);
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        if(m.A()) {
            g2.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        g2.f.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new j2.m.h(this, v));
    }

    private Task N() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.L()) {
            File file0 = (File)object0;
            try {
                arrayList0.add(this.M(Long.parseLong(file0.getName().substring(3))));
            }
            catch(NumberFormatException unused_ex) {
                g2.f.f().k("Could not parse app exception timestamp from file " + file0.getName());
            }
            file0.delete();
        }
        return Tasks.whenAll(arrayList0);
    }

    private static boolean O(String s, File file0, l2.B.a b$a0) {
        if(file0 == null || !file0.exists()) {
            g2.f.f().k("No minidump data found for session " + s);
        }
        if(b$a0 == null) {
            g2.f.f().g("No Tombstones data found for session " + s);
        }
        return (file0 == null || !file0.exists()) && b$a0 == null;
    }

    private static B P(g g0) {
        File file0 = g0.e();
        return file0 != null && file0.exists() ? new x("minidump_file", "minidump", file0) : new j2.g("minidump_file", "minidump", new byte[]{0});
    }

    void Q(String s) {
        class j2.m.g implements Callable {
            final String a;
            final m b;

            j2.m.g(String s) {
                this.a = s;
                super();
            }

            public Void a() {
                m.this.v(this.a);
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        j2.m.g m$g0 = new j2.m.g(this, s);
        this.e.h(m$g0);
    }

    private static byte[] R(InputStream inputStream0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    void S() {
        try {
            String s = this.G();
            if(s != null) {
                this.T("com.crashlytics.version-control-info", s);
                g2.f.f().g("Saved version control info");
            }
        }
        catch(IOException iOException0) {
            g2.f.f().l("Unable to save version control info", iOException0);
        }
    }

    void T(String s, String s1) {
        try {
            this.d.l(s, s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(this.a != null && j2.i.x(this.a)) {
                throw illegalArgumentException0;
            }
            g2.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void U(String s) {
        this.d.m(s);
    }

    Task V(Task task0) {
        class j2.m.d implements SuccessContinuation {
            final Task a;
            final m b;

            j2.m.d(Task task0) {
                this.a = task0;
                super();
            }

            public Task a(Boolean boolean0) {
                class j2.m.d.a implements Callable {
                    final Boolean a;
                    final j2.m.d b;

                    j2.m.d.a(Boolean boolean0) {
                        this.a = boolean0;
                        super();
                    }

                    public Task a() {
                        class j2.m.d.a.a implements SuccessContinuation {
                            final Executor a;
                            final j2.m.d.a b;

                            j2.m.d.a.a(Executor executor0) {
                                this.a = executor0;
                                super();
                            }

                            public Task a(d d0) {
                                if(d0 == null) {
                                    g2.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                                    return Tasks.forResult(null);
                                }
                                m.this.N();
                                m.this.l.w(this.a);
                                m.this.q.trySetResult(null);
                                return Tasks.forResult(null);
                            }

                            @Override  // com.google.android.gms.tasks.SuccessContinuation
                            public Task then(Object object0) {
                                return this.a(((d)object0));
                            }
                        }

                        if(!this.a.booleanValue()) {
                            g2.f.f().i("Deleting cached crash reports...");
                            m.r(m.this.L());
                            m.this.l.v();
                            m.this.q.trySetResult(null);
                            return Tasks.forResult(null);
                        }
                        g2.f.f().b("Sending cached crash reports...");
                        m.this.b.c(this.a.booleanValue());
                        Executor executor0 = m.this.e.c();
                        j2.m.d.a.a m$d$a$a0 = new j2.m.d.a.a(this, executor0);
                        return j2.m.d.this.a.onSuccessTask(executor0, m$d$a$a0);
                    }

                    @Override
                    public Object call() {
                        return this.a();
                    }
                }

                j2.m.d.a m$d$a0 = new j2.m.d.a(this, boolean0);
                return m.this.e.i(m$d$a0);
            }

            @Override  // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object object0) {
                return this.a(((Boolean)object0));
            }
        }

        if(!this.l.m()) {
            g2.f.f().i("No crash reports are available to be sent.");
            this.o.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        g2.f.f().i("Crash reports are available to be sent.");
        return this.W().onSuccessTask(new j2.m.d(this, task0));
    }

    private Task W() {
        class j2.m.c implements SuccessContinuation {
            final m a;

            public Task a(Void void0) {
                return Tasks.forResult(Boolean.TRUE);
            }

            @Override  // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object object0) {
                return this.a(((Void)object0));
            }
        }

        if(this.b.d()) {
            g2.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.o.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        g2.f.f().b("Automatic data collection is disabled.");
        g2.f.f().i("Notifying that unsent reports are available.");
        this.o.trySetResult(Boolean.TRUE);
        Task task0 = this.b.i().onSuccessTask(new j2.m.c(this));
        g2.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return V.n(task0, this.p.getTask());
    }

    private void X(String s) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            List list0 = ((ActivityManager)this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if(list0.size() != 0) {
                c c0 = new c(this.g, s);
                i i0 = i.i(s, this.g, this.e);
                this.l.u(s, list0, c0, i0);
                return;
            }
            g2.f.f().i("No ApplicationExitInfo available. Session: " + s);
            return;
        }
        g2.f.f().i("ANR feature enabled, but device is API " + v);
    }

    void Y(Thread thread0, Throwable throwable0) {
        class j2.m.f implements Runnable {
            final long f;
            final Throwable g;
            final Thread h;
            final m i;

            j2.m.f(long v, Throwable throwable0, Thread thread0) {
                this.f = v;
                this.g = throwable0;
                this.h = thread0;
                super();
            }

            @Override
            public void run() {
                if(!m.this.J()) {
                    long v = m.b(this.f);
                    String s = m.this.B();
                    if(s == null) {
                        g2.f.f().k("Tried to write a non-fatal exception while no session was open.");
                        return;
                    }
                    m.this.l.t(this.g, this.h, s, v);
                }
            }
        }

        j2.m.f m$f0 = new j2.m.f(this, System.currentTimeMillis(), throwable0, thread0);
        this.e.g(m$f0);
    }

    void Z(long v, String s) {
        class e implements Callable {
            final long a;
            final String b;
            final m c;

            e(long v, String s) {
                this.a = v;
                this.b = s;
                super();
            }

            public Void a() {
                if(!m.this.J()) {
                    m.this.i.g(this.a, this.b);
                }
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        e m$e0 = new e(this, v, s);
        this.e.h(m$e0);
    }

    // 检测为 Lambda 实现
    public static boolean a(File file0, String s) [...]

    static long b(long v) {
        return v / 1000L;
    }

    static h2.a f(m m0) {
        return m0.k;
    }

    private static l2.D.a o(y y0, a a0) {
        String s = y0.a().c();
        int v = v.b(a0.d).f();
        return l2.D.a.b(y0.f(), a0.f, a0.g, s, v, a0.h);
    }

    private static l2.D.b p() {
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
        return l2.D.b.c(j2.i.m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), j2.i.t(), v, j2.i.z(), j2.i.n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static l2.D.c q() {
        return l2.D.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, j2.i.A());
    }

    private static void r(List list0) {
        for(Object object0: list0) {
            ((File)object0).delete();
        }
    }

    boolean s() {
        if(!this.c.c()) {
            String s = this.B();
            return s != null && this.j.d(s);
        }
        g2.f.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void t(q2.i i0) {
        this.u(false, i0);
    }

    private void u(boolean z, q2.i i0) {
        ArrayList arrayList0 = new ArrayList(this.l.o());
        if(arrayList0.size() <= ((int)z)) {
            g2.f.f().i("No open sessions to be closed.");
            return;
        }
        String s = (String)arrayList0.get(((int)z));
        if(i0.b().b.b) {
            this.X(s);
        }
        else {
            g2.f.f().i("ANR feature disabled.");
        }
        if(this.j.d(s)) {
            this.y(s);
        }
        String s1 = ((int)z) == 0 ? null : ((String)arrayList0.get(0));
        this.l.j(0x68BB6A6AL, s1);
    }

    private void v(String s) {
        g2.f.f().b("Opening a new session with ID " + s);
        Locale locale0 = Locale.US;
        D d0 = D.b(m.o(this.f, this.h), m.q(), m.p());
        this.j.a(s, String.format(locale0, "Crashlytics Android SDK/%s", "18.4.0"), 0x68BB6A71L, d0);
        this.i.e(s);
        this.l.p(s, 0x68BB6A71L);
    }

    private void w(long v) {
        try {
            if(!this.g.e(".ae" + v).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        }
        catch(IOException iOException0) {
            g2.f.f().l("Could not create app exception marker file.", iOException0);
        }
    }

    void x(String s, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, q2.i i0) {
        class j2.m.a implements j2.s.a {
            final m a;

            @Override  // j2.s$a
            public void a(q2.i i0, Thread thread0, Throwable throwable0) {
                m.this.H(i0, thread0, throwable0);
            }
        }

        this.n = i0;
        this.Q(s);
        s s1 = new s((q2.i i0, Thread thread0, Throwable throwable0) -> m.this.I(i0, thread0, throwable0, false), i0, thread$UncaughtExceptionHandler0, this.j);
        this.m = s1;
        Thread.setDefaultUncaughtExceptionHandler(s1);
    }

    private void y(String s) {
        g2.f.f().i("Finalizing native report for session " + s);
        g g0 = this.j.b(s);
        File file0 = g0.e();
        l2.B.a b$a0 = g0.d();
        if(m.O(s, file0, b$a0)) {
            g2.f.f().k("No native core present");
            return;
        }
        long v = file0.lastModified();
        c c0 = new c(this.g, s);
        File file1 = this.g.i(s);
        if(!file1.isDirectory()) {
            g2.f.f().k("Couldn\'t create directory to store native session files, aborting.");
            return;
        }
        this.w(v);
        byte[] arr_b = c0.b();
        List list0 = m.D(g0, s, this.g, arr_b);
        C.b(file1, list0);
        g2.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.l.i(s, list0, b$a0);
        c0.a();
    }

    boolean z(q2.i i0) {
        this.e.b();
        if(this.J()) {
            g2.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        g2.f.f().i("Finalizing previously open sessions.");
        try {
            this.u(true, i0);
        }
        catch(Exception exception0) {
            g2.f.f().e("Unable to finalize previously open sessions.", exception0);
            return false;
        }
        g2.f.f().i("Closed all previously open sessions.");
        return true;
    }
}

