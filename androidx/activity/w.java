package androidx.activity;

import android.window.OnBackInvokedCallback;
import y3.a;

public final class w implements OnBackInvokedCallback {
    public final a a;

    public w(a a0) {
        this.a = a0;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        f.c(this.a);
    }
}

