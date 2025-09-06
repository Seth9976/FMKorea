package com.google.android.gms.internal.consent_sdk;

import W1.c.c;
import java.util.HashSet;

final class zzz {
    private final zzaa zza;
    private final zzcm zzb;
    private int zzc;
    private c zzd;

    zzz(zzaa zzaa0, zzcm zzcm0) {
        this.zzc = 0;
        this.zzd = c.f;
        this.zza = zzaa0;
        this.zzb = zzcm0;
    }

    // This method was un-flattened
    final zzac zza() {
        String s;
        zzcm zzcm0 = this.zzb;
        int v = zzcm0.zzf - 1;
        if(zzcm0.zzf == 0) {
            throw null;
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                this.zzc = 3;
                break;
            }
            case 4: {
                this.zzc = 2;
                break;
            }
            case 5: {
                this.zzc = 1;
                break;
            }
            case 6: {
                throw new zzi(1, "Invalid response from server: " + zzcm0.zzc);
            }
            case 7: {
                throw new zzi(3, "Publisher misconfiguration: " + zzcm0.zzc);
            }
            default: {
                throw new zzi(1, "Invalid response from server.");
            }
        }
        int v1 = zzcm0.zzg - 1;
        if(zzcm0.zzg == 0) {
            throw null;
        }
        switch(v1) {
            case 1: {
                this.zzd = c.h;
                break;
            }
            case 2: {
                this.zzd = c.g;
                break;
            }
            default: {
                throw new zzi(1, "Invalid response from server.");
            }
        }
        zzbs zzbs0 = zzcm0.zza == null ? null : new zzbs(zzcm0.zzb, zzcm0.zza);
        this.zza.zzc.zzi(new HashSet(zzcm0.zzd));
        for(Object object0: this.zzb.zze) {
            zzcl zzcl0 = (zzcl)object0;
            int v2 = zzcl0.zzb - 1;
            if(zzcl0.zzb == 0) {
                throw null;
            }
            switch(v2) {
                case 1: {
                    break;
                }
                case 2: {
                    s = "clear";
                    break;
                }
                default: {
                    s = null;
                    continue;
                }
            }
            this.zza.zza.zzb(s, zzcl0.zza, new zzf[]{this.zza.zzb});
        }
        return new zzac(this.zzc, this.zzd, zzbs0, null);
    }
}

