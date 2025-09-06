package m1;

import java.util.concurrent.Executor;

class n implements Executor {
    static class a implements Runnable {
        private final Runnable f;

        a(Runnable runnable0) {
            this.f = runnable0;
        }

        @Override
        public void run() {
            try {
                this.f.run();
            }
            catch(Exception exception0) {
                q1.a.d("Executor", "Background execution failure.", exception0);
            }
        }
    }

    private final Executor f;

    n(Executor executor0) {
        this.f = executor0;
    }

    @Override
    public void execute(Runnable runnable0) {
        a n$a0 = new a(runnable0);
        this.f.execute(n$a0);
    }
}

