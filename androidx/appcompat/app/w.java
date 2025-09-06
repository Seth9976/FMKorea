package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;

public final class w implements OnBackInvokedCallback {
    public final i a;

    public w(i i0) {
        this.a = i0;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.G0();
    }
}

