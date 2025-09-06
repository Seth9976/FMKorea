package com.google.android.gms.internal.ads;

import java.util.List;

final class zzbsw extends zzbsq {
    final List zza;

    zzbsw(zzbsz zzbsz0, List list0) {
        this.zza = list0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbsr
    public final void zze(String s) {
        zzcaa.zzg(("Error recording impression urls: " + s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(List list0) {
        zzcaa.zzi(("Recorded impression urls: " + this.zza.toString()));
    }
}

