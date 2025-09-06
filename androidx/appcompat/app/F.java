package androidx.appcompat.app;

import android.content.Context;

public final class f implements Runnable {
    public final Context f;

    public f(Context context0) {
        this.f = context0;
    }

    @Override
    public final void run() {
        g.y(this.f);
    }
}

