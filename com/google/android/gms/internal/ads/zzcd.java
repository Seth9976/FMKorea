package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzcd extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzcd(String s, Throwable throwable0, boolean z, int v) {
        super(s, throwable0);
        this.zza = z;
        this.zzb = v;
    }

    @Override
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }

    public static zzcd zza(String s, Throwable throwable0) {
        return new zzcd(s, throwable0, true, 1);
    }

    public static zzcd zzb(String s, Throwable throwable0) {
        return new zzcd(s, throwable0, true, 0);
    }

    public static zzcd zzc(String s) {
        return new zzcd(s, null, false, 1);
    }
}

