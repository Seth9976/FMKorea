package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznq implements k {
    private static zznq zza;
    private final k zzb;

    static {
        zznq.zza = new zznq();
    }

    public zznq() {
        this.zzb = l.b(new zzns());
    }

    @Override  // X1.k
    public final Object get() {
        return (zznt)this.zzb.get();
    }

    public static boolean zza() {
        return ((zznt)zznq.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznt)zznq.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zznt)zznq.zza.get()).zzc();
    }
}

