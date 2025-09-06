package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzew.zzb;
import com.google.android.gms.internal.measurement.zzew.zzc;
import com.google.android.gms.internal.measurement.zzfi.zze;
import com.google.android.gms.internal.measurement.zzfi.zzg;
import com.google.android.gms.internal.measurement.zzob;
import java.util.HashSet;
import java.util.Iterator;

final class zzz extends zzac {
    private zzb zzg;
    private final zzt zzh;

    zzz(zzt zzt0, String s, int v, zzb zzew$zzb0) {
        this.zzh = zzt0;
        super(s, v);
        this.zzg = zzew$zzb0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzac
    final int zza() {
        return this.zzg.zzb();
    }

    final boolean zza(Long long0, Long long1, zze zzfi$zze0, long v, zzbc zzbc0, boolean z) {
        boolean z1 = zzob.zza() && this.zzh.zze().zzf(this.zza, zzbi.zzbg);
        long v1 = this.zzg.zzj() ? zzbc0.zze : v;
        Integer integer0 = null;
        if(this.zzh.zzj().zza(2)) {
            this.zzh.zzj().zzp().zza("Evaluating filter. audience, filter, event", this.zzb, (this.zzg.zzl() ? this.zzg.zzb() : null), this.zzh.zzi().zza(""));
            this.zzh.zzj().zzp().zza("Filter definition", this.zzh.g_().zza(this.zzg));
        }
        if(this.zzg.zzl() && this.zzg.zzb() <= 0x100) {
            boolean z2 = this.zzg.zzh() || this.zzg.zzi() || this.zzg.zzj();
            if(z && !z2) {
                zzft zzft0 = this.zzh.zzj().zzp();
                Integer integer1 = this.zzb;
                if(this.zzg.zzl()) {
                    integer0 = this.zzg.zzb();
                }
                zzft0.zza("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", integer1, integer0);
                return true;
            }
            zzb zzew$zzb0 = this.zzg;
            if(zzew$zzb0.zzk()) {
                Boolean boolean0 = zzac.zza(v1, zzew$zzb0.zze());
                if(boolean0 != null) {
                    if(!boolean0.booleanValue()) {
                        integer0 = Boolean.FALSE;
                        goto label_52;
                    }
                    goto label_22;
                }
            }
            else {
            label_22:
                HashSet hashSet0 = new HashSet();
                Iterator iterator0 = zzew$zzb0.zzg().iterator();
                if(iterator0.hasNext()) {
                    iterator0.next();
                    this.zzh.zzj().zzu().zza("null or empty param name in filter. event", this.zzh.zzi().zza(""));
                }
                else {
                    a a0 = new a();
                    for(Object object0: zzfi$zze0.zzh()) {
                        zzg zzfi$zzg0 = (zzg)object0;
                        if(!hashSet0.contains("")) {
                            continue;
                        }
                        if(zzfi$zzg0.zzl()) {
                            a0.put("", (zzfi$zzg0.zzl() ? zzfi$zzg0.zzd() : null));
                            continue;
                        }
                        if(zzfi$zzg0.zzj()) {
                            a0.put("", (zzfi$zzg0.zzj() ? zzfi$zzg0.zza() : null));
                            continue;
                        }
                        if(zzfi$zzg0.zzn()) {
                            a0.put("", "");
                            continue;
                        }
                        this.zzh.zzj().zzu().zza("Unknown value for param. event, param", this.zzh.zzi().zza(""), this.zzh.zzi().zzb(""));
                        goto label_52;
                    }
                    Iterator iterator2 = zzew$zzb0.zzg().iterator();
                    if(iterator2.hasNext()) {
                        Object object1 = iterator2.next();
                        boolean z3 = !((zzc)object1).zzg() || !((zzc)object1).zzf();
                        this.zzh.zzj().zzu().zza("Event has empty param name. event", this.zzh.zzi().zza(""));
                    }
                    else {
                        integer0 = Boolean.TRUE;
                    }
                }
            }
        label_52:
            zzft zzft1 = this.zzh.zzj().zzp();
            String s = integer0 == null ? "null" : integer0;
            zzft1.zza("Event filter result", s);
            if(integer0 == null) {
                return false;
            }
            this.zzc = Boolean.TRUE;
            if(!((Boolean)integer0).booleanValue()) {
                return true;
            }
            this.zzd = Boolean.TRUE;
            if(z2 && zzfi$zze0.zzk()) {
                Long long2 = zzfi$zze0.zzd();
                if(this.zzg.zzi()) {
                    if(z1 && this.zzg.zzk()) {
                        long2 = long0;
                    }
                    this.zzf = long2;
                    return true;
                }
                if(z1 && this.zzg.zzk()) {
                    long2 = long1;
                }
                this.zze = long2;
            }
            return true;
        }
        zzft zzft2 = this.zzh.zzj().zzu();
        Object object2 = zzfr.zza(this.zza);
        if(this.zzg.zzl()) {
            integer0 = this.zzg.zzb();
        }
        zzft2.zza("Invalid event filter ID. appId, id", object2, String.valueOf(integer0));
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzac
    final boolean zzb() {
        return this.zzg.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzac
    final boolean zzc() {
        return false;
    }
}

