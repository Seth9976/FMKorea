package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzfzr implements zzfzq {
    private final zzgfw zza;
    private final Class zzb;

    public zzfzr(zzgfw zzgfw0, Class class0) {
        if(!zzgfw0.zzl().contains(class0) && !Void.class.equals(class0)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgfw0.toString(), class0.getName()));
        }
        this.zza = zzgfw0;
        this.zzb = class0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzq
    public final zzgmq zza(zzgqi zzgqi0) {
        try {
            zzgfv zzgfv0 = this.zza.zza();
            zzgta zzgta0 = zzgfv0.zzb(zzgqi0);
            zzgfv0.zzd(zzgta0);
            zzgta zzgta1 = zzgfv0.zza(zzgta0);
            zzgmn zzgmn0 = zzgmq.zza();
            zzgmn0.zzb(this.zza.zzd());
            zzgmn0.zzc(zzgta1.zzau());
            zzgmn0.zza(this.zza.zzb());
            return (zzgmq)zzgmn0.zzal();
        }
        catch(zzgsc zzgsc0) {
            throw new GeneralSecurityException("Unexpected proto", zzgsc0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfzq
    public final Object zzb(zzgqi zzgqi0) {
        try {
            zzgta zzgta0 = this.zza.zzc(zzgqi0);
            if(Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zze(zzgta0);
            return this.zza.zzk(zzgta0, this.zzb);
        }
        catch(zzgsc zzgsc0) {
        }
        throw new GeneralSecurityException("Failures parsing proto of type " + this.zza.zzj().getName(), zzgsc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzq
    public final String zzc() {
        return this.zza.zzd();
    }
}

