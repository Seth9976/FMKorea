package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

public final class zzdxe implements zzdxg {
    private final Map zza;
    private final zzfyo zzb;
    private final zzczb zzc;

    public zzdxe(Map map0, zzfyo zzfyo0, zzczb zzczb0) {
        this.zza = map0;
        this.zzb = zzfyo0;
        this.zzc = zzczb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdxg
    public final d zzb(zzbun zzbun0) {
        this.zzc.zzbr(zzbun0);
        d d0 = zzfye.zzg(new zzdve(3));
        String[] arr_s = ((String)zzba.zzc().zzb(zzbbr.zzhR)).split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            zzgzg zzgzg0 = (zzgzg)this.zza.get(arr_s[v].trim());
            if(zzgzg0 != null) {
                zzdxc zzdxc0 = new zzdxc(zzgzg0, zzbun0);
                d0 = zzfye.zzf(d0, zzdve.class, zzdxc0, this.zzb);
            }
        }
        zzfye.zzr(d0, new zzdxd(this), zzcan.zzf);
        return d0;
    }
}

