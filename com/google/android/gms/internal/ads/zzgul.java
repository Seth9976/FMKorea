package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgul {
    private static final zzgul zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzgul.zza = new zzgul(0, new int[0], new Object[0], false);
    }

    private zzgul() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgul(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.zze = -1;
        this.zzb = v;
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zzf = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzgul)) {
            return false;
        }
        int v = this.zzb;
        if(v == ((zzgul)object0).zzb) {
            int[] arr_v = this.zzc;
            int[] arr_v1 = ((zzgul)object0).zzc;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.zzd;
            Object[] arr_object1 = ((zzgul)object0).zzd;
            int v2 = this.zzb;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!arr_object[v3].equals(arr_object1[v3])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb;
        int[] arr_v = this.zzc;
        int v2 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.zzd;
        int v5 = this.zzb;
        for(int v1 = 0; v1 < v5; ++v1) {
            v2 = v2 * 0x1F + arr_object[v1].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v2;
    }

    public final int zza() {
        int v6;
        int v = this.zze;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.zzb; ++v1) {
                int v3 = this.zzc[v1];
                int v4 = v3 >>> 3;
                int v5 = v3 & 7;
                switch(v5) {
                    case 0: {
                        v6 = zzgqx.zzA(v4 << 3) + zzgqx.zzB(((long)(((Long)this.zzd[v1]))));
                        break;
                    }
                    case 1: {
                        ((Long)this.zzd[v1]).longValue();
                        v6 = zzgqx.zzA(v4 << 3) + 8;
                        break;
                    }
                    case 2: {
                        int v7 = ((zzgqi)this.zzd[v1]).zzd();
                        v6 = zzgqx.zzA(v4 << 3) + (zzgqx.zzA(v7) + v7);
                        break;
                    }
                    case 3: {
                        int v8 = zzgqx.zzA(v4 << 3);
                        v6 = v8 + v8 + ((zzgul)this.zzd[v1]).zza();
                        break;
                    }
                    default: {
                        if(v5 != 5) {
                            throw new IllegalStateException(zzgsc.zza());
                        }
                        ((Integer)this.zzd[v1]).intValue();
                        v6 = zzgqx.zzA(v4 << 3) + 4;
                        break;
                    }
                }
                v2 += v6;
            }
            this.zze = v2;
            return v2;
        }
        return v;
    }

    public final int zzb() {
        int v = this.zze;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.zzb; ++v1) {
                int v3 = this.zzc[v1] >>> 3;
                int v4 = ((zzgqi)this.zzd[v1]).zzd();
                v2 = zzgqx.zzA(v4) + zzgqx.zzA(v3) + v2 + v4 + 4;
            }
            this.zze = v2;
            return v2;
        }
        return v;
    }

    public static zzgul zzc() {
        return zzgul.zza;
    }

    final zzgul zzd(zzgul zzgul0) {
        if(zzgul0.equals(zzgul.zza)) {
            return this;
        }
        this.zzg();
        int v = this.zzb + zzgul0.zzb;
        this.zzl(v);
        System.arraycopy(zzgul0.zzc, 0, this.zzc, this.zzb, zzgul0.zzb);
        System.arraycopy(zzgul0.zzd, 0, this.zzd, this.zzb, zzgul0.zzb);
        this.zzb = v;
        return this;
    }

    static zzgul zze(zzgul zzgul0, zzgul zzgul1) {
        int v = zzgul0.zzb + zzgul1.zzb;
        int[] arr_v = Arrays.copyOf(zzgul0.zzc, v);
        System.arraycopy(zzgul1.zzc, 0, arr_v, zzgul0.zzb, zzgul1.zzb);
        Object[] arr_object = Arrays.copyOf(zzgul0.zzd, v);
        System.arraycopy(zzgul1.zzd, 0, arr_object, zzgul0.zzb, zzgul1.zzb);
        return new zzgul(v, arr_v, arr_object, true);
    }

    static zzgul zzf() {
        return new zzgul(0, new int[8], new Object[8], true);
    }

    final void zzg() {
        if(!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if(this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzgtc.zzb(stringBuilder0, v, String.valueOf(this.zzc[v1] >>> 3), this.zzd[v1]);
        }
    }

    final void zzj(int v, Object object0) {
        this.zzg();
        this.zzl(this.zzb + 1);
        int v1 = this.zzb;
        this.zzc[v1] = v;
        this.zzd[v1] = object0;
        this.zzb = v1 + 1;
    }

    public final void zzk(zzgqy zzgqy0) {
        if(this.zzb != 0) {
            for(int v = 0; v < this.zzb; ++v) {
                int v1 = this.zzc[v];
                Object object0 = this.zzd[v];
                int v2 = v1 & 7;
                int v3 = v1 >>> 3;
                switch(v2) {
                    case 0: {
                        zzgqy0.zzt(v3, ((long)(((Long)object0))));
                        break;
                    }
                    case 1: {
                        zzgqy0.zzm(v3, ((long)(((Long)object0))));
                        break;
                    }
                    case 2: {
                        zzgqy0.zzd(v3, ((zzgqi)object0));
                        break;
                    }
                    case 3: {
                        zzgqy0.zzE(v3);
                        ((zzgul)object0).zzk(zzgqy0);
                        zzgqy0.zzh(v3);
                        break;
                    }
                    default: {
                        if(v2 != 5) {
                            throw new RuntimeException(zzgsc.zza());
                        }
                        zzgqy0.zzk(v3, ((int)(((Integer)object0))));
                        break;
                    }
                }
            }
        }
    }

    private final void zzl(int v) {
        int[] arr_v = this.zzc;
        if(v > arr_v.length) {
            int v1 = this.zzb + this.zzb / 2;
            if(v1 >= v) {
                v = v1;
            }
            if(v < 8) {
                v = 8;
            }
            this.zzc = Arrays.copyOf(arr_v, v);
            this.zzd = Arrays.copyOf(this.zzd, v);
        }
    }
}

