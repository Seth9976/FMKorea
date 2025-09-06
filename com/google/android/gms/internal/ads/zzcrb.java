package com.google.android.gms.internal.ads;

public final class zzcrb implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcrb(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        boolean z = ((zzcrh)this.zza).zza().booleanValue();
        zzegv zzegv0 = ((zzegw)this.zzb).zza();
        zzeis zzeis0 = ((zzeit)this.zzc).zza();
        return z ? zzegv0 : zzeis0;
    }
}

