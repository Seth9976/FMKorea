package B0;

import android.webkit.CookieManager;

public final class n0 implements Runnable {
    public final CookieManager f;

    public n0(CookieManager cookieManager0) {
        this.f = cookieManager0;
    }

    @Override
    public final void run() {
        this.f.flush();
    }
}

