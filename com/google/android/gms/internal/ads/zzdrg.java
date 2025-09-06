package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzdrg {
    final zzdrh zza;
    private final Map zzb;

    zzdrg(zzdrh zzdrh0) {
        this.zza = zzdrh0;
        super();
        this.zzb = new ConcurrentHashMap();
    }

    static zzdrg zza(zzdrg zzdrg0) {
        Map map0 = zzdrh.zzc(zzdrg0.zza);
        zzdrg0.zzb.putAll(map0);
        return zzdrg0;
    }

    public final zzdrg zzb(String s, String s1) {
        this.zzb.put(s, s1);
        return this;
    }

    public final zzdrg zzc(String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            this.zzb.put(s, s1);
        }
        return this;
    }

    public final zzdrg zzd(zzfbe zzfbe0) {
        this.zzb.put("aai", zzfbe0.zzx);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            this.zzc("rid", zzfbe0.zzao);
        }
        return this;
    }

    public final zzdrg zze(zzfbi zzfbi0) {
        this.zzb.put("gqi", zzfbi0.zzb);
        return this;
    }

    public final String zzf() {
        return zzdrh.zzb(this.zza).zzb(this.zzb);
    }

    public final void zzg() {
        zzdrh.zzd(this.zza).execute(() -> zzdrh.zzb(this.zza).zze(this.zzb));
    }

    public final void zzh() {
        zzdre zzdre0 = () -> this.zza.zza.zzd(this.zzb);
        zzdrh.zzd(this.zza).execute(zzdre0);
    }

    // 检测为 Lambda 实现
    final void zzi() [...]

    // 检测为 Lambda 实现
    final void zzj() [...]
}

