package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class zzamj extends FilterInputStream {
    private final long zza;
    private long zzb;

    zzamj(InputStream inputStream0, long v) {
        super(inputStream0);
        this.zza = v;
    }

    @Override
    public final int read() {
        int v = super.read();
        if(v != -1) {
            ++this.zzb;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = super.read(arr_b, v, v1);
        if(v2 != -1) {
            this.zzb += (long)v2;
        }
        return v2;
    }

    final long zza() {
        return this.zza - this.zzb;
    }
}

