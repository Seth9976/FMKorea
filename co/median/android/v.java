package co.median.android;

import android.webkit.JavascriptInterface;

public class v {
    public interface a {
        void a(String arg1);
    }

    private final a a;

    public v(a v$a0) {
        this.a = v$a0;
    }

    @JavascriptInterface
    public void postMessage(String s) {
        this.a.a(s);
    }
}

