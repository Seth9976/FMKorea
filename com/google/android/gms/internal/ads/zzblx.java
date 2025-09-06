package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import java.util.Map;
import org.json.JSONObject;

public final class zzblx implements zzbln, zzblp {
    private final zzcfi zza;

    public zzblx(Context context0, zzcag zzcag0, zzaqx zzaqx0, zza zza0) {
        zzcfi zzcfi0 = zzcfu.zza(context0, zzcgx.zza(), "", false, false, null, null, zzcag0, null, null, null, zzaxe.zza(), null, null, null);
        this.zza = zzcfi0;
        ((View)zzcfi0).setWillNotDraw(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbly
    public final void zza(String s) {
        zzblx.zzs(() -> this.zza.zza(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbly
    public final void zzb(String s, String s1) {
        zzblm.zzc(this, s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final void zzc() {
        this.zza.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String s, Map map0) {
        zzblm.zza(this, s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbll
    public final void zze(String s, JSONObject jSONObject0) {
        zzblm.zzb(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final void zzf(String s) {
        zzblx.zzs(() -> this.zza.loadData(s, "text/html", "UTF-8"));
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final void zzg(String s) {
        zzblx.zzs(() -> this.zza.loadUrl(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final void zzh(String s) {
        zzblx.zzs(() -> this.zza.loadData(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", s), "text/html", "UTF-8"));
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final zzbmw zzj() {
        return new zzbmw(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzblp
    public final void zzk(zzbme zzbme0) {
        this.zza.zzN().zzG(new zzblq(zzbme0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String s, JSONObject jSONObject0) {
        zzblm.zzd(this, s, jSONObject0);
    }

    // 检测为 Lambda 实现
    final void zzm(String s) [...]

    // 检测为 Lambda 实现
    final void zzn(String s) [...]

    // 检测为 Lambda 实现
    final void zzo(String s) [...]

    // 检测为 Lambda 实现
    final void zzp(String s) [...]

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(String s, zzbir zzbir0) {
        zzblw zzblw0 = new zzblw(this, zzbir0);
        this.zza.zzad(s, zzblw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zzr(String s, zzbir zzbir0) {
        zzblr zzblr0 = new zzblr(zzbir0);
        this.zza.zzav(s, zzblr0);
    }

    private static final void zzs(Runnable runnable0) {
        if(zzbzt.zzu()) {
            runnable0.run();
            return;
        }
        zzs.zza.post(runnable0);
    }
}

