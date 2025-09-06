package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.List;

@Class(creator = "NonagonRequestParcelCreator")
public final class zzbun extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final Bundle zza;
    @Field(id = 2)
    public final zzcag zzb;
    @Field(id = 3)
    public final ApplicationInfo zzc;
    @Field(id = 4)
    public final String zzd;
    @Field(id = 5)
    public final List zze;
    @Field(id = 6)
    public final PackageInfo zzf;
    @Field(id = 7)
    public final String zzg;
    @Field(id = 9)
    public final String zzh;
    @Field(id = 10)
    public zzfdu zzi;
    @Field(id = 11)
    public String zzj;
    @Field(id = 12)
    public final boolean zzk;
    @Field(id = 13)
    public final boolean zzl;

    static {
        zzbun.CREATOR = new zzbuo();
    }

    @Constructor
    public zzbun(@Param(id = 1) Bundle bundle0, @Param(id = 2) zzcag zzcag0, @Param(id = 3) ApplicationInfo applicationInfo0, @Param(id = 4) String s, @Param(id = 5) List list0, @Param(id = 6) PackageInfo packageInfo0, @Param(id = 7) String s1, @Param(id = 9) String s2, @Param(id = 10) zzfdu zzfdu0, @Param(id = 11) String s3, @Param(id = 12) boolean z, @Param(id = 13) boolean z1) {
        this.zza = bundle0;
        this.zzb = zzcag0;
        this.zzd = s;
        this.zzc = applicationInfo0;
        this.zze = list0;
        this.zzf = packageInfo0;
        this.zzg = s1;
        this.zzh = s2;
        this.zzi = zzfdu0;
        this.zzj = s3;
        this.zzk = z;
        this.zzl = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zzb, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzf, v, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel0, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.zzi, v, false);
        SafeParcelWriter.writeString(parcel0, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel0, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel0, 13, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

