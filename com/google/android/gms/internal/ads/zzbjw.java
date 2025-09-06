package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbjw {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbjs zzc;

    public zzbjw(Context context0, OnH5AdsEventListener onH5AdsEventListener0) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(onH5AdsEventListener0);
        this.zza = context0;
        this.zzb = onH5AdsEventListener0;
        zzbbr.zza(context0);
    }

    public final void zza() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzji)).booleanValue()) {
            return;
        }
        this.zzd();
        zzbjs zzbjs0 = this.zzc;
        if(zzbjs0 != null) {
            try {
                zzbjs0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }

    public final boolean zzb(String s) {
        if(!zzbjw.zzc(s)) {
            return false;
        }
        this.zzd();
        zzbjs zzbjs0 = this.zzc;
        if(zzbjs0 != null) {
            try {
                zzbjs0.zzf(s);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
            return true;
        }
        return false;
    }

    public static final boolean zzc(String s) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzji)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(s);
        if(s.length() > ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzjk))))) {
            zzcaa.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri0 = Uri.parse(s);
        return "gmsg".equals(uri0.getScheme()) && "mobileads.google.com".equals(uri0.getHost()) && "/h5ads".equals(uri0.getPath());
    }

    private final void zzd() {
        if(this.zzc != null) {
            return;
        }
        zzboc zzboc0 = new zzboc();
        this.zzc = zzay.zza().zzl(this.zza, zzboc0, this.zzb);
    }
}

