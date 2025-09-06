package B0;

import I0.d;
import co.median.android.MainActivity;

public final class o0 implements Runnable {
    public final MainActivity f;
    public final String g;
    public final d h;

    public o0(MainActivity mainActivity0, String s, d d0) {
        this.f = mainActivity0;
        this.g = s;
        this.h = d0;
    }

    @Override
    public final void run() {
        this.f.A2(this.g, this.h);
    }
}

