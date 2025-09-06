package co.median.android;

import B0.J;
import B0.Q;
import B0.S0;
import I0.a;
import I0.g;
import I0.j;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;

public abstract class w {
    private static final String a = "co.median.android.w";

    static {
    }

    public static void a(m m0) {
        m0.setWebViewClient(null);
        m0.setWebChromeClient(null);
    }

    public static void b(j j0, Context context0) {
        if(!(j0 instanceof m)) {
            g.a().b("co.median.android.w", "Expected webview to be of class LeanWebView and not " + j0.getClass().getName());
            return;
        }
        a a0 = a.V(context0);
        WebSettings webSettings0 = ((m)j0).getSettings();
        if(a.V(context0).C3) {
            webSettings0.setBuiltInZoomControls(true);
        }
        else {
            webSettings0.setBuiltInZoomControls(false);
        }
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings0.setMinimumFontSize(1);
        webSettings0.setMinimumLogicalFontSize(1);
        webSettings0.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(((m)j0), true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setCacheMode(a0.B.g());
        webSettings0.setDatabaseEnabled(true);
        webSettings0.setSaveFormData(false);
        webSettings0.setSavePassword(false);
        if(TextUtils.isEmpty(a0.k)) {
            webSettings0.setUserAgentString(j0.getDefaultUserAgent() + " " + a0.j);
        }
        else {
            webSettings0.setUserAgentString(a0.k);
        }
        if(a0.I == 1) {
            webSettings0.setSupportMultipleWindows(false);
        }
        else {
            webSettings0.setSupportMultipleWindows(a0.s);
        }
        webSettings0.setGeolocationEnabled(a0.s1.d());
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        int v = a0.k1;
        if(v > 0) {
            webSettings0.setTextZoom(v);
        }
    }

    public static void c(j j0, MainActivity mainActivity0) {
        if(!(j0 instanceof m)) {
            g.a().b("co.median.android.w", "Expected webview to be of class LeanWebView and not " + j0.getClass().getName());
            return;
        }
        w.b(((m)j0), mainActivity0);
        u u0 = new u(mainActivity0);
        u0.R(j0.getUrl());
        ((m)j0).setWebChromeClient(new k(mainActivity0, u0));
        ((m)j0).setWebViewClient(new J(mainActivity0, u0));
        d d0 = mainActivity0.b2();
        if(d0 != null) {
            ((m)j0).setDownloadListener(d0);
            d0.H(u0);
        }
        ((m)j0).removeJavascriptInterface("median_status_checker");
        ((m)j0).addJavascriptInterface(mainActivity0.k2(), "median_status_checker");
        ((m)j0).removeJavascriptInterface("gonative_file_writer_sharer");
        ((m)j0).addJavascriptInterface(mainActivity0.c2().j(), "gonative_file_writer_sharer");
        ((m)j0).removeJavascriptInterface("JSBridge");
        ((m)j0).addJavascriptInterface(new v(new S0(mainActivity0)), "JSBridge");
        ((GoNativeApplication)mainActivity0.getApplication()).q.y(mainActivity0, ((m)j0));
        if(mainActivity0.getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
            Message message0 = ((GoNativeApplication)mainActivity0.getApplication()).i();
            if(message0 != null) {
                WebView.WebViewTransport webView$WebViewTransport0 = (WebView.WebViewTransport)message0.obj;
                if(webView$WebViewTransport0 != null) {
                    webView$WebViewTransport0.setWebView(((m)j0));
                    message0.sendToTarget();
                }
            }
        }
    }

    public static void d(Context context0) {
        if(!a.V(context0).Y3) {
            String s = (String)Q.b(context0).get("distribution");
            if(s != null && (s.equals("debug") || s.equals("adhoc"))) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
    }
}

