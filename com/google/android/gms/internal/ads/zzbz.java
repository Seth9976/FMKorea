package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzbz implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    private final zzby[] zzb;

    static {
        zzbz.CREATOR = new zzbx();
    }

    public zzbz(long v, zzby[] arr_zzby) {
        this.zza = v;
        this.zzb = arr_zzby;
    }

    zzbz(Parcel parcel0) {
        this.zzb = new zzby[parcel0.readInt()];
        for(int v = 0; true; ++v) {
            zzby[] arr_zzby = this.zzb;
            if(v >= arr_zzby.length) {
                break;
            }
            arr_zzby[v] = (zzby)parcel0.readParcelable(zzby.class.getClassLoader());
        }
        this.zza = parcel0.readLong();
    }

    public zzbz(List list0) {
        this(0x8000000000000001L, ((zzby[])list0.toArray(new zzby[0])));
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
            return zzbz.class == class0 && Arrays.equals(this.zzb, ((zzbz)object0).zzb) && this.zza == ((zzbz)object0).zza;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzb) * 0x1F + ((int)(this.zza ^ this.zza >>> 0x20));
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.zzb);
        return this.zza == 0x8000000000000001L ? "entries=" + s + "" : "entries=" + s + (", presentationTimeUs=" + this.zza);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zzb.length);
        zzby[] arr_zzby = this.zzb;
        for(int v1 = 0; v1 < arr_zzby.length; ++v1) {
            parcel0.writeParcelable(arr_zzby[v1], 0);
        }
        parcel0.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzby zzb(int v) {
        return this.zzb[v];
    }

    public final zzbz zzc(zzby[] arr_zzby) {
        if(arr_zzby.length == 0) {
            return this;
        }
        Object[] arr_object = Arrays.copyOf(this.zzb, this.zzb.length + arr_zzby.length);
        System.arraycopy(arr_zzby, 0, arr_object, this.zzb.length, arr_zzby.length);
        return new zzbz(this.zza, ((zzby[])arr_object));
    }

    public final zzbz zzd(zzbz zzbz0) {
        return zzbz0 == null ? this : this.zzc(zzbz0.zzb);
    }
}

