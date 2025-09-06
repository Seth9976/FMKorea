package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

final class zzgu implements zzv {
    private final zzgp zza;

    zzgu(zzgp zzgp0) {
        this.zza = zzgp0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzs0, String s, List list0, boolean z, boolean z1) {
        zzft zzft0;
        int v = zzgw.zza[zzs0.ordinal()];
        switch(v) {
            case 1: {
                zzft0 = this.zza.zzj().zzc();
                break;
            }
            case 2: {
                if(z) {
                    zzft0 = this.zza.zzj().zzm();
                }
                else if(z1) {
                    zzft0 = this.zza.zzj().zzg();
                }
                else {
                    zzft0 = this.zza.zzj().zzh();
                }
                break;
            }
            case 3: {
                if(z) {
                    zzft0 = this.zza.zzj().zzw();
                }
                else {
                    zzft0 = z1 ? this.zza.zzj().zzu() : this.zza.zzj().zzv();
                }
                break;
            }
            default: {
                zzft0 = v == 4 ? this.zza.zzj().zzp() : this.zza.zzj().zzn();
            }
        }
        switch(list0.size()) {
            case 1: {
                zzft0.zza(s, list0.get(0));
                return;
            }
            case 2: {
                zzft0.zza(s, list0.get(0), list0.get(1));
                return;
            }
            case 3: {
                zzft0.zza(s, list0.get(0), list0.get(1), list0.get(2));
                return;
            }
            default: {
                zzft0.zza(s);
            }
        }
    }
}

