package com.google.android.gms.internal.ads;

public abstract class zzfqt implements zzfrj {
    @Override  // com.google.android.gms.internal.ads.zzfrj
    @Deprecated
    public final boolean zza(Object object0) {
        return this.zzb(((Character)object0).charValue());
    }

    public abstract boolean zzb(char arg1);

    public static zzfqt zzc(char c) {
        return new zzfqq(c);
    }
}

