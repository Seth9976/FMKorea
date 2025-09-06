package com.google.android.gms.internal.ads;

final class zzcoa implements zzfya {
    final zzfik zza;
    final String zzb;
    final zzcob zzc;

    zzcoa(zzcob zzcob0, zzfik zzfik0, String s) {
        this.zzc = zzcob0;
        this.zza = zzfik0;
        this.zzb = s;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzcob.zzf(this.zzc).zza(new zzcny(this, throwable0, this.zza, this.zzb));
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzcnz zzcnz0 = new zzcnz(this.zza, ((String)object0));
        zzcob.zzf(this.zzc).zza(zzcnz0);
    }
}

