package y0;

import androidx.work.impl.F;
import androidx.work.k;

public class v implements Runnable {
    private final F f;
    private final androidx.work.impl.v g;
    private final boolean h;
    private static final String i;

    static {
        v.i = "WM-StopWorkRunnable";
    }

    public v(F f0, androidx.work.impl.v v0, boolean z) {
        this.f = f0;
        this.g = v0;
        this.h = z;
    }

    @Override
    public void run() {
        boolean z = this.h ? this.f.o().t(this.g) : this.f.o().u(this.g);
        k.e().a("WM-StopWorkRunnable", "StopWorkRunnable for " + this.g.a().b() + "; Processor.stopWork = " + z);
    }
}

