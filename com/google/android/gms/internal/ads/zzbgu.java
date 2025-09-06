package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbgu extends UnifiedNativeAd {
    private final zzbgt zza;
    private final List zzb;
    private final zzbex zzc;
    private final VideoController zzd;
    private final AdChoicesInfo zze;
    private final List zzf;

    public zzbgu(zzbgt zzbgt0) {
        zzbex zzbex1;
        zzbew zzbew0;
        this.zzb = new ArrayList();
        this.zzd = new VideoController();
        this.zzf = new ArrayList();
        this.zza = zzbgt0;
        AdChoicesInfo nativeAd$AdChoicesInfo0 = null;
        try {
            List list0 = zzbgt0.zzu();
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(object0 instanceof IBinder && ((IBinder)object0) != null) {
                        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbew0 = iInterface0 instanceof zzbew ? ((zzbew)iInterface0) : new zzbeu(((IBinder)object0));
                    }
                    else {
                        zzbew0 = null;
                    }
                    if(zzbew0 != null) {
                        zzbex zzbex0 = new zzbex(zzbew0);
                        this.zzb.add(zzbex0);
                    }
                }
            }
            goto label_26;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzh("", remoteException0);
        try {
        label_26:
            List list1 = this.zza.zzv();
            if(list1 != null) {
                Iterator iterator1 = list1.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    zzcw zzcw0 = object1 instanceof IBinder ? zzcv.zzb(((IBinder)object1)) : null;
                    if(zzcw0 != null) {
                        zzcx zzcx0 = new zzcx(zzcw0);
                        this.zzf.add(zzcx0);
                    }
                }
            }
            goto label_39;
        }
        catch(RemoteException remoteException1) {
        }
        zzcaa.zzh("", remoteException1);
        try {
        label_39:
            zzbew zzbew1 = this.zza.zzk();
            if(zzbew1 == null) {
                goto label_47;
            }
            else {
                zzbex1 = new zzbex(zzbew1);
            }
        }
        catch(RemoteException remoteException2) {
            zzcaa.zzh("", remoteException2);
            zzbex1 = null;
        }
        goto label_48;
    label_47:
        zzbex1 = null;
        try {
        label_48:
            this.zzc = zzbex1;
            if(this.zza.zzi() != null) {
                nativeAd$AdChoicesInfo0 = new zzbep(this.zza.zzi());
            }
        }
        catch(RemoteException remoteException3) {
            zzcaa.zzh("", remoteException3);
        }
        this.zze = nativeAd$AdChoicesInfo0;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to cancelUnconfirmedClick", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzC();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final AdChoicesInfo getAdChoicesInfo() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundle0 = this.zza.zzf();
            if(bundle0 != null) {
                return bundle0;
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Image getIcon() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getImages() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if(this.zza.zzj() != null) {
                return new zzep(this.zza.zzj(), null);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.zza.zzr();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getMuteThisAdReasons() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.zza.zzs();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        try {
            return ResponseInfo.zza(this.zza.zzg());
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return ResponseInfo.zza(null);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double f = this.zza.zze();
            return f == -1.0 ? null : f;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.zza.zzt();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if(this.zza.zzh() != null) {
                zzdq zzdq0 = this.zza.zzh();
                this.zzd.zzb(zzdq0);
                return this.zzd;
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzH();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason0) {
        try {
            if(this.zza.zzH()) {
                goto label_5;
            }
            goto label_14;
        }
        catch(RemoteException remoteException0) {
            try {
                zzcaa.zzh("", remoteException0);
                goto label_14;
            label_5:
                if(muteThisAdReason0 == null) {
                    this.zza.zzy(null);
                    return;
                }
                if(muteThisAdReason0 instanceof zzcx) {
                    zzcw zzcw0 = ((zzcx)muteThisAdReason0).zza();
                    this.zza.zzy(zzcw0);
                    return;
                }
                zzcaa.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                return;
            label_14:
                zzcaa.zzg("Ad is not custom mute enabled");
                return;
            }
            catch(RemoteException remoteException1) {
            }
        }
        zzcaa.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle0) {
        try {
            this.zza.zzz(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle0) {
        try {
            return this.zza.zzI(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle0) {
        try {
            this.zza.zzB(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener0) {
        try {
            zzct zzct0 = new zzct(muteThisAdListener0);
            this.zza.zzD(zzct0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            zzfe zzfe0 = new zzfe(onPaidEventListener0);
            this.zza.zzE(zzfe0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to setOnPaidEventListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnconfirmedClickListener unifiedNativeAd$UnconfirmedClickListener0) {
        try {
            zzbhf zzbhf0 = new zzbhf(unifiedNativeAd$UnconfirmedClickListener0);
            this.zza.zzF(zzbhf0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to setUnconfirmedClickListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            IObjectWrapper iObjectWrapper0 = this.zza.zzl();
            if(iObjectWrapper0 != null) {
                return ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
        return null;
    }
}

