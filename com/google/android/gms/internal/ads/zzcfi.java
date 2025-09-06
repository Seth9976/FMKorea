package com.google.android.gms.internal.ads;

import Z1.d;
import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.util.Predicate;

public interface zzcfi extends zza, zzl, zzauf, zzbll, zzbly, zzccj, zzcez, zzcgf, zzcgj, zzcgn, zzcgq, zzcgr, zzcgs, zzddw {
    boolean canGoBack();

    void destroy();

    @Override  // com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] arg1);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String arg1, String arg2, String arg3);

    void loadDataWithBaseURL(String arg1, String arg2, String arg3, String arg4, String arg5);

    void loadUrl(String arg1);

    void measure(int arg1, int arg2);

    void onPause();

    void onResume();

    @Override  // com.google.android.gms.internal.ads.zzccj
    void setBackgroundColor(int arg1);

    void setOnClickListener(View.OnClickListener arg1);

    void setOnTouchListener(View.OnTouchListener arg1);

    void setWebChromeClient(WebChromeClient arg1);

    void setWebViewClient(WebViewClient arg1);

    @Override  // com.google.android.gms.internal.ads.zzccj
    void zzC(zzcge arg1);

    @Override  // com.google.android.gms.internal.ads.zzcez
    zzfbe zzD();

    Context zzE();

    @Override  // com.google.android.gms.internal.ads.zzcgs
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override  // com.google.android.gms.internal.ads.zzcgq
    zzaqx zzI();

    zzavs zzJ();

    zzbej zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcgv zzN();

    @Override  // com.google.android.gms.internal.ads.zzcgp
    zzcgx zzO();

    @Override  // com.google.android.gms.internal.ads.zzcgf
    zzfbi zzP();

    zzfip zzQ();

    d zzR();

    String zzS();

    void zzT(zzfbe arg1, zzfbi arg2);

    void zzU();

    void zzV();

    void zzW(int arg1);

    void zzX();

    void zzY();

    void zzZ(boolean arg1);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String arg1, String arg2, String arg3);

    void zzac();

    void zzad(String arg1, zzbir arg2);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl arg1);

    void zzag(zzcgx arg1);

    void zzah(zzavs arg1);

    void zzai(boolean arg1);

    void zzaj();

    void zzak(Context arg1);

    void zzal(boolean arg1);

    void zzam(zzbeh arg1);

    void zzan(boolean arg1);

    void zzao(zzbej arg1);

    void zzap(zzfip arg1);

    void zzaq(int arg1);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl arg1);

    void zzas(boolean arg1);

    void zzat(boolean arg1);

    void zzau(String arg1, zzbir arg2);

    void zzav(String arg1, Predicate arg2);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean arg1, int arg2);

    boolean zzaz();

    @Override  // com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    Activity zzi();

    @Override  // com.google.android.gms.internal.ads.zzccj
    com.google.android.gms.ads.internal.zza zzj();

    @Override  // com.google.android.gms.internal.ads.zzccj
    zzbch zzm();

    @Override  // com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccj
    zzcag zzn();

    @Override  // com.google.android.gms.internal.ads.zzccj
    zzcge zzq();

    @Override  // com.google.android.gms.internal.ads.zzccj
    void zzt(String arg1, zzcdu arg2);
}

