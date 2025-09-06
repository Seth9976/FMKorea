package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.List;

@Class(creator = "AdsServiceInputParcelCreator")
public final class zzbtr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final ApplicationInfo zza;
    @Field(id = 2)
    public final String zzb;
    @Field(id = 3)
    public final PackageInfo zzc;
    @Field(id = 4)
    public final String zzd;
    @Field(id = 5)
    public final int zze;
    @Field(id = 6)
    public final String zzf;
    @Field(id = 7)
    public final List zzg;
    @Field(id = 8)
    public final boolean zzh;
    @Field(id = 9)
    public final boolean zzi;

    static {
        zzbtr.CREATOR = new zzbts();
    }

    @Constructor
    public zzbtr(@Param(id = 1) ApplicationInfo applicationInfo0, @Param(id = 2) String s, @Param(id = 3) PackageInfo packageInfo0, @Param(id = 4) String s1, @Param(id = 5) int v, @Param(id = 6) String s2, @Param(id = 7) List list0, @Param(id = 8) boolean z, @Param(id = 9) boolean z1) {
        this.zzb = s;
        this.zza = applicationInfo0;
        this.zzc = packageInfo0;
        this.zzd = s1;
        this.zze = v;
        this.zzf = s2;
        this.zzg = list0;
        this.zzh = z;
        this.zzi = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.zza, v, false);
        SafeParcelWriter.writeString(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.zze);
        SafeParcelWriter.writeString(parcel0, 6, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel0, 7, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

