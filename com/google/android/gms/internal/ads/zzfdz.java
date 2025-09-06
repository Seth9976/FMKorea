package com.google.android.gms.internal.ads;

public final class zzfdz implements zzfdx {
    private final String zza;

    public zzfdz(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfdx
    public final boolean equals(Object object0) {
        return object0 instanceof zzfdz ? this.zza.equals(((zzfdz)object0).zza) : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfdx
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zza;
    }
}

