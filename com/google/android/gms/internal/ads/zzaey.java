package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaey extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;

    static {
        zzaey.CREATOR = new zzaex();
    }

    zzaey(Parcel parcel0) {
        super("PRIV");
        this.zza = parcel0.readString();
        this.zzb = parcel0.createByteArray();
    }

    public zzaey(String s, byte[] arr_b) {
        super("PRIV");
        this.zza = s;
        this.zzb = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaey.class == class0 && zzfk.zzD(this.zza, ((zzaey)object0).zza) && Arrays.equals(this.zzb, ((zzaey)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza == null ? Arrays.hashCode(this.zzb) + 0x3FD1 : (this.zza.hashCode() + 0x20F) * 0x1F + Arrays.hashCode(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzaes
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByteArray(this.zzb);
    }
}

