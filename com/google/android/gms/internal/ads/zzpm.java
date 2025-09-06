package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;

public final class zzpm {
    private Boolean zza;

    public zzpm() {
    }

    public zzpm(Context context0) {
    }

    public final zzom zza(zzam zzam0, zzk zzk0) {
        zzam0.getClass();
        zzk0.getClass();
        int v = zzfk.zza;
        if(v >= 29 && zzam0.zzA != -1) {
            if(this.zza == null) {
                this.zza = Boolean.FALSE;
            }
            zzam0.zzm.getClass();
            int v1 = zzcc.zza(zzam0.zzm, zzam0.zzj);
            if(v1 != 0 && v >= zzfk.zzf(v1)) {
                int v2 = zzfk.zzg(zzam0.zzz);
                if(v2 == 0) {
                    return zzom.zza;
                }
                try {
                    AudioFormat audioFormat0 = zzfk.zzt(zzam0.zzA, v2, v1);
                    return v < 0x1F ? zzpk.zza(audioFormat0, zzk0.zza().zza, false) : zzpl.zza(audioFormat0, zzk0.zza().zza, false);
                }
                catch(IllegalArgumentException unused_ex) {
                    return zzom.zza;
                }
            }
            return zzom.zza;
        }
        return zzom.zza;
    }
}

