package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzghb {
    private final Map zza;
    private final Map zzb;

    zzghb(zzggx zzggx0, zzgha zzgha0) {
        this.zza = new HashMap(zzggx0.zza);
        this.zzb = new HashMap(zzggx0.zzb);
    }

    public final Class zza(Class class0) {
        if(!this.zzb.containsKey(class0)) {
            throw new GeneralSecurityException("No input primitive class for " + class0.toString() + " available");
        }
        return ((zzgap)this.zzb.get(class0)).zza();
    }

    public final Object zzb(zzfzp zzfzp0, Class class0) {
        zzggz zzggz0 = new zzggz(zzfzp0.getClass(), class0, null);
        if(!this.zza.containsKey(zzggz0)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + zzggz0.toString() + " available");
        }
        return ((zzggu)this.zza.get(zzggz0)).zza(zzfzp0);
    }

    public final Object zzc(zzgao zzgao0, Class class0) {
        if(!this.zzb.containsKey(class0)) {
            throw new GeneralSecurityException("No wrapper found for " + class0.toString());
        }
        zzgap zzgap0 = (zzgap)this.zzb.get(class0);
        if(!zzgao0.zzc().equals(zzgap0.zza()) || !zzgap0.zza().equals(zzgao0.zzc())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn\'t match the type of primitives in the provided PrimitiveSet");
        }
        return zzgap0.zzc(zzgao0);
    }

    static Map zzd(zzghb zzghb0) {
        return zzghb0.zza;
    }

    static Map zze(zzghb zzghb0) {
        return zzghb0.zzb;
    }
}

