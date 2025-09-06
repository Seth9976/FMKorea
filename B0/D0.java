package B0;

import co.median.android.MainActivity;

public final class d0 implements Runnable {
    public final MainActivity f;
    public final String g;

    public d0(MainActivity mainActivity0, String s) {
        this.f = mainActivity0;
        this.g = s;
    }

    @Override
    public final void run() {
        this.f.H2(this.g);
    }
}

