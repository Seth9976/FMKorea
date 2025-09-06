package co.median.android;

import B0.J;
import I0.j;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class m extends WebView implements j {
    class a extends GestureDetector.SimpleOnGestureListener {
        final m a;

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onDown(MotionEvent motionEvent0) {
            return true;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
            m.g(m.this);
            return false;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
            m.g(m.this);
            return false;
        }
    }

    public interface b {
    }

    private final String f;
    private WebViewClient g;
    private WebChromeClient h;
    private boolean i;
    private GestureDetector j;
    private boolean k;
    private String l;
    GestureDetector.SimpleOnGestureListener m;

    public m(Context context0) {
        super(context0);
        this.f = this.getSettings().getUserAgentString();
        this.g = null;
        this.h = null;
        this.i = true;
        this.k = false;
        this.l = "";
        this.m = new a(this);
        this.j = new GestureDetector(context0, this.m);
    }

    @Override  // I0.j
    public void a(String s) {
        this.evaluateJavascript(s, null);
    }

    @Override  // I0.j
    public void b(Bundle bundle0) {
        this.saveState(bundle0);
    }

    @Override  // I0.j
    public boolean c() {
        return this.h == null || !(this.h instanceof k) ? false : ((k)this.h).d();
    }

    @Override  // android.webkit.WebView, I0.j
    public boolean canGoForward() {
        WebBackForwardList webBackForwardList0 = this.copyBackForwardList();
        WebHistoryItem webHistoryItem0 = webBackForwardList0.getItemAtIndex(webBackForwardList0.getCurrentIndex() + 1);
        return webHistoryItem0 == null || !"file:///android_asset/offline.html".equals(webHistoryItem0.getUrl()) ? super.canGoForward() : webBackForwardList0.getItemAtIndex(webBackForwardList0.getCurrentIndex() + 2) != null;
    }

    @Override  // I0.j
    public void d(String s, ValueCallback valueCallback0) {
        this.evaluateJavascript(s, valueCallback0);
    }

    @Override  // I0.j
    public void e(String s) {
        super.loadUrl(s);
    }

    @Override  // I0.j
    public void f(Bundle bundle0) {
        this.restoreState(bundle0);
    }

    static b g(m m0) {
        m0.getClass();
        return null;
    }

    @Override  // I0.j
    public String getDefaultUserAgent() {
        return this.f;
    }

    @Override  // I0.j
    public int getMaxHorizontalScroll() {
        return this.computeHorizontalScrollRange() - this.getWidth();
    }

    @Deprecated
    public b getOnSwipeListener() {
        return null;
    }

    @Override  // I0.j
    public int getWebViewScrollX() {
        return this.getScrollX();
    }

    @Override  // I0.j
    public int getWebViewScrollY() {
        return this.getScrollY();
    }

    @Override  // android.webkit.WebView, I0.j
    public void goBack() {
        int v1;
        WebHistoryItem webHistoryItem0;
        try {
            WebBackForwardList webBackForwardList0 = this.copyBackForwardList();
            for(int v = webBackForwardList0.getCurrentIndex() - 1; true; --v) {
                if(v < 0) {
                    webHistoryItem0 = null;
                    v1 = 0;
                    break;
                }
                webHistoryItem0 = webBackForwardList0.getItemAtIndex(v);
                if(!webHistoryItem0.getUrl().equals("file:///android_asset/offline.html")) {
                    v1 = v - webBackForwardList0.getCurrentIndex();
                    break;
                }
            }
            if(webHistoryItem0 == null) {
                return;
            }
            if(this.g.shouldOverrideUrlLoading(this, webHistoryItem0.getUrl())) {
                return;
            }
            super.goBackOrForward(v1);
        }
        catch(Exception unused_ex) {
            super.goBack();
        }
    }

    @Override  // android.webkit.WebView, I0.j
    public void goForward() {
        WebBackForwardList webBackForwardList0 = this.copyBackForwardList();
        WebHistoryItem webHistoryItem0 = webBackForwardList0.getItemAtIndex(webBackForwardList0.getCurrentIndex() + 1);
        if(webHistoryItem0 != null && "file:///android_asset/offline.html".equals(webHistoryItem0.getUrl())) {
            if(webBackForwardList0.getItemAtIndex(webBackForwardList0.getCurrentIndex() + 2) != null) {
                this.goBackOrForward(2);
            }
            return;
        }
        super.goForward();
    }

    public static boolean h() [...] // Inlined contents

    public void i() {
        try {
            WebHistoryItem webHistoryItem0 = null;
            WebBackForwardList webBackForwardList0 = this.copyBackForwardList();
            for(int v = webBackForwardList0.getCurrentIndex() - 1; v >= 0; --v) {
                WebHistoryItem webHistoryItem1 = webBackForwardList0.getItemAtIndex(v);
                if(!webHistoryItem1.getUrl().equals("file:///android_asset/offline.html")) {
                    webHistoryItem0 = webHistoryItem1;
                    break;
                }
            }
            if(webHistoryItem0 != null) {
                this.l = webHistoryItem0.getUrl();
            }
            this.goBack();
        }
        catch(Exception unused_ex) {
        }
    }

    public boolean j(String s) {
        if(this.l.equals(s)) {
            this.l = "";
            this.stopLoading();
            this.reload();
            return true;
        }
        return false;
    }

    @Override  // android.webkit.WebView, I0.j
    public void loadUrl(String s) {
        if(s == null) {
            return;
        }
        if("file:///offline.html".equals(s)) {
            s = "file:///android_asset/offline.html";
        }
        if(s.startsWith("javascript:") || (this.g == null || !this.g.shouldOverrideUrlLoading(this, s))) {
            super.loadUrl(s);
        }
    }

    @Override  // android.webkit.WebView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        this.j.onTouchEvent(motionEvent0);
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // android.webkit.WebView, I0.j
    public void reload() {
        WebViewClient webViewClient0 = this.g;
        if(webViewClient0 == null || !(webViewClient0 instanceof J)) {
            super.reload();
        }
        else if(!((J)webViewClient0).a(this, this.getUrl(), true)) {
            super.reload();
        }
    }

    @Override  // I0.j, android.view.View
    public void scrollTo(int v, int v1) {
        super.scrollTo(v, v1);
    }

    @Override  // I0.j
    public void setCheckLoginSignup(boolean z) {
        this.i = z;
    }

    @Deprecated
    public void setOnSwipeListener(b m$b0) {
    }

    @Override  // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient0) {
        this.h = webChromeClient0;
        super.setWebChromeClient(webChromeClient0);
    }

    @Override  // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient0) {
        this.g = webViewClient0;
        super.setWebViewClient(webViewClient0);
    }

    @Override  // android.webkit.WebView
    public void zoomBy(float f) {
        super.zoomBy(f);
        this.k = true;
    }

    @Override  // android.webkit.WebView
    public boolean zoomOut() {
        this.k = false;
        return super.zoomOut();
    }
}

