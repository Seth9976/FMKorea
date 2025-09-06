package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgn;

@Class(creator = "AdManagerAdViewOptionsCreator")
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final class Builder {
        private boolean zza;
        private ShouldDelayBannerRenderingListener zzb;

        public Builder() {
            this.zza = false;
        }

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, null);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener0) {
            this.zzb = shouldDelayBannerRenderingListener0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;
    @Field(getter = "getDelayedBannerAdListenerBinder", id = 2)
    private final IBinder zzb;

    static {
        AdManagerAdViewOptions.CREATOR = new zzc();
    }

    AdManagerAdViewOptions(Builder adManagerAdViewOptions$Builder0, zzb zzb0) {
        this.zza = adManagerAdViewOptions$Builder0.zza;
        this.zzb = adManagerAdViewOptions$Builder0.zzb == null ? null : new zzfj(adManagerAdViewOptions$Builder0.zzb);
    }

    @Constructor
    AdManagerAdViewOptions(@Param(id = 1) boolean z, @Param(id = 2) IBinder iBinder0) {
        this.zza = z;
        this.zzb = iBinder0;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel0, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzbgn zza() {
        return this.zzb == null ? null : zzbgm.zzc(this.zzb);
    }
}

