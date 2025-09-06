package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgjy {
    private final zzfzu zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    zzgjy(zzfzu zzfzu0, int v, String s, String s1, zzgjx zzgjx0) {
        this.zza = zzfzu0;
        this.zzb = v;
        this.zzc = s;
        this.zzd = s1;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgjy ? this.zza == ((zzgjy)object0).zza && this.zzb == ((zzgjy)object0).zzb && this.zzc.equals(((zzgjy)object0).zzc) && this.zzd.equals(((zzgjy)object0).zzd) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override
    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType=\'%s\', keyPrefix=\'%s\')", this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}

