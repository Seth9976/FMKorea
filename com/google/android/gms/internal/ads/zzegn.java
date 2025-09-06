package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzegn implements zzedt {
    private final Context zza;
    private final zzdgm zzb;
    private zzbou zzc;
    private final zzcag zzd;

    public zzegn(Context context0, zzdgm zzdgm0, zzcag zzcag0) {
        this.zza = context0;
        this.zzb = zzdgm0;
        this.zzd = zzcag0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        if(!zzfbr0.zza.zza.zzg.contains("6")) {
            throw new zzehf(2, "Unified must be used for RTB.");
        }
        zzdic zzdic0 = zzdic.zzt(this.zzc);
        String s = Integer.toString(zzdic0.zzc());
        if(!zzfbr0.zza.zza.zzg.contains(s)) {
            throw new zzehf(1, "No corresponding native ad listener");
        }
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdio zzdio0 = new zzdio(zzdic0);
        zzdkf zzdkf0 = new zzdkf(null, null, this.zzc);
        zzdie zzdie0 = this.zzb.zze(zzcst0, zzdio0, zzdkf0);
        zzeio zzeio0 = zzdie0.zzi();
        ((zzefj)zzedq0.zzc).zzc(zzeio0);
        return zzdie0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            ((zzbqc)zzedq0.zzb).zzq(zzfbe0.zzaa);
            if(this.zzd.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzbE))))) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzegm zzegm0 = new zzegm(this, zzedq0, null);
                ((zzbqc)zzedq0.zzb).zzm(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper0, zzegm0, ((zzbol)zzedq0.zzc));
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
            zzegm zzegm1 = new zzegm(this, zzedq0, null);
            ((zzbqc)zzedq0.zzb).zzn(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper1, zzegm1, ((zzbol)zzedq0.zzc), zzfbr0.zza.zza.zzi);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        throw new zzfcf(remoteException0);
    }

    static void zzc(zzegn zzegn0, zzbou zzbou0) {
        zzegn0.zzc = zzbou0;
    }
}

