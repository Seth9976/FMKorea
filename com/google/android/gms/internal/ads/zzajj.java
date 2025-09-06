package com.google.android.gms.internal.ads;

final class zzajj {
    private final zzfi zza;
    private final zzfb zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    zzajj() {
        this.zza = new zzfi(0L);
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzb = new zzfb();
    }

    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        long v = 0x8000000000000001L;
        if(!this.zze) {
            long v1 = zzabc0.zzd();
            int v2 = (int)Math.min(20000L, v1);
            long v3 = v1 - ((long)v2);
            if(zzabc0.zzf() != v3) {
                zzabx0.zza = v3;
                return 1;
            }
            this.zzb.zzD(v2);
            zzabc0.zzj();
            ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, v2, false);
            zzfb zzfb0 = this.zzb;
            int v4 = zzfb0.zzc();
            for(int v5 = zzfb0.zzd() - 4; v5 >= v4; --v5) {
                if(zzajj.zzg(zzfb0.zzI(), v5) == 442) {
                    zzfb0.zzG(v5 + 4);
                    long v6 = zzajj.zzc(zzfb0);
                    if(v6 != 0x8000000000000001L) {
                        v = v6;
                        break;
                    }
                }
            }
            this.zzg = v;
            this.zze = true;
            return 0;
        }
        if(this.zzg == 0x8000000000000001L) {
            this.zzf(zzabc0);
            return 0;
        }
        if(!this.zzd) {
            int v7 = (int)Math.min(20000L, zzabc0.zzd());
            if(zzabc0.zzf() != 0L) {
                zzabx0.zza = 0L;
                return 1;
            }
            this.zzb.zzD(v7);
            zzabc0.zzj();
            ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, v7, false);
            zzfb zzfb1 = this.zzb;
            int v8 = zzfb1.zzc();
            int v9 = zzfb1.zzd();
            while(v8 < v9 - 3) {
                if(zzajj.zzg(zzfb1.zzI(), v8) == 442) {
                    zzfb1.zzG(v8 + 4);
                    long v10 = zzajj.zzc(zzfb1);
                    if(v10 != 0x8000000000000001L) {
                        v = v10;
                        break;
                    }
                }
                ++v8;
            }
            this.zzf = v;
            this.zzd = true;
            return 0;
        }
        long v11 = this.zzf;
        if(v11 == 0x8000000000000001L) {
            this.zzf(zzabc0);
            return 0;
        }
        long v12 = this.zza.zzb(v11);
        long v13 = this.zza.zzb(this.zzg) - v12;
        this.zzh = v13;
        if(v13 < 0L) {
            zzes.zzf("PsDurationReader", "Invalid duration: " + v13 + ". Using TIME_UNSET instead.");
            this.zzh = 0x8000000000000001L;
        }
        this.zzf(zzabc0);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public static long zzc(zzfb zzfb0) {
        int v = zzfb0.zzc();
        if(zzfb0.zza() < 9) {
            return 0x8000000000000001L;
        }
        byte[] arr_b = new byte[9];
        zzfb0.zzC(arr_b, 0, 9);
        zzfb0.zzG(v);
        int v1 = arr_b[0];
        if((v1 & 0xC4) == 68) {
            int v2 = arr_b[2];
            if((v2 & 4) == 4) {
                int v3 = arr_b[4];
                return (v3 & 4) != 4 || (arr_b[5] & 1) != 1 || (arr_b[8] & 3) != 3 ? 0x8000000000000001L : (((long)v2) & 3L) << 13 | ((((long)v1) & 3L) << 28 | (56L & ((long)v1)) >> 3 << 30 | (((long)arr_b[1]) & 0xFFL) << 20 | (((long)v2) & 0xF8L) >> 3 << 15) | (0xFFL & ((long)arr_b[3])) << 5 | (((long)v3) & 0xF8L) >> 3;
            }
        }
        return 0x8000000000000001L;
    }

    public final zzfi zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    private final int zzf(zzabc zzabc0) {
        this.zzb.zzE(zzfk.zzf, 0);
        this.zzc = true;
        zzabc0.zzj();
        return 0;
    }

    private static final int zzg(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }
}

