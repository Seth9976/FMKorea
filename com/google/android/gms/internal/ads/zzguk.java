package com.google.android.gms.internal.ads;

abstract class zzguk {
    abstract int zza(Object arg1);

    abstract int zzb(Object arg1);

    abstract Object zzc(Object arg1);

    abstract Object zzd(Object arg1);

    abstract Object zze(Object arg1, Object arg2);

    abstract Object zzf();

    abstract Object zzg(Object arg1);

    abstract void zzh(Object arg1, int arg2, int arg3);

    abstract void zzi(Object arg1, int arg2, long arg3);

    abstract void zzj(Object arg1, int arg2, Object arg3);

    abstract void zzk(Object arg1, int arg2, zzgqi arg3);

    abstract void zzl(Object arg1, int arg2, long arg3);

    abstract void zzm(Object arg1);

    abstract void zzn(Object arg1, Object arg2);

    abstract void zzo(Object arg1, Object arg2);

    final boolean zzp(Object object0, zzgtl zzgtl0) {
        int v = zzgtl0.zzd();
        switch(v & 7) {
            case 0: {
                this.zzl(object0, v >>> 3, zzgtl0.zzl());
                return true;
            }
            case 1: {
                this.zzi(object0, v >>> 3, zzgtl0.zzk());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            Object object1 = this.zzf();
                            while(zzgtl0.zzc() != 0x7FFFFFFF && this.zzp(object1, zzgtl0)) {
                            }
                            if((4 | v >>> 3 << 3) != zzgtl0.zzd()) {
                                throw zzgsc.zzb();
                            }
                            this.zzg(object1);
                            this.zzj(object0, v >>> 3, object1);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzgsc.zza();
                            }
                            this.zzh(object0, v >>> 3, zzgtl0.zzf());
                            return true;
                        }
                    }
                }
                this.zzk(object0, v >>> 3, zzgtl0.zzp());
                return true;
            }
        }
    }

    abstract boolean zzq(zzgtl arg1);

    abstract void zzr(Object arg1, zzgqy arg2);
}

