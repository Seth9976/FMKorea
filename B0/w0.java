package B0;

import I0.j;
import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import co.median.android.m;

public class w0 extends WebViewClient {
    private d a;
    private final Activity b;

    public w0(Activity activity0, d q0$d0, m m0) {
        this.b = activity0;
        this.a = q0$d0;
        m0.setWebViewClient(this);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(WebView webView0, String s) {
        class a implements Runnable {
            final WebView f;
            final w0 g;

            a(WebView webView0) {
                this.f = webView0;
                super();
            }

            @Override
            public void run() {
                this.f.setWebViewClient(null);
            }
        }

        super.onPageFinished(webView0, s);
        new Handler(webView0.getContext().getMainLooper()).post(new a(this, webView0));
        this.a.b(this.b, ((j)webView0), s);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        String s = webResourceRequest0.getMethod();
        if(s != null && s.equalsIgnoreCase("GET")) {
            Uri uri0 = webResourceRequest0.getUrl();
            return uri0 == null || !uri0.getScheme().startsWith("http") ? null : this.shouldInterceptRequest(webView0, uri0.toString());
        }
        return null;
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        return this.a.a(this.b, ((j)webView0), s);
    }
}

