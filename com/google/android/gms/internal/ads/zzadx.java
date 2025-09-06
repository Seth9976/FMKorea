package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadx implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    static {
        zzadx.CREATOR = new zzadw();
    }

    public zzadx(int v, String s, String s1, int v1, int v2, int v3, int v4, byte[] arr_b) {
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = arr_b;
    }

    zzadx(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.readInt();
        this.zze = parcel0.readInt();
        this.zzf = parcel0.readInt();
        this.zzg = parcel0.readInt();
        this.zzh = parcel0.createByteArray();
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
            return zzadx.class == class0 && this.zza == ((zzadx)object0).zza && this.zzb.equals(((zzadx)object0).zzb) && this.zzc.equals(((zzadx)object0).zzc) && this.zzd == ((zzadx)object0).zzd && this.zze == ((zzadx)object0).zze && this.zzf == ((zzadx)object0).zzf && this.zzg == ((zzadx)object0).zzg && Arrays.equals(this.zzh, ((zzadx)object0).zzh);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzh);
        return (((((((this.zza + 0x20F) * 0x1F + this.zzb.hashCode()) * 0x1F + this.zzc.hashCode()) * 0x1F + this.zzd) * 0x1F + this.zze) * 0x1F + this.zzf) * 0x1F + this.zzg) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeInt(this.zzd);
        parcel0.writeInt(this.zze);
        parcel0.writeInt(this.zzf);
        parcel0.writeInt(this.zzg);
        parcel0.writeByteArray(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
        zzbt0.zza(this.zzh, this.zza);
    }

    public static zzadx zzb(zzfb zzfb0) {
        int v = zzfb0.zzf();
        String s = zzfb0.zzy(zzfb0.zzf(), zzfqu.zza);
        String s1 = zzfb0.zzy(zzfb0.zzf(), zzfqu.zzc);
        int v1 = zzfb0.zzf();
        int v2 = zzfb0.zzf();
        int v3 = zzfb0.zzf();
        int v4 = zzfb0.zzf();
        int v5 = zzfb0.zzf();
        byte[] arr_b = new byte[v5];
        zzfb0.zzC(arr_b, 0, v5);
        return new zzadx(v, s, s1, v1, v2, v3, v4, arr_b);
    }
}

