package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class zzlz {
    private static final zzlz zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlz.zza = new zzlz(0, new int[0], new Object[0], false);
    }

    private zzlz() {
        this(0, new int[8], new Object[8], true);
    }

    private zzlz(int v, int[] arr_v, Object[] arr_object, boolean z) {
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
        if(!(object0 instanceof zzlz)) {
            return false;
        }
        int v = this.zzb;
        if(v == ((zzlz)object0).zzb) {
            int[] arr_v = this.zzc;
            int[] arr_v1 = ((zzlz)object0).zzc;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.zzd;
            Object[] arr_object1 = ((zzlz)object0).zzd;
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
        int v1 = 17;
        int v3 = 17;
        for(int v4 = 0; v4 < v; ++v4) {
            v3 = v3 * 0x1F + arr_v[v4];
        }
        Object[] arr_object = this.zzd;
        int v5 = this.zzb;
        for(int v2 = 0; v2 < v5; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v3) * 0x1F + v1;
    }

    static zzlz zza(zzlz zzlz0, zzlz zzlz1) {
        int v = zzlz0.zzb + zzlz1.zzb;
        int[] arr_v = Arrays.copyOf(zzlz0.zzc, v);
        System.arraycopy(zzlz1.zzc, 0, arr_v, zzlz0.zzb, zzlz1.zzb);
        Object[] arr_object = Arrays.copyOf(zzlz0.zzd, v);
        System.arraycopy(zzlz1.zzd, 0, arr_object, zzlz0.zzb, zzlz1.zzb);
        return new zzlz(v, arr_v, arr_object, true);
    }

    private final void zza(int v) {
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

    private static void zza(int v, Object object0, zzmw zzmw0) {
        switch(v & 7) {
            case 0: {
                zzmw0.zzb(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                zzmw0.zza(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                zzmw0.zza(v >>> 3, ((zzhm)object0));
                return;
            }
            case 3: {
                if(zzmw0.zza() == zzmz.zza) {
                    zzmw0.zzb(v >>> 3);
                    ((zzlz)object0).zzb(zzmw0);
                    zzmw0.zza(v >>> 3);
                    return;
                }
                zzmw0.zza(v >>> 3);
                ((zzlz)object0).zzb(zzmw0);
                zzmw0.zzb(v >>> 3);
                return;
            }
            case 5: {
                zzmw0.zzb(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(zzji.zza());
            }
        }
    }

    public final int zza() {
        int v5;
        int v = this.zze;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            int v3 = this.zzc[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v5 = zzig.zzg(v4, ((long)(((Long)this.zzd[v1]))));
                    break;
                }
                case 1: {
                    v5 = zzig.zzc(v4, ((long)(((Long)this.zzd[v1]))));
                    break;
                }
                case 2: {
                    v5 = zzig.zzc(v4, ((zzhm)this.zzd[v1]));
                    break;
                }
                case 3: {
                    v5 = (zzig.zzi(v4) << 1) + ((zzlz)this.zzd[v1]).zza();
                    break;
                }
                case 5: {
                    v5 = zzig.zzf(v4, ((int)(((Integer)this.zzd[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(zzji.zza());
                }
            }
            v2 += v5;
        }
        this.zze = v2;
        return v2;
    }

    final zzlz zza(zzlz zzlz0) {
        if(zzlz0.equals(zzlz.zza)) {
            return this;
        }
        this.zzf();
        int v = this.zzb + zzlz0.zzb;
        this.zza(v);
        System.arraycopy(zzlz0.zzc, 0, this.zzc, this.zzb, zzlz0.zzb);
        System.arraycopy(zzlz0.zzd, 0, this.zzd, this.zzb, zzlz0.zzb);
        this.zzb = v;
        return this;
    }

    final void zza(int v, Object object0) {
        this.zzf();
        this.zza(this.zzb + 1);
        int v1 = this.zzb;
        this.zzc[v1] = v;
        this.zzd[v1] = object0;
        this.zzb = v1 + 1;
    }

    final void zza(zzmw zzmw0) {
        if(zzmw0.zza() == zzmz.zzb) {
            for(int v = this.zzb - 1; v >= 0; --v) {
                zzmw0.zza(this.zzc[v] >>> 3, this.zzd[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzmw0.zza(this.zzc[v1] >>> 3, this.zzd[v1]);
        }
    }

    final void zza(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzko.zza(stringBuilder0, v, String.valueOf(this.zzc[v1] >>> 3), this.zzd[v1]);
        }
    }

    public final int zzb() {
        int v = this.zze;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            v2 += zzig.zzd(this.zzc[v1] >>> 3, ((zzhm)this.zzd[v1]));
        }
        this.zze = v2;
        return v2;
    }

    public final void zzb(zzmw zzmw0) {
        if(this.zzb == 0) {
            return;
        }
        if(zzmw0.zza() == zzmz.zza) {
            for(int v = 0; v < this.zzb; ++v) {
                zzlz.zza(this.zzc[v], this.zzd[v], zzmw0);
            }
            return;
        }
        for(int v1 = this.zzb - 1; v1 >= 0; --v1) {
            zzlz.zza(this.zzc[v1], this.zzd[v1], zzmw0);
        }
    }

    public static zzlz zzc() {
        return zzlz.zza;
    }

    static zzlz zzd() {
        return new zzlz();
    }

    public final void zze() {
        if(this.zzf) {
            this.zzf = false;
        }
    }

    private final void zzf() {
        if(!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }
}

