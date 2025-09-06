package com.google.android.gms.internal.ads;

abstract class zzahy {
    private final zzahr zza;
    private zzace zzb;
    private zzabe zzc;
    private zzaht zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzahv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    public zzahy() {
        this.zza = new zzahr();
        this.zzj = new zzahv();
    }

    protected abstract long zza(zzfb arg1);

    protected void zzb(boolean z) {
        int v;
        if(z) {
            this.zzj = new zzahv();
            this.zzf = 0L;
            v = 0;
        }
        else {
            v = 1;
        }
        this.zzh = v;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract boolean zzc(zzfb arg1, long arg2, zzahv arg3);

    final int zze(zzabc zzabc0, zzabx zzabx0) {
        zzdy.zzb(this.zzb);
        switch(this.zzh) {
            case 0: {
                while(true) {
                    if(!this.zza.zze(zzabc0)) {
                        this.zzh = 3;
                        return -1;
                    }
                    this.zzk = zzabc0.zzf() - this.zzf;
                    if(!this.zzc(this.zza.zza(), this.zzf, this.zzj)) {
                        break;
                    }
                    this.zzf = zzabc0.zzf();
                }
                zzam zzam0 = this.zzj.zza;
                this.zzi = zzam0.zzA;
                if(!this.zzm) {
                    this.zzb.zzk(zzam0);
                    this.zzm = true;
                }
                zzaht zzaht0 = this.zzj.zzb;
                if(zzaht0 != null) {
                    this.zzd = zzaht0;
                }
                else if(zzabc0.zzd() == -1L) {
                    this.zzd = new zzahx(null);
                }
                else {
                    zzahs zzahs0 = this.zza.zzb();
                    boolean z = (zzahs0.zza & 4) != 0;
                    this.zzd = new zzahm(this, this.zzf, zzabc0.zzd(), ((long)(zzahs0.zzd + zzahs0.zze)), zzahs0.zzb, z);
                }
                this.zzh = 2;
                this.zza.zzd();
                return 0;
            }
            case 1: {
                ((zzaar)zzabc0).zzo(((int)this.zzf), false);
                this.zzh = 2;
                return 0;
            }
            case 2: {
                long v = this.zzd.zzd(zzabc0);
                if(v >= 0L) {
                    zzabx0.zza = v;
                    return 1;
                }
                if(v < -1L) {
                    this.zzi(-(v + 2L));
                }
                if(!this.zzl) {
                    zzaca zzaca0 = this.zzd.zze();
                    zzdy.zzb(zzaca0);
                    this.zzc.zzN(zzaca0);
                    this.zzl = true;
                }
                if(this.zzk <= 0L && !this.zza.zze(zzabc0)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzfb zzfb0 = this.zza.zza();
                long v1 = this.zza(zzfb0);
                if(v1 >= 0L) {
                    long v2 = this.zzg;
                    if(v2 + v1 >= this.zze) {
                        long v3 = this.zzf(v2);
                        zzacc.zzb(this.zzb, zzfb0, zzfb0.zzd());
                        this.zzb.zzs(v3, 1, zzfb0.zzd(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += v1;
                return 0;
            }
            default: {
                return -1;
            }
        }
    }

    protected final long zzf(long v) {
        return v * 1000000L / ((long)this.zzi);
    }

    protected final long zzg(long v) {
        return ((long)this.zzi) * v / 1000000L;
    }

    final void zzh(zzabe zzabe0, zzace zzace0) {
        this.zzc = zzabe0;
        this.zzb = zzace0;
        this.zzb(true);
    }

    protected void zzi(long v) {
        this.zzg = v;
    }

    final void zzj(long v, long v1) {
        this.zza.zzc();
        if(v == 0L) {
            this.zzb(!this.zzl);
            return;
        }
        if(this.zzh != 0) {
            long v2 = this.zzg(v1);
            this.zze = v2;
            this.zzd.zzg(v2);
            this.zzh = 2;
        }
    }
}

