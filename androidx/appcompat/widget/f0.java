package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final class f0 implements OnBackInvokedCallback {
    public final Runnable a;

    public f0(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.run();
    }
}

