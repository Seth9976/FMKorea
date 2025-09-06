package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpy implements k {
    private static zzpy zza;
    private final k zzb;

    static {
        zzpy.zza = new zzpy();
    }

    public zzpy() {
        this.zzb = l.b(new zzqa());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzqb)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzqb)zzpy.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqb)zzpy.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqb)zzpy.zza.get()).zzc();
    }
}

