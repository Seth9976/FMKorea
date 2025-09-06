package p2;

import java.util.concurrent.CountDownLatch;

public final class d implements Runnable {
    public final e f;
    public final CountDownLatch g;

    public d(e e0, CountDownLatch countDownLatch0) {
        this.f = e0;
        this.g = countDownLatch0;
    }

    @Override
    public final void run() {
        e.b(this.f, this.g);
    }
}

