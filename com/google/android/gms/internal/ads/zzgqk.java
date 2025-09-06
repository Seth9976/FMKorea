package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzgqk extends zzgqq {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    zzgqk(byte[] arr_b, int v, int v1, boolean z, zzgqj zzgqj0) {
        super(null);
        this.zzk = 0x7FFFFFFF;
        this.zze = arr_b;
        this.zzf = v1 + v;
        this.zzh = v;
        this.zzi = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final void zzA(int v) {
        this.zzk = v;
        this.zzJ();
    }

    public final void zzB(int v) {
        if(v >= 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                this.zzh = v1 + v;
                return;
            }
        }
        throw v >= 0 ? zzgsc.zzj() : zzgsc.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzC() {
        return this.zzh == this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzD() {
        return this.zzr() != 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzE(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.zzf - this.zzh >= 10) {
                    while(v1 < 10) {
                        int v3 = this.zzh;
                        this.zzh = v3 + 1;
                        if(this.zze[v3] >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw zzgsc.zze();
                }
                else {
                    while(true) {
                        if(v1 >= 10) {
                            throw zzgsc.zze();
                        }
                        if(this.zza() >= 0) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
            case 1: {
                this.zzB(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            do {
                                int v2 = this.zzm();
                            }
                            while(v2 != 0 && this.zzE(v2));
                            this.zzz(v >>> 3 << 3 | 4);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzgsc.zza();
                            }
                            this.zzB(4);
                            return true;
                        }
                    }
                }
                this.zzB(this.zzj());
                return true;
            }
        }
    }

    private final void zzJ() {
        int v = this.zzf + this.zzg;
        this.zzf = v;
        int v1 = v - this.zzi;
        int v2 = this.zzk;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.zzg = v3;
            this.zzf = v - v3;
            return;
        }
        this.zzg = 0;
    }

    public final byte zza() {
        int v = this.zzh;
        if(v == this.zzf) {
            throw zzgsc.zzj();
        }
        this.zzh = v + 1;
        return this.zze[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final double zzb() {
        return Double.longBitsToDouble(this.zzq());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final float zzc() {
        return Float.intBitsToFloat(this.zzi());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzd() {
        return this.zzh - this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zze(int v) {
        if(v < 0) {
            throw zzgsc.zzf();
        }
        int v1 = v + (this.zzh - this.zzi);
        if(v1 < 0) {
            throw zzgsc.zzg();
        }
        int v2 = this.zzk;
        if(v1 > v2) {
            throw zzgsc.zzj();
        }
        this.zzk = v1;
        this.zzJ();
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzf() {
        return this.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzg() {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzh() {
        return this.zzj();
    }

    public final int zzi() {
        int v = this.zzh;
        if(this.zzf - v < 4) {
            throw zzgsc.zzj();
        }
        this.zzh = v + 4;
        return (this.zze[v + 3] & 0xFF) << 24 | ((this.zze[v + 1] & 0xFF) << 8 | this.zze[v] & 0xFF | (this.zze[v + 2] & 0xFF) << 16);
    }

    public final int zzj() {
        int v5;
        int v = this.zzh;
        int v1 = this.zzf;
        if(v1 != v) {
            byte[] arr_b = this.zze;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzh = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.zzh = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.zzh = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.zzh = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.zzh = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzh = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzh = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzh = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzh = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.zzh = v3;
                    return v11;
                }
            }
        }
        return (int)this.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzk() {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzl() {
        return zzgqq.zzF(this.zzj());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzm() {
        if(this.zzC()) {
            this.zzj = 0;
            return 0;
        }
        int v = this.zzj();
        this.zzj = v;
        if(v >>> 3 == 0) {
            throw zzgsc.zzc();
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzn() {
        return this.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzo() {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzp() {
        return this.zzr();
    }

    public final long zzq() {
        int v = this.zzh;
        if(this.zzf - v < 8) {
            throw zzgsc.zzj();
        }
        this.zzh = v + 8;
        return (((long)this.zze[v + 7]) & 0xFFL) << 56 | (((long)this.zze[v]) & 0xFFL | (((long)this.zze[v + 1]) & 0xFFL) << 8 | (((long)this.zze[v + 2]) & 0xFFL) << 16 | (((long)this.zze[v + 3]) & 0xFFL) << 24 | (((long)this.zze[v + 4]) & 0xFFL) << 0x20 | (((long)this.zze[v + 5]) & 0xFFL) << 40 | (((long)this.zze[v + 6]) & 0xFFL) << 0x30);
    }

    public final long zzr() {
        long v11;
        long v5;
        int v = this.zzh;
        int v1 = this.zzf;
        if(v1 != v) {
            byte[] arr_b = this.zze;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzh = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.zzh = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.zzh = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.zzh = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v5 = v9 ^ 0xFE03F80L;
                    v3 = v6;
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 6;
                long v10 = ((long)arr_b[v6]) << 35 ^ v9;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzh = v3;
                    return v5;
                }
                int v12 = v + 7;
                long v13 = v10 ^ ((long)arr_b[v3]) << 42;
                if(v13 >= 0L) {
                    v5 = v13 ^ 0x3F80FE03F80L;
                    v3 = v12;
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 8;
                v10 = v13 ^ ((long)arr_b[v12]) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzh = v3;
                    return v5;
                }
                v12 = v + 9;
                long v14 = v10 ^ ((long)arr_b[v3]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v12;
                    this.zzh = v3;
                    return v14;
                }
                v3 = v + 10;
                if(((long)arr_b[v12]) >= 0L) {
                    this.zzh = v3;
                    return v14;
                }
            }
        }
        return this.zzs();
    }

    final long zzs() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zza();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzgsc.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzt() {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzu() {
        return zzgqq.zzG(this.zzr());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzv() {
        return this.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final zzgqi zzw() {
        int v = this.zzj();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                zzgqi zzgqi0 = zzgqi.zzv(this.zze, v1, v);
                this.zzh += v;
                return zzgqi0;
            }
        }
        if(v != 0) {
            if(v > 0) {
                int v2 = this.zzh;
                if(v <= this.zzf - v2) {
                    int v3 = v + v2;
                    this.zzh = v3;
                    return new zzgqe(Arrays.copyOfRange(this.zze, v2, v3));
                }
            }
            throw v > 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        return zzgqi.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final String zzx() {
        int v = this.zzj();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                String s = new String(this.zze, v1, v, zzgsa.zzb);
                this.zzh += v;
                return s;
            }
        }
        if(v != 0) {
            throw v >= 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final String zzy() {
        int v = this.zzj();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                String s = zzguz.zzh(this.zze, v1, v);
                this.zzh += v;
                return s;
            }
        }
        if(v != 0) {
            throw v > 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final void zzz(int v) {
        if(this.zzj != v) {
            throw zzgsc.zzb();
        }
    }
}

