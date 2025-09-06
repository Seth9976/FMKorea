package y0;

import java.util.concurrent.Executor;

public class w implements Executor {
    @Override
    public void execute(Runnable runnable0) {
        runnable0.run();
    }
}

