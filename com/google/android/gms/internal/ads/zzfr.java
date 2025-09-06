package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzfr implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final float zzb;

    static {
        zzfr.CREATOR = new zzfp();
    }

    public zzfr(float f, float f1) {
        zzdy.zze(Float.compare(f, -90.0f) >= 0 && f <= 90.0f && f1 >= -180.0f && f1 <= 180.0f, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f1;
    }

    zzfr(Parcel parcel0, zzfq zzfq0) {
        this.zza = parcel0.readFloat();
        this.zzb = parcel0.readFloat();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzfr.class == class0 && this.zza == ((zzfr)object0).zza && this.zzb == ((zzfr)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.zza.hashCode() + 0x20F) * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.zza);
        parcel0.writeFloat(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
    }
}

