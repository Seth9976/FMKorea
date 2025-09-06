package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

public final class zzfck {
    private final zzfbe zza;
    private final zzfbi zzb;
    private final zzech zzc;
    private final zzfik zzd;
    private final zzfhr zze;
    private final zzcob zzf;

    public zzfck(zzech zzech0, zzfik zzfik0, zzfbe zzfbe0, zzfbi zzfbi0, zzcob zzcob0, zzfhr zzfhr0) {
        this.zza = zzfbe0;
        this.zzb = zzfbi0;
        this.zzc = zzech0;
        this.zzd = zzfik0;
        this.zzf = zzcob0;
        this.zze = zzfhr0;
    }

    public final void zza(List list0) {
        for(Object object0: list0) {
            this.zzb(((String)object0), 2);
        }
    }

    public final void zzb(String s, int v) {
        if(!this.zza.zzaj) {
            this.zzd.zzc(s, this.zze);
            return;
        }
        zzecj zzecj0 = new zzecj(zzt.zzB().currentTimeMillis(), this.zzb.zzb, s, v);
        this.zzc.zzd(zzecj0);
    }

    public final void zzc(List list0, int v) {
        for(Object object0: list0) {
            String s = (String)object0;
            zzfye.zzr((((Boolean)zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() ? this.zzf.zzc(s, zzay.zze()) : zzfye.zzh(s)), new zzfcj(this, v), zzcan.zza);
        }
    }
}

