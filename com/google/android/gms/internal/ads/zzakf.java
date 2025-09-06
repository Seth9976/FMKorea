package com.google.android.gms.internal.ads;

final class zzakf implements zzakg {
    private static final int[] zza;
    private static final int[] zzb;
    private final zzabe zzc;
    private final zzace zzd;
    private final zzakj zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfb zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    static {
        zzakf.zza = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        zzakf.zzb = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 0x1F, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 0x76, 130, 0x8F, 0x9D, 0xAD, 190, 209, 230, 0xFD, 279, 307, 337, 371, 408, 449, 494, 0x220, 598, 658, 724, 796, 876, 963, 1060, 0x48E, 0x502, 0x583, 0x610, 1707, 0x756, 2066, 0x8E0, 0x9C3, 0xABD, 0xBD0, 0xCFF, 3660, 0xFBA, 4428, 0x1307, 5358, 0x1706, 6484, 7132, 7845, 8630, 9493, 10442, 0x2CDF, 0x315B, 0x364B, 0x3BB9, 0x41B2, 18500, 20350, 0x5771, 0x602F, 27086, 0x7462, 0x7FFF};
    }

    public zzakf(zzabe zzabe0, zzace zzace0, zzakj zzakj0) {
        this.zzc = zzabe0;
        this.zzd = zzace0;
        this.zze = zzakj0;
        int v = Math.max(1, zzakj0.zzc / 10);
        this.zzi = v;
        zzfb zzfb0 = new zzfb(zzakj0.zzf);
        zzfb0.zzj();
        int v1 = zzfb0.zzj();
        this.zzf = v1;
        int v2 = zzakj0.zzb;
        int v3 = zzakj0.zzd;
        int v4 = (v3 - v2 * 4) * 8 / (zzakj0.zze * v2) + 1;
        if(v1 != v4) {
            throw zzcd.zza(("Expected frames per block: " + v4 + "; got: " + v1), null);
        }
        int v5 = (v + v1 - 1) / v1;
        this.zzg = new byte[v3 * v5];
        this.zzh = new zzfb(v5 * ((v1 + v1) * v2));
        int v6 = zzakj0.zzc * zzakj0.zzd * 8 / v1;
        zzak zzak0 = new zzak();
        zzak0.zzS("audio/raw");
        zzak0.zzv(v6);
        zzak0.zzO(v6);
        zzak0.zzL((v + v) * v2);
        zzak0.zzw(zzakj0.zzb);
        zzak0.zzT(zzakj0.zzc);
        zzak0.zzN(2);
        this.zzj = zzak0.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.zzakg
    public final void zza(int v, long v1) {
        zzakm zzakm0 = new zzakm(this.zze, this.zzf, ((long)v), v1);
        this.zzc.zzN(zzakm0);
        this.zzd.zzk(this.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzakg
    public final void zzb(long v) {
        this.zzk = 0;
        this.zzl = v;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzakg
    public final boolean zzc(zzabc zzabc0, long v) {
        boolean z;
        int v1 = this.zzd(this.zzm);
        int v2 = (this.zzi - v1 + this.zzf - 1) / this.zzf * this.zze.zzd;
        if(Long.compare(v, 0L) != 0) {
            z = false;
            goto label_6;
        }
        while(true) {
            z = true;
        label_6:
            if(z) {
                break;
            }
            int v3 = this.zzk;
            if(v3 >= v2) {
                break;
            }
            int v4 = zzabc0.zza(this.zzg, this.zzk, ((int)Math.min(v2 - v3, v)));
            if(v4 == -1) {
                continue;
            }
            this.zzk += v4;
            goto label_6;
        }
        int v5 = this.zzk / this.zze.zzd;
        if(v5 > 0) {
            byte[] arr_b = this.zzg;
            zzfb zzfb0 = this.zzh;
            for(int v6 = 0; v6 < v5; ++v6) {
                for(int v7 = 0; true; ++v7) {
                    zzakj zzakj0 = this.zze;
                    int v8 = zzakj0.zzb;
                    if(v7 >= v8) {
                        break;
                    }
                    byte[] arr_b1 = zzfb0.zzI();
                    int v9 = zzakj0.zzd / v8 - 4;
                    int v10 = v6 * zzakj0.zzd + v7 * 4;
                    int v11 = arr_b[v10 + 1] & 0xFF;
                    int v12 = arr_b[v10] & 0xFF;
                    int v13 = Math.min(arr_b[v10 + 2] & 0xFF, 88);
                    int v14 = zzakf.zzb[v13];
                    int v15 = this.zzf * v6 * v8 + v7;
                    int v16 = (short)(v11 << 8 | v12);
                    int v17 = v15 + v15;
                    arr_b1[v17] = (byte)(v16 & 0xFF);
                    arr_b1[v17 + 1] = (byte)(v16 >> 8);
                    int v18 = 0;
                    while(v18 < v9 + v9) {
                        int v19 = arr_b[v8 * 4 + v10 + v18 / 8 * v8 * 4 + v18 / 2 % 4];
                        int v20 = v18 % 2 == 0 ? v19 & 15 : (v19 & 0xFF) >> 4;
                        v16 = Math.max(0xFFFF8000, Math.min(v16 + ((v20 & 8) == 0 ? ((v20 & 7) * 2 + 1) * v14 >> 3 : -(((v20 & 7) * 2 + 1) * v14 >> 3)), 0x7FFF));
                        v17 = v8 * 2 + v17;
                        arr_b1[v17] = (byte)(v16 & 0xFF);
                        arr_b1[v17 + 1] = (byte)(v16 >> 8);
                        int v21 = Math.max(0, Math.min(v13 + zzakf.zza[v20], 88));
                        v14 = zzakf.zzb[v21];
                        ++v18;
                        v13 = v21;
                    }
                }
            }
            zzfb0.zzG(0);
            zzfb0.zzF(this.zze(this.zzf * v5));
            this.zzk -= v5 * this.zze.zzd;
            int v22 = this.zzh.zzd();
            zzacc.zzb(this.zzd, this.zzh, v22);
            int v23 = this.zzm + v22;
            this.zzm = v23;
            int v24 = this.zzd(v23);
            int v25 = this.zzi;
            if(v24 >= v25) {
                this.zzf(v25);
            }
        }
        if(z) {
            int v26 = this.zzd(this.zzm);
            if(v26 > 0) {
                this.zzf(v26);
            }
        }
        return z;
    }

    private final int zzd(int v) {
        int v1 = this.zze.zzb;
        return v / (v1 + v1);
    }

    private final int zze(int v) {
        return (v + v) * this.zze.zzb;
    }

    private final void zzf(int v) {
        long v1 = this.zzl;
        long v2 = zzfk.zzq(this.zzn, 1000000L, this.zze.zzc);
        int v3 = this.zze(v);
        this.zzd.zzs(v1 + v2, 1, v3, this.zzm - v3, null);
        this.zzn += (long)v;
        this.zzm -= v3;
    }
}

