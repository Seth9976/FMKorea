package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

public final class zzbrq implements NativeCustomFormatAd {
    private final zzbfq zza;
    private DisplayOpenMeasurement zzb;

    public zzbrq(zzbfq zzbfq0) {
        this.zza = zzbfq0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if(this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbri(this.zza);
                return this.zzb;
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final Image getImage(String s) {
        try {
            zzbew zzbew0 = this.zza.zzg(s);
            if(zzbew0 != null) {
                return new zzbrj(zzbew0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        try {
            if(this.zza.zzf() != null) {
                return new zzep(this.zza.zzf(), this.zza);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String s) {
        try {
            return this.zza.zzj(s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String s) {
        try {
            this.zza.zzn(s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }
}

