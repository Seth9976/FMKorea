package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

public final class zzeey implements zzedt {
    private final Context zza;
    private final zzcqz zzb;
    private View zzc;
    private zzboo zzd;

    public zzeey(Context context0, zzcqz zzcqz0) {
        this.zza = context0;
        this.zzb = zzcqz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        View view0;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() || !zzfbe0.zzah) {
            view0 = this.zzc;
        }
        else {
            try {
                view0 = (View)ObjectWrapper.unwrap(this.zzd.zze());
                boolean z = this.zzd.zzf();
            }
            catch(RemoteException remoteException0) {
                throw new zzfcf(remoteException0);
            }
            if(view0 == null) {
                throw new zzfcf(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
            }
            if(z) {
                d d0 = zzfye.zzn(zzfye.zzh(null), (Object object0) -> zzfye.zzh(zzcrq.zza(this.zza, view0, zzfbe0)), zzcan.zze);
                try {
                    view0 = (View)d0.get();
                    goto label_15;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    throw new zzfcf(interruptedException0);
                }
                throw new zzfcf(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
            }
        }
    label_15:
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzcqj zzcqj0 = new zzcqj(view0, null, new zzeev(zzedq0), ((zzfbf)zzfbe0.zzv.get(0)));
        zzcqd zzcqd0 = this.zzb.zza(zzcst0, zzcqj0);
        zzcqd0.zzg().zza(view0);
        zzeio zzeio0 = zzcqd0.zzi();
        ((zzefj)zzedq0.zzc).zzc(zzeio0);
        return zzcqd0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            ((zzbqc)zzedq0.zzb).zzq(zzfbe0.zzaa);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbe0.zzah) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzeex zzeex0 = new zzeex(this, zzedq0, null);
                ((zzbqc)zzedq0.zzb).zzk(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper0, zzeex0, ((zzbol)zzedq0.zzc), zzfbr0.zza.zza.zze);
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
            zzeex zzeex1 = new zzeex(this, zzedq0, null);
            ((zzbqc)zzedq0.zzb).zzj(zzfbe0.zzV, zzfbe0.zzw.toString(), zzfbr0.zza.zza.zzd, iObjectWrapper1, zzeex1, ((zzbol)zzedq0.zzc), zzfbr0.zza.zza.zze);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        throw new zzfcf(remoteException0);
    }

    // 检测为 Lambda 实现
    final d zzc(View view0, zzfbe zzfbe0, Object object0) [...]
}

