package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzfo implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    static {
        zzfo.CREATOR = new zzfm();
    }

    zzfo(Parcel parcel0, zzfn zzfn0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.createByteArray();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.readInt();
    }

    public zzfo(String s, byte[] arr_b, int v, int v1) {
        this.zza = s;
        this.zzb = arr_b;
        this.zzc = v;
        this.zzd = v1;
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
            return zzfo.class == class0 && this.zza.equals(((zzfo)object0).zza) && Arrays.equals(this.zzb, ((zzfo)object0).zzb) && this.zzc == ((zzfo)object0).zzc && this.zzd == ((zzfo)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzb);
        return (((this.zza.hashCode() + 0x20F) * 0x1F + v) * 0x1F + this.zzc) * 0x1F + this.zzd;
    }

    @Override
    public final String toString() {
        int v1 = this.zzd;
        if(v1 != 1) {
            switch(v1) {
                case 23: {
                    zzdy.zzd(this.zzb.length == 4);
                    return "mdta: key=" + this.zza + ", value=" + Float.intBitsToFloat((this.zzb[1] & 0xFF) << 16 | this.zzb[0] << 24 | (this.zzb[2] & 0xFF) << 8 | this.zzb[3] & 0xFF);
                }
                case 67: {
                    zzdy.zzd(this.zzb.length == 4);
                    return "mdta: key=" + this.zza + ", value=" + (this.zzb[1] << 16 | this.zzb[0] << 24 | this.zzb[2] << 8 | this.zzb[3]);
                }
                default: {
                    byte[] arr_b = this.zzb;
                    StringBuilder stringBuilder0 = new StringBuilder(arr_b.length + arr_b.length);
                    for(int v = 0; v < arr_b.length; ++v) {
                        stringBuilder0.append(Character.forDigit(arr_b[v] >> 4 & 15, 16));
                        stringBuilder0.append(Character.forDigit(arr_b[v] & 15, 16));
                    }
                    return "mdta: key=" + this.zza + ", value=" + stringBuilder0.toString();
                }
            }
        }
        return "mdta: key=" + this.zza + ", value=" + new String(this.zzb, zzfqu.zzc);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByteArray(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeInt(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
    }
}

