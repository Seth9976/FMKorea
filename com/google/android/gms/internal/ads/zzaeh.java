package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaeh extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzaes[] zzg;

    static {
        zzaeh.CREATOR = new zzaeg();
    }

    zzaeh(Parcel parcel0) {
        super("CHAP");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readInt();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.readLong();
        this.zze = parcel0.readLong();
        int v = parcel0.readInt();
        this.zzg = new zzaes[v];
        for(int v1 = 0; v1 < v; ++v1) {
            this.zzg[v1] = (zzaes)parcel0.readParcelable(zzaes.class.getClassLoader());
        }
    }

    public zzaeh(String s, int v, int v1, long v2, long v3, zzaes[] arr_zzaes) {
        super("CHAP");
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzg = arr_zzaes;
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
            return zzaeh.class == class0 && this.zzb == ((zzaeh)object0).zzb && this.zzc == ((zzaeh)object0).zzc && this.zzd == ((zzaeh)object0).zzd && this.zze == ((zzaeh)object0).zze && zzfk.zzD(this.zza, ((zzaeh)object0).zza) && Arrays.equals(this.zzg, ((zzaeh)object0).zzg);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.zzb + 0x20F) * 0x1F + this.zzc;
        int v1 = (int)this.zzd;
        int v2 = (int)this.zze;
        return this.zza == null ? ((v * 0x1F + v1) * 0x1F + v2) * 0x1F : ((v * 0x1F + v1) * 0x1F + v2) * 0x1F + this.zza.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeLong(this.zze);
        parcel0.writeInt(this.zzg.length);
        zzaes[] arr_zzaes = this.zzg;
        for(int v1 = 0; v1 < arr_zzaes.length; ++v1) {
            parcel0.writeParcelable(arr_zzaes[v1], 0);
        }
    }
}

