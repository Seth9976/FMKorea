package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzawb;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import java.util.Map;
import java.util.concurrent.Future;

public final class zzs extends zzbt {
    private final zzcag zza;
    private final zzq zzb;
    private final Future zzc;
    private final Context zzd;
    private final zzr zze;
    private WebView zzf;
    private zzbh zzg;
    private zzaqx zzh;
    private AsyncTask zzi;

    public zzs(Context context0, zzq zzq0, String s, zzcag zzcag0) {
        this.zzd = context0;
        this.zza = zzcag0;
        this.zzb = zzq0;
        this.zzf = new WebView(context0);
        zzo zzo0 = new zzo(this);
        this.zzc = zzcan.zza.zzb(zzo0);
        this.zze = new zzr(context0, s);
        this.zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbe0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbh0) {
        this.zzg = zzbh0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzby0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzq0) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcb0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzawb zzawb0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzw0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzci0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzdu0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsl zzbsl0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcp zzbcp0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdg0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbso zzbso0, String s) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String s) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvj zzbvj0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String s) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzfl0) {
        throw new IllegalStateException("Unused method");
    }

    final void zzV(int v) {
        if(this.zzf == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, v);
        this.zzf.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzl0) {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzl0, this.zza);
        this.zzi = new com.google.android.gms.ads.internal.zzq(this, null).execute(new Void[0]);
        return true;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcf0) {
        throw new IllegalStateException("Unused method");
    }

    final int zzb(String s) {
        String s1 = Uri.parse(s).getQueryParameter("height");
        if(TextUtils.isEmpty(s1)) {
            return 0;
        }
        try {
            int v = Integer.parseInt(s1);
            return zzbzt.zzx(this.zzd, v);
        }
        catch(NumberFormatException unused_ex) {
            return 0;
        }
    }

    static Context zzc(zzs zzs0) {
        return zzs0.zzd;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    static WebView zze(zzs zzs0) {
        return zzs0.zzf;
    }

    static zzaqx zzf(zzs zzs0) {
        return zzs0.zzh;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return this.zzb;
    }

    static zzbh zzh(zzs zzs0) {
        return zzs0.zzg;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    static zzcag zzm(zzs zzs0) {
        return zzs0.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    static String zzo(zzs zzs0, String s) {
        if(zzs0.zzh != null) {
            Uri uri0 = Uri.parse(s);
            try {
                uri0 = zzs0.zzh.zza(uri0, zzs0.zzd, null, null);
                return uri0.toString();
            }
            catch(zzaqy zzaqy0) {
                zzcaa.zzk("Unable to process ad data", zzaqy0);
                return uri0.toString();
            }
        }
        return s;
    }

    final String zzp() {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("https://").appendEncodedPath("/afs/ads/i/webview.html");
        uri$Builder0.appendQueryParameter("query", this.zze.zzd());
        uri$Builder0.appendQueryParameter("pubId", this.zze.zzc());
        uri$Builder0.appendQueryParameter("mappver", this.zze.zza());
        Map map0 = this.zze.zze();
        for(Object object0: map0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), ((String)map0.get(((String)object0))));
        }
        Uri uri0 = uri$Builder0.build();
        zzaqx zzaqx0 = this.zzh;
        if(zzaqx0 != null) {
            try {
                uri0 = zzaqx0.zzb(uri0, this.zzd);
                return this.zzq() + "#" + uri0.getEncodedQuery();
            }
            catch(zzaqy zzaqy0) {
                zzcaa.zzk("Unable to process ad data", zzaqy0);
                return this.zzq() + "#" + uri0.getEncodedQuery();
            }
        }
        return this.zzq() + "#" + uri0.getEncodedQuery();
    }

    final String zzq() {
        String s = this.zze.zzb();
        if(TextUtils.isEmpty(s)) {
            s = "www.google.com";
        }
        return "https://" + s + "/afs/ads/i/webview.html";
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return null;
    }

    static void zzw(zzs zzs0, String s) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse(s));
        zzs0.zzd.startActivity(intent0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzl0, zzbk zzbk0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}

