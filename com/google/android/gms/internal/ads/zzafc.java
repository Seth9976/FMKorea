package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzafc extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzafc.CREATOR = new zzafb();
    }

    zzafc(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzafc(String s, String s1, String s2) {
        super(s);
        this.zza = s1;
        this.zzb = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzafc.class == class0 && this.zzf.equals(((zzafc)object0).zzf) && zzfk.zzD(this.zza, ((zzafc)object0).zza) && zzfk.zzD(this.zzb, ((zzafc)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzf.hashCode();
        int v1 = 0;
        int v2 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + 0x20F) * 0x1F + v2) * 0x1F + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaes
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }
}

