package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbsz;
import java.util.List;
import java.util.Map;

@KeepForSdk
public final class ReportingInfo {
    @KeepForSdk
    public static final class Builder {
        private final zzbsy zza;

        @KeepForSdk
        public Builder(View view0) {
            zzbsy zzbsy0 = new zzbsy();
            this.zza = zzbsy0;
            zzbsy0.zzb(view0);
        }

        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @KeepForSdk
        public Builder setAssetViews(Map map0) {
            this.zza.zzc(map0);
            return this;
        }

        static zzbsy zza(Builder reportingInfo$Builder0) {
            return reportingInfo$Builder0.zza;
        }
    }

    private final zzbsz zza;

    ReportingInfo(Builder reportingInfo$Builder0, zzb zzb0) {
        this.zza = new zzbsz(Builder.zza(reportingInfo$Builder0));
    }

    @KeepForSdk
    public void recordClick(List list0) {
        this.zza.zza(list0);
    }

    @KeepForSdk
    public void recordImpression(List list0) {
        this.zza.zzb(list0);
    }

    @KeepForSdk
    public void reportTouchEvent(MotionEvent motionEvent0) {
        this.zza.zzc(motionEvent0);
    }

    @KeepForSdk
    public void updateClickUrl(Uri uri0, UpdateClickUrlCallback updateClickUrlCallback0) {
        this.zza.zzd(uri0, updateClickUrlCallback0);
    }

    @KeepForSdk
    public void updateImpressionUrls(List list0, UpdateImpressionUrlsCallback updateImpressionUrlsCallback0) {
        this.zza.zze(list0, updateImpressionUrlsCallback0);
    }
}

