package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaej extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzaes[] zze;

    static {
        zzaej.CREATOR = new zzaei();
    }

    zzaej(Parcel parcel0) {
        super("CTOC");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readByte() != 0;
        this.zzc = parcel0.readByte() != 0;
        this.zzd = parcel0.createStringArray();
        int v1 = parcel0.readInt();
        this.zze = new zzaes[v1];
        for(int v = 0; v < v1; ++v) {
            this.zze[v] = (zzaes)parcel0.readParcelable(zzaes.class.getClassLoader());
        }
    }

    public zzaej(String s, boolean z, boolean z1, String[] arr_s, zzaes[] arr_zzaes) {
        super("CTOC");
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = arr_s;
        this.zze = arr_zzaes;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaej.class == class0 && this.zzb == ((zzaej)object0).zzb && this.zzc == ((zzaej)object0).zzc && zzfk.zzD(this.zza, ((zzaej)object0).zza) && Arrays.equals(this.zzd, ((zzaej)object0).zzd) && Arrays.equals(this.zze, ((zzaej)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.zzb + 0x20F) * 0x1F + this.zzc;
        return this.zza == null ? v * 0x1F : v * 0x1F + this.zza.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByte(((byte)this.zzb));
        parcel0.writeByte(((byte)this.zzc));
        parcel0.writeStringArray(this.zzd);
        parcel0.writeInt(this.zze.length);
        zzaes[] arr_zzaes = this.zze;
        for(int v1 = 0; v1 < arr_zzaes.length; ++v1) {
            parcel0.writeParcelable(arr_zzaes[v1], 0);
        }
    }
}

