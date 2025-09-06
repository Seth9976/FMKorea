package com.google.android.gms.internal.ads;

import Z1.d;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcfx extends FrameLayout implements zzcfi {
    private final zzcfi zza;
    private final zzcby zzb;
    private final AtomicBoolean zzc;

    public zzcfx(zzcfi zzcfi0) {
        super(zzcfi0.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcfi0;
        this.zzb = new zzcby(zzcfi0.zzE(), this, this);
        this.addView(((View)zzcfi0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void destroy() {
        zzfip zzfip0 = this.zzQ();
        if(zzfip0 != null) {
            zzcfv zzcfv0 = new zzcfv(zzfip0);
            zzs.zza.post(zzcfv0);
            this.zza.getClass();
            zzcfw zzcfw0 = new zzcfw(this.zza);
            long v = (long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzeS)))));
            zzs.zza.postDelayed(zzcfw0, v);
            return;
        }
        this.zza.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void goBack() {
        this.zza.goBack();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void loadData(String s, String s1, String s2) {
        this.zza.loadData(s, "text/html", s2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        this.zza.loadDataWithBaseURL(s, s1, "text/html", "UTF-8", null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void loadUrl(String s) {
        this.zza.loadUrl(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfi zzcfi0 = this.zza;
        if(zzcfi0 != null) {
            zzcfi0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void onResume() {
        this.zza.onResume();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi, android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.zza.setOnClickListener(view$OnClickListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi, android.view.View
    public final void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        this.zza.setOnTouchListener(view$OnTouchListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void setWebChromeClient(WebChromeClient webChromeClient0) {
        this.zza.setWebChromeClient(webChromeClient0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void setWebViewClient(WebViewClient webViewClient0) {
        this.zza.setWebViewClient(webViewClient0);
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzA(int v) {
        this.zza.zzA(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int v) {
        this.zzb.zzg(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzC(zzcge zzcge0) {
        this.zza.zzC(zzcge0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzfbe zzD() {
        return this.zza.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final View zzF() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final WebView zzG() {
        return (WebView)this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzaqx zzI() {
        return this.zza.zzI();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzavs zzJ() {
        return this.zza.zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzbej zzK() {
        return this.zza.zzK();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzl zzL() {
        return this.zza.zzL();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzl zzM() {
        return this.zza.zzM();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcgv zzN() {
        return ((zzcgb)this.zza).zzaJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcgx zzO() {
        return this.zza.zzO();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzfbi zzP() {
        return this.zza.zzP();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzfip zzQ() {
        return this.zza.zzQ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final d zzR() {
        return this.zza.zzR();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final String zzS() {
        return this.zza.zzS();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzT(zzfbe zzfbe0, zzfbi zzfbi0) {
        this.zza.zzT(zzfbe0, zzfbi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzU() {
        this.zzb.zze();
        this.zza.zzU();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzV() {
        this.zza.zzV();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzW(int v) {
        this.zza.zzW(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzX() {
        this.zza.zzX();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzY() {
        HashMap hashMap0 = new HashMap(3);
        hashMap0.put("app_muted", String.valueOf(zzt.zzr().zze()));
        hashMap0.put("app_volume", String.valueOf(zzt.zzr().zza()));
        hashMap0.put("device_volume", String.valueOf(zzab.zzb(((zzcgb)this.zza).getContext())));
        ((zzcgb)this.zza).zzd("volume", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzZ(boolean z) {
        this.zza.zzZ(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zza(String s) {
        ((zzcgb)this.zza).zzaO(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaD(zzc zzc0, boolean z) {
        this.zza.zzaD(zzc0, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaE(String s, String s1, int v) {
        this.zza.zzaE(s, s1, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaF(boolean z, int v, boolean z1) {
        this.zza.zzaF(z, v, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaG(boolean z, int v, String s, boolean z1) {
        this.zza.zzaG(z, v, s, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaH(boolean z, int v, String s, String s1, boolean z1) {
        this.zza.zzaH(z, v, s, s1, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzab(String s, String s1, String s2) {
        this.zza.zzab(s, s1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzac() {
        this.zza.zzac();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzad(String s, zzbir zzbir0) {
        this.zza.zzad(s, zzbir0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzae() {
        TextView textView0 = new TextView(this.getContext());
        textView0.setText(zzs.zzv());
        textView0.setTextSize(15.0f);
        textView0.setTextColor(-1);
        textView0.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setColor(-12303292);
        gradientDrawable0.setCornerRadius(8.0f);
        textView0.setBackground(gradientDrawable0);
        this.addView(textView0, new FrameLayout.LayoutParams(-2, -2, 49));
        this.bringChildToFront(textView0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaf(zzl zzl0) {
        this.zza.zzaf(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzag(zzcgx zzcgx0) {
        this.zza.zzag(zzcgx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzah(zzavs zzavs0) {
        this.zza.zzah(zzavs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzai(boolean z) {
        this.zza.zzai(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaj() {
        this.setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzak(Context context0) {
        this.zza.zzak(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzam(zzbeh zzbeh0) {
        this.zza.zzam(zzbeh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzao(zzbej zzbej0) {
        this.zza.zzao(zzbej0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzap(zzfip zzfip0) {
        this.zza.zzap(zzfip0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaq(int v) {
        this.zza.zzaq(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzar(zzl zzl0) {
        this.zza.zzar(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzat(boolean z) {
        this.zza.zzat(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzau(String s, zzbir zzbir0) {
        this.zza.zzau(s, zzbir0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzav(String s, Predicate predicate0) {
        this.zza.zzav(s, predicate0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzax() {
        return this.zza.zzax();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzay(boolean z, int v) {
        if(!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaJ)).booleanValue()) {
            return false;
        }
        if(this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.zza.getParent()).removeView(((View)this.zza));
        }
        this.zza.zzay(z, v);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zzb(String s, String s1) {
        this.zza.zzb("window.inspectorInfo", s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzcfi zzcfi0 = this.zza;
        if(zzcfi0 != null) {
            zzcfi0.zzbK();
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        this.zza.zzbj();
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.zza.zzbk();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final String zzbl() {
        return this.zza.zzbl();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final String zzbm() {
        return this.zza.zzbm();
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        this.zza.zzbt(zzaue0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String s, Map map0) {
        this.zza.zzd(s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zze(String s, JSONObject jSONObject0) {
        this.zza.zze(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final int zzf() {
        return this.zza.zzf();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzdG)).booleanValue() ? this.zza.getMeasuredHeight() : this.getMeasuredHeight();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzdG)).booleanValue() ? this.zza.getMeasuredWidth() : this.getMeasuredWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zza zzj() {
        return this.zza.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzbcg zzk() {
        return this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String s, JSONObject jSONObject0) {
        ((zzcgb)this.zza).zzb(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzbch zzm() {
        return this.zza.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcag zzn() {
        return this.zza.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzcdu zzp(String s) {
        return this.zza.zzp(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcge zzq() {
        return this.zza.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzcfi zzcfi0 = this.zza;
        if(zzcfi0 != null) {
            zzcfi0.zzs();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzt(String s, zzcdu zzcdu0) {
        this.zza.zzt(s, zzcdu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        this.zza.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z, long v) {
        this.zza.zzv(z, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzw() {
        this.zza.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}

