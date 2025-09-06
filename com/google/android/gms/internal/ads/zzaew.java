package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaew extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    static {
        zzaew.CREATOR = new zzaev();
    }

    public zzaew(int v, int v1, int v2, int[] arr_v, int[] arr_v1) {
        super("MLLT");
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = arr_v;
        this.zze = arr_v1;
    }

    zzaew(Parcel parcel0) {
        super("MLLT");
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readInt();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.createIntArray();
        this.zze = parcel0.createIntArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzaes
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
            return zzaew.class == class0 && this.zza == ((zzaew)object0).zza && this.zzb == ((zzaew)object0).zzb && this.zzc == ((zzaew)object0).zzc && Arrays.equals(this.zzd, ((zzaew)object0).zzd) && Arrays.equals(this.zze, ((zzaew)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzd);
        int v1 = Arrays.hashCode(this.zze);
        return ((((this.zza + 0x20F) * 0x1F + this.zzb) * 0x1F + this.zzc) * 0x1F + v) * 0x1F + v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeIntArray(this.zzd);
        parcel0.writeIntArray(this.zze);
    }
}

