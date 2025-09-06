package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "HttpRequestParcelCreator")
public final class zzbtv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final int zzb;
    @Field(id = 3)
    public final Bundle zzc;
    @Field(id = 4)
    public final byte[] zzd;
    @Field(id = 5)
    public final boolean zze;
    @Field(id = 6)
    public final String zzf;
    @Field(id = 7)
    public final String zzg;

    static {
        zzbtv.CREATOR = new zzbtw();
    }

    @Constructor
    public zzbtv(@Param(id = 1) String s, @Param(id = 2) int v, @Param(id = 3) Bundle bundle0, @Param(id = 4) byte[] arr_b, @Param(id = 5) boolean z, @Param(id = 6) String s1, @Param(id = 7) String s2) {
        this.zza = s;
        this.zzb = v;
        this.zzc = bundle0;
        this.zzd = arr_b;
        this.zze = z;
        this.zzf = s1;
        this.zzg = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zze);
        SafeParcelWriter.writeString(parcel0, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

