package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzfdb;
import com.google.android.gms.internal.ads.zzfrx;

@Class(creator = "ExceptionParcelCreator")
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final int zzb;

    static {
        zzaz.CREATOR = new zzba();
    }

    @Constructor
    zzaz(@Param(id = 1) String s, @Param(id = 2) int v) {
        if(s == null) {
            s = "";
        }
        this.zza = s;
        this.zzb = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzay zza() {
        return new zzay(this.zza, this.zzb);
    }

    public static zzaz zzb(Throwable throwable0) {
        zze zze0 = zzfdb.zza(throwable0);
        return zzfrx.zzd(throwable0.getMessage()) ? new zzaz(zze0.zzb, zze0.zza) : new zzaz(throwable0.getMessage(), zze0.zza);
    }
}

