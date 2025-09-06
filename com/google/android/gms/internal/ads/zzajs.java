package com.google.android.gms.internal.ads;

final class zzajs {
    private final zzfi zza;
    private final zzfb zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    zzajs(int v) {
        this.zza = new zzfi(0L);
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzb = new zzfb();
    }

    public final int zza(zzabc zzabc0, zzabx zzabx0, int v) {
        long v1 = 0x8000000000000001L;
        if(v <= 0) {
            this.zze(zzabc0);
            return 0;
        }
        if(!this.zze) {
            long v2 = zzabc0.zzd();
            int v3 = (int)Math.min(112800L, v2);
            long v4 = v2 - ((long)v3);
            if(zzabc0.zzf() != v4) {
                zzabx0.zza = v4;
                return 1;
            }
            this.zzb.zzD(v3);
            zzabc0.zzj();
            ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, v3, false);
            zzfb zzfb0 = this.zzb;
            int v5 = zzfb0.zzc();
            int v6 = zzfb0.zzd();
            int v7 = v6 - 0xBC;
        alab1:
            while(v7 >= v5) {
                byte[] arr_b = zzfb0.zzI();
                int v8 = 0;
                int v9 = -4;
                while(v9 <= 4) {
                    int v10 = v9 * 0xBC + v7;
                    if(v10 < v5 || v10 >= v6 || arr_b[v10] != 71) {
                        v8 = 0;
                    }
                    else if(v8 + 1 == 5) {
                        goto label_31;
                    }
                    else {
                        ++v8;
                    }
                    ++v9;
                    continue;
                label_31:
                    long v11 = zzakc.zzb(zzfb0, v7, v);
                    if(v11 == 0x8000000000000001L) {
                        break;
                    }
                    v1 = v11;
                    break alab1;
                }
                --v7;
            }
            this.zzg = v1;
            this.zze = true;
            return 0;
        }
        if(this.zzg == 0x8000000000000001L) {
            this.zze(zzabc0);
            return 0;
        }
        if(!this.zzd) {
            int v12 = (int)Math.min(112800L, zzabc0.zzd());
            if(zzabc0.zzf() != 0L) {
                zzabx0.zza = 0L;
                return 1;
            }
            this.zzb.zzD(v12);
            zzabc0.zzj();
            ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, v12, false);
            zzfb zzfb1 = this.zzb;
            int v13 = zzfb1.zzc();
            int v14 = zzfb1.zzd();
            while(v13 < v14) {
                if(zzfb1.zzI()[v13] == 71) {
                    long v15 = zzakc.zzb(zzfb1, v13, v);
                    if(v15 != 0x8000000000000001L) {
                        v1 = v15;
                        break;
                    }
                }
                ++v13;
            }
            this.zzf = v1;
            this.zzd = true;
            return 0;
        }
        long v16 = this.zzf;
        if(v16 == 0x8000000000000001L) {
            this.zze(zzabc0);
            return 0;
        }
        long v17 = this.zza.zzb(v16);
        long v18 = this.zza.zzb(this.zzg) - v17;
        this.zzh = v18;
        if(v18 < 0L) {
            zzes.zzf("TsDurationReader", "Invalid duration: " + v18 + ". Using TIME_UNSET instead.");
            this.zzh = 0x8000000000000001L;
        }
        this.zze(zzabc0);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    private final int zze(zzabc zzabc0) {
        this.zzb.zzE(zzfk.zzf, 0);
        this.zzc = true;
        zzabc0.zzj();
        return 0;
    }
}

