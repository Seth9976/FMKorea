package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzgtz {
    private static final Iterator zza;
    private static final Iterable zzb;

    static {
        zzgtz.zza = new zzgtx();
        zzgtz.zzb = () -> zzgtz.zza;
    }

    static Iterable zza() {
        return zzgtz.zzb;
    }

    // 检测为 Lambda 实现
    static Iterator zzb() [...]
}

