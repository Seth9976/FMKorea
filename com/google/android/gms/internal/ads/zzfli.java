package com.google.android.gms.internal.ads;

final class zzfli extends zzfle {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    zzfli(String s, boolean z, boolean z1, zzflh zzflh0) {
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfle) {
            String s = ((zzfle)object0).zzb();
            if(this.zza.equals(s)) {
                boolean z = ((zzfle)object0).zzd();
                if(this.zzb == z) {
                    boolean z1 = ((zzfle)object0).zzc();
                    return this.zzc == z1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        int v1 = 0x4CF;
        int v2 = this.zzb ? 0x4CF : 0x4D5;
        if(!this.zzc) {
            v1 = 0x4D5;
        }
        return ((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfle
    public final String zzb() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfle
    public final boolean zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfle
    public final boolean zzd() {
        return this.zzb;
    }
}

