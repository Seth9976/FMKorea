package I3;

import java.util.concurrent.CancellationException;

public abstract class f0 {
    public static final CancellationException a(String s, Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }
}

