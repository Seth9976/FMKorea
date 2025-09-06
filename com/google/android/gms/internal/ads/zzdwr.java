package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzaz;

public final class zzdwr extends zzbui {
    final zzdws zza;

    protected zzdwr(zzdws zzdws0) {
        this.zza = zzdws0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final void zze(zzaz zzaz0) {
        zzay zzay0 = zzaz0.zza();
        this.zza.zza.zzd(zzay0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor0) {
        ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
        this.zza.zza.zzc(parcelFileDescriptor$AutoCloseInputStream0);
    }
}

