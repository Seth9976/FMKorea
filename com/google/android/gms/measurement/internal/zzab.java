package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew.zzc;
import com.google.android.gms.internal.measurement.zzew.zze;
import com.google.android.gms.internal.measurement.zzfi.zzn;
import com.google.android.gms.internal.measurement.zzob;

final class zzab extends zzac {
    private zze zzg;
    private final zzt zzh;

    zzab(zzt zzt0, String s, int v, zze zzew$zze0) {
        this.zzh = zzt0;
        super(s, v);
        this.zzg = zzew$zze0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzac
    final int zza() {
        return this.zzg.zza();
    }

    final boolean zza(Long long0, Long long1, zzn zzfi$zzn0, boolean z) {
        boolean z1 = zzob.zza() && this.zzh.zze().zzf(this.zza, zzbi.zzbe);
        boolean z2 = this.zzg.zzf();
        boolean z3 = this.zzg.zzg();
        boolean z4 = this.zzg.zzh();
        boolean z5 = z2 || z3 || z4;
        Integer integer0 = null;
        if(z && !z5) {
            zzft zzft0 = this.zzh.zzj().zzp();
            Integer integer1 = this.zzb;
            if(this.zzg.zzi()) {
                integer0 = this.zzg.zza();
            }
            zzft0.zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", integer1, integer0);
            return true;
        }
        zzc zzew$zzc0 = this.zzg.zzb();
        boolean z6 = zzew$zzc0.zzf();
        if(!zzfi$zzn0.zzk()) {
            if(!zzfi$zzn0.zzi()) {
                if(!zzfi$zzn0.zzm()) {
                    this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(""));
                }
                else if(zzew$zzc0.zzj()) {
                    integer0 = zzac.zza(zzac.zza("", zzew$zzc0.zzd(), this.zzh.zzj()), z6);
                }
                else if(!zzew$zzc0.zzh()) {
                    this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(""));
                }
                else {
                    this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(""), "");
                }
            }
            else if(!zzew$zzc0.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(""));
            }
            else {
                integer0 = zzac.zza(zzac.zza(zzfi$zzn0.zza(), zzew$zzc0.zzc()), z6);
            }
        }
        else if(!zzew$zzc0.zzh()) {
            this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(""));
        }
        else {
            integer0 = zzac.zza(zzac.zza(zzfi$zzn0.zzc(), zzew$zzc0.zzc()), z6);
        }
        zzft zzft1 = this.zzh.zzj().zzp();
        String s = integer0 == null ? "null" : integer0;
        zzft1.zza("Property filter result", s);
        if(integer0 == null) {
            return false;
        }
        this.zzc = Boolean.TRUE;
        if(z4 && !((Boolean)integer0).booleanValue()) {
            return true;
        }
        if(!z || this.zzg.zzf()) {
            this.zzd = integer0;
        }
        if(((Boolean)integer0).booleanValue() && z5 && zzfi$zzn0.zzl()) {
            long v = long0 == null ? zzfi$zzn0.zzd() : ((long)long0);
            if(z1 && this.zzg.zzf() && !this.zzg.zzg() && long1 != null) {
                v = (long)long1;
            }
            if(this.zzg.zzg()) {
                this.zzf = v;
                return true;
            }
            this.zze = v;
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzac
    final boolean zzb() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzac
    final boolean zzc() {
        return true;
    }
}

