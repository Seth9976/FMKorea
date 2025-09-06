package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "UserAttributeParcelCreator")
public final class zznc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final long zzb;
    @Field(id = 4)
    public final Long zzc;
    @Field(id = 6)
    public final String zzd;
    @Field(id = 7)
    public final String zze;
    @Field(id = 8)
    public final Double zzf;
    @Field(id = 1)
    private final int zzg;
    @Field(id = 5)
    private final Float zzh;

    static {
        zznc.CREATOR = new zznb();
    }

    @Constructor
    zznc(@Param(id = 1) int v, @Param(id = 2) String s, @Param(id = 3) long v1, @Param(id = 4) Long long0, @Param(id = 5) Float float0, @Param(id = 6) String s1, @Param(id = 7) String s2, @Param(id = 8) Double double0) {
        this.zzg = v;
        this.zza = s;
        this.zzb = v1;
        this.zzc = long0;
        Double double1 = null;
        this.zzh = null;
        if(v == 1) {
            if(float0 != null) {
                double1 = float0.doubleValue();
            }
            this.zzf = double1;
        }
        else {
            this.zzf = double0;
        }
        this.zzd = s1;
        this.zze = s2;
    }

    zznc(zzne zzne0) {
        this(zzne0.zzc, zzne0.zzd, zzne0.zze, zzne0.zzb);
    }

    zznc(String s, long v, Object object0, String s1) {
        Preconditions.checkNotEmpty(s);
        this.zzg = 2;
        this.zza = s;
        this.zzb = v;
        this.zze = s1;
        if(object0 == null) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if(object0 instanceof Long) {
            this.zzc = (Long)object0;
            this.zzh = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if(object0 instanceof String) {
            this.zzc = null;
            this.zzh = null;
            this.zzf = null;
            this.zzd = (String)object0;
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.zzc = null;
        this.zzh = null;
        this.zzf = (Double)object0;
        this.zzd = null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzg);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel0, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel0, 5, null, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel0, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final Object zza() {
        Long long0 = this.zzc;
        if(long0 != null) {
            return long0;
        }
        Double double0 = this.zzf;
        if(double0 != null) {
            return double0;
        }
        String s = this.zzd;
        return s != null ? s : null;
    }
}

