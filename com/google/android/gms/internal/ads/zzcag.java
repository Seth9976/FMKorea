package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "VersionInfoParcelCreator")
@Reserved({1})
public final class zzcag extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public String zza;
    @Field(id = 3)
    public int zzb;
    @Field(id = 4)
    public int zzc;
    @Field(id = 5)
    public boolean zzd;
    @Field(id = 6)
    public boolean zze;

    static {
        zzcag.CREATOR = new zzcah();
    }

    public zzcag(int v, int v1, boolean z, boolean z1) {
        this(233012000, v1, true, false, z1);
    }

    public zzcag(int v, int v1, boolean z, boolean z1, boolean z2) {
        this("afma-sdk-a-v" + v + "." + v1 + "." + (z ? "0" : "1"), v, v1, z, z2);
    }

    @Constructor
    zzcag(@Param(id = 2) String s, @Param(id = 3) int v, @Param(id = 4) int v1, @Param(id = 5) boolean z, @Param(id = 6) boolean z1) {
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzcag zza() {
        return new zzcag(12451000, 12451000, true, false, false);
    }
}

