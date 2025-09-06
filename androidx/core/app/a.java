package androidx.core.app;

import android.app.Activity;

public final class a implements Runnable {
    public final Activity f;

    public a(Activity activity0) {
        this.f = activity0;
    }

    @Override
    public final void run() {
        b.c(this.f);
    }
}

