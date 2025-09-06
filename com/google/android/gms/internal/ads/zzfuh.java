package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfuh extends zzftw {
    Object[] zzd;
    private int zze;

    public zzfuh() {
        super(4);
    }

    zzfuh(int v) {
        super(v);
        this.zzd = new Object[zzfui.zzh(v)];
    }

    @Override  // com.google.android.gms.internal.ads.zzftw
    public final zzftx zzb(Object object0) {
        this.zzf(object0);
        return this;
    }

    public final zzfuh zzf(Object object0) {
        object0.getClass();
        if(this.zzd != null) {
            int v = zzfui.zzh(this.zzb);
            int v1 = this.zzd.length;
            if(v <= v1) {
                int v2 = object0.hashCode();
                for(int v3 = zzftv.zza(v2); true; v3 = v4 + 1) {
                    Object[] arr_object = this.zzd;
                    int v4 = v3 & v1 - 1;
                    Object object1 = arr_object[v4];
                    if(object1 == null) {
                        arr_object[v4] = object0;
                        this.zze += v2;
                        super.zza(object0);
                        return this;
                    }
                    if(object1.equals(object0)) {
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(object0);
        return this;
    }

    public final zzfuh zzg(Iterable iterable0) {
        if(this.zzd != null) {
            for(Object object0: iterable0) {
                this.zzf(object0);
            }
            return this;
        }
        super.zzc(iterable0);
        return this;
    }

    public final zzfui zzh() {
        zzfui zzfui0;
        int v = this.zzb;
        switch(v) {
            case 0: {
                return zzfvt.zza;
            }
            case 1: {
                Object object0 = this.zza[0];
                object0.getClass();
                return new zzfwa(object0);
            }
            default: {
                if(this.zzd == null || zzfui.zzh(v) != this.zzd.length) {
                    zzfui0 = zzfui.zzk(this.zzb, this.zza);
                    this.zzb = zzfui0.size();
                }
                else {
                    zzfui0 = new zzfvt((zzfui.zzq(this.zzb, this.zza.length) ? Arrays.copyOf(this.zza, this.zzb) : this.zza), this.zze, this.zzd, this.zzd.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzfui0;
            }
        }
    }
}

