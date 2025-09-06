package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

final class zzawx extends PushbackInputStream {
    final zzawy zza;

    zzawx(zzawy zzawy0, InputStream inputStream0, int v) {
        this.zza = zzawy0;
        super(inputStream0, 1);
    }

    @Override
    public final void close() {
        synchronized(this) {
            zzaxa.zze(this.zza.zzc);
            super.close();
        }
    }
}

