package androidx.core.content.res;

import android.graphics.Typeface;

public final class i implements Runnable {
    public final e f;
    public final Typeface g;

    public i(e h$e0, Typeface typeface0) {
        this.f = h$e0;
        this.g = typeface0;
    }

    @Override
    public final void run() {
        this.f.g(this.g);
    }
}

