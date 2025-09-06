package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaff implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    static {
        zzaff.CREATOR = new zzafd();
    }

    public zzaff(long v, long v1, long v2, long v3, long v4) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
    }

    zzaff(Parcel parcel0, zzafe zzafe0) {
        this.zza = parcel0.readLong();
        this.zzb = parcel0.readLong();
        this.zzc = parcel0.readLong();
        this.zzd = parcel0.readLong();
        this.zze = parcel0.readLong();
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
            return zzaff.class == class0 && this.zza == ((zzaff)object0).zza && this.zzb == ((zzaff)object0).zzb && this.zzc == ((zzaff)object0).zzc && this.zzd == ((zzaff)object0).zzd && this.zze == ((zzaff)object0).zze;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((((int)(this.zza ^ this.zza >>> 0x20)) + 0x20F) * 0x1F + ((int)(this.zzb ^ this.zzb >>> 0x20))) * 0x1F + ((int)(this.zzc ^ this.zzc >>> 0x20))) * 0x1F + ((int)(this.zzd ^ this.zzd >>> 0x20))) * 0x1F + ((int)(this.zze ^ this.zze >>> 0x20));
    }

    @Override
    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.zza);
        parcel0.writeLong(this.zzb);
        parcel0.writeLong(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeLong(this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
    }
}

