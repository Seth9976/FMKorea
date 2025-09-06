package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzfzt {
    private static final Logger zza;
    private final ConcurrentMap zzb;

    static {
        zzfzt.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzfzt");
    }

    zzfzt() {
        this.zzb = new ConcurrentHashMap();
    }

    zzfzt(zzfzt zzfzt0) {
        this.zzb = new ConcurrentHashMap(zzfzt0.zzb);
    }

    final zzfzq zza(String s, Class class0) {
        zzfzs zzfzs0 = this.zze(s);
        if(zzfzs0.zza.zzl().contains(class0)) {
            try {
                return new zzfzr(zzfzs0.zza, class0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new GeneralSecurityException("Primitive type not supported", illegalArgumentException0);
            }
        }
        String s1 = class0.getName();
        String s2 = String.valueOf(zzfzs0.zza.getClass());
        Set set0 = zzfzs0.zza.zzl();
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = true;
        for(Object object0: set0) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Class)object0).getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + s1 + " not supported by key manager of type " + s2 + ", supported primitives: " + stringBuilder0.toString());
    }

    final zzfzq zzb(String s) {
        return this.zze(s).zza();
    }

    final void zzc(zzgfw zzgfw0) {
        synchronized(this) {
            if(zzgfj.zza(zzgfw0.zzf())) {
                this.zzf(new zzfzs(zzgfw0), false);
                return;
            }
        }
        throw new GeneralSecurityException("failed to register key manager " + zzgfw0.getClass() + " as it is not FIPS compatible.");
    }

    final boolean zzd(String s) {
        return this.zzb.containsKey(s);
    }

    private final zzfzs zze(String s) {
        synchronized(this) {
            if(this.zzb.containsKey(s)) {
                return (zzfzs)this.zzb.get(s);
            }
        }
        throw new GeneralSecurityException("No key manager found for key type " + s);
    }

    private final void zzf(zzfzs zzfzs0, boolean z) {
        synchronized(this) {
            String s = zzfzs0.zza().zzc();
            zzfzs zzfzs1 = (zzfzs)this.zzb.get(s);
            if(zzfzs1 != null && !zzfzs1.zza.getClass().equals(zzfzs0.zza.getClass())) {
                zzfzt.zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type " + s);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", s, zzfzs1.zza.getClass().getName(), zzfzs0.zza.getClass().getName()));
            }
            this.zzb.putIfAbsent(s, zzfzs0);
        }
    }
}

