package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzcaa;

public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;
    private final zzbfa zzb;

    public NativeAdView(Context context0) {
        super(context0);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    public NativeAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    public NativeAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    @TargetApi(21)
    public NativeAdView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        super.bringChildToFront(this.zza);
    }

    @Override  // android.view.ViewGroup
    public final void bringChildToFront(View view0) {
        super.bringChildToFront(view0);
        FrameLayout frameLayout0 = this.zza;
        if(frameLayout0 != view0) {
            super.bringChildToFront(frameLayout0);
        }
    }

    public void destroy() {
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 != null) {
            try {
                zzbfa0.zzc();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to destroy native ad view", remoteException0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(this.zzb != null && ((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(motionEvent0);
                this.zzb.zzd(iObjectWrapper0);
                return super.dispatchTouchEvent(motionEvent0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call handleTouchEvent on delegate", remoteException0);
                return super.dispatchTouchEvent(motionEvent0);
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    public AdChoicesView getAdChoicesView() {
        View view0 = this.zza("3011");
        return view0 instanceof AdChoicesView ? ((AdChoicesView)view0) : null;
    }

    public final View getAdvertiserView() {
        return this.zza("3005");
    }

    public final View getBodyView() {
        return this.zza("3004");
    }

    public final View getCallToActionView() {
        return this.zza("3002");
    }

    public final View getHeadlineView() {
        return this.zza("3001");
    }

    public final View getIconView() {
        return this.zza("3003");
    }

    public final View getImageView() {
        return this.zza("3008");
    }

    public final MediaView getMediaView() {
        View view0 = this.zza("3010");
        if(view0 instanceof MediaView) {
            return (MediaView)view0;
        }
        if(view0 != null) {
            zzcaa.zze("View is not an instance of MediaView");
        }
        return null;
    }

    public final View getPriceView() {
        return this.zza("3007");
    }

    public final View getStarRatingView() {
        return this.zza("3009");
    }

    public final View getStoreView() {
        return this.zza("3006");
    }

    @Override  // android.view.View
    public final void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 != null) {
            try {
                zzbfa0.zze(ObjectWrapper.wrap(view0), v);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call onVisibilityChanged on delegate", remoteException0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override  // android.view.ViewGroup
    public final void removeView(View view0) {
        if(this.zza == view0) {
            return;
        }
        super.removeView(view0);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView0) {
        this.zzf("3011", adChoicesView0);
    }

    public final void setAdvertiserView(View view0) {
        this.zzf("3005", view0);
    }

    public final void setBodyView(View view0) {
        this.zzf("3004", view0);
    }

    public final void setCallToActionView(View view0) {
        this.zzf("3002", view0);
    }

    public final void setClickConfirmingView(View view0) {
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 != null) {
            try {
                zzbfa0.zzbA(ObjectWrapper.wrap(view0));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call setClickConfirmingView on delegate", remoteException0);
            }
        }
    }

    public final void setHeadlineView(View view0) {
        this.zzf("3001", view0);
    }

    public final void setIconView(View view0) {
        this.zzf("3003", view0);
    }

    public final void setImageView(View view0) {
        this.zzf("3008", view0);
    }

    public final void setMediaView(MediaView mediaView0) {
        this.zzf("3010", mediaView0);
        if(mediaView0 == null) {
            return;
        }
        mediaView0.zza(new zzb(this));
        mediaView0.zzb(new zzc(this));
    }

    public void setNativeAd(NativeAd nativeAd0) {
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 != null) {
            try {
                zzbfa0.zzbD(((IObjectWrapper)nativeAd0.zza()));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call setNativeAd on delegate", remoteException0);
            }
        }
    }

    public final void setPriceView(View view0) {
        this.zzf("3007", view0);
    }

    public final void setStarRatingView(View view0) {
        this.zzf("3009", view0);
    }

    public final void setStoreView(View view0) {
        this.zzf("3006", view0);
    }

    protected final View zza(String s) {
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 != null) {
            try {
                IObjectWrapper iObjectWrapper0 = zzbfa0.zzb(s);
                if(iObjectWrapper0 != null) {
                    return (View)ObjectWrapper.unwrap(iObjectWrapper0);
                }
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call getAssetView on delegate", remoteException0);
            }
        }
        return null;
    }

    final void zzb(MediaContent mediaContent0) {
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 == null) {
            return;
        }
        try {
            if(mediaContent0 instanceof zzep) {
                zzbfa0.zzbB(((zzep)mediaContent0).zzc());
                return;
            }
            if(mediaContent0 == null) {
                zzbfa0.zzbB(null);
                return;
            }
            zzcaa.zze("Use MediaContent provided by NativeAd.getMediaContent");
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzh("Unable to call setMediaContent on delegate", remoteException0);
    }

    final void zzc(ImageView.ScaleType imageView$ScaleType0) {
        try {
            zzbfa zzbfa0 = this.zzb;
            if(zzbfa0 == null) {
                return;
            }
            if(imageView$ScaleType0 != null) {
                zzbfa0.zzbC(ObjectWrapper.wrap(imageView$ScaleType0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to call setMediaViewImageScaleType on delegate", remoteException0);
        }
    }

    private final FrameLayout zzd(Context context0) {
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.addView(frameLayout0);
        return frameLayout0;
    }

    // 去混淆评级： 低(20)
    private final zzbfa zze() {
        return this.isInEditMode() ? null : zzay.zza().zzh(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String s, View view0) {
        zzbfa zzbfa0 = this.zzb;
        if(zzbfa0 != null) {
            try {
                zzbfa0.zzbz(s, ObjectWrapper.wrap(view0));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to call setAssetView on delegate", remoteException0);
            }
        }
    }
}

