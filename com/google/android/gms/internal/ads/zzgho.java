package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgho {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    zzgho(zzghi zzghi0, zzghn zzghn0) {
        this.zza = new HashMap(zzghi0.zza);
        this.zzb = new HashMap(zzghi0.zzb);
        this.zzc = new HashMap(zzghi0.zzc);
        this.zzd = new HashMap(zzghi0.zzd);
    }

    public final zzfzp zza(zzghh zzghh0, zzgas zzgas0) {
        zzghk zzghk0 = new zzghk(zzghh0.getClass(), zzghh0.zzd(), null);
        if(!this.zzb.containsKey(zzghk0)) {
            throw new GeneralSecurityException("No Key Parser for requested key type " + zzghk0.toString() + " available");
        }
        return ((zzgfp)this.zzb.get(zzghk0)).zza(zzghh0, zzgas0);
    }

    public final zzgah zzb(zzghh zzghh0) {
        zzghk zzghk0 = new zzghk(zzghh0.getClass(), zzghh0.zzd(), null);
        if(!this.zzd.containsKey(zzghk0)) {
            throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzghk0.toString() + " available");
        }
        return ((zzggm)this.zzd.get(zzghk0)).zza(zzghh0);
    }

    public final zzghh zzc(zzgah zzgah0, Class class0) {
        zzghm zzghm0 = new zzghm(zzgah0.getClass(), class0, null);
        if(!this.zzc.containsKey(zzghm0)) {
            throw new GeneralSecurityException("No Key Format serializer for " + zzghm0.toString() + " available");
        }
        return ((zzggq)this.zzc.get(zzghm0)).zza(zzgah0);
    }

    static Map zzd(zzgho zzgho0) {
        return zzgho0.zzb;
    }

    static Map zze(zzgho zzgho0) {
        return zzgho0.zza;
    }

    static Map zzf(zzgho zzgho0) {
        return zzgho0.zzd;
    }

    static Map zzg(zzgho zzgho0) {
        return zzgho0.zzc;
    }

    public final boolean zzh(zzghh zzghh0) {
        zzghk zzghk0 = new zzghk(zzghh0.getClass(), zzghh0.zzd(), null);
        return this.zzb.containsKey(zzghk0);
    }

    public final boolean zzi(zzghh zzghh0) {
        zzghk zzghk0 = new zzghk(zzghh0.getClass(), zzghh0.zzd(), null);
        return this.zzd.containsKey(zzghk0);
    }
}

