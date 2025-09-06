package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdjo {
    private final zzdom zza;
    private final zzdnb zzb;
    private final zzcpi zzc;
    private final zzdik zzd;

    public zzdjo(zzdom zzdom0, zzdnb zzdnb0, zzcpi zzcpi0, zzdik zzdik0) {
        this.zza = zzdom0;
        this.zzb = zzdnb0;
        this.zzc = zzcpi0;
        this.zzd = zzdik0;
    }

    public final View zza() {
        zzq zzq0 = zzq.zzc();
        zzcfi zzcfi0 = this.zza.zza(zzq0, null, null);
        ((View)zzcfi0).setVisibility(8);
        zzcfi0.zzad("/sendMessageToSdk", (zzcfi zzcfi0, Map map0) -> this.zzb.zzg("sendMessageToNativeJs", map0));
        zzcfi0.zzad("/adMuted", (zzcfi zzcfi0, Map map0) -> this.zzd.zzg());
        WeakReference weakReference0 = new WeakReference(zzcfi0);
        zzdjk zzdjk0 = new zzdjk(this);
        this.zzb.zzj(weakReference0, "/loadHtml", zzdjk0);
        WeakReference weakReference1 = new WeakReference(zzcfi0);
        zzdjl zzdjl0 = (zzcfi zzcfi0, Map map0) -> {
            zzcaa.zzi("Showing native ads overlay.");
            zzcfi0.zzF().setVisibility(0);
            this.zzc.zze(true);
        };
        this.zzb.zzj(weakReference1, "/showOverlay", zzdjl0);
        WeakReference weakReference2 = new WeakReference(zzcfi0);
        zzdjm zzdjm0 = (zzcfi zzcfi0, Map map0) -> {
            zzcaa.zzi("Hiding native ads overlay.");
            zzcfi0.zzF().setVisibility(8);
            this.zzc.zze(false);
        };
        this.zzb.zzj(weakReference2, "/hideOverlay", zzdjm0);
        return (View)zzcfi0;
    }

    // 检测为 Lambda 实现
    final void zzb(zzcfi zzcfi0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzc(zzcfi zzcfi0, Map map0) [...]

    final void zzd(Map map0, boolean z, int v, String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("messageType", "htmlLoaded");
        hashMap0.put("id", ((String)map0.get("id")));
        this.zzb.zzg("sendMessageToNativeJs", hashMap0);
    }

    // 检测为 Lambda 实现
    final void zze(zzcfi zzcfi0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzf(zzcfi zzcfi0, Map map0) [...]
}

