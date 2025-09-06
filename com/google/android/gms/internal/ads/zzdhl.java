package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdhl extends zzbes {
    private final zzdic zza;
    private IObjectWrapper zzb;

    public zzdhl(zzdic zzdic0) {
        this.zza = zzdic0;
    }

    private static float zzb(IObjectWrapper iObjectWrapper0) {
        if(iObjectWrapper0 == null) {
            return 0.0f;
        }
        Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
        return drawable0 == null || drawable0.getIntrinsicWidth() == -1 || drawable0.getIntrinsicHeight() == -1 ? 0.0f : ((float)drawable0.getIntrinsicWidth()) / ((float)drawable0.getIntrinsicHeight());
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final float zze() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzge)).booleanValue()) {
            return 0.0f;
        }
        if(this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if(this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Remote exception getting video controller aspect ratio.", remoteException0);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper0 = this.zzb;
        if(iObjectWrapper0 != null) {
            return zzdhl.zzb(iObjectWrapper0);
        }
        zzbew zzbew0 = this.zza.zzm();
        if(zzbew0 != null) {
            float f = zzbew0.zzd() == -1 || zzbew0.zzc() == -1 ? 0.0f : ((float)zzbew0.zzd()) / ((float)zzbew0.zzc());
            return f == 0.0f ? zzdhl.zzb(zzbew0.zzf()) : f;
        }
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final float zzf() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgf)).booleanValue()) {
            return 0.0f;
        }
        return this.zza.zzj() == null ? 0.0f : this.zza.zzj().zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final float zzg() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgf)).booleanValue()) {
            return 0.0f;
        }
        return this.zza.zzj() == null ? 0.0f : this.zza.zzj().zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final zzdq zzh() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() ? this.zza.zzj() : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final IObjectWrapper zzi() {
        IObjectWrapper iObjectWrapper0 = this.zzb;
        if(iObjectWrapper0 != null) {
            return iObjectWrapper0;
        }
        zzbew zzbew0 = this.zza.zzm();
        return zzbew0 == null ? null : zzbew0.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.zzb = iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final boolean zzk() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() ? this.zza.zzaf() : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final boolean zzl() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() ? this.zza.zzj() != null : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbet
    public final void zzm(zzbge zzbge0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgf)).booleanValue()) {
            return;
        }
        if(this.zza.zzj() instanceof zzcge) {
            ((zzcge)this.zza.zzj()).zzv(zzbge0);
        }
    }
}

