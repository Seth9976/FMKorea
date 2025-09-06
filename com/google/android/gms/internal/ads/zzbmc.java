package com.google.android.gms.internal.ads;

import java.util.ArrayList;

public final class zzbmc implements Runnable {
    public final zzbmu zza;
    public final zzbmt zzb;
    public final zzblp zzc;
    public final ArrayList zzd;
    public final long zze;

    public zzbmc(zzbmu zzbmu0, zzbmt zzbmt0, zzblp zzblp0, ArrayList arrayList0, long v) {
        this.zza = zzbmu0;
        this.zzb = zzbmt0;
        this.zzc = zzblp0;
        this.zzd = arrayList0;
        this.zze = v;
    }

    @Override
    public final void run() {
        this.zza.zzi(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

