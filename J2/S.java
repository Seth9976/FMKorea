package j2;

import g2.f;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.i;

class s implements Thread.UncaughtExceptionHandler {
    interface a {
        void a(i arg1, Thread arg2, Throwable arg3);
    }

    private final a a;
    private final i b;
    private final Thread.UncaughtExceptionHandler c;
    private final g2.a d;
    private final AtomicBoolean e;

    public s(a s$a0, i i0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, g2.a a0) {
        this.a = s$a0;
        this.b = i0;
        this.c = thread$UncaughtExceptionHandler0;
        this.e = new AtomicBoolean(false);
        this.d = a0;
    }

    boolean a() {
        return this.e.get();
    }

    private boolean b(Thread thread0, Throwable throwable0) {
        if(thread0 == null) {
            f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if(throwable0 == null) {
            f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if(this.d.c()) {
            f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    @Override
    public void uncaughtException(Thread thread0, Throwable throwable0) {
        this.e.set(true);
        try {
            if(this.b(thread0, throwable0)) {
                this.a.a(this.b, thread0, throwable0);
            }
            else {
                f.f().b("Uncaught exception will not be recorded by Crashlytics.");
            }
        }
        catch(Exception exception0) {
            f.f().e("An error occurred in the uncaught exception handler", exception0);
        }
        finally {
            f.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread0, throwable0);
            this.e.set(false);
        }
    }
}

