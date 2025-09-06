package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzdp {
    public static final zzdp zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
        zzdp.zza = new zzdp(-1, -1, -1);
    }

    public zzdp(int v, int v1, int v2) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = zzfk.zzE(v2) ? zzfk.zzl(v2, v1) : -1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzdp ? this.zzb == ((zzdp)object0).zzb && this.zzc == ((zzdp)object0).zzc && this.zzd == ((zzdp)object0).zzd : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd});
    }

    @Override
    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + "]";
    }
}

