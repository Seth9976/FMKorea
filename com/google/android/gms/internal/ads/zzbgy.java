package com.google.android.gms.internal.ads;

final class zzbgy extends zzbfz {
    final zzbhb zza;

    zzbgy(zzbhb zzbhb0, zzbgx zzbgx0) {
        this.zza = zzbhb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfq0, String s) {
        zzbhb zzbhb0 = this.zza;
        if(zzbhb.zza(zzbhb0) == null) {
            return;
        }
        zzbhb.zza(zzbhb0).onCustomClick(zzbhb.zzc(zzbhb0, zzbfq0), s);
    }
}

