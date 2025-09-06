package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaeu extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;

    static {
        zzaeu.CREATOR = new zzaet();
    }

    zzaeu(Parcel parcel0) {
        super("----");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
    }

    public zzaeu(String s, String s1, String s2) {
        super("----");
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaeu.class == class0 && zzfk.zzD(this.zzb, ((zzaeu)object0).zzb) && zzfk.zzD(this.zza, ((zzaeu)object0).zza) && zzfk.zzD(this.zzc, ((zzaeu)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        String s = this.zzc;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + 0x20F) * 0x1F + v2) * 0x1F + v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaes
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzc);
    }
}

