package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaef extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final byte[] zza;

    static {
        zzaef.CREATOR = new zzaee();
    }

    zzaef(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = parcel0.createByteArray();
    }

    public zzaef(String s, byte[] arr_b) {
        super(s);
        this.zza = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaef.class == class0 && this.zzf.equals(((zzaef)object0).zzf) && Arrays.equals(this.zza, ((zzaef)object0).zza);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zza);
        return (this.zzf.hashCode() + 0x20F) * 0x1F + v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeByteArray(this.zza);
    }
}

