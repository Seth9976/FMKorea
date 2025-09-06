package com.google.android.gms.internal.ads;

final class zzkq {
    public final zztq zza;
    public final Object zzb;
    public final zzvj[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkr zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlp[] zzi;
    private final zzxl zzj;
    private final zzlf zzk;
    private zzkq zzl;
    private zzvs zzm;
    private zzxm zzn;
    private long zzo;

    public zzkq(zzlp[] arr_zzlp, long v, zzxl zzxl0, zzxu zzxu0, zzlf zzlf0, zzkr zzkr0, zzxm zzxm0) {
        this.zzi = arr_zzlp;
        this.zzo = v;
        this.zzj = zzxl0;
        this.zzk = zzlf0;
        this.zzb = zzkr0.zza.zza;
        this.zzf = zzkr0;
        this.zzm = zzvs.zza;
        this.zzn = zzxm0;
        this.zzc = new zzvj[2];
        this.zzh = new boolean[2];
        long v1 = zzkr0.zzd;
        zztq zztq0 = zzlf0.zzp(zzkr0.zza, zzxu0, zzkr0.zzb);
        if(v1 != 0x8000000000000001L) {
            zztq0 = new zzsx(zztq0, true, 0L, v1);
        }
        this.zza = zztq0;
    }

    public final long zza(zzxm zzxm0, long v, boolean z) {
        return this.zzb(zzxm0, v, false, new boolean[2]);
    }

    public final long zzb(zzxm zzxm0, long v, boolean z, boolean[] arr_z) {
        for(int v1 = 0; true; ++v1) {
            boolean z1 = true;
            if(v1 >= zzxm0.zza) {
                break;
            }
            boolean[] arr_z1 = this.zzh;
            if(z || !zzxm0.zza(this.zzn, v1)) {
                z1 = false;
            }
            arr_z1[v1] = z1;
        }
        for(int v2 = 0; true; ++v2) {
            zzlp[] arr_zzlp = this.zzi;
            if(v2 >= 2) {
                break;
            }
            arr_zzlp[v2].zzb();
        }
        this.zzs();
        this.zzn = zzxm0;
        this.zzt();
        long v3 = this.zza.zzf(zzxm0.zzc, this.zzh, this.zzc, arr_z, v);
        for(int v4 = 0; true; ++v4) {
            zzlp[] arr_zzlp1 = this.zzi;
            if(v4 >= 2) {
                break;
            }
            arr_zzlp1[v4].zzb();
        }
        this.zze = false;
        for(int v5 = 0; true; ++v5) {
            zzvj[] arr_zzvj = this.zzc;
            if(v5 >= 2) {
                break;
            }
            if(arr_zzvj[v5] == null) {
                zzdy.zzf(zzxm0.zzc[v5] == null);
            }
            else {
                zzdy.zzf(zzxm0.zzb(v5));
                this.zzi[v5].zzb();
                this.zze = true;
            }
        }
        return v3;
    }

    public final long zzc() {
        if(!this.zzd) {
            return this.zzf.zzb;
        }
        long v = this.zze ? this.zza.zzb() : 0x8000000000000000L;
        return v == 0x8000000000000000L ? this.zzf.zze : v;
    }

    public final long zzd() {
        return this.zzd ? this.zza.zzc() : 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzkq zzg() {
        return this.zzl;
    }

    public final zzvs zzh() {
        return this.zzm;
    }

    public final zzxm zzi() {
        return this.zzn;
    }

    public final zzxm zzj(float f, zzcw zzcw0) {
        zzxm zzxm0 = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzcw0);
        zzxf[] arr_zzxf = zzxm0.zzc;
        for(int v = 0; v < arr_zzxf.length; ++v) {
            zzxf zzxf0 = arr_zzxf[v];
        }
        return zzxm0;
    }

    public final void zzk(long v) {
        zzdy.zzf(this.zzu());
        this.zza.zzo(v - this.zzo);
    }

    public final void zzl(float f, zzcw zzcw0) {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxm zzxm0 = this.zzj(f, zzcw0);
        long v = this.zzf.zzb;
        long v1 = this.zzf.zze;
        if(v1 != 0x8000000000000001L && v >= v1) {
            v = Math.max(0L, v1 - 1L);
        }
        long v2 = this.zza(zzxm0, v, false);
        this.zzo += this.zzf.zzb - v2;
        this.zzf = this.zzf.zzb(v2);
    }

    public final void zzm(long v) {
        zzdy.zzf(this.zzu());
        if(this.zzd) {
            this.zza.zzm(v - this.zzo);
        }
    }

    public final void zzn() {
        this.zzs();
        zzlf zzlf0 = this.zzk;
        zztq zztq0 = this.zza;
        try {
            if(zztq0 instanceof zzsx) {
                zzlf0.zzi(((zzsx)zztq0).zza);
                return;
            }
            zzlf0.zzi(zztq0);
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        zzes.zzd("MediaPeriodHolder", "Period release failed.", runtimeException0);
    }

    public final void zzo(zzkq zzkq0) {
        if(zzkq0 == this.zzl) {
            return;
        }
        this.zzs();
        this.zzl = zzkq0;
        this.zzt();
    }

    public final void zzp(long v) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztq zztq0 = this.zza;
        if(zztq0 instanceof zzsx) {
            ((zzsx)zztq0).zzn(0L, (this.zzf.zzd == 0x8000000000000001L ? 0x8000000000000000L : this.zzf.zzd));
        }
    }

    // 去混淆评级： 低(20)
    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == 0x8000000000000000L);
    }

    private final void zzs() {
        if(this.zzu()) {
            for(int v = 0; v < this.zzn.zza; ++v) {
                zzxf zzxf0 = this.zzn.zzc[v];
            }
        }
    }

    private final void zzt() {
        if(this.zzu()) {
            for(int v = 0; v < this.zzn.zza; ++v) {
                zzxf zzxf0 = this.zzn.zzc[v];
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }
}

