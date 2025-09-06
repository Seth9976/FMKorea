package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzghc implements zzghh {
    private final String zza;
    private final zzgpo zzb;
    private final zzgqi zzc;
    private final zzgmp zzd;
    private final zzgnw zze;
    private final Integer zzf;

    private zzghc(String s, zzgqi zzgqi0, zzgmp zzgmp0, zzgnw zzgnw0, Integer integer0) {
        this.zza = s;
        this.zzb = zzghq.zza(s);
        this.zzc = zzgqi0;
        this.zzd = zzgmp0;
        this.zze = zzgnw0;
        this.zzf = integer0;
    }

    public static zzghc zza(String s, zzgqi zzgqi0, zzgmp zzgmp0, zzgnw zzgnw0, Integer integer0) {
        if(zzgnw0 == zzgnw.zzd) {
            if(integer0 != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        else if(integer0 == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzghc(s, zzgqi0, zzgmp0, zzgnw0, integer0);
    }

    public final zzgmp zzb() {
        return this.zzd;
    }

    public final zzgnw zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzghh
    public final zzgpo zzd() {
        return this.zzb;
    }

    public final zzgqi zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}

