package e2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum l implements Executor {
    INSTANCE;

    private static final Handler g;

    static {
        l.g = new Handler(Looper.getMainLooper());
    }

    @Override
    public void execute(Runnable runnable0) {
        l.g.post(runnable0);
    }
}

