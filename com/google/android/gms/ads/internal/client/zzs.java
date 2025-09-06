package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import org.json.JSONObject;

@Class(creator = "AdValueParcelCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    public final int zzb;
    @Field(id = 3)
    public final String zzc;
    @Field(id = 4)
    public final long zzd;

    static {
        zzs.CREATOR = new zzt();
    }

    @Constructor
    public zzs(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) String s, @Param(id = 4) long v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = s;
        this.zzd = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.writeString(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel0, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzs zza(JSONObject jSONObject0) {
        return new zzs(jSONObject0.getInt("type_num"), jSONObject0.getInt("precision_num"), jSONObject0.getString("currency"), jSONObject0.getLong("value"));
    }
}

