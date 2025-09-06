package co.median.android;

import I0.a;
import I0.g;
import android.content.DialogInterface;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.util.ArrayList;

class k extends WebChromeClient {
    static abstract class b {
        static final int[] a;

        static {
            int[] arr_v = new int[ConsoleMessage.MessageLevel.values().length];
            b.a = arr_v;
            try {
                arr_v[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final MainActivity a;
    private final u b;
    private final boolean c;
    private View d;
    private WebChromeClient.CustomViewCallback e;
    private boolean f;
    private long g;

    public k(MainActivity mainActivity0, u u0) {
        this.f = false;
        this.a = mainActivity0;
        this.b = u0;
        this.g = 0L;
        a a0 = a.V(mainActivity0);
        this.c = a0.R3;
        if(a0.R3) {
            Log.d("GoNative WebView", "Web Console logs enabled");
        }
    }

    public boolean d() {
        if(this.f) {
            this.onHideCustomView();
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private void e(GeolocationPermissions.Callback geolocationPermissions$Callback0, String s, boolean z) [...]

    // 检测为 Lambda 实现
    private static void f(JsResult jsResult0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private static void g(JsResult jsResult0, DialogInterface dialogInterface0) [...]

    @Override  // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView0) {
        if(this.a.w2()) {
            this.a.finish();
        }
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
        if(this.c) {
            switch(b.a[consoleMessage0.messageLevel().ordinal()]) {
                case 1: {
                    Log.i("[console.log]", consoleMessage0.message());
                    break;
                }
                case 2: 
                case 3: {
                    Log.d("[console.debug]", consoleMessage0.message());
                    return true;
                }
                case 4: {
                    Log.w("[console.warn]", consoleMessage0.message());
                    return true;
                }
                case 5: {
                    g.a().d("[console.error]", consoleMessage0.message(), new Exception(consoleMessage0.message()), 1);
                    return true;
                }
                default: {
                    return true;
                }
            }
        }
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
        this.b.q(webView0, message0);
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String s, GeolocationPermissions.Callback geolocationPermissions$Callback0) {
        if(!a.V(this.a).s1.d()) {
            geolocationPermissions$Callback0.invoke(s, false, false);
            return;
        }
        if(SystemClock.uptimeMillis() - this.g < 1000L) {
            geolocationPermissions$Callback0.invoke(s, false, false);
            return;
        }
        this.a.h2().i((boolean z) -> {
            if(z) {
                geolocationPermissions$Callback0.invoke(s, true, false);
                return;
            }
            geolocationPermissions$Callback0.invoke(s, false, false);
            this.g = SystemClock.uptimeMillis();
        });
    }

    @Override  // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.d = null;
        this.f = false;
        RelativeLayout relativeLayout0 = this.a.d2();
        if(relativeLayout0 != null) {
            relativeLayout0.setVisibility(4);
            relativeLayout0.removeAllViews();
        }
        WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = this.e;
        if(webChromeClient$CustomViewCallback0 != null) {
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
        }
        this.a.f0(false);
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
        new I1.b(this.a).z(s1).F(0x7F120108, (DialogInterface dialogInterface0, int v) -> jsResult0.confirm()).D((DialogInterface dialogInterface0) -> jsResult0.cancel()).s();
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView0, String s, String s1, JsResult jsResult0) {
        this.b.n();
        return super.onJsBeforeUnload(webView0, s, s1, jsResult0);
    }

    @Override  // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest0) {
        class co.median.android.k.a implements m {
            final PermissionRequest a;
            final k b;

            co.median.android.k.a(PermissionRequest permissionRequest0) {
                this.a = permissionRequest0;
                super();
            }

            @Override  // co.median.android.MainActivity$m
            public void a(String[] arr_s, int[] arr_v) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_v.length; ++v) {
                    if(arr_v[v] == 0) {
                        if(arr_s[v].equals("android.permission.RECORD_AUDIO")) {
                            arrayList0.add("android.webkit.resource.AUDIO_CAPTURE");
                        }
                        else if(arr_s[v].equals("android.permission.CAMERA")) {
                            arrayList0.add("android.webkit.resource.VIDEO_CAPTURE");
                        }
                    }
                }
                if(arrayList0.isEmpty()) {
                    this.a.deny();
                    return;
                }
                String[] arr_s1 = (String[])arrayList0.toArray(new String[arrayList0.size()]);
                this.a.grant(arr_s1);
            }
        }

        String[] arr_s = permissionRequest0.getResources();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                arrayList0.add("android.permission.RECORD_AUDIO");
                arrayList0.add("android.permission.MODIFY_AUDIO_SETTINGS");
            }
            else if(arr_s[v].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList0.add("android.permission.CAMERA");
            }
        }
        String[] arr_s1 = (String[])arrayList0.toArray(new String[arrayList0.size()]);
        co.median.android.k.a k$a0 = new co.median.android.k.a(this, permissionRequest0);
        this.a.j2(arr_s1, k$a0);
    }

    @Override  // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest0) {
        super.onPermissionRequestCanceled(permissionRequest0);
    }

    @Override  // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView0, String s) {
        this.a.l3();
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        RelativeLayout relativeLayout0 = this.a.d2();
        if(relativeLayout0 == null) {
            return;
        }
        this.d = view0;
        this.e = webChromeClient$CustomViewCallback0;
        this.f = true;
        relativeLayout0.setVisibility(0);
        relativeLayout0.addView(view0, new RelativeLayout.LayoutParams(-1, -1));
        this.a.f0(this.f);
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView0, ValueCallback valueCallback0, WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0) {
        this.b.m();
        if(webChromeClient$FileChooserParams0.getMode() == 3) {
            valueCallback0.onReceiveValue(null);
            return false;
        }
        this.b.H(valueCallback0, webChromeClient$FileChooserParams0);
        return true;
    }
}

