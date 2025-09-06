package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzfu implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final long zzc;

    static {
        zzfu.CREATOR = new zzfs();
    }

    public zzfu(long v, long v1, long v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
    }

    zzfu(Parcel parcel0, zzft zzft0) {
        this.zza = parcel0.readLong();
        this.zzb = parcel0.readLong();
        this.zzc = parcel0.readLong();
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
        return object0 instanceof zzfu ? this.zza == ((zzfu)object0).zza && this.zzb == ((zzfu)object0).zzb && this.zzc == ((zzfu)object0).zzc : false;
    }

    @Override
    public final int hashCode() {
        return ((((int)(this.zza ^ this.zza >>> 0x20)) + 0x20F) * 0x1F + ((int)(this.zzb ^ this.zzb >>> 0x20))) * 0x1F + ((int)(this.zzc ^ this.zzc >>> 0x20));
    }

    @Override
    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.zza);
        parcel0.writeLong(this.zzb);
        parcel0.writeLong(this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
    }
}

