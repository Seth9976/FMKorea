package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzggx {
    private final Map zza;
    private final Map zzb;

    private zzggx() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    zzggx(zzggw zzggw0) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    zzggx(zzghb zzghb0, zzggw zzggw0) {
        this.zza = new HashMap(zzghb.zzd(zzghb0));
        this.zzb = new HashMap(zzghb.zze(zzghb0));
    }

    public final zzggx zza(zzggu zzggu0) {
        zzggz zzggz0 = new zzggz(zzggu0.zzc(), zzggu0.zzd(), null);
        if(this.zza.containsKey(zzggz0)) {
            zzggu zzggu1 = (zzggu)this.zza.get(zzggz0);
            if(!zzggu1.equals(zzggu0) || !zzggu0.equals(zzggu1)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + zzggz0.toString());
            }
        }
        else {
            this.zza.put(zzggz0, zzggu0);
        }
        return this;
    }

    public final zzggx zzb(zzgap zzgap0) {
        if(zzgap0 == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class class0 = zzgap0.zzb();
        if(this.zzb.containsKey(class0)) {
            zzgap zzgap1 = (zzgap)this.zzb.get(class0);
            if(!zzgap1.equals(zzgap0) || !zzgap0.equals(zzgap1)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + class0.toString());
            }
        }
        else {
            this.zzb.put(class0, zzgap0);
        }
        return this;
    }
}

