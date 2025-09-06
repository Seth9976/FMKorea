package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzad implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    private final zzac[] zzc;
    private int zzd;

    static {
        zzad.CREATOR = new zzaa();
    }

    zzad(Parcel parcel0) {
        this.zza = parcel0.readString();
        zzac[] arr_zzac = (zzac[])parcel0.createTypedArray(zzac.CREATOR);
        this.zzc = arr_zzac;
        this.zzb = arr_zzac.length;
    }

    private zzad(String s, boolean z, zzac[] arr_zzac) {
        this.zza = s;
        if(z) {
            arr_zzac = (zzac[])arr_zzac.clone();
        }
        this.zzc = arr_zzac;
        this.zzb = arr_zzac.length;
        Arrays.sort(arr_zzac, this);
    }

    public zzad(String s, zzac[] arr_zzac) {
        this(null, true, arr_zzac);
    }

    public zzad(List list0) {
        this(null, false, ((zzac[])list0.toArray(new zzac[0])));
    }

    @Override
    public final int compare(Object object0, Object object1) {
        UUID uUID0 = zzo.zza;
        if(uUID0.equals(((zzac)object0).zza)) {
            return uUID0.equals(((zzac)object1).zza) ? 0 : 1;
        }
        return ((zzac)object0).zza.compareTo(((zzac)object1).zza);
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
            return zzad.class == class0 && zzfk.zzD(this.zza, ((zzad)object0).zza) && Arrays.equals(this.zzc, ((zzad)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzd;
        if(v == 0) {
            v = (this.zza == null ? 0 : this.zza.hashCode()) * 0x1F + Arrays.hashCode(this.zzc);
            this.zzd = v;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeTypedArray(this.zzc, 0);
    }

    public final zzac zza(int v) {
        return this.zzc[v];
    }

    // 去混淆评级： 低(20)
    public final zzad zzb(String s) {
        return zzfk.zzD(this.zza, s) ? this : new zzad(s, false, this.zzc);
    }
}

