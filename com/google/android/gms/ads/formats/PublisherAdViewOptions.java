package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgn;

@Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @Deprecated
    public static final class Builder {
        private ShouldDelayBannerRenderingListener zza;

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener0) {
            this.zza = shouldDelayBannerRenderingListener0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;
    @Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    private final zzcb zzb;
    @Field(getter = "getDelayedBannerAdListenerBinder", id = 3)
    private final IBinder zzc;

    static {
        PublisherAdViewOptions.CREATOR = new zzf();
    }

    @Constructor
    PublisherAdViewOptions(@Param(id = 1) boolean z, @Param(id = 2) IBinder iBinder0, @Param(id = 3) IBinder iBinder1) {
        this.zza = z;
        this.zzb = iBinder0 == null ? null : zzca.zzd(iBinder0);
        this.zzc = iBinder1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.zza);
        SafeParcelWriter.writeIBinder(parcel0, 2, (this.zzb == null ? null : this.zzb.asBinder()), false);
        SafeParcelWriter.writeIBinder(parcel0, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzcb zza() {
        return this.zzb;
    }

    public final zzbgn zzb() {
        return this.zzc == null ? null : zzbgm.zzc(this.zzc);
    }

    public final boolean zzc() {
        return this.zza;
    }
}

