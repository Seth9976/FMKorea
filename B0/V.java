package B0;

import co.median.android.d;

public final class v implements Runnable {
    public final d f;
    public final String g;

    public v(d d0, String s) {
        this.f = d0;
        this.g = s;
    }

    @Override
    public final void run() {
        this.f.z(this.g);
    }
}

