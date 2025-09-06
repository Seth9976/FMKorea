package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadu implements zzby {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private static final zzam zzf;
    private static final zzam zzg;
    private int zzh;

    static {
        zzak zzak0 = new zzak();
        zzak0.zzS("application/id3");
        zzadu.zzf = zzak0.zzY();
        zzak zzak1 = new zzak();
        zzak1.zzS("application/x-scte35");
        zzadu.zzg = zzak1.zzY();
        zzadu.CREATOR = new zzadt();
    }

    zzadu(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readLong();
        this.zzd = parcel0.readLong();
        this.zze = parcel0.createByteArray();
    }

    public zzadu(String s, String s1, long v, long v1, byte[] arr_b) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = arr_b;
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
            return zzadu.class == class0 && this.zzc == ((zzadu)object0).zzc && this.zzd == ((zzadu)object0).zzd && zzfk.zzD(this.zza, ((zzadu)object0).zza) && zzfk.zzD(this.zzb, ((zzadu)object0).zzb) && Arrays.equals(this.zze, ((zzadu)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzh;
        if(v == 0) {
            int v1 = 0;
            int v2 = this.zza == null ? 0 : this.zza.hashCode();
            String s = this.zzb;
            if(s != null) {
                v1 = s.hashCode();
            }
            int v3 = Arrays.hashCode(this.zze);
            v = ((((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(this.zzc ^ this.zzc >>> 0x20))) * 0x1F + ((int)(this.zzd ^ this.zzd >>> 0x20))) * 0x1F + v3;
            this.zzh = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeLong(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeByteArray(this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbt0) {
    }
}

