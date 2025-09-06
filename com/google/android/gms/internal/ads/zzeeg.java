package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzeeg implements zzedt {
    private final Context zza;
    private final zzcpq zzb;

    zzeeg(Context context0, zzcpq zzcpq0) {
        this.zza = context0;
        this.zzb = zzcpq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzefs zzefs0 = new zzefs(zzfbe0, ((zzbqc)zzedq0.zzb), AdFormat.APP_OPEN_AD);
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdet zzdet0 = new zzdet(zzefs0, null);
        zzcpo zzcpo0 = new zzcpo(zzfbe0.zzab);
        zzcpn zzcpn0 = this.zzb.zza(zzcst0, zzdet0, zzcpo0);
        zzefs0.zzb(zzcpn0.zzc());
        zzeio zzeio0 = zzcpn0.zzi();
        ((zzefj)zzedq0.zzc).zzc(zzeio0);
        return zzcpn0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            ((zzbqc)zzedq0.zzb).zzq(zzfbe0.zzaa);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzeef zzeef0 = new zzeef(zzedq0, null);
            ((zzbqc)zzedq0.zzb).zzi(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper0, zzeef0, ((zzbol)zzedq0.zzc));
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Remote exception loading an app open RTB ad", remoteException0);
            throw new zzfcf(remoteException0);
        }
    }
}

