package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

final class zzdzx implements zzfya {
    final zzbug zza;

    zzdzx(zzdzy zzdzy0, zzbug zzbug0) {
        this.zza = zzbug0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        try {
            zzaz zzaz0 = zzaz.zzb(throwable0);
            this.zza.zze(zzaz0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Ad service can\'t call client", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)object0;
        try {
            this.zza.zzf(parcelFileDescriptor0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Ad service can\'t call client", remoteException0);
        }
    }
}

