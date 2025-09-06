package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaeb implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    static {
        zzaeb.CREATOR = new zzaea();
    }

    public zzaeb(int v, String s, String s1, String s2, boolean z, int v1) {
        zzdy.zzd(v1 == -1 || v1 > 0);
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        this.zzf = v1;
    }

    zzaeb(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.readString();
        this.zze = parcel0.readInt() != 0;
        this.zzf = parcel0.readInt();
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
            return zzaeb.class == class0 && this.zza == ((zzaeb)object0).zza && zzfk.zzD(this.zzb, ((zzaeb)object0).zzb) && zzfk.zzD(this.zzc, ((zzaeb)object0).zzc) && zzfk.zzD(this.zzd, ((zzaeb)object0).zzd) && this.zze == ((zzaeb)object0).zze && this.zzf == ((zzaeb)object0).zzf;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza + 0x20F;
        int v1 = 0;
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        int v3 = this.zzc == null ? 0 : this.zzc.hashCode();
        String s = this.zzd;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.zze) * 0x1F + this.zzf;
    }

    @Override
    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeString(this.zzd);
        parcel0.writeInt(((int)this.zze));
        parcel0.writeInt(this.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
        String s = this.zzc;
        if(s != null) {
            zzbt0.zzp(s);
        }
        String s1 = this.zzb;
        if(s1 != null) {
            zzbt0.zzi(s1);
        }
    }
}

