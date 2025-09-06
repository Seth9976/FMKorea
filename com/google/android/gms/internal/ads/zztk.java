package com.google.android.gms.internal.ads;

public final class zztk implements zztp, zztq {
    public final zzts zza;
    private final long zzb;
    private zztu zzc;
    private zztq zzd;
    private zztp zze;
    private long zzf;
    private final zzxu zzg;

    public zztk(zzts zzts0, zzxu zzxu0, long v) {
        this.zza = zzts0;
        this.zzg = zzxu0;
        this.zzb = v;
        this.zzf = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zza(long v, zzlr zzlr0) {
        return this.zzd.zza(v, zzlr0);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzb() {
        return this.zzd.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzc() {
        return this.zzd.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        return this.zzd.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zze(long v) {
        return this.zzd.zze(v);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] arr_zzxf, boolean[] arr_z, zzvj[] arr_zzvj, boolean[] arr_z1, long v) {
        long v1 = this.zzf;
        if(v1 != 0x8000000000000001L && v == this.zzb) {
            this.zzf = 0x8000000000000001L;
            return this.zzd.zzf(arr_zzxf, arr_z, arr_zzvj, arr_z1, v1);
        }
        return this.zzd.zzf(arr_zzxf, arr_z, arr_zzvj, arr_z1, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final void zzg(zzvl zzvl0) {
        zztq zztq0 = (zztq)zzvl0;
        this.zze.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        return this.zzd.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztq0) {
        this.zze.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzj(long v, boolean z) {
        this.zzd.zzj(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzk() {
        zztq zztq0 = this.zzd;
        if(zztq0 != null) {
            zztq0.zzk();
            return;
        }
        zztu zztu0 = this.zzc;
        if(zztu0 != null) {
            zztu0.zzz();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztp0, long v) {
        this.zze = zztp0;
        zztq zztq0 = this.zzd;
        if(zztq0 != null) {
            zztq0.zzl(this, this.zzv(this.zzb));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzm(long v) {
        this.zzd.zzm(v);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzo(long v) {
        return this.zzd != null && this.zzd.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzp() {
        return this.zzd != null && this.zzd.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzts zzts0) {
        long v = this.zzv(this.zzb);
        zztu zztu0 = this.zzc;
        zztu0.getClass();
        zztq zztq0 = zztu0.zzI(zzts0, this.zzg, v);
        this.zzd = zztq0;
        if(this.zze != null) {
            zztq0.zzl(this, v);
        }
    }

    public final void zzs(long v) {
        this.zzf = v;
    }

    public final void zzt() {
        zztq zztq0 = this.zzd;
        if(zztq0 != null) {
            zztu zztu0 = this.zzc;
            zztu0.getClass();
            zztu0.zzG(zztq0);
        }
    }

    public final void zzu(zztu zztu0) {
        zzdy.zzf(this.zzc == null);
        this.zzc = zztu0;
    }

    private final long zzv(long v) {
        return this.zzf == 0x8000000000000001L ? v : this.zzf;
    }
}

