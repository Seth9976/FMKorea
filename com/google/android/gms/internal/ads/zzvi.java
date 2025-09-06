package com.google.android.gms.internal.ads;

public final class zzvi implements zzace {
    private boolean zzA;
    private boolean zzB;
    private zzra zzC;
    private final zzvc zza;
    private final zzve zzb;
    private final zzvp zzc;
    private final zzqz zzd;
    private final zzqt zze;
    private zzvh zzf;
    private zzam zzg;
    private int zzh;
    private long[] zzi;
    private long[] zzj;
    private int[] zzk;
    private int[] zzl;
    private long[] zzm;
    private zzacd[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzam zzy;
    private zzam zzz;

    protected zzvi(zzxu zzxu0, zzqz zzqz0, zzqt zzqt0) {
        this.zzd = zzqz0;
        this.zze = zzqt0;
        this.zza = new zzvc(zzxu0);
        this.zzb = new zzve();
        this.zzh = 1000;
        this.zzi = new long[1000];
        this.zzj = new long[1000];
        this.zzm = new long[1000];
        this.zzl = new int[1000];
        this.zzk = new int[1000];
        this.zzn = new zzacd[1000];
        this.zzc = new zzvp(zzvd.zza);
        this.zzs = 0x8000000000000000L;
        this.zzt = 0x8000000000000000L;
        this.zzu = 0x8000000000000000L;
        this.zzx = true;
        this.zzw = true;
        this.zzA = true;
    }

    private final int zzA(int v) {
        int v1 = this.zzq + v;
        return v1 >= this.zzh ? v1 - this.zzh : v1;
    }

    private final int zzB(zzkn zzkn0, zzht zzht0, boolean z, boolean z1, zzve zzve0) {
        synchronized(this) {
            zzht0.zzc = false;
            if(!this.zzJ()) {
                if(!z1 && !this.zzv) {
                    zzam zzam0 = this.zzz;
                    if(zzam0 != null && (z || zzam0 != this.zzg)) {
                        this.zzG(zzam0, zzkn0);
                        return -5;
                    }
                    return -3;
                }
                zzht0.zzc(4);
                zzht0.zzd = 0x8000000000000000L;
                return -4;
            }
            zzam zzam1 = ((zzvg)this.zzc.zza(this.zzp + this.zzr)).zza;
            if(!z && zzam1 == this.zzg) {
                int v1 = this.zzA(this.zzr);
                if(!this.zzK(v1)) {
                    zzht0.zzc = true;
                    return -3;
                }
                zzht0.zzc(this.zzl[v1]);
                if(this.zzr == this.zzo - 1 && (z1 || this.zzv)) {
                    zzht0.zza(0x20000000);
                }
                long v2 = this.zzm[v1];
                zzht0.zzd = v2;
                if(v2 < this.zzs) {
                    zzht0.zza(0x80000000);
                }
                zzve0.zza = this.zzk[v1];
                zzve0.zzb = this.zzj[v1];
                zzve0.zzc = this.zzn[v1];
                return -4;
            }
            this.zzG(zzam1, zzkn0);
            return -5;
        }
    }

    private final long zzC(long v, boolean z, boolean z1) {
        synchronized(this) {
            int v2 = this.zzo;
            if(v2 != 0) {
                int v3 = this.zzq;
                if(v >= this.zzm[v3]) {
                    if(z1) {
                        int v4 = this.zzr;
                        if(v4 != v2) {
                            v2 = v4 + 1;
                        }
                    }
                    int v5 = this.zzz(v3, v2, v, false);
                    return v5 == -1 ? -1L : this.zzE(v5);
                }
            }
            return -1L;
        }
    }

    private final long zzD() {
        synchronized(this) {
            int v1 = this.zzo;
            return v1 == 0 ? -1L : this.zzE(v1);
        }
    }

    private final long zzE(int v) {
        long v1 = this.zzt;
        long v2 = 0x8000000000000000L;
        if(v != 0) {
            int v3 = this.zzA(v - 1);
            for(int v4 = 0; v4 < v; ++v4) {
                v2 = Math.max(v2, this.zzm[v3]);
                if((this.zzl[v3] & 1) != 0) {
                    break;
                }
                --v3;
                v3 = v3 == -1 ? this.zzh - 1 : v3 - 1;
            }
        }
        this.zzt = Math.max(v1, v2);
        this.zzo -= v;
        int v5 = this.zzp + v;
        this.zzp = v5;
        int v6 = this.zzq + v;
        this.zzq = v6;
        int v7 = this.zzh;
        if(v6 >= v7) {
            this.zzq = v6 - v7;
        }
        int v8 = this.zzr - v;
        this.zzr = v8;
        if(v8 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(v5);
        if(this.zzo == 0) {
            int v9 = this.zzq == 0 ? this.zzh : this.zzq;
            return this.zzj[v9 - 1] + ((long)this.zzk[v9 - 1]);
        }
        return this.zzj[this.zzq];
    }

    private final void zzF(long v, int v1, long v2, int v3, zzacd zzacd0) {
        synchronized(this) {
            int v5 = this.zzo;
            if(v5 > 0) {
                int v6 = this.zzA(v5 - 1);
                zzdy.zzd(this.zzj[v6] + ((long)this.zzk[v6]) <= v2);
            }
            this.zzv = (0x20000000 & v1) != 0;
            this.zzu = Math.max(this.zzu, v);
            int v7 = this.zzA(this.zzo);
            this.zzm[v7] = v;
            this.zzj[v7] = v2;
            this.zzk[v7] = v3;
            this.zzl[v7] = v1;
            this.zzn[v7] = zzacd0;
            this.zzi[v7] = 0L;
            if(this.zzc.zzf() || !((zzvg)this.zzc.zzb()).zza.equals(this.zzz)) {
                zzqy zzqy0 = zzqy.zzb;
                zzvp zzvp0 = this.zzc;
                int v8 = this.zzp + this.zzo;
                zzam zzam0 = this.zzz;
                if(zzam0 == null) {
                    throw null;
                }
                zzvp0.zzc(v8, new zzvg(zzam0, zzqy0, null));
            }
            int v9 = this.zzo + 1;
            this.zzo = v9;
            int v10 = this.zzh;
            if(v9 == v10) {
                long[] arr_v = new long[v10 + 1000];
                long[] arr_v1 = new long[v10 + 1000];
                long[] arr_v2 = new long[v10 + 1000];
                int[] arr_v3 = new int[v10 + 1000];
                int[] arr_v4 = new int[v10 + 1000];
                zzacd[] arr_zzacd = new zzacd[v10 + 1000];
                int v11 = v10 - this.zzq;
                System.arraycopy(this.zzj, this.zzq, arr_v1, 0, v11);
                System.arraycopy(this.zzm, this.zzq, arr_v2, 0, v11);
                System.arraycopy(this.zzl, this.zzq, arr_v3, 0, v11);
                System.arraycopy(this.zzk, this.zzq, arr_v4, 0, v11);
                System.arraycopy(this.zzn, this.zzq, arr_zzacd, 0, v11);
                System.arraycopy(this.zzi, this.zzq, arr_v, 0, v11);
                int v12 = this.zzq;
                System.arraycopy(this.zzj, 0, arr_v1, v11, v12);
                System.arraycopy(this.zzm, 0, arr_v2, v11, v12);
                System.arraycopy(this.zzl, 0, arr_v3, v11, v12);
                System.arraycopy(this.zzk, 0, arr_v4, v11, v12);
                System.arraycopy(this.zzn, 0, arr_zzacd, v11, v12);
                System.arraycopy(this.zzi, 0, arr_v, v11, v12);
                this.zzj = arr_v1;
                this.zzm = arr_v2;
                this.zzl = arr_v3;
                this.zzk = arr_v4;
                this.zzn = arr_zzacd;
                this.zzi = arr_v;
                this.zzq = 0;
                this.zzh = v10 + 1000;
            }
        }
    }

    private final void zzG(zzam zzam0, zzkn zzkn0) {
        zzam zzam1 = this.zzg;
        boolean z = zzam1 == null;
        zzra zzra0 = null;
        this.zzg = zzam0;
        zzkn0.zza = zzam0.zzc(this.zzd.zza(zzam0));
        zzkn0.zzb = this.zzC;
        if(!z && zzfk.zzD((z ? null : zzam1.zzp), zzam0.zzp)) {
            return;
        }
        if(zzam0.zzp != null) {
            zzra0 = new zzra(new zzqr(new zzrc(1), 6001));
        }
        this.zzC = zzra0;
        zzkn0.zzb = zzra0;
    }

    private final void zzH() {
        if(this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final void zzI() {
        synchronized(this) {
            this.zzr = 0;
            this.zza.zzg();
        }
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int v) {
        if(this.zzC != null) {
            return (this.zzl[v] & 0x40000000) == 0 ? false : false;
        }
        return true;
    }

    private final boolean zzL(zzam zzam0) {
        synchronized(this) {
            this.zzx = false;
            if(zzfk.zzD(zzam0, this.zzz)) {
                return false;
            }
            this.zzz = this.zzc.zzf() || !((zzvg)this.zzc.zzb()).zza.equals(zzam0) ? zzam0 : ((zzvg)this.zzc.zzb()).zza;
            this.zzA &= zzcc.zze(this.zzz.zzm, this.zzz.zzj);
            this.zzB = false;
            return true;
        }
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final int zzb(long v, boolean z) {
        synchronized(this) {
            int v2 = this.zzr;
            int v3 = this.zzA(v2);
            if(this.zzJ() && v >= this.zzm[v3]) {
                if(v > this.zzu && z) {
                    return this.zzo - v2;
                }
                int v4 = this.zzz(v3, this.zzo - v2, v, true);
                return v4 == -1 ? 0 : v4;
            }
            return 0;
        }
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    public final int zzd(zzkn zzkn0, zzht zzht0, int v, boolean z) {
        int v1 = this.zzB(zzkn0, zzht0, (v & 2) != 0, z, this.zzb);
        if(v1 == -4) {
            if(!zzht0.zzg()) {
                boolean z1 = false;
                if((v & 4) == 0) {
                    z1 = true;
                    if((v & 1) != 0) {
                        this.zza.zzd(zzht0, this.zzb);
                        return -4;
                    }
                    this.zza.zze(zzht0, this.zzb);
                }
                else if((v & 1) == 0) {
                    z1 = true;
                }
                if(z1) {
                    ++this.zzr;
                    return -4;
                }
            }
            return -4;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final int zze(zzt zzt0, int v, boolean z) {
        return zzacc.zza(this, zzt0, v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final int zzf(zzt zzt0, int v, boolean z, int v1) {
        return this.zza.zza(zzt0, v, z);
    }

    public final long zzg() {
        synchronized(this) {
        }
        return this.zzu;
    }

    public final zzam zzh() {
        synchronized(this) {
            if(this.zzx) {
                return null;
            }
        }
        return this.zzz;
    }

    public final void zzi(long v, boolean z, boolean z1) {
        long v1 = this.zzC(v, false, z1);
        this.zza.zzc(v1);
    }

    public final void zzj() {
        long v = this.zzD();
        this.zza.zzc(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzk(zzam zzam0) {
        this.zzy = zzam0;
        boolean z = this.zzL(zzam0);
        zzvh zzvh0 = this.zzf;
        if(zzvh0 != null && z) {
            zzvh0.zzL(zzam0);
        }
    }

    static void zzl(zzvg zzvg0) {
    }

    public final void zzm() {
        zzra zzra0 = this.zzC;
        if(zzra0 != null) {
            throw zzra0.zza();
        }
    }

    public final void zzn() {
        this.zzj();
        this.zzH();
    }

    public final void zzo() {
        this.zzp(true);
        this.zzH();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = 0x8000000000000000L;
        this.zzt = 0x8000000000000000L;
        this.zzu = 0x8000000000000000L;
        this.zzv = false;
        this.zzc.zzd();
        if(z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzq(zzfb zzfb0, int v) {
        zzacc.zzb(this, zzfb0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzr(zzfb zzfb0, int v, int v1) {
        this.zza.zzh(zzfb0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzace
    public final void zzs(long v, int v1, int v2, int v3, zzacd zzacd0) {
        if(this.zzw) {
            if((v1 & 1) == 0) {
                return;
            }
            this.zzw = false;
        }
        if(this.zzA) {
            if(v < this.zzs) {
                return;
            }
            if((v1 & 1) == 0) {
                if(!this.zzB) {
                    zzes.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.zzz);
                    this.zzB = true;
                }
                v1 |= 1;
            }
        }
        this.zzF(v, v1, this.zza.zzb() - ((long)v2) - ((long)v3), v2, zzacd0);
    }

    public final void zzt(long v) {
        this.zzs = v;
    }

    public final void zzu(zzvh zzvh0) {
        this.zzf = zzvh0;
    }

    public final void zzv(int v) {
        boolean z = false;
        synchronized(this) {
            if(v >= 0 && this.zzr + v <= this.zzo) {
                z = true;
            }
            zzdy.zzd(z);
            this.zzr += v;
        }
    }

    public final boolean zzw() {
        synchronized(this) {
        }
        return this.zzv;
    }

    public final boolean zzx(boolean z) {
        boolean z1 = true;
        synchronized(this) {
            if(!this.zzJ()) {
                if(!z && !this.zzv) {
                    zzam zzam0 = this.zzz;
                    if(zzam0 == null) {
                        z1 = false;
                    }
                    else if(zzam0 == this.zzg) {
                        return false;
                    }
                }
                return z1;
            }
            return ((zzvg)this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg ? true : this.zzK(this.zzA(this.zzr));
        }
    }

    public final boolean zzy(long v, boolean z) {
        int v4;
        synchronized(this) {
            this.zzI();
            int v2 = this.zzr;
            int v3 = this.zzA(v2);
            if(this.zzJ() && v >= this.zzm[v3]) {
                boolean z1 = false;
                if(Long.compare(v, this.zzu) <= 0) {
                    z1 = true;
                }
                else if(z) {
                    z1 = true;
                    z = true;
                }
                if(z1) {
                    if(this.zzA) {
                        v4 = this.zzo - v2;
                        int v5 = v3;
                        while(v5 < v4) {
                            if(this.zzm[v5] >= v) {
                                v4 = v5 - v3;
                                goto label_22;
                            }
                            ++v5;
                        }
                        if(!z) {
                            v4 = -1;
                        }
                    }
                    else {
                        v4 = this.zzz(v3, this.zzo - v2, v, true);
                    }
                label_22:
                    if(v4 == -1) {
                        return false;
                    }
                    this.zzs = v;
                    this.zzr += v4;
                    return true;
                }
            }
            return false;
        }
    }

    private final int zzz(int v, int v1, long v2, boolean z) {
        int v3 = -1;
        int v4 = 0;
        while(v4 < v1) {
            int v5 = Long.compare(this.zzm[v], v2);
            if(v5 > 0) {
                break;
            }
            if(!z || (this.zzl[v] & 1) != 0) {
                v3 = v4;
                if(v5 != 0) {
                    goto label_8;
                }
                break;
            }
        label_8:
            ++v;
            v = v == this.zzh ? 0 : v + 1;
            ++v4;
        }
        return v3;
    }
}

