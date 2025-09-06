package com.google.android.gms.internal.measurement;

abstract class zzma {
    abstract int zza(Object arg1);

    abstract Object zza();

    abstract Object zza(Object arg1, Object arg2);

    abstract void zza(Object arg1, int arg2, int arg3);

    abstract void zza(Object arg1, int arg2, long arg3);

    abstract void zza(Object arg1, int arg2, zzhm arg3);

    abstract void zza(Object arg1, int arg2, Object arg3);

    abstract void zza(Object arg1, zzmw arg2);

    abstract boolean zza(zzlc arg1);

    final boolean zza(Object object0, zzlc zzlc0) {
        int v = zzlc0.zzd();
        switch(v & 7) {
            case 0: {
                this.zzb(object0, v >>> 3, zzlc0.zzl());
                return true;
            }
            case 1: {
                this.zza(object0, v >>> 3, zzlc0.zzk());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            Object object1 = this.zza();
                            while(zzlc0.zzc() != 0x7FFFFFFF && this.zza(object1, zzlc0)) {
                            }
                            if((4 | v >>> 3 << 3) != zzlc0.zzd()) {
                                throw zzji.zzb();
                            }
                            this.zza(object0, v >>> 3, this.zze(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzji.zza();
                            }
                            this.zza(object0, v >>> 3, zzlc0.zzf());
                            return true;
                        }
                    }
                }
                this.zza(object0, v >>> 3, zzlc0.zzp());
                return true;
            }
        }
    }

    abstract int zzb(Object arg1);

    abstract void zzb(Object arg1, int arg2, long arg3);

    abstract void zzb(Object arg1, zzmw arg2);

    abstract void zzb(Object arg1, Object arg2);

    abstract Object zzc(Object arg1);

    abstract void zzc(Object arg1, Object arg2);

    abstract Object zzd(Object arg1);

    abstract Object zze(Object arg1);

    abstract void zzf(Object arg1);
}

