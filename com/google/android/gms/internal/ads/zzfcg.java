package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzfcg implements zzbir {
    public final zzddw zza;
    public final zzcob zzb;
    public final zzfik zzc;
    public final zzech zzd;

    public zzfcg(zzddw zzddw0, zzcob zzcob0, zzfik zzfik0, zzech zzech0) {
        this.zza = zzddw0;
        this.zzb = zzcob0;
        this.zzc = zzfik0;
        this.zzd = zzech0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcob zzcob0 = this.zzb;
        zzfik zzfik0 = this.zzc;
        zzech zzech0 = this.zzd;
        zzbiq.zzc(map0, this.zza);
        String s = (String)map0.get("u");
        if(s == null) {
            zzcaa.zzj("URL missing from click GMSG.");
            return;
        }
        zzfye.zzr(zzbiq.zza(((zzcfi)object0), s), new zzfci(((zzcfi)object0), zzcob0, zzfik0, zzech0), zzcan.zza);
    }
}

