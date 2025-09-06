package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.Collections;
import java.util.concurrent.Callable;

public final class zzffo {
    public static final zzffv zza(Callable callable0, Object object0, zzffw zzffw0) {
        return zzffo.zzb(callable0, zzffw.zze(zzffw0), object0, zzffw0);
    }

    public static final zzffv zzb(Callable callable0, zzfyo zzfyo0, Object object0, zzffw zzffw0) {
        return new zzffv(zzffw0, object0, null, zzffw.zzd(), Collections.emptyList(), zzfyo0.zzb(callable0), null);
    }

    public static final zzffv zzc(d d0, Object object0, zzffw zzffw0) {
        return new zzffv(zzffw0, object0, null, zzffw.zzd(), Collections.emptyList(), d0, null);
    }

    public static final zzffv zzd(zzffi zzffi0, zzfyo zzfyo0, Object object0, zzffw zzffw0) {
        return zzffo.zzb(new zzffn(zzffi0), zzfyo0, object0, zzffw0);
    }
}

