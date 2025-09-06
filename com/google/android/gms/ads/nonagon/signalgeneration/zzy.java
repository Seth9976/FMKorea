package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfya;
import java.util.List;

final class zzy implements zzfya {
    final zzbsr zza;
    final boolean zzb;
    final zzaa zzc;

    zzy(zzaa zzaa0, zzbsr zzbsr0, boolean z) {
        this.zzc = zzaa0;
        this.zza = zzbsr0;
        this.zzb = z;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        try {
            this.zza.zze("Internal error: " + throwable0.getMessage());
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        List list0 = (List)object0;
        try {
            zzaa.zzF(this.zzc, list0);
            this.zza.zzf(list0);
            if(this.zzc.zzu || this.zzb) {
                for(Object object1: list0) {
                    Uri uri0 = (Uri)object1;
                    if(this.zzc.zzN(uri0)) {
                        Uri uri1 = zzaa.zzd(this.zzc, uri0, this.zzc.zzC, "1");
                        this.zzc.zzs.zzc(uri1.toString(), null);
                    }
                    else if(((Boolean)zzba.zzc().zzb(zzbbr.zzhp)).booleanValue()) {
                        this.zzc.zzs.zzc(uri0.toString(), null);
                    }
                }
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzh("", remoteException0);
    }
}

