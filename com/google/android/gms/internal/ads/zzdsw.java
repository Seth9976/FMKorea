package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdsw implements zzdsg {
    private final long zza;
    private final zzdsl zzb;
    private final zzfav zzc;

    zzdsw(long v, Context context0, zzdsl zzdsl0, zzchd zzchd0, String s) {
        this.zza = v;
        this.zzb = zzdsl0;
        zzfax zzfax0 = zzchd0.zzv();
        zzfax0.zzb(context0);
        zzfax0.zza(s);
        this.zzc = zzfax0.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzdsg
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(zzl zzl0) {
        try {
            zzdsu zzdsu0 = new zzdsu(this);
            this.zzc.zzf(zzl0, zzdsu0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdsg
    public final void zzc() {
        try {
            zzdsv zzdsv0 = new zzdsv(this);
            this.zzc.zzk(zzdsv0);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(null);
            this.zzc.zzm(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    static long zzd(zzdsw zzdsw0) {
        return zzdsw0.zza;
    }

    static zzdsl zze(zzdsw zzdsw0) {
        return zzdsw0.zzb;
    }
}

