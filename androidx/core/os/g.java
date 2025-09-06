package androidx.core.os;

import B.h;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public abstract class g {
    static class a implements Executor {
        private final Handler f;

        a(Handler handler0) {
            this.f = (Handler)h.g(handler0);
        }

        @Override
        public void execute(Runnable runnable0) {
            Runnable runnable1 = (Runnable)h.g(runnable0);
            if(!this.f.post(runnable1)) {
                throw new RejectedExecutionException(this.f + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler0) {
        return new a(handler0);
    }
}

