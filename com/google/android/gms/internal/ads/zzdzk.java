package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

final class zzdzk implements zzfya {
    final zzbuj zza;

    zzdzk(zzdzo zzdzo0, zzbuj zzbuj0) {
        this.zza = zzbuj0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        try {
            zzaz zzaz0 = zzaz.zzb(throwable0);
            this.zza.zze(zzaz0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Service can\'t call client", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)object0;
        try {
            this.zza.zzf(parcelFileDescriptor0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Service can\'t call client", remoteException0);
        }
    }
}

