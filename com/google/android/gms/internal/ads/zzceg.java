package com.google.android.gms.internal.ads;

public final class zzceg implements zzko {
    private final zzxu zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private int zzg;
    private boolean zzh;

    zzceg() {
        this.zzb = new zzxu(true, 0x10000);
        this.zzc = 15000000L;
        this.zzd = 30000000L;
        this.zze = 2500000L;
        this.zzf = 5000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final long zza() {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zzb() {
        this.zzj(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zzc() {
        this.zzj(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zzd() {
        this.zzj(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zze(zzcw zzcw0, zzbw zzbw0, zzln[] arr_zzln, zzvs zzvs0, zzxf[] arr_zzxf) {
        this.zzg = 0;
        for(int v = 0; v < 2; ++v) {
            if(arr_zzxf[v] != null) {
                this.zzg += (arr_zzln[v].zzb() == 1 ? 0xC80000 : 0x7D00000);
            }
        }
        this.zzb.zzf(this.zzg);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(long v, long v1, float f) {
        int v2;
        boolean z = true;
        if(Long.compare(v1, this.zzd) > 0) {
            v2 = 0;
        }
        else {
            v2 = v1 >= this.zzc ? 1 : 2;
        }
        int v3 = this.zzb.zza();
        if(v2 != 2 && (v2 != 1 || !this.zzh || v3 >= this.zzg)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(zzcw zzcw0, zzbw zzbw0, long v, float f, boolean z, long v1) {
        long v2 = z ? this.zzf : this.zze;
        return v2 <= 0L || v >= v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final zzxu zzi() {
        return this.zzb;
    }

    final void zzj(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if(z) {
            this.zzb.zze();
        }
    }

    public final void zzk(int v) {
        synchronized(this) {
            this.zze = ((long)v) * 1000L;
        }
    }

    public final void zzl(int v) {
        synchronized(this) {
            this.zzf = ((long)v) * 1000L;
        }
    }

    public final void zzm(int v) {
        synchronized(this) {
            this.zzd = ((long)v) * 1000L;
        }
    }

    public final void zzn(int v) {
        synchronized(this) {
            this.zzc = ((long)v) * 1000L;
        }
    }
}

