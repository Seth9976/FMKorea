package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;
import java.util.Map;

public abstract class UnifiedNativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private VideoController zzj;
    private boolean zzk;
    private View zzl;
    private View zzm;
    private Object zzn;
    private Bundle zzo;
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    public UnifiedNativeAdMapper() {
        this.zzo = new Bundle();
    }

    public View getAdChoicesContent() {
        return this.zzl;
    }

    public final String getAdvertiser() {
        return this.zzf;
    }

    public final String getBody() {
        return this.zzc;
    }

    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() [...] // Inlined contents

    public float getDuration() [...] // Inlined contents

    public final Bundle getExtras() {
        return this.zzo;
    }

    public final String getHeadline() {
        return this.zza;
    }

    public final Image getIcon() {
        return this.zzd;
    }

    public final List getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    public final String getPrice() {
        return this.zzi;
    }

    public final Double getStarRating() {
        return this.zzg;
    }

    public final String getStore() {
        return this.zzh;
    }

    public void handleClick(View view0) {
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view0) {
        this.zzl = view0;
    }

    public final void setAdvertiser(String s) {
        this.zzf = s;
    }

    public final void setBody(String s) {
        this.zzc = s;
    }

    public final void setCallToAction(String s) {
        this.zze = s;
    }

    public final void setExtras(Bundle bundle0) {
        this.zzo = bundle0;
    }

    public void setHasVideoContent(boolean z) {
        this.zzk = z;
    }

    public final void setHeadline(String s) {
        this.zza = s;
    }

    public final void setIcon(Image nativeAd$Image0) {
        this.zzd = nativeAd$Image0;
    }

    public final void setImages(List list0) {
        this.zzb = list0;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzr = f;
    }

    public void setMediaView(View view0) {
        this.zzm = view0;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzq = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzp = z;
    }

    public final void setPrice(String s) {
        this.zzi = s;
    }

    public final void setStarRating(Double double0) {
        this.zzg = double0;
    }

    public final void setStore(String s) {
        this.zzh = s;
    }

    public void trackViews(View view0, Map map0, Map map1) {
    }

    public void untrackView(View view0) {
    }

    public final View zza() {
        return this.zzm;
    }

    public final VideoController zzb() {
        return this.zzj;
    }

    public final Object zzc() {
        return this.zzn;
    }

    public final void zzd(Object object0) {
        this.zzn = object0;
    }

    public final void zze(VideoController videoController0) {
        this.zzj = videoController0;
    }
}

