package B0;

import co.median.android.MainActivity.o;

public final class p0 implements Runnable {
    public final o f;
    public final String g;

    public p0(o mainActivity$o0, String s) {
        this.f = mainActivity$o0;
        this.g = s;
    }

    @Override
    public final void run() {
        this.f.lambda$onReadyState$0(this.g);
    }
}

