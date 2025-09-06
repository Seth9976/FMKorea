package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.Arrays;

@Class(creator = "RtbVersionInfoParcelCreator")
public final class zzbqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    public final int zzb;
    @Field(id = 3)
    public final int zzc;

    static {
        zzbqq.CREATOR = new zzbqr();
    }

    @Constructor
    zzbqq(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == null ? false : object0 instanceof zzbqq && ((zzbqq)object0).zzc == this.zzc && ((zzbqq)object0).zzb == this.zzb && ((zzbqq)object0).zza == this.zza;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    @Override
    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzbqq zza(VersionInfo versionInfo0) {
        return new zzbqq(versionInfo0.getMajorVersion(), versionInfo0.getMinorVersion(), versionInfo0.getMicroVersion());
    }
}

