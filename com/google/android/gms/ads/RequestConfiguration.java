package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzcaa;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestConfiguration {
    public static class Builder {
        private int zza;
        private int zzb;
        private String zzc;
        private final List zzd;

        public Builder() {
            this.zza = -1;
            this.zzb = -1;
            this.zzc = null;
            this.zzd = new ArrayList();
        }

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder setMaxAdContentRating(String s) {
            if(s != null && !"".equals(s)) {
                if(!"G".equals(s) && !"PG".equals(s) && !"T".equals(s) && !"MA".equals(s)) {
                    zzcaa.zzj(("Invalid value passed to setMaxAdContentRating: " + s));
                    return this;
                }
                this.zzc = s;
                return this;
            }
            this.zzc = null;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int v) {
            if(v != -1 && v != 0 && v != 1) {
                zzcaa.zzj(("Invalid value passed to setTagForChildDirectedTreatment: " + v));
                return this;
            }
            this.zza = v;
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int v) {
            if(v != -1 && v != 0 && v != 1) {
                zzcaa.zzj(("Invalid value passed to setTagForUnderAgeOfConsent: " + v));
                return this;
            }
            this.zzb = v;
            return this;
        }

        public Builder setTestDeviceIds(List list0) {
            this.zzd.clear();
            if(list0 != null) {
                this.zzd.addAll(list0);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public static final List zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final List zze;

    static {
        RequestConfiguration.zza = Arrays.asList(new String[]{"MA", "T", "PG", "G"});
    }

    RequestConfiguration(int v, int v1, String s, List list0, zzh zzh0) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = s;
        this.zze = list0;
    }

    public String getMaxAdContentRating() {
        return this.zzd == null ? "" : this.zzd;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    public List getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    public Builder toBuilder() {
        Builder requestConfiguration$Builder0 = new Builder();
        requestConfiguration$Builder0.setTagForChildDirectedTreatment(this.zzb);
        requestConfiguration$Builder0.setTagForUnderAgeOfConsent(this.zzc);
        requestConfiguration$Builder0.setMaxAdContentRating(this.zzd);
        requestConfiguration$Builder0.setTestDeviceIds(this.zze);
        return requestConfiguration$Builder0;
    }
}

