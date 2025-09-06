package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class zzgfw {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgfw(Class class0, zzggv[] arr_zzggv) {
        this.zza = class0;
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v <= 0; ++v) {
            zzggv zzggv0 = arr_zzggv[v];
            if(hashMap0.containsKey(zzggv0.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + zzggv0.zzb().getCanonicalName());
            }
            hashMap0.put(zzggv0.zzb(), zzggv0);
        }
        this.zzc = arr_zzggv[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap0);
    }

    public zzgfv zza() {
        throw null;
    }

    public abstract zzgmp zzb();

    public abstract zzgta zzc(zzgqi arg1);

    public abstract String zzd();

    public abstract void zze(zzgta arg1);

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgta zzgta0, Class class0) {
        zzggv zzggv0 = (zzggv)this.zzb.get(class0);
        if(zzggv0 == null) {
            throw new IllegalArgumentException("Requested primitive class " + class0.getCanonicalName() + " not supported.");
        }
        return zzggv0.zza(zzgta0);
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}

