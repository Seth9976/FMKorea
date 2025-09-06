package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;

public final class zzcfh extends WebChromeClient {
    private final zzcfi zza;

    public zzcfh(zzcfi zzcfi0) {
        this.zza = zzcfi0;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView0) {
        if(!(webView0 instanceof zzcfi)) {
            zzcaa.zzj("Tried to close a WebView that wasn\'t an AdWebView.");
            return;
        }
        zzl zzl0 = ((zzcfi)webView0).zzL();
        if(zzl0 == null) {
            zzcaa.zzj("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        zzl0.zzb();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
        String s = "JS: " + consoleMessage0.message() + " (" + consoleMessage0.sourceId() + ":" + consoleMessage0.lineNumber() + ")";
        if(s.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage0);
        }
        switch(zzcfg.zza[consoleMessage0.messageLevel().ordinal()]) {
            case 1: {
                zzcaa.zzg(s);
                return super.onConsoleMessage(consoleMessage0);
            }
            case 2: {
                zzcaa.zzj(s);
                return super.onConsoleMessage(consoleMessage0);
            }
            case 3: 
            case 4: {
                zzcaa.zzi(s);
                return super.onConsoleMessage(consoleMessage0);
            }
            case 5: {
                zzcaa.zze(s);
                return super.onConsoleMessage(consoleMessage0);
            }
            default: {
                zzcaa.zzi(s);
                return super.onConsoleMessage(consoleMessage0);
            }
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
        WebView.WebViewTransport webView$WebViewTransport0 = (WebView.WebViewTransport)message0.obj;
        WebView webView1 = new WebView(webView0.getContext());
        if(this.zza.zzH() != null) {
            webView1.setWebViewClient(this.zza.zzH());
        }
        webView$WebViewTransport0.setWebView(webView1);
        message0.sendToTarget();
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String s, String s1, long v, long v1, long v2, WebStorage.QuotaUpdater webStorage$QuotaUpdater0) {
        if(0x500000L - v2 <= 0L) {
            webStorage$QuotaUpdater0.updateQuota(v);
            return;
        }
        if(Long.compare(v, 0L) != 0) {
            if(v1 == 0L) {
                v1 = Math.min(v + Math.min(0x20000L, 0x500000L - v2), 0x100000L);
            }
            else {
                if(v1 <= Math.min(0x100000L - v, 0x500000L - v2)) {
                    v += v1;
                }
                v1 = v;
            }
        }
        else if(v1 > 0x500000L - v2 || v1 > 0x100000L) {
            v1 = 0L;
        }
        webStorage$QuotaUpdater0.updateQuota(v1);
    }

    @Override  // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String s, GeolocationPermissions.Callback geolocationPermissions$Callback0) {
        if(geolocationPermissions$Callback0 != null) {
            geolocationPermissions$Callback0.invoke(s, zzs.zzx(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION") || zzs.zzx(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION"), true);
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzl zzl0 = this.zza.zzL();
        if(zzl0 == null) {
            zzcaa.zzj("Could not get ad overlay when hiding custom view.");
            return;
        }
        zzl0.zzg();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
        return this.zza(zzcfh.zzb(webView0), "alert", s, s1, null, jsResult0, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView0, String s, String s1, JsResult jsResult0) {
        return this.zza(zzcfh.zzb(webView0), "onBeforeUnload", s, s1, null, jsResult0, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView0, String s, String s1, JsResult jsResult0) {
        return this.zza(zzcfh.zzb(webView0), "confirm", s, s1, null, jsResult0, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView0, String s, String s1, String s2, JsPromptResult jsPromptResult0) {
        return this.zza(zzcfh.zzb(webView0), "prompt", s, s1, s2, null, jsPromptResult0, true);
    }

    @Override  // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view0, int v, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        zzl zzl0 = this.zza.zzL();
        if(zzl0 == null) {
            zzcaa.zzj("Could not get ad overlay when showing custom view.");
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
            return;
        }
        zzl0.zzC(view0, webChromeClient$CustomViewCallback0);
        zzl0.zzA(v);
    }

    @Override  // android.webkit.WebChromeClient
    public final void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        this.onShowCustomView(view0, -1, webChromeClient$CustomViewCallback0);
    }

    protected final boolean zza(Context context0, String s, String s1, String s2, String s3, JsResult jsResult0, JsPromptResult jsPromptResult0, boolean z) {
        try {
            if(this.zza != null && this.zza.zzN() != null && this.zza.zzN().zzd() != null) {
                zzb zzb0 = this.zza.zzN().zzd();
                if(zzb0 != null && !zzb0.zzc()) {
                    zzb0.zzb("window." + s + "(\'" + s2 + "\')");
                    return false;
                }
            }
            AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(context0);
            alertDialog$Builder0.setTitle(s1);
            if(z) {
                LinearLayout linearLayout0 = new LinearLayout(context0);
                linearLayout0.setOrientation(1);
                TextView textView0 = new TextView(context0);
                textView0.setText(s2);
                EditText editText0 = new EditText(context0);
                editText0.setText(s3);
                linearLayout0.addView(textView0);
                linearLayout0.addView(editText0);
                alertDialog$Builder0.setView(linearLayout0).setPositiveButton(0x104000A, new zzcff(jsPromptResult0, editText0)).setNegativeButton(0x1040000, new zzcfe(jsPromptResult0)).setOnCancelListener(new zzcfd(jsPromptResult0)).create().show();
                return true;
            }
            alertDialog$Builder0.setMessage(s2).setPositiveButton(0x104000A, new zzcfc(jsResult0)).setNegativeButton(0x1040000, new zzcfb(jsResult0)).setOnCancelListener(new zzcfa(jsResult0)).create().show();
            return true;
        }
        catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
        }
        zzcaa.zzk("Fail to display Dialog.", windowManager$BadTokenException0);
        return true;
    }

    private static final Context zzb(WebView webView0) {
        if(!(webView0 instanceof zzcfi)) {
            return webView0.getContext();
        }
        Context context0 = ((zzcfi)webView0).zzi();
        return context0 == null ? ((zzcfi)webView0).getContext() : context0;
    }
}

