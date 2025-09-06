package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class zzfeb {
    private final HashMap zza;

    public zzfeb() {
        this.zza = new HashMap();
    }

    public final zzfea zza(zzfdr zzfdr0, Context context0, zzfdj zzfdj0, zzfeh zzfeh0) {
        zzfea zzfea0 = (zzfea)this.zza.get(zzfdr0);
        if(zzfea0 == null) {
            zzfdo zzfdo0 = new zzfdo(zzfdu.zza(zzfdr0, context0));
            zzfea zzfea1 = new zzfea(zzfdo0, new zzfej(zzfdo0, zzfdj0, zzfeh0));
            this.zza.put(zzfdr0, zzfea1);
            return zzfea1;
        }
        return zzfea0;
    }
}

