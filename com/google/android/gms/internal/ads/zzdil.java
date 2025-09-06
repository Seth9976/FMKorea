package com.google.android.gms.internal.ads;

import androidx.collection.g;

public final class zzdil {
    zzbfx zza;
    zzbfu zzb;
    zzbgk zzc;
    zzbgh zzd;
    zzblj zze;
    final g zzf;
    final g zzg;

    public zzdil() {
        this.zzf = new g();
        this.zzg = new g();
    }

    public final zzdil zza(zzbfu zzbfu0) {
        this.zzb = zzbfu0;
        return this;
    }

    public final zzdil zzb(zzbfx zzbfx0) {
        this.zza = zzbfx0;
        return this;
    }

    public final zzdil zzc(String s, zzbgd zzbgd0, zzbga zzbga0) {
        this.zzf.put(s, zzbgd0);
        if(zzbga0 != null) {
            this.zzg.put(s, zzbga0);
        }
        return this;
    }

    public final zzdil zzd(zzblj zzblj0) {
        this.zze = zzblj0;
        return this;
    }

    public final zzdil zze(zzbgh zzbgh0) {
        this.zzd = zzbgh0;
        return this;
    }

    public final zzdil zzf(zzbgk zzbgk0) {
        this.zzc = zzbgk0;
        return this;
    }

    public final zzdin zzg() {
        return new zzdin(this, null);
    }
}

