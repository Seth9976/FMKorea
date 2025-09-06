package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfya;
import java.util.ArrayList;

final class zzx implements zzfya {
    final zzbsr zza;
    final boolean zzb;
    final zzaa zzc;

    zzx(zzaa zzaa0, zzbsr zzbsr0, boolean z) {
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
        ArrayList arrayList0 = (ArrayList)object0;
        try {
            this.zza.zzf(arrayList0);
            if(this.zzc.zzt || this.zzb) {
                for(Object object1: arrayList0) {
                    Uri uri0 = (Uri)object1;
                    if(this.zzc.zzO(uri0)) {
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

