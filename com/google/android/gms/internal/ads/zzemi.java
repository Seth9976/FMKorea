package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzemi implements zzesi {
    private final String zza;

    public zzemi(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        String s = this.zza;
        if(s != null) {
            ((Bundle)object0).putString("arek", s);
        }
    }
}

