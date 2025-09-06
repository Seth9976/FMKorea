package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import org.json.JSONObject;

public final class zzdyp {
    public d zza;
    private final zzczb zzb;
    private final zzdxx zzc;
    private final zzfge zzd;
    private final zzfca zze;
    private final zzcag zzf;
    private final zzfhu zzg;
    private final zzfhr zzh;
    private final Context zzi;
    private final zzfyo zzj;

    zzdyp(zzczb zzczb0, zzdxx zzdxx0, zzfge zzfge0, zzfca zzfca0, zzcag zzcag0, zzfhu zzfhu0, zzfhr zzfhr0, Context context0, zzfyo zzfyo0) {
        this.zzb = zzczb0;
        this.zzc = zzdxx0;
        this.zzd = zzfge0;
        this.zze = zzfca0;
        this.zzf = zzcag0;
        this.zzg = zzfhu0;
        this.zzh = zzfhr0;
        this.zzi = context0;
        this.zzj = zzfyo0;
    }

    // 检测为 Lambda 实现
    final zzbtv zza(zzbun zzbun0, zzeaa zzeaa0) [...]

    public final d zzc(zzbun zzbun0, JSONObject jSONObject0, zzbuq zzbuq0) {
        this.zzb.zzbr(zzbun0);
        zzfhg zzfhg0 = zzfhf.zza(this.zzi, 9);
        zzeaf zzeaf0 = new zzeaf(zzbun0.zzg, this.zzh, zzfhg0);
        d d0 = zzfye.zzh(new zzeae(jSONObject0, zzbuq0));
        d d1 = zzfye.zzm(this.zzd.zzb(zzffy.zzh, d0).zze(zzeaf0).zza(), (zzeaa zzeaa0) -> {
            zzeaa0.zzc.put("Content-Type", zzeaa0.zze);
            String s = zzt.zzp().zzc(this.zzi, zzbun0.zzb.zza);
            zzeaa0.zzc.put("User-Agent", s);
            String s1 = zzeaa0.zza;
            int v = zzeaa0.zzb;
            Bundle bundle0 = new Bundle();
            for(Object object0: zzeaa0.zzc.entrySet()) {
                bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            return new zzbtv(s1, v, bundle0, zzeaa0.zzd, zzeaa0.zzf, zzbun0.zzd, zzbun0.zzh);
        }, this.zzj);
        zzffj zzffj0 = this.zzd.zzb(zzffy.zzj, d1).zzf(new zzdyk(this.zzc)).zza();
        this.zza = zzffj0;
        zzbmy zzbmy0 = zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzdzn.zza, zzbnf.zzb);
        d d2 = zzfye.zzn(this.zzd.zzb(zzffy.zzk, zzffj0).zze(new zzdym(jSONObject0, zzbuq0)).zzf(zzbmy0).zza(), (InputStream inputStream0) -> zzfye.zzh(new zzfbr(new zzfbo(this.zze), zzfbq.zza(new InputStreamReader(inputStream0)))), this.zzj);
        zzfye.zzr(d2, new zzdyo(this), this.zzj);
        return d2;
    }

    // 检测为 Lambda 实现
    final d zzd(InputStream inputStream0) [...]
}

