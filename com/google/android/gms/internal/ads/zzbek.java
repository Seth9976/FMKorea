package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.nativead.NativeAdOptions.Builder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "NativeAdOptionsParcelCreator")
public final class zzbek extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    public final boolean zzb;
    @Field(id = 3)
    public final int zzc;
    @Field(id = 4)
    public final boolean zzd;
    @Field(id = 5)
    public final int zze;
    @Field(id = 6)
    public final zzfl zzf;
    @Field(id = 7)
    public final boolean zzg;
    @Field(id = 8)
    public final int zzh;
    @Field(id = 9)
    public final int zzi;
    @Field(id = 10)
    public final boolean zzj;

    static {
        zzbek.CREATOR = new zzbel();
    }

    @Constructor
    public zzbek(@Param(id = 1) int v, @Param(id = 2) boolean z, @Param(id = 3) int v1, @Param(id = 4) boolean z1, @Param(id = 5) int v2, @Param(id = 6) zzfl zzfl0, @Param(id = 7) boolean z2, @Param(id = 8) int v3, @Param(id = 9) int v4, @Param(id = 10) boolean z3) {
        this.zza = v;
        this.zzb = z;
        this.zzc = v1;
        this.zzd = z1;
        this.zze = v2;
        this.zzf = zzfl0;
        this.zzg = z2;
        this.zzh = v3;
        this.zzj = z3;
        this.zzi = v4;
    }

    @Deprecated
    public zzbek(NativeAdOptions nativeAdOptions0) {
        this(4, nativeAdOptions0.shouldReturnUrlsForImageAssets(), nativeAdOptions0.getImageOrientation(), nativeAdOptions0.shouldRequestMultipleImages(), nativeAdOptions0.getAdChoicesPlacement(), (nativeAdOptions0.getVideoOptions() == null ? null : new zzfl(nativeAdOptions0.getVideoOptions())), nativeAdOptions0.zza(), nativeAdOptions0.getMediaAspectRatio(), 0, false);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzf, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel0, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel0, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(zzbek zzbek0) {
        Builder nativeAdOptions$Builder0 = new Builder();
        if(zzbek0 == null) {
            return nativeAdOptions$Builder0.build();
        }
        switch(zzbek0.zza) {
            case 2: {
                nativeAdOptions$Builder0.setAdChoicesPlacement(zzbek0.zze);
                nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbek0.zzb);
                nativeAdOptions$Builder0.setRequestMultipleImages(zzbek0.zzd);
                return nativeAdOptions$Builder0.build();
            }
            case 3: {
                break;
            }
            case 4: {
                nativeAdOptions$Builder0.setRequestCustomMuteThisAd(zzbek0.zzg);
                nativeAdOptions$Builder0.setMediaAspectRatio(zzbek0.zzh);
                nativeAdOptions$Builder0.enableCustomClickGestureDirection(zzbek0.zzi, zzbek0.zzj);
                break;
            }
            default: {
                nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbek0.zzb);
                nativeAdOptions$Builder0.setRequestMultipleImages(zzbek0.zzd);
                return nativeAdOptions$Builder0.build();
            }
        }
        zzfl zzfl0 = zzbek0.zzf;
        if(zzfl0 != null) {
            nativeAdOptions$Builder0.setVideoOptions(new VideoOptions(zzfl0));
        }
        nativeAdOptions$Builder0.setAdChoicesPlacement(zzbek0.zze);
        nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbek0.zzb);
        nativeAdOptions$Builder0.setRequestMultipleImages(zzbek0.zzd);
        return nativeAdOptions$Builder0.build();
    }
}

