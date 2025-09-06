package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzcaa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static final WeakHashMap zza;
    private zzbfg zzb;
    private WeakReference zzc;

    static {
        NativeAdViewHolder.zza = new WeakHashMap();
    }

    public NativeAdViewHolder(View view0, Map map0, Map map1) {
        Preconditions.checkNotNull(view0, "ContainerView must not be null");
        if(view0 instanceof NativeAdView) {
            zzcaa.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap0 = NativeAdViewHolder.zza;
        if(weakHashMap0.get(view0) != null) {
            zzcaa.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap0.put(view0, this);
        this.zzc = new WeakReference(view0);
        this.zzb = zzay.zza().zzi(view0, NativeAdViewHolder.zza(map0), NativeAdViewHolder.zza(map1));
    }

    public final void setClickConfirmingView(View view0) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view0));
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call setClickConfirmingView on delegate", remoteException0);
        }
    }

    public void setNativeAd(NativeAd nativeAd0) {
        Object object0 = nativeAd0.zza();
        View view0 = this.zzc == null ? null : ((View)this.zzc.get());
        if(view0 == null) {
            zzcaa.zzj("NativeAdViewHolder.setNativeAd containerView doesn\'t exist, returning");
            return;
        }
        WeakHashMap weakHashMap0 = NativeAdViewHolder.zza;
        if(!weakHashMap0.containsKey(view0)) {
            weakHashMap0.put(view0, this);
        }
        zzbfg zzbfg0 = this.zzb;
        if(zzbfg0 != null) {
            try {
                zzbfg0.zzc(((IObjectWrapper)object0));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call setNativeAd on delegate", remoteException0);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbfg zzbfg0 = this.zzb;
        if(zzbfg0 != null) {
            try {
                zzbfg0.zzd();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call unregisterNativeAd on delegate", remoteException0);
            }
        }
        View view0 = this.zzc == null ? null : ((View)this.zzc.get());
        if(view0 != null) {
            NativeAdViewHolder.zza.remove(view0);
        }
    }

    private static final HashMap zza(Map map0) {
        return map0 == null ? new HashMap() : new HashMap(map0);
    }
}

