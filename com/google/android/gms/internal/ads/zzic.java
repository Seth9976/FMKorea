package com.google.android.gms.internal.ads;

public abstract class zzic implements zzln, zzlp {
    private final Object zza;
    private final int zzb;
    private final zzkn zzc;
    private zzlq zzd;
    private int zze;
    private zzoh zzf;
    private zzdz zzg;
    private int zzh;
    private zzvj zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private zzlo zzp;

    public zzic(int v) {
        this.zza = new Object();
        this.zzb = v;
        this.zzc = new zzkn();
        this.zzm = 0x8000000000000000L;
    }

    protected void zzA() {
    }

    protected void zzB() {
    }

    protected void zzC(zzam[] arr_zzam, long v, long v1) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzD() {
        zzdy.zzf(this.zzh == 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzE(zzam[] arr_zzam, zzvj zzvj0, long v, long v1) {
        zzdy.zzf(!this.zzn);
        this.zzi = zzvj0;
        if(this.zzm == 0x8000000000000000L) {
            this.zzm = v;
        }
        this.zzj = arr_zzam;
        this.zzk = v1;
        this.zzC(arr_zzam, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzF() {
        zzdy.zzf(this.zzh == 0);
        this.zzc.zzb = null;
        this.zzc.zza = null;
        this.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzG(long v) {
        this.zzV(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzH() {
        this.zzn = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzlp
    public final void zzI(zzlo zzlo0) {
        synchronized(this.zza) {
            this.zzp = zzlo0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public void zzJ(float f, float f1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzK() {
        zzdy.zzf(this.zzh == 1);
        this.zzh = 2;
        this.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzL() {
        zzdy.zzf(this.zzh == 2);
        this.zzh = 1;
        this.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final boolean zzM() {
        return this.zzm == 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final boolean zzN() {
        return this.zzn;
    }

    protected final boolean zzO() {
        if(this.zzM()) {
            return this.zzn;
        }
        zzvj zzvj0 = this.zzi;
        zzvj0.getClass();
        return zzvj0.zze();
    }

    protected final zzam[] zzP() {
        zzam[] arr_zzam = this.zzj;
        arr_zzam.getClass();
        return arr_zzam;
    }

    private final void zzV(long v, boolean z) {
        this.zzn = false;
        this.zzl = v;
        this.zzm = v;
        this.zzy(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final int zzbc() {
        return this.zzh;
    }

    protected final int zzbd(zzkn zzkn0, zzht zzht0, int v) {
        zzvj zzvj0 = this.zzi;
        zzvj0.getClass();
        int v1 = zzvj0.zza(zzkn0, zzht0, v);
        if(v1 == -4) {
            if(zzht0.zzg()) {
                this.zzm = 0x8000000000000000L;
                return this.zzn ? -4 : -3;
            }
            long v2 = zzht0.zzd + this.zzk;
            zzht0.zzd = v2;
            this.zzm = Math.max(this.zzm, v2);
            return -4;
        }
        if(v1 == -5) {
            zzam zzam0 = zzkn0.zza;
            zzam0.getClass();
            long v3 = zzam0.zzq;
            if(v3 != 0x7FFFFFFFFFFFFFFFL) {
                zzak zzak0 = zzam0.zzb();
                zzak0.zzW(v3 + this.zzk);
                zzkn0.zza = zzak0.zzY();
                return -5;
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final long zzbe() {
        return this.zzm;
    }

    protected final int zzd(long v) {
        zzvj zzvj0 = this.zzi;
        zzvj0.getClass();
        return zzvj0.zzb(v - this.zzk);
    }

    @Override  // com.google.android.gms.internal.ads.zzlp
    public int zze() {
        return 0;
    }

    protected final long zzf() {
        return this.zzl;
    }

    protected final zzdz zzh() {
        zzdz zzdz0 = this.zzg;
        zzdz0.getClass();
        return zzdz0;
    }

    protected final zzil zzi(Throwable throwable0, zzam zzam0, boolean z, int v) {
        if(zzam0 != null && !this.zzo) {
            try {
                this.zzo = true;
                int v1 = this.zzU(zzam0) & 7;
                this.zzo = false;
                return zzil.zzb(throwable0, this.zzQ(), this.zze, zzam0, v1, z, v);
            }
            catch(zzil unused_ex) {
                this.zzo = false;
                return zzil.zzb(throwable0, this.zzQ(), this.zze, zzam0, 4, z, v);
            }
            catch(Throwable throwable1) {
                this.zzo = false;
                throw throwable1;
            }
        }
        return zzil.zzb(throwable0, this.zzQ(), this.zze, zzam0, 4, z, v);
    }

    protected final zzkn zzj() {
        this.zzc.zzb = null;
        this.zzc.zza = null;
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public zzkp zzk() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final zzlp zzl() {
        return this;
    }

    protected final zzlq zzm() {
        zzlq zzlq0 = this.zzd;
        zzlq0.getClass();
        return zzlq0;
    }

    protected final zzoh zzn() {
        zzoh zzoh0 = this.zzf;
        zzoh0.getClass();
        return zzoh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final zzvj zzo() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzlp
    public final void zzp() {
        synchronized(this.zza) {
            this.zzp = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzq() {
        zzdy.zzf(this.zzh == 1);
        this.zzc.zzb = null;
        this.zzc.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        this.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzr(zzlq zzlq0, zzam[] arr_zzam, zzvj zzvj0, long v, boolean z, boolean z1, long v1, long v2) {
        zzdy.zzf(this.zzh == 0);
        this.zzd = zzlq0;
        this.zzh = 1;
        this.zzx(z, z1);
        this.zzE(arr_zzam, zzvj0, v1, v2);
        this.zzV(v1, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public void zzs() {
    }

    @Override  // com.google.android.gms.internal.ads.zzli
    public void zzt(int v, Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzu(int v, zzoh zzoh0, zzdz zzdz0) {
        this.zze = v;
        this.zzf = zzoh0;
        this.zzg = zzdz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzv() {
        zzvj zzvj0 = this.zzi;
        zzvj0.getClass();
        zzvj0.zzd();
    }

    protected void zzw() {
        throw null;
    }

    protected void zzx(boolean z, boolean z1) {
    }

    protected void zzy(long v, boolean z) {
        throw null;
    }

    protected void zzz() {
    }
}

