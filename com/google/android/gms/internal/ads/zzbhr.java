package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbhr implements zzbir {
    public final zzddw zza;
    public final zzcob zzb;

    public zzbhr(zzddw zzddw0, zzcob zzcob0) {
        this.zza = zzddw0;
        this.zzb = zzcob0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcob zzcob0 = this.zzb;
        zzbiq.zzc(map0, this.zza);
        String s = (String)map0.get("u");
        if(s == null) {
            zzcaa.zzj("URL missing from click GMSG.");
            return;
        }
        zzfye.zzr(zzfye.zzn(zzfxv.zzu(zzbiq.zza(((zzcfi)object0), s)), new zzbht(zzcob0), zzcan.zza), new zzbif(((zzcfi)object0)), zzcan.zza);
    }
}

