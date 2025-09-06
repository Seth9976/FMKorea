package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

enum b implements Executor {
    INSTANCE;

    @Override
    public void execute(Runnable runnable0) {
        runnable0.run();
    }

    private static b[] f() [...] // Inlined contents

    @Override
    public String toString() {
        return "DirectExecutor";
    }
}

