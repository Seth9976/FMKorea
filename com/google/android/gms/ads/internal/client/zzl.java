package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzcab;
import java.util.ArrayList;
import java.util.List;

@Class(creator = "AdRequestParcelCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    @Deprecated
    public final long zzb;
    @Field(id = 3)
    public final Bundle zzc;
    @Field(id = 4)
    @Deprecated
    public final int zzd;
    @Field(id = 5)
    public final List zze;
    @Field(id = 6)
    public final boolean zzf;
    @Field(id = 7)
    public final int zzg;
    @Field(id = 8)
    public final boolean zzh;
    @Field(id = 9)
    public final String zzi;
    @Field(id = 10)
    public final zzfh zzj;
    @Field(id = 11)
    public final Location zzk;
    @Field(id = 12)
    public final String zzl;
    @Field(id = 13)
    public final Bundle zzm;
    @Field(id = 14)
    public final Bundle zzn;
    @Field(id = 15)
    public final List zzo;
    @Field(id = 16)
    public final String zzp;
    @Field(id = 17)
    public final String zzq;
    @Field(id = 18)
    @Deprecated
    public final boolean zzr;
    @Field(id = 19)
    public final zzc zzs;
    @Field(id = 20)
    public final int zzt;
    @Field(id = 21)
    public final String zzu;
    @Field(id = 22)
    public final List zzv;
    @Field(id = 23)
    public final int zzw;
    @Field(id = 24)
    public final String zzx;

    static {
        zzl.CREATOR = new zzn();
    }

    @Constructor
    public zzl(@Param(id = 1) int v, @Param(id = 2) long v1, @Param(id = 3) Bundle bundle0, @Param(id = 4) int v2, @Param(id = 5) List list0, @Param(id = 6) boolean z, @Param(id = 7) int v3, @Param(id = 8) boolean z1, @Param(id = 9) String s, @Param(id = 10) zzfh zzfh0, @Param(id = 11) Location location0, @Param(id = 12) String s1, @Param(id = 13) Bundle bundle1, @Param(id = 14) Bundle bundle2, @Param(id = 15) List list1, @Param(id = 16) String s2, @Param(id = 17) String s3, @Param(id = 18) boolean z2, @Param(id = 19) zzc zzc0, @Param(id = 20) int v4, @Param(id = 21) String s4, @Param(id = 22) List list2, @Param(id = 23) int v5, @Param(id = 24) String s5) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = bundle0 == null ? new Bundle() : bundle0;
        this.zzd = v2;
        this.zze = list0;
        this.zzf = z;
        this.zzg = v3;
        this.zzh = z1;
        this.zzi = s;
        this.zzj = zzfh0;
        this.zzk = location0;
        this.zzl = s1;
        this.zzm = bundle1 == null ? new Bundle() : bundle1;
        this.zzn = bundle2;
        this.zzo = list1;
        this.zzp = s2;
        this.zzq = s3;
        this.zzr = z2;
        this.zzs = zzc0;
        this.zzt = v4;
        this.zzu = s4;
        List list3 = list2 == null ? new ArrayList() : list2;
        this.zzv = list3;
        this.zzw = v5;
        this.zzx = s5;
    }

    // 去混淆评级： 低(37)
    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzl)) {
            return false;
        }
        zzl zzl0 = (zzl)object0;
        return this.zza == zzl0.zza && this.zzb == zzl0.zzb && zzcab.zza(this.zzc, zzl0.zzc) && this.zzd == zzl0.zzd && Objects.equal(this.zze, zzl0.zze) && this.zzf == zzl0.zzf && this.zzg == zzl0.zzg && this.zzh == zzl0.zzh && Objects.equal(this.zzi, zzl0.zzi) && Objects.equal(this.zzj, zzl0.zzj) && Objects.equal(this.zzk, zzl0.zzk) && Objects.equal(this.zzl, zzl0.zzl) && zzcab.zza(this.zzm, zzl0.zzm) && zzcab.zza(this.zzn, zzl0.zzn) && Objects.equal(this.zzo, zzl0.zzo) && Objects.equal(this.zzp, zzl0.zzp) && Objects.equal(this.zzq, zzl0.zzq) && this.zzr == zzl0.zzr && this.zzt == zzl0.zzt && Objects.equal(this.zzu, zzl0.zzu) && Objects.equal(this.zzv, zzl0.zzv) && this.zzw == zzl0.zzw && Objects.equal(this.zzx, zzl0.zzx);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, Boolean.valueOf(this.zzf), this.zzg, Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), this.zzt, this.zzu, this.zzv, this.zzw, this.zzx});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeLong(parcel0, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzd);
        SafeParcelWriter.writeStringList(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzh);
        SafeParcelWriter.writeString(parcel0, 9, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.zzj, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 11, this.zzk, v, false);
        SafeParcelWriter.writeString(parcel0, 12, this.zzl, false);
        SafeParcelWriter.writeBundle(parcel0, 13, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel0, 14, this.zzn, false);
        SafeParcelWriter.writeStringList(parcel0, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel0, 16, this.zzp, false);
        SafeParcelWriter.writeString(parcel0, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel0, 18, this.zzr);
        SafeParcelWriter.writeParcelable(parcel0, 19, this.zzs, v, false);
        SafeParcelWriter.writeInt(parcel0, 20, this.zzt);
        SafeParcelWriter.writeString(parcel0, 21, this.zzu, false);
        SafeParcelWriter.writeStringList(parcel0, 22, this.zzv, false);
        SafeParcelWriter.writeInt(parcel0, 23, this.zzw);
        SafeParcelWriter.writeString(parcel0, 24, this.zzx, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

