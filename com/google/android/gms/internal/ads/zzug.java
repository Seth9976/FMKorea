package com.google.android.gms.internal.ads;

final class zzug implements zztp, zztq {
    private final zztq zza;
    private final long zzb;
    private zztp zzc;

    public zzug(zztq zztq0, long v) {
        this.zza = zztq0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zza(long v, zzlr zzlr0) {
        return this.zza.zza(v - this.zzb, zzlr0) + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzb() {
        long v = this.zza.zzb();
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzc() {
        long v = this.zza.zzc();
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        long v = this.zza.zzd();
        return v == 0x8000000000000001L ? 0x8000000000000001L : v + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zze(long v) {
        return this.zza.zze(v - this.zzb) + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] arr_zzxf, boolean[] arr_z, zzvj[] arr_zzvj, boolean[] arr_z1, long v) {
        zzvj[] arr_zzvj1 = new zzvj[arr_zzvj.length];
        for(int v2 = 0; true; ++v2) {
            zzvj zzvj0 = null;
            if(v2 >= arr_zzvj.length) {
                break;
            }
            zzuh zzuh0 = (zzuh)arr_zzvj[v2];
            if(zzuh0 != null) {
                zzvj0 = zzuh0.zzc();
            }
            arr_zzvj1[v2] = zzvj0;
        }
        long v3 = this.zza.zzf(arr_zzxf, arr_z, arr_zzvj1, arr_z1, v - this.zzb);
        for(int v1 = 0; v1 < arr_zzvj.length; ++v1) {
            zzvj zzvj1 = arr_zzvj1[v1];
            if(zzvj1 == null) {
                arr_zzvj[v1] = null;
            }
            else {
                zzvj zzvj2 = arr_zzvj[v1];
                if(zzvj2 == null || ((zzuh)zzvj2).zzc() != zzvj1) {
                    arr_zzvj[v1] = new zzuh(zzvj1, this.zzb);
                }
            }
        }
        return v3 + this.zzb;
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
        this.zza.zzj(v - this.zzb, false);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzk() {
        this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztp0, long v) {
        this.zzc = zztp0;
        this.zza.zzl(this, v - this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzm(long v) {
        this.zza.zzm(v - this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzo(long v) {
        return this.zza.zzo(v - this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

