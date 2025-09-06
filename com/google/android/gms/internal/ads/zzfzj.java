package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class zzfzj {
    private final InputStream zza;

    private zzfzj(InputStream inputStream0) {
        this.zza = inputStream0;
    }

    public final zzgnd zza() {
        try {
            return zzgnd.zzg(this.zza, zzgrc.zza());
        }
        finally {
            this.zza.close();
        }
    }

    public static zzfzj zzb(byte[] arr_b) {
        return new zzfzj(new ByteArrayInputStream(arr_b));
    }
}

