package com.google.android.gms.internal.location;

import G3.h;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;
import java.util.List;
import z3.k;

@Class(creator = "ClientIdentityCreator")
@Reserved({2, 5})
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final zzd zza;
    @Field(getter = "getUid", id = 1)
    private final int zzb;
    @Field(getter = "getPackageName", id = 3)
    private final String zzc;
    @Field(getter = "getAttributionTag", id = 4)
    private final String zzd;
    @Field(getter = "getListenerId", id = 6)
    private final String zze;
    @Field(getter = "getClientFeatures", id = 8)
    private final List zzf;
    @Field(getter = "getImpersonator", id = 7)
    private final zze zzg;

    static {
        zze.zza = new zzd(null);
        zze.CREATOR = new zzf();
        Process.myUid();
        Process.myPid();
    }

    @Constructor
    public zze(@Param(id = 1) int v, @Param(id = 3) String s, @Param(id = 4) String s1, @Param(id = 6) String s2, @Param(id = 8) List list0, @Param(id = 7) zze zze0) {
        k.e(s, "packageName");
        super();
        if(zze0 != null && zze0.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = v;
        this.zzc = s;
        this.zzd = s1;
        List list1 = null;
        if(s2 == null) {
            s2 = zze0 == null ? null : zze0.zze;
        }
        this.zze = s2;
        if(list0 == null) {
            if(zze0 != null) {
                list1 = zze0.zzf;
            }
            list0 = list1;
            if(list0 == null) {
                list0 = zzex.zzi();
                k.d(list0, "of(...)");
            }
        }
        k.e(list0, "<this>");
        zzex zzex0 = zzex.zzj(list0);
        k.d(zzex0, "copyOf(...)");
        this.zzf = zzex0;
        this.zzg = zze0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zze && this.zzb == ((zze)object0).zzb && k.a(this.zzc, ((zze)object0).zzc) && k.a(this.zzd, ((zze)object0).zzd) && k.a(this.zze, ((zze)object0).zze) && k.a(this.zzg, ((zze)object0).zzg) && k.a(this.zzf, ((zze)object0).zzf);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, this.zzg});
    }

    @Override
    public final String toString() {
        int v = 0;
        StringBuilder stringBuilder0 = new StringBuilder(this.zzc.length() + 18 + (this.zzd == null ? 0 : this.zzd.length()));
        stringBuilder0.append(this.zzb);
        stringBuilder0.append("/");
        stringBuilder0.append(this.zzc);
        String s = this.zzd;
        if(s != null) {
            stringBuilder0.append("[");
            if(h.u(s, this.zzc, false, 2, null)) {
                stringBuilder0.append(s, this.zzc.length(), s.length());
            }
            else {
                stringBuilder0.append(s);
            }
            stringBuilder0.append("]");
        }
        if(this.zze != null) {
            stringBuilder0.append("/");
            String s1 = this.zze;
            if(s1 != null) {
                v = s1.hashCode();
            }
            stringBuilder0.append(Integer.toHexString(v));
        }
        String s2 = stringBuilder0.toString();
        k.d(s2, "toString(...)");
        return s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        k.e(parcel0, "dest");
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzb);
        SafeParcelWriter.writeString(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel0, 7, this.zzg, v, false);
        SafeParcelWriter.writeTypedList(parcel0, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final boolean zza() {
        return this.zzg != null;
    }
}

