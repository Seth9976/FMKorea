package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzehr implements zzedt {
    private final Context zza;
    private final zzdnv zzb;

    public zzehr(Context context0, zzdnv zzdnv0) {
        this.zza = context0;
        this.zzb = zzdnv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzefs zzefs0 = new zzefs(zzfbe0, ((zzbqc)zzedq0.zzb), AdFormat.REWARDED);
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdns zzdns0 = new zzdns(zzefs0);
        zzdnr zzdnr0 = this.zzb.zze(zzcst0, zzdns0);
        zzefs0.zzb(zzdnr0.zzc());
        zzein zzein0 = zzdnr0.zzn();
        ((zzefj)zzedq0.zzc).zzc(zzein0);
        return zzdnr0.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            ((zzbqc)zzedq0.zzb).zzq(zzfbe0.zzaa);
            if(zzfbr0.zza.zza.zzo.zza == 3) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzehq zzehq0 = new zzehq(this, zzedq0, null);
                ((zzbqc)zzedq0.zzb).zzo(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper0, zzehq0, ((zzbol)zzedq0.zzc));
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
            zzehq zzehq1 = new zzehq(this, zzedq0, null);
            ((zzbqc)zzedq0.zzb).zzp(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper1, zzehq1, ((zzbol)zzedq0.zzc));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zze.zzb("Remote exception loading a rewarded RTB ad", remoteException0);
    }
}

