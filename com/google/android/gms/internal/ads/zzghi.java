package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzghi {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzghi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public zzghi(zzgho zzgho0) {
        this.zza = new HashMap(zzgho.zze(zzgho0));
        this.zzb = new HashMap(zzgho.zzd(zzgho0));
        this.zzc = new HashMap(zzgho.zzg(zzgho0));
        this.zzd = new HashMap(zzgho.zzf(zzgho0));
    }

    public final zzghi zza(zzgfp zzgfp0) {
        zzghk zzghk0 = new zzghk(zzgfp0.zzd(), zzgfp0.zzc(), null);
        if(this.zzb.containsKey(zzghk0)) {
            zzgfp zzgfp1 = (zzgfp)this.zzb.get(zzghk0);
            if(!zzgfp1.equals(zzgfp0) || !zzgfp0.equals(zzgfp1)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + zzghk0.toString());
            }
        }
        else {
            this.zzb.put(zzghk0, zzgfp0);
        }
        return this;
    }

    public final zzghi zzb(zzgft zzgft0) {
        zzghm zzghm0 = new zzghm(zzgft0.zzb(), zzgft0.zzc(), null);
        if(this.zza.containsKey(zzghm0)) {
            zzgft zzgft1 = (zzgft)this.zza.get(zzghm0);
            if(!zzgft1.equals(zzgft0) || !zzgft0.equals(zzgft1)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + zzghm0.toString());
            }
        }
        else {
            this.zza.put(zzghm0, zzgft0);
        }
        return this;
    }

    public final zzghi zzc(zzggm zzggm0) {
        zzghk zzghk0 = new zzghk(zzggm0.zzd(), zzggm0.zzc(), null);
        if(this.zzd.containsKey(zzghk0)) {
            zzggm zzggm1 = (zzggm)this.zzd.get(zzghk0);
            if(!zzggm1.equals(zzggm0) || !zzggm0.equals(zzggm1)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + zzghk0.toString());
            }
        }
        else {
            this.zzd.put(zzghk0, zzggm0);
        }
        return this;
    }

    public final zzghi zzd(zzggq zzggq0) {
        zzghm zzghm0 = new zzghm(zzggq0.zzc(), zzggq0.zzd(), null);
        if(this.zzc.containsKey(zzghm0)) {
            zzggq zzggq1 = (zzggq)this.zzc.get(zzghm0);
            if(!zzggq1.equals(zzggq0) || !zzggq0.equals(zzggq1)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + zzghm0.toString());
            }
        }
        else {
            this.zzc.put(zzghm0, zzggq0);
        }
        return this;
    }
}

