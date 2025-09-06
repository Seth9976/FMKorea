package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzerr implements zzesi {
    private final String zza;

    public zzerr(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(TextUtils.isEmpty(this.zza)) {
            return;
        }
        ((Bundle)object0).putString("query_info", this.zza);
    }
}

