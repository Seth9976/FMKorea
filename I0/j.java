package I0;

import android.os.Bundle;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView.HitTestResult;

public interface j {
    void a(String arg1);

    void b(Bundle arg1);

    boolean c();

    boolean canGoBack();

    boolean canGoForward();

    void clearCache(boolean arg1);

    void clearFocus();

    void d(String arg1, ValueCallback arg2);

    void destroy();

    void e(String arg1);

    void f(Bundle arg1);

    String getDefaultUserAgent();

    WebView.HitTestResult getHitTestResult();

    int getMaxHorizontalScroll();

    ViewParent getParent();

    int getProgress();

    int getScrollX();

    WebSettings getSettings();

    String getTitle();

    String getUrl();

    int getWebViewScrollX();

    int getWebViewScrollY();

    int getWidth();

    void goBack();

    void goForward();

    void loadUrl(String arg1);

    void onPause();

    void onResume();

    void reload();

    void scrollTo(int arg1, int arg2);

    void setCheckLoginSignup(boolean arg1);

    void stopLoading();
}

