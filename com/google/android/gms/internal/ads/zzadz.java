package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public class zzadz implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzadz.CREATOR = new zzady();
    }

    protected zzadz(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzadz(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zza.equals(((zzadz)object0).zza) && this.zzb.equals(((zzadz)object0).zzb);
    }

    @Override
    public final int hashCode() {
        return (this.zza.hashCode() + 0x20F) * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
        switch(this.zza) {
            case "ALBUM": {
                zzbt0.zzd(this.zzb);
                return;
            }
            case "ALBUMARTIST": {
                zzbt0.zzc(this.zzb);
                return;
            }
            case "ARTIST": {
                zzbt0.zze(this.zzb);
                return;
            }
            case "DESCRIPTION": {
                zzbt0.zzh(this.zzb);
                return;
            }
            case "TITLE": {
                zzbt0.zzq(this.zzb);
            }
        }
    }
}

