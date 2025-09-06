package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcwe implements zzgyt {
    private final zzcwd zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzcwe(zzcwd zzcwd0, zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzcwd0;
        this.zzb = zzgzg0;
        this.zzc = zzgzg1;
        this.zzd = zzgzg2;
        this.zze = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zzb.zzb();
        zzcag zzcag0 = ((zzchv)this.zzc).zza();
        zzfbe zzfbe0 = ((zzcsu)this.zzd).zza();
        zzbwx zzbwx0 = new zzbwx();
        if(zzfbe0.zzB != null) {
            return zzfbe0.zzt == null ? new zzbww(((Context)object0), zzcag0, zzfbe0.zzB, null, zzbwx0) : new zzbww(((Context)object0), zzcag0, zzfbe0.zzB, zzfbe0.zzt.zzb, zzbwx0);
        }
        return null;
    }
}

