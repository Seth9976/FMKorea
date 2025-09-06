package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbzp;

public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context0) {
        super(context0, 0);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdManagerAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, true);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdManagerAdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v, 0, true);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbr.zza(this.getContext());
        if(((Boolean)zzbdi.zzf.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
            zzb zzb0 = () -> try {
                this.zza.zzm(adManagerAdRequest0.zza());
            }
            catch(IllegalStateException illegalStateException0) {
                zzbtf.zza(this.getContext()).zzf(illegalStateException0, "AdManagerAdView.loadAd");
            };
            zzbzp.zzb.execute(zzb0);
            return;
        }
        this.zza.zzm(adManagerAdRequest0.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(AdSize[] arr_adSize) {
        if(arr_adSize == null || arr_adSize.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzt(arr_adSize);
    }

    public void setAppEventListener(AppEventListener appEventListener0) {
        this.zza.zzv(appEventListener0);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions0) {
        this.zza.zzy(videoOptions0);
    }

    // 检测为 Lambda 实现
    final void zza(AdManagerAdRequest adManagerAdRequest0) [...]

    public final boolean zzb(zzbu zzbu0) {
        return this.zza.zzz(zzbu0);
    }
}

