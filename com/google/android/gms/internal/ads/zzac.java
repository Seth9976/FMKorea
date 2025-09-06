package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

public final class zzac implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    static {
        zzac.CREATOR = new zzab();
    }

    zzac(Parcel parcel0) {
        this.zza = new UUID(parcel0.readLong(), parcel0.readLong());
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.createByteArray();
    }

    public zzac(UUID uUID0, String s, String s1, byte[] arr_b) {
        uUID0.getClass();
        this.zza = uUID0;
        this.zzb = null;
        this.zzc = s1;
        this.zzd = arr_b;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzac)) {
            return false;
        }
        return object0 == this ? true : zzfk.zzD(this.zzb, ((zzac)object0).zzb) && zzfk.zzD(this.zzc, ((zzac)object0).zzc) && zzfk.zzD(this.zza, ((zzac)object0).zza) && Arrays.equals(this.zzd, ((zzac)object0).zzd);
    }

    @Override
    public final int hashCode() {
        int v = this.zze;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzd);
            v = ((this.zza.hashCode() * 0x1F + (this.zzb == null ? 0 : this.zzb.hashCode())) * 0x1F + this.zzc.hashCode()) * 0x1F + v1;
            this.zze = v;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.zza.getMostSignificantBits());
        parcel0.writeLong(this.zza.getLeastSignificantBits());
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeByteArray(this.zzd);
    }
}

