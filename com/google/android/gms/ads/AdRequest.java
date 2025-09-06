package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class AdRequest {
    public static class Builder {
        protected final zzdw zza;

        public Builder() {
            zzdw zzdw0 = new zzdw();
            this.zza = zzdw0;
            zzdw0.zzv("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @Deprecated
        public Builder addCustomEventExtrasBundle(Class class0, Bundle bundle0) {
            this.zza.zzq(class0, bundle0);
            return this;
        }

        public Builder addKeyword(String s) {
            this.zza.zzs(s);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class0, Bundle bundle0) {
            this.zza.zzt(class0, bundle0);
            if(class0.equals(AdMobAdapter.class) && bundle0.getBoolean("_emulatorLiveAds")) {
                this.zza.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setAdString(String s) {
            this.zza.zzx(s);
            return this;
        }

        public Builder setContentUrl(String s) {
            Preconditions.checkNotNull(s, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(s, "Content URL must be non-empty.");
            Object[] arr_object = new Object[2];
            boolean z = false;
            arr_object[0] = 0x200;
            arr_object[1] = s.length();
            if(s.length() <= 0x200) {
                z = true;
            }
            Preconditions.checkArgument(z, "Content URL must not exceed %d in length.  Provided length was %d.", arr_object);
            this.zza.zzz(s);
            return this;
        }

        public Builder setHttpTimeoutMillis(int v) {
            this.zza.zzB(v);
            return this;
        }

        public Builder setNeighboringContentUrls(List list0) {
            if(list0 == null) {
                zzcaa.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzD(list0);
            return this;
        }

        public Builder setRequestAgent(String s) {
            this.zza.zzF(s);
            return this;
        }

        @Deprecated
        public final Builder zza(String s) {
            this.zza.zzv(s);
            return this;
        }

        @Deprecated
        public final Builder zzb(Date date0) {
            this.zza.zzy(date0);
            return this;
        }

        @Deprecated
        public final Builder zzc(int v) {
            this.zza.zzA(v);
            return this;
        }

        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzC(z);
            return this;
        }

        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzG(z);
            return this;
        }
    }

    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 0x200;
    protected final zzdx zza;

    protected AdRequest(Builder adRequest$Builder0) {
        this.zza = new zzdx(adRequest$Builder0.zza, null);
    }

    public String getAdString() {
        return this.zza.zzj();
    }

    public String getContentUrl() {
        return this.zza.zzk();
    }

    @Deprecated
    public Bundle getCustomEventExtrasBundle(Class class0) {
        return this.zza.zzd(class0);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public Set getKeywords() {
        return this.zza.zzq();
    }

    public List getNeighboringContentUrls() {
        return this.zza.zzo();
    }

    public Bundle getNetworkExtrasBundle(Class class0) {
        return this.zza.zzf(class0);
    }

    public String getRequestAgent() {
        return this.zza.zzm();
    }

    public boolean isTestDevice(Context context0) {
        return this.zza.zzs(context0);
    }

    public final zzdx zza() {
        return this.zza;
    }
}

