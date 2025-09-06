package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzbfr implements NativeCustomTemplateAd {
    private final zzbfq zza;
    private final MediaView zzb;
    private final VideoController zzc;
    private DisplayOpenMeasurement zzd;

    public zzbfr(zzbfq zzbfq0) {
        Context context0;
        this.zzc = new VideoController();
        this.zza = zzbfq0;
        MediaView mediaView0 = null;
        try {
            context0 = (Context)ObjectWrapper.unwrap(zzbfq0.zzh());
        }
        catch(NullPointerException | RemoteException nullPointerException0) {
            zzcaa.zzh("", nullPointerException0);
            context0 = null;
        }
        if(context0 != null) {
            MediaView mediaView1 = new MediaView(context0);
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(mediaView1);
                if(this.zza.zzs(iObjectWrapper0)) {
                    mediaView0 = mediaView1;
                }
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("", remoteException0);
            }
        }
        this.zzb = mediaView0;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.zza.zzl();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.zza.zzi();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if(this.zzd == null && this.zza.zzq()) {
                this.zzd = new zzbeq(this.zza);
                return this.zzd;
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final Image getImage(String s) {
        try {
            zzbew zzbew0 = this.zza.zzg(s);
            if(zzbew0 != null) {
                return new zzbex(zzbew0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String s) {
        try {
            return this.zza.zzj(s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzdq zzdq0 = this.zza.zze();
            if(zzdq0 != null) {
                this.zzc.zzb(zzdq0);
                return this.zzc;
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String s) {
        try {
            this.zza.zzn(s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    public final zzbfq zza() {
        return this.zza;
    }
}

