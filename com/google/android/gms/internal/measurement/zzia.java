package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzia extends zzib {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzia(byte[] arr_b, int v, int v1, boolean z) {
        super(null);
        this.zzk = 0x7FFFFFFF;
        this.zzd = arr_b;
        this.zzf = v1 + v;
        this.zzh = v;
        this.zzi = v;
        this.zze = z;
    }

    zzia(byte[] arr_b, int v, int v1, boolean z, zzid zzid0) {
        this(arr_b, 0, v1, false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final double zza() {
        return Double.longBitsToDouble(this.zzy());
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zza(int v) {
        if(v < 0) {
            throw zzji.zzf();
        }
        int v1 = v + this.zzc();
        if(v1 < 0) {
            throw zzji.zzg();
        }
        int v2 = this.zzk;
        if(v1 > v2) {
            throw zzji.zzh();
        }
        this.zzk = v1;
        this.zzaa();
        return v2;
    }

    private final void zzaa() {
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

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final float zzb() {
        return Float.intBitsToFloat(this.zzw());
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final void zzb(int v) {
        if(this.zzj != v) {
            throw zzji.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final void zzc(int v) {
        this.zzk = v;
        this.zzaa();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzd() {
        return this.zzx();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final boolean zzd(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.zzf - this.zzh >= 10) {
                    while(v1 < 10) {
                        int v3 = this.zzh;
                        this.zzh = v3 + 1;
                        if(this.zzd[v3] >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw zzji.zze();
                }
                else {
                    while(true) {
                        if(v1 >= 10) {
                            throw zzji.zze();
                        }
                        if(this.zzv() >= 0) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
            case 1: {
                this.zzf(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            do {
                                int v2 = this.zzi();
                            }
                            while(v2 != 0 && this.zzd(v2));
                            this.zzb(v >>> 3 << 3 | 4);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzji.zza();
                            }
                            this.zzf(4);
                            return true;
                        }
                    }
                }
                this.zzf(this.zzx());
                return true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zze() {
        return this.zzw();
    }

    private final void zzf(int v) {
        if(v >= 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                this.zzh = v1 + v;
                return;
            }
        }
        throw v >= 0 ? zzji.zzh() : zzji.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzf() {
        return this.zzx();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzg() {
        return this.zzw();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzh() {
        return zzib.zze(this.zzx());
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzi() {
        if(this.zzt()) {
            this.zzj = 0;
            return 0;
        }
        int v = this.zzx();
        this.zzj = v;
        if(v >>> 3 == 0) {
            throw zzji.zzc();
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final int zzj() {
        return this.zzx();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final long zzk() {
        return this.zzy();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final long zzl() {
        return this.zzz();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    final long zzm() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zzv();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzji.zze();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final long zzn() {
        return this.zzy();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final long zzo() {
        return zzib.zza(this.zzz());
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final long zzp() {
        return this.zzz();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final zzhm zzq() {
        int v = this.zzx();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                zzhm zzhm0 = zzhm.zza(this.zzd, v1, v);
                this.zzh += v;
                return zzhm0;
            }
        }
        if(v == 0) {
            return zzhm.zza;
        }
        if(v > 0) {
            int v2 = this.zzh;
            if(v <= this.zzf - v2) {
                int v3 = v + v2;
                this.zzh = v3;
                return zzhm.zza(Arrays.copyOfRange(this.zzd, v2, v3));
            }
        }
        throw v > 0 ? zzji.zzh() : zzji.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final String zzr() {
        int v = this.zzx();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                String s = new String(this.zzd, v1, v, zziz.zza);
                this.zzh += v;
                return s;
            }
        }
        if(v != 0) {
            throw v >= 0 ? zzji.zzh() : zzji.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final String zzs() {
        int v = this.zzx();
        if(v > 0) {
            int v1 = this.zzh;
            if(v <= this.zzf - v1) {
                String s = zzmh.zzb(this.zzd, v1, v);
                this.zzh += v;
                return s;
            }
        }
        if(v != 0) {
            throw v > 0 ? zzji.zzh() : zzji.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final boolean zzt() {
        return this.zzh == this.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    public final boolean zzu() {
        return this.zzz() != 0L;
    }

    private final byte zzv() {
        int v = this.zzh;
        if(v == this.zzf) {
            throw zzji.zzh();
        }
        this.zzh = v + 1;
        return this.zzd[v];
    }

    private final int zzw() {
        int v = this.zzh;
        if(this.zzf - v < 4) {
            throw zzji.zzh();
        }
        this.zzh = v + 4;
        return (this.zzd[v + 3] & 0xFF) << 24 | (this.zzd[v] & 0xFF | (this.zzd[v + 1] & 0xFF) << 8 | (this.zzd[v + 2] & 0xFF) << 16);
    }

    private final int zzx() {
        int v5;
        int v = this.zzh;
        int v1 = this.zzf;
        if(v1 != v) {
            byte[] arr_b = this.zzd;
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
        return (int)this.zzm();
    }

    private final long zzy() {
        int v = this.zzh;
        if(this.zzf - v < 8) {
            throw zzji.zzh();
        }
        this.zzh = v + 8;
        return (((long)this.zzd[v + 7]) & 0xFFL) << 56 | (((long)this.zzd[v]) & 0xFFL | (((long)this.zzd[v + 1]) & 0xFFL) << 8 | (((long)this.zzd[v + 2]) & 0xFFL) << 16 | (((long)this.zzd[v + 3]) & 0xFFL) << 24 | (((long)this.zzd[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzd[v + 5]) & 0xFFL) << 40 | (((long)this.zzd[v + 6]) & 0xFFL) << 0x30);
    }

    private final long zzz() {
        long v12;
        long v9;
        long v5;
        int v = this.zzh;
        int v1 = this.zzf;
        if(v1 != v) {
            byte[] arr_b = this.zzd;
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
                int v6 = arr_b[v3] << 14 ^ v4;
                if(v6 >= 0) {
                    v5 = (long)(v6 ^ 0x3F80);
                    v3 = v + 3;
                    this.zzh = v3;
                    return v5;
                }
                int v7 = v6 ^ arr_b[v + 3] << 21;
                if(v7 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v7);
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 5;
                long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                if(v8 >= 0L) {
                    v9 = 0xFE03F80L;
                    v5 = v8 ^ v9;
                    this.zzh = v3;
                    return v5;
                }
                int v10 = v + 6;
                long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                if(v11 < 0L) {
                    v12 = 0xFFFFFFF80FE03F80L;
                    v5 = v11 ^ v12;
                    v3 = v10;
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 7;
                v8 = v11 ^ ((long)arr_b[v10]) << 42;
                if(v8 >= 0L) {
                    v9 = 0x3F80FE03F80L;
                    v5 = v8 ^ v9;
                    this.zzh = v3;
                    return v5;
                }
                v10 = v + 8;
                v11 = v8 ^ ((long)arr_b[v3]) << 49;
                if(v11 < 0L) {
                    v12 = 0xFFFE03F80FE03F80L;
                    v5 = v11 ^ v12;
                    v3 = v10;
                    this.zzh = v3;
                    return v5;
                }
                v3 = v + 9;
                long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                boolean z = false;
                if(v13 >= 0L) {
                    z = true;
                }
                else if(((long)arr_b[v3]) >= 0L) {
                    z = true;
                    v3 = v + 10;
                }
                if(z) {
                    this.zzh = v3;
                    return v13;
                }
            }
        }
        return this.zzm();
    }
}

