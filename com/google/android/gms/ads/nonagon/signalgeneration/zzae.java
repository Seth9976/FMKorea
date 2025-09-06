package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzaxo;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class zzae {
    private final String zza;

    zzae(zzac zzac0, zzad zzad0) {
        this.zza = zzac0.zza;
    }

    public final zzaxo zza() {
        switch(this.zza) {
            case "BANNER": {
                return zzaxo.zzb;
            }
            case "INTERSTITIAL": {
                return zzaxo.zzd;
            }
            case "NATIVE": {
                return zzaxo.zzg;
            }
            case "REWARDED": {
                return zzaxo.zzh;
            }
            default: {
                return zzaxo.zza;
            }
        }
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        Set set0 = new HashSet();
        set0.add(this.zza.toLowerCase(Locale.ROOT));
        return set0;
    }
}

