package com.google.android.gms.internal.ads;

import java.io.Closeable;

public abstract class zzfnn implements Closeable {
    public static zzfnz zza() {
        return new zzfnz();
    }

    public static zzfnz zzb(int v, zzfny zzfny0) {
        return new zzfnz(() -> v, () -> -1, zzfny0);
    }

    public static zzfnz zzc(zzfry zzfry0, zzfry zzfry1, zzfny zzfny0) {
        return new zzfnz(zzfry0, zzfry1, zzfny0);
    }

    // 检测为 Lambda 实现
    static Integer zzd(int v) [...]

    // 检测为 Lambda 实现
    static Integer zze() [...]
}

