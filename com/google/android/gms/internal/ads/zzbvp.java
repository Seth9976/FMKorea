package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import org.json.JSONArray;

@Class(creator = "RewardItemParcelCreator")
@Reserved({1})
public final class zzbvp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final int zzb;

    static {
        zzbvp.CREATOR = new zzbvq();
    }

    @Constructor
    public zzbvp(@Param(id = 2) String s, @Param(id = 3) int v) {
        this.zza = s;
        this.zzb = v;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzbvp && Objects.equal(this.zza, ((zzbvp)object0).zza) && Objects.equal(this.zzb, ((zzbvp)object0).zzb);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzbvp zza(JSONArray jSONArray0) {
        return jSONArray0 == null || jSONArray0.length() == 0 ? null : new zzbvp(jSONArray0.getJSONObject(0).optString("rb_type"), jSONArray0.getJSONObject(0).optInt("rb_amount"));
    }
}

