package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzafi implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final int zzb;

    static {
        zzafi.CREATOR = new zzafg();
    }

    public zzafi(float f, int v) {
        this.zza = f;
        this.zzb = v;
    }

    zzafi(Parcel parcel0, zzafh zzafh0) {
        this.zza = parcel0.readFloat();
        this.zzb = parcel0.readInt();
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
            return zzafi.class == class0 && this.zza == ((zzafi)object0).zza && this.zzb == ((zzafi)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.zza.hashCode() + 0x20F) * 0x1F + this.zzb;
    }

    @Override
    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.zza);
        parcel0.writeInt(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
    }
}

