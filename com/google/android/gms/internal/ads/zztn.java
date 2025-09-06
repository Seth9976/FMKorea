package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zztn extends zzvu {
    private final boolean zzb;
    private final zzcv zzc;
    private final zzct zzd;
    private zztl zze;
    private zztk zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztn(zztu zztu0, boolean z) {
        super(zztu0);
        boolean z1;
        if(z) {
            zztu0.zzv();
            z1 = true;
        }
        else {
            z1 = false;
        }
        this.zzb = z1;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        zztu0.zzM();
        this.zze = zztl.zzq(zztu0.zzJ());
    }

    public final zzcw zzC() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    protected final zzts zzD(zzts zzts0) {
        return zzts0.zzc((this.zze.zzf == null || !this.zze.zzf.equals(zzts0.zza) ? zzts0.zza : zztl.zzd));
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    protected final void zzE(zzcw zzcw0) {
        long v1;
        zzts zzts0 = null;
        if(this.zzh) {
            this.zze = this.zze.zzp(zzcw0);
            zztk zztk0 = this.zzf;
            if(zztk0 != null) {
                this.zzL(zztk0.zzn());
            }
        }
        else if(zzcw0.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzcw0) : zztl.zzr(zzcw0, zzcv.zza, zztl.zzd);
        }
        else {
            zzcw0.zze(0, this.zzc, 0L);
            Object object0 = this.zzc.zzc;
            zztk zztk1 = this.zzf;
            if(zztk1 == null) {
                v1 = 0L;
            }
            else {
                long v = zztk1.zzq();
                this.zze.zzn(zztk1.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                v1 = v == 0L ? 0L : v;
            }
            Pair pair0 = zzcw0.zzl(this.zzc, this.zzd, 0, v1);
            Object object1 = pair0.first;
            long v2 = (long)(((Long)pair0.second));
            this.zze = this.zzi ? this.zze.zzp(zzcw0) : zztl.zzr(zzcw0, object0, object1);
            zztk zztk2 = this.zzf;
            if(zztk2 != null) {
                this.zzL(v2);
                Object object2 = this.zzK(zztk2.zza.zza);
                zzts0 = zztk2.zza.zzc(object2);
            }
        }
        this.zzi = true;
        this.zzh = true;
        this.zzo(this.zze);
        if(zzts0 != null) {
            zztk zztk3 = this.zzf;
            zztk3.getClass();
            zztk3.zzr(zzts0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    public final void zzF() {
        if(!this.zzb) {
            this.zzg = true;
            this.zzB(null, this.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    public final void zzG(zztq zztq0) {
        ((zztk)zztq0).zzt();
        if(zztq0 == this.zzf) {
            this.zzf = null;
        }
    }

    public final zztk zzH(zzts zzts0, zzxu zzxu0, long v) {
        zztk zztk0 = new zztk(zzts0, zzxu0, v);
        zztk0.zzu(this.zza);
        if(this.zzh) {
            zztk0.zzr(zzts0.zzc(this.zzK(zzts0.zza)));
            return zztk0;
        }
        this.zzf = zztk0;
        if(!this.zzg) {
            this.zzg = true;
            this.zzB(null, this.zza);
        }
        return zztk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    public final zztq zzI(zzts zzts0, zzxu zzxu0, long v) {
        return this.zzH(zzts0, zzxu0, v);
    }

    private final Object zzK(Object object0) {
        return this.zze.zzf == null || !object0.equals(zztl.zzd) ? object0 : this.zze.zzf;
    }

    private final void zzL(long v) {
        zztk zztk0 = this.zzf;
        int v1 = this.zze.zza(zztk0.zza.zza);
        if(v1 == -1) {
            return;
        }
        this.zze.zzd(v1, this.zzd, false);
        long v2 = this.zzd.zze;
        if(v2 != 0x8000000000000001L && v >= v2) {
            v = Math.max(0L, v2 - 1L);
        }
        zztk0.zzs(v);
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zzt(zzbp zzbp0) {
        this.zze = this.zzi ? this.zze.zzp(new zzvq(this.zze.zzc, zzbp0)) : zztl.zzq(zzbp0);
        this.zza.zzt(zzbp0);
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    public final void zzz() {
    }
}

