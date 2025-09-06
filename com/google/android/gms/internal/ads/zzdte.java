package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzdte implements Runnable {
    public final zzdtj zza;
    public final zzfcw zzb;
    public final zzbks zzc;
    public final List zzd;
    public final String zze;

    public zzdte(zzdtj zzdtj0, zzfcw zzfcw0, zzbks zzbks0, List list0, String s) {
        this.zza = zzdtj0;
        this.zzb = zzfcw0;
        this.zzc = zzbks0;
        this.zzd = list0;
        this.zze = s;
    }

    @Override
    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

