package com.google.android.gms.internal.ads;

public final class zzsx implements zztp, zztq {
    public final zztq zza;
    long zzb;
    private zztp zzc;
    private zzsw[] zzd;
    private long zze;

    public zzsx(zztq zztq0, boolean z, long v, long v1) {
        this.zza = zztq0;
        this.zzd = new zzsw[0];
        this.zze = 0L;
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zza(long v, zzlr zzlr0) {
        if(v != 0L) {
            long v1 = Math.max(0L, Math.min(zzlr0.zzf, v));
            long v2 = Math.max(0L, Math.min(zzlr0.zzg, (this.zzb == 0x8000000000000000L ? 0x7FFFFFFFFFFFFFFFL : this.zzb - v)));
            if(v1 != zzlr0.zzf || v2 != zzlr0.zzg) {
                zzlr0 = new zzlr(v1, v2);
            }
            return this.zza.zza(v, zzlr0);
        }
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzb() {
        long v = this.zza.zzb();
        return v == 0x8000000000000000L || this.zzb != 0x8000000000000000L && v >= this.zzb ? 0x8000000000000000L : v;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzc() {
        long v = this.zza.zzc();
        return v == 0x8000000000000000L || this.zzb != 0x8000000000000000L && v >= this.zzb ? 0x8000000000000000L : v;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        if(this.zzq()) {
            long v = this.zze;
            this.zze = 0x8000000000000001L;
            long v1 = this.zzd();
            return v1 == 0x8000000000000001L ? v : v1;
        }
        boolean z = false;
        long v2 = this.zza.zzd();
        if(v2 == 0x8000000000000001L) {
            return 0x8000000000000001L;
        }
        zzdy.zzf(Long.compare(v2, 0L) >= 0);
        if(this.zzb == 0x8000000000000000L || v2 <= this.zzb) {
            z = true;
        }
        zzdy.zzf(z);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zze(long v) {
        this.zze = 0x8000000000000001L;
        zzsw[] arr_zzsw = this.zzd;
        boolean z = false;
        for(int v1 = 0; v1 < arr_zzsw.length; ++v1) {
            zzsw zzsw0 = arr_zzsw[v1];
            if(zzsw0 != null) {
                zzsw0.zzc();
            }
        }
        long v2 = this.zza.zze(v);
        if(Long.compare(v2, v) == 0 || v2 >= 0L && (this.zzb == 0x8000000000000000L || v2 <= this.zzb)) {
            z = true;
        }
        zzdy.zzf(z);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] arr_zzxf, boolean[] arr_z, zzvj[] arr_zzvj, boolean[] arr_z1, long v) {
        this.zzd = new zzsw[arr_zzvj.length];
        zzvj[] arr_zzvj1 = new zzvj[arr_zzvj.length];
        for(int v2 = 0; true; ++v2) {
            zzvj zzvj0 = null;
            if(v2 >= arr_zzvj.length) {
                break;
            }
            zzsw[] arr_zzsw = this.zzd;
            zzsw zzsw0 = (zzsw)arr_zzvj[v2];
            arr_zzsw[v2] = zzsw0;
            if(zzsw0 != null) {
                zzvj0 = zzsw0.zza;
            }
            arr_zzvj1[v2] = zzvj0;
        }
        long v3 = this.zza.zzf(arr_zzxf, arr_z, arr_zzvj1, arr_z1, v);
        long v4 = !this.zzq() || v != 0L ? v : 0L;
        this.zze = 0x8000000000000001L;
        zzdy.zzf(Long.compare(v3, v4) == 0 || v3 >= 0L && (this.zzb == 0x8000000000000000L || v3 <= this.zzb));
        for(int v1 = 0; v1 < arr_zzvj.length; ++v1) {
            zzvj zzvj1 = arr_zzvj1[v1];
            if(zzvj1 == null) {
                this.zzd[v1] = null;
            }
            else {
                zzsw[] arr_zzsw1 = this.zzd;
                zzsw zzsw1 = arr_zzsw1[v1];
                if(zzsw1 == null || zzsw1.zza != zzvj1) {
                    arr_zzsw1[v1] = new zzsw(this, zzvj1);
                }
            }
            arr_zzvj[v1] = this.zzd[v1];
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final void zzg(zzvl zzvl0) {
        zztq zztq0 = (zztq)zzvl0;
        zztp zztp0 = this.zzc;
        zztp0.getClass();
        zztp0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztq0) {
        zztp zztp0 = this.zzc;
        zztp0.getClass();
        zztp0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzj(long v, boolean z) {
        this.zza.zzj(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzk() {
        this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztp0, long v) {
        this.zzc = zztp0;
        this.zza.zzl(this, v);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzm(long v) {
        this.zza.zzm(v);
    }

    public final void zzn(long v, long v1) {
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzo(long v) {
        return this.zza.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != 0x8000000000000001L;
    }
}

