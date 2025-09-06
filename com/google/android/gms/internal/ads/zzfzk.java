package com.google.android.gms.internal.ads;

import java.io.OutputStream;

public final class zzfzk {
    private final OutputStream zza;

    private zzfzk(OutputStream outputStream0) {
        this.zza = outputStream0;
    }

    public final void zza(zzgnd zzgnd0) {
        try {
            zzgnd0.zzaw(this.zza);
        }
        finally {
            this.zza.close();
        }
    }

    public static zzfzk zzb(OutputStream outputStream0) {
        return new zzfzk(outputStream0);
    }
}

