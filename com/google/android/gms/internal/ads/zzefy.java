package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzefy implements zzedt {
    private final Context zza;
    private final zzdfq zzb;

    public zzefy(Context context0, zzdfq zzdfq0) {
        this.zza = context0;
        this.zzb = zzdfq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzefs zzefs0 = new zzefs(zzfbe0, ((zzbqc)zzedq0.zzb), AdFormat.INTERSTITIAL);
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdet zzdet0 = new zzdet(zzefs0, null);
        zzdeq zzdeq0 = this.zzb.zze(zzcst0, zzdet0);
        zzefs0.zzb(zzdeq0.zzc());
        zzeio zzeio0 = zzdeq0.zzi();
        ((zzefj)zzedq0.zzc).zzc(zzeio0);
        return zzdeq0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            ((zzbqc)zzedq0.zzb).zzq(zzfbe0.zzaa);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzefx zzefx0 = new zzefx(this, zzedq0, null);
            ((zzbqc)zzedq0.zzb).zzl(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper0, zzefx0, ((zzbol)zzedq0.zzc));
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Remote exception loading a interstitial RTB ad", remoteException0);
            throw new zzfcf(remoteException0);
        }
    }
}

