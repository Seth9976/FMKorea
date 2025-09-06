package r2;

public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;

    public e(Throwable throwable0, d d0) {
        this.a = throwable0.getLocalizedMessage();
        this.b = throwable0.getClass().getName();
        this.c = d0.a(throwable0.getStackTrace());
        Throwable throwable1 = throwable0.getCause();
        this.d = throwable1 == null ? null : new e(throwable1, d0);
    }
}

