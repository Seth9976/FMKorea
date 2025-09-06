package com.google.android.gms.internal.ads;

final class zzbrm extends zzbfz {
    final zzbrp zza;

    zzbrm(zzbrp zzbrp0, zzbrl zzbrl0) {
        this.zza = zzbrp0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfq0, String s) {
        zzbrp zzbrp0 = this.zza;
        if(zzbrp.zzc(zzbrp0) == null) {
            return;
        }
        zzbrp.zzc(zzbrp0).onCustomClick(zzbrp.zze(zzbrp0, zzbfq0), s);
    }
}

