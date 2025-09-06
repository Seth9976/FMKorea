package e0;

import java.util.concurrent.Executor;

public final class m implements Executor {
    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

