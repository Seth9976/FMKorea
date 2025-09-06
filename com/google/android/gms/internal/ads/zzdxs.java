package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

public final class zzdxs {
    private final zzfyo zza;
    private final zzdwy zzb;
    private final zzgyn zzc;
    private final zzfhu zzd;
    private final Context zze;
    private final zzcag zzf;

    public zzdxs(zzfyo zzfyo0, zzdwy zzdwy0, zzgyn zzgyn0, zzfhu zzfhu0, Context context0, zzcag zzcag0) {
        this.zza = zzfyo0;
        this.zzb = zzdwy0;
        this.zzc = zzgyn0;
        this.zzd = zzfhu0;
        this.zze = context0;
        this.zzf = zzcag0;
    }

    public final d zza(zzbun zzbun0) {
        zzdxn zzdxn0 = new zzdxn(zzbun0);
        return this.zzh(zzbun0, new zzdxo(this.zzb), (zzbun zzbun0) -> ((zzdzo)this.zzc.zzb()).zzb(zzbun0, Binder.getCallingUid()), zzdxn0);
    }

    public final d zzb(JSONObject jSONObject0) {
        zzbmy zzbmy0 = zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbnf.zza, (JSONObject jSONObject0) -> new zzbuq(jSONObject0));
        return zzfye.zzn(zzfxv.zzu(zzfye.zzh(jSONObject0)), zzbmy0, this.zza);
    }

    // 检测为 Lambda 实现
    final d zzc(zzdxr zzdxr0, zzbun zzbun0, zzfxl zzfxl0, zzdxh zzdxh0) [...]

    // 检测为 Lambda 实现
    final d zzd(zzbun zzbun0) [...]

    // 检测为 Lambda 实现
    final d zze(zzbun zzbun0) [...]

    // 检测为 Lambda 实现
    final d zzf(zzbun zzbun0) [...]

    public final d zzg(zzbun zzbun0) {
        return this.zzh(zzbun0, (zzbun zzbun0) -> this.zzb.zzc(zzbun0.zzh), (zzbun zzbun0) -> ((zzdzo)this.zzc.zzb()).zzi(zzbun0.zzh), zzdxj.zza);
    }

    private final d zzh(zzbun zzbun0, zzdxr zzdxr0, zzdxr zzdxr1, zzfxl zzfxl0) {
        d d0 = zzfye.zzn(zzfxv.zzu((zzs.zzz(zzbun0.zzd) ? zzfye.zzg(new zzdxh(1)) : zzfye.zzf(zzdxr0.zza(zzbun0), ExecutionException.class, zzdxi.zza, this.zza))), zzfxl0, this.zza);
        zzdxq zzdxq0 = (zzdxh zzdxh0) -> zzfye.zzn(zzdxr1.zza(zzbun0), zzfxl0, this.zza);
        return zzfye.zzf(d0, zzdxh.class, zzdxq0, this.zza);
    }
}

