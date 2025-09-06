package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzdt {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzdt(int v, int v1, float f, float f1, int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = f;
        this.zzd = f1;
        this.zze = ((float)v) / ((float)v2);
        this.zzf = v / 400;
        this.zzg = v / 65;
        int v3 = v / 65 + v / 65;
        this.zzh = v3;
        this.zzi = new short[v3];
        int v4 = v3 * v1;
        this.zzj = new short[v4];
        this.zzl = new short[v4];
        this.zzn = new short[v4];
    }

    public final int zza() {
        int v = this.zzm * this.zzb;
        return v + v;
    }

    public final int zzb() {
        int v = this.zzk * this.zzb;
        return v + v;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer0) {
        int v = Math.min(shortBuffer0.remaining() / this.zzb, this.zzm);
        shortBuffer0.put(this.zzl, 0, this.zzb * v);
        int v1 = this.zzm - v;
        this.zzm = v1;
        System.arraycopy(this.zzl, v * this.zzb, this.zzl, 0, v1 * this.zzb);
    }

    public final void zze() {
        int v3;
        int v = this.zzk;
        int v1 = this.zzm + ((int)((((float)v) / (this.zzc / this.zzd) + ((float)this.zzo)) / (this.zze * this.zzd) + 0.5f));
        this.zzj = this.zzl(this.zzj, v, this.zzh + this.zzh + v);
        for(int v2 = 0; true; ++v2) {
            v3 = this.zzh + this.zzh;
            int v4 = this.zzb;
            if(v2 >= v3 * v4) {
                break;
            }
            this.zzj[v4 * v + v2] = 0;
        }
        this.zzk += v3;
        this.zzk();
        if(this.zzm > v1) {
            this.zzm = v1;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer0) {
        int v = shortBuffer0.remaining() / this.zzb;
        int v1 = this.zzb * v;
        short[] arr_v = this.zzl(this.zzj, this.zzk, v);
        this.zzj = arr_v;
        shortBuffer0.get(arr_v, this.zzk * this.zzb, (v1 + v1) / 2);
        this.zzk += v;
        this.zzk();
    }

    private final int zzg(short[] arr_v, int v, int v1, int v2) {
        int v3 = v * this.zzb;
        int v4 = 1;
        int v5 = 0xFF;
        int v6 = 0;
        int v7 = 0;
        while(v1 <= v2) {
            int v9 = 0;
            for(int v8 = 0; v8 < v1; ++v8) {
                v9 += Math.abs(arr_v[v3 + v8] - arr_v[v3 + v1 + v8]);
            }
            int v10 = v9 * v6;
            int v11 = v4 * v1;
            if(v10 < v11) {
                v4 = v9;
            }
            if(v10 < v11) {
                v6 = v1;
            }
            int v12 = v9 * v5;
            int v13 = v7 * v1;
            if(v12 > v13) {
                v7 = v9;
            }
            if(v12 > v13) {
                v5 = v1;
            }
            ++v1;
        }
        this.zzu = v4 / v6;
        this.zzv = v7 / v5;
        return v6;
    }

    private final void zzh(short[] arr_v, int v, int v1) {
        short[] arr_v1 = this.zzl(this.zzl, this.zzm, v1);
        this.zzl = arr_v1;
        System.arraycopy(arr_v, v * this.zzb, arr_v1, this.zzm * this.zzb, this.zzb * v1);
        this.zzm += v1;
    }

    private final void zzi(short[] arr_v, int v, int v1) {
        int v2 = this.zzh / v1;
        int v3 = v1 * this.zzb;
        int v4 = v * this.zzb;
        for(int v5 = 0; v5 < v2; ++v5) {
            int v7 = 0;
            for(int v6 = 0; v6 < v3; ++v6) {
                v7 += arr_v[v5 * v3 + v4 + v6];
            }
            this.zzi[v5] = (short)(v7 / v3);
        }
    }

    private static void zzj(int v, int v1, short[] arr_v, int v2, short[] arr_v1, int v3, short[] arr_v2, int v4) {
        for(int v5 = 0; v5 < v1; ++v5) {
            int v6 = v3 * v1 + v5;
            int v7 = v4 * v1 + v5;
            int v8 = v2 * v1 + v5;
            for(int v9 = 0; v9 < v; ++v9) {
                arr_v[v8] = (short)((arr_v1[v6] * (v - v9) + arr_v2[v7] * v9) / v);
                v8 += v1;
                v6 += v1;
                v7 += v1;
            }
        }
    }

    private final void zzk() {
        int v28;
        int v27;
        int v26;
        int v25;
        int v18;
        int v17;
        int v16;
        int v6;
        int v = this.zzm;
        float f = this.zzc / this.zzd;
        float f1 = this.zze * this.zzd;
        if(Double.compare(f, 1.00001) > 0 || ((double)f) < 0.99999) {
            int v1 = this.zzk;
            if(v1 >= this.zzh) {
                int v2 = 0;
                do {
                    int v3 = this.zzr;
                    if(v3 > 0) {
                        int v4 = Math.min(this.zzh, v3);
                        this.zzh(this.zzj, v2, v4);
                        this.zzr -= v4;
                        v2 += v4;
                    }
                    else {
                        short[] arr_v = this.zzj;
                        int v5 = this.zza <= 4000 ? 1 : this.zza / 4000;
                        if(this.zzb != 1 || v5 != 1) {
                            this.zzi(arr_v, v2, v5);
                            int v7 = this.zzg(this.zzi, 0, this.zzf / v5, this.zzg / v5);
                            if(v5 == 1) {
                                v6 = v7;
                            }
                            else {
                                int v8 = v7 * v5;
                                int v9 = this.zzf;
                                int v10 = v8 - v5 * 4;
                                if(v10 >= v9) {
                                    v9 = v10;
                                }
                                int v11 = v8 + v5 * 4;
                                int v12 = this.zzg;
                                if(v11 > v12) {
                                    v11 = v12;
                                }
                                if(this.zzb == 1) {
                                    v6 = this.zzg(arr_v, v2, v9, v11);
                                }
                                else {
                                    this.zzi(arr_v, v2, 1);
                                    v6 = this.zzg(this.zzi, 0, v9, v11);
                                }
                            }
                        }
                        else {
                            v6 = this.zzg(arr_v, v2, this.zzf, this.zzg);
                        }
                        int v13 = this.zzu;
                        int v14 = this.zzv;
                        if(v13 == 0) {
                            v16 = v6;
                        }
                        else {
                            int v15 = this.zzs;
                            if(v15 != 0 && v14 <= v13 * 3 && v13 + v13 > this.zzt * 3) {
                                v16 = v15;
                            }
                        }
                        this.zzt = v13;
                        this.zzs = v6;
                        if(Double.compare(f, 1.0) > 0) {
                            short[] arr_v1 = this.zzj;
                            if(f >= 2.0f) {
                                v17 = (int)(((float)v16) / (f - 1.0f));
                            }
                            else {
                                this.zzr = (int)(((float)v16) * (2.0f - f) / (f - 1.0f));
                                v17 = v16;
                            }
                            short[] arr_v2 = this.zzl(this.zzl, this.zzm, v17);
                            this.zzl = arr_v2;
                            zzdt.zzj(v17, this.zzb, arr_v2, this.zzm, arr_v1, v2, arr_v1, v2 + v16);
                            this.zzm += v17;
                            v2 += v16 + v17;
                        }
                        else {
                            short[] arr_v3 = this.zzj;
                            if(f < 0.5f) {
                                v18 = (int)(((float)v16) * f / (1.0f - f));
                            }
                            else {
                                this.zzr = (int)(((float)v16) * (f + f - 1.0f) / (1.0f - f));
                                v18 = v16;
                            }
                            int v19 = v16 + v18;
                            short[] arr_v4 = this.zzl(this.zzl, this.zzm, v19);
                            this.zzl = arr_v4;
                            System.arraycopy(arr_v3, v2 * this.zzb, arr_v4, this.zzm * this.zzb, this.zzb * v16);
                            zzdt.zzj(v18, this.zzb, this.zzl, this.zzm + v16, arr_v3, v2 + v16, arr_v3, v2);
                            this.zzm += v19;
                            v2 += v18;
                        }
                    }
                }
                while(this.zzh + v2 <= v1);
                int v20 = this.zzk - v2;
                System.arraycopy(this.zzj, v2 * this.zzb, this.zzj, 0, this.zzb * v20);
                this.zzk = v20;
            }
        }
        else {
            this.zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        if(f1 != 1.0f && this.zzm != v) {
            int v21 = this.zza;
            int v22 = (int)(((float)v21) / f1);
            while(v22 > 0x4000 || v21 > 0x4000) {
                v22 /= 2;
                v21 /= 2;
            }
            int v23 = this.zzm - v;
            short[] arr_v5 = this.zzl(this.zzn, this.zzo, v23);
            this.zzn = arr_v5;
            System.arraycopy(this.zzl, v * this.zzb, arr_v5, this.zzo * this.zzb, this.zzb * v23);
            this.zzm = v;
            this.zzo += v23;
            for(int v24 = 0; true; ++v24) {
                v25 = this.zzo;
                v26 = v25 - 1;
                if(v24 >= v26) {
                    break;
                }
                while(true) {
                    v27 = this.zzp + 1;
                    v28 = this.zzq;
                    if(v27 * v22 <= v28 * v21) {
                        break;
                    }
                    this.zzl = this.zzl(this.zzl, this.zzm, 1);
                    for(int v29 = 0; true; ++v29) {
                        int v30 = this.zzb;
                        if(v29 >= v30) {
                            break;
                        }
                        int v31 = v24 * v30 + v29;
                        int v32 = (this.zzp + 1) * v22;
                        int v33 = v32 - this.zzq * v21;
                        int v34 = v32 - this.zzp * v22;
                        this.zzl[this.zzm * v30 + v29] = (short)((this.zzn[v31] * v33 + (v34 - v33) * this.zzn[v31 + v30]) / v34);
                    }
                    ++this.zzq;
                    ++this.zzm;
                }
                this.zzp = v27;
                if(v27 == v21) {
                    this.zzp = 0;
                    zzdy.zzf(v28 == v22);
                    this.zzq = 0;
                }
            }
            if(v26 != 0) {
                System.arraycopy(this.zzn, v26 * this.zzb, this.zzn, 0, (v25 - v26) * this.zzb);
                this.zzo -= v26;
            }
        }
    }

    private final short[] zzl(short[] arr_v, int v, int v1) {
        int v2 = arr_v.length / this.zzb;
        return v + v1 > v2 ? Arrays.copyOf(arr_v, (v2 * 3 / 2 + v1) * this.zzb) : arr_v;
    }
}

