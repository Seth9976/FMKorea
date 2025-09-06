package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfrb {
    private final String zza;
    private final zzfqz zzb;
    private zzfqz zzc;

    zzfrb(String s, zzfra zzfra0) {
        zzfqz zzfqz0 = new zzfqz(null);
        this.zzb = zzfqz0;
        this.zzc = zzfqz0;
        s.getClass();
        this.zza = s;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x20);
        stringBuilder0.append(this.zza);
        stringBuilder0.append('{');
        zzfqz zzfqz0 = this.zzb.zzb;
        for(String s = ""; zzfqz0 != null; s = ", ") {
            Object object0 = zzfqz0.zza;
            stringBuilder0.append(s);
            if(object0 == null || !object0.getClass().isArray()) {
                stringBuilder0.append(object0);
            }
            else {
                String s1 = Arrays.deepToString(new Object[]{object0});
                stringBuilder0.append(s1, 1, s1.length() - 1);
            }
            zzfqz0 = zzfqz0.zzb;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public final zzfrb zza(Object object0) {
        zzfqz zzfqz0 = new zzfqz(null);
        this.zzc.zzb = zzfqz0;
        this.zzc = zzfqz0;
        zzfqz0.zza = object0;
        return this;
    }
}

