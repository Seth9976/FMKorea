package a;

public abstract class b {
    private static final String a = "_COROUTINE";

    static {
    }

    private static final StackTraceElement b(Throwable throwable0, String s) {
        StackTraceElement stackTraceElement0 = throwable0.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE" + '.' + s, "_", stackTraceElement0.getFileName(), stackTraceElement0.getLineNumber());
    }
}

