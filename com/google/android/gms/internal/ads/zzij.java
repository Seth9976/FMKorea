package com.google.android.gms.internal.ads;

final class zzij implements zzkp {
    private final zzlu zza;
    private final zzii zzb;
    private zzln zzc;
    private zzkp zzd;
    private boolean zze;
    private boolean zzf;

    public zzij(zzii zzii0, zzdz zzdz0) {
        this.zzb = zzii0;
        this.zza = new zzlu(zzdz0);
        this.zze = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        if(this.zzc == null || this.zzc.zzS() || !this.zzc.zzT() && (z || this.zzc.zzM())) {
            this.zze = true;
            if(this.zzf) {
                this.zza.zzd();
            }
        }
        else {
            zzkp zzkp0 = this.zzd;
            zzkp0.getClass();
            long v = zzkp0.zza();
            if(!this.zze) {
            label_11:
                this.zza.zzb(v);
                zzch zzch0 = zzkp0.zzc();
                if(!zzch0.equals(this.zza.zzc())) {
                    this.zza.zzg(zzch0);
                    this.zzb.zza(zzch0);
                }
            }
            else if(v < this.zza.zza()) {
                this.zza.zze();
            }
            else {
                this.zze = false;
                if(this.zzf) {
                    this.zza.zzd();
                }
                goto label_11;
            }
        }
        if(this.zze) {
            return this.zza.zza();
        }
        zzkp zzkp1 = this.zzd;
        zzkp1.getClass();
        return zzkp1.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zzd == null ? this.zza.zzc() : this.zzd.zzc();
    }

    public final void zzd(zzln zzln0) {
        if(zzln0 == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzln zzln0) {
        zzkp zzkp0 = zzln0.zzk();
        if(zzkp0 != null) {
            zzkp zzkp1 = this.zzd;
            if(zzkp0 != zzkp1) {
                if(zzkp1 != null) {
                    throw zzil.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                }
                this.zzd = zzkp0;
                this.zzc = zzln0;
                zzkp0.zzg(this.zza.zzc());
            }
        }
    }

    public final void zzf(long v) {
        this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzch0) {
        zzkp zzkp0 = this.zzd;
        if(zzkp0 != null) {
            zzkp0.zzg(zzch0);
            zzch0 = this.zzd.zzc();
        }
        this.zza.zzg(zzch0);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}

