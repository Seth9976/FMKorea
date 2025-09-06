package com.google.android.gms.internal.ads;

public final class zzdnw implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdnw(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgzg zzgzg0 = this.zza;
        zzgzg zzgzg1 = this.zzb;
        zzfca zzfca0 = ((zzcvz)this.zzc).zza();
        int v = zzfca0.zzo.zza - 1;
        if(zzfca0.zzo.zza == 0) {
            throw null;
        }
        return v == 0 ? ((zzeit)zzgzg0).zza() : ((zzeit)zzgzg1).zza();
    }
}

