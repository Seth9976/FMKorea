package y0;

import androidx.work.WorkerParameters.a;
import androidx.work.impl.F;
import androidx.work.impl.v;

public class u implements Runnable {
    private F f;
    private v g;
    private a h;

    public u(F f0, v v0, a workerParameters$a0) {
        this.f = f0;
        this.g = v0;
        this.h = workerParameters$a0;
    }

    @Override
    public void run() {
        this.f.o().q(this.g, this.h);
    }
}

