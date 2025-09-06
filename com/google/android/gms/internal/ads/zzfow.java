package com.google.android.gms.internal.ads;

final class zzfow extends zzfpo {
    private final int zza;
    private final String zzb;

    zzfow(int v, String s, zzfov zzfov0) {
        this.zza = v;
        this.zzb = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfpo) {
            int v = ((zzfpo)object0).zza();
            if(this.zza == v) {
                return this.zzb == null ? ((zzfpo)object0).zzb() == null : this.zzb.equals(((zzfpo)object0).zzb());
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza ^ 1000003;
        return this.zzb == null ? v * 1000003 : v * 1000003 ^ this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfpo
    public final int zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpo
    public final String zzb() {
        return this.zzb;
    }
}

