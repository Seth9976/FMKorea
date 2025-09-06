package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

public final class AdManagerAdRequest extends AdRequest {
    public static final class Builder extends com.google.android.gms.ads.AdRequest.Builder {
        public Builder addCategoryExclusion(String s) {
            this.zza.zzp(s);
            return this;
        }

        public Builder addCustomTargeting(String s, String s1) {
            this.zza.zzr(s, s1);
            return this;
        }

        public Builder addCustomTargeting(String s, List list0) {
            if(list0 != null) {
                String s1 = TextUtils.join(",", list0);
                this.zza.zzr(s, s1);
            }
            return this;
        }

        @Override  // com.google.android.gms.ads.AdRequest$Builder
        public final AdRequest build() {
            return this.build();
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        public Builder setPublisherProvidedId(String s) {
            this.zza.zzE(s);
            return this;
        }
    }

    AdManagerAdRequest(Builder adManagerAdRequest$Builder0, zza zza0) {
        super(adManagerAdRequest$Builder0);
    }

    @Override  // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}

