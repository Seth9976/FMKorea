package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

final class zzaqo implements zzfmx {
    final zzfkx zza;

    zzaqo(zzaqq zzaqq0, zzfkx zzfkx0) {
        this.zza = zzfkx0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfmx
    public final boolean zza(File file0) {
        try {
            return this.zza.zza(file0);
        }
        catch(GeneralSecurityException unused_ex) {
            return false;
        }
    }
}

