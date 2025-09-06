package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "PoolConfigurationCreator")
public final class zzfdu extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Context zza;
    public final zzfdr zzb;
    @Field(id = 2)
    public final int zzc;
    @Field(id = 3)
    public final int zzd;
    @Field(id = 4)
    public final int zze;
    @Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfdr[] zzh;
    @Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    static {
        zzfdu.CREATOR = new zzfdv();
    }

    @Constructor
    public zzfdu(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2, @Param(id = 4) int v3, @Param(id = 5) String s, @Param(id = 6) int v4, @Param(id = 7) int v5) {
        zzfdr[] arr_zzfdr = zzfdr.values();
        this.zzh = arr_zzfdr;
        int[] arr_v = zzfds.zza();
        this.zzl = arr_v;
        int[] arr_v1 = zzfdt.zza();
        this.zzm = arr_v1;
        this.zza = null;
        this.zzi = v;
        this.zzb = arr_zzfdr[v];
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = s;
        this.zzj = v4;
        this.zzg = arr_v[v4];
        this.zzk = v5;
        int v6 = arr_v1[v5];
    }

    private zzfdu(Context context0, zzfdr zzfdr0, int v, int v1, int v2, String s, String s1, String s2) {
        int v3;
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        this.zzm = zzfdt.zza();
        this.zza = context0;
        this.zzi = zzfdr0.ordinal();
        this.zzb = zzfdr0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = s;
        if("oldest".equals(s1)) {
            v3 = 1;
        }
        else if("lru".equals(s1)) {
            v3 = 2;
        }
        else if("lfu".equals(s1)) {
            v3 = 3;
        }
        else {
            v3 = 2;
        }
        this.zzg = v3;
        this.zzj = v3 - 1;
        "onAdClosed".equals(s2);
        this.zzk = 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 4, this.zze);
        SafeParcelWriter.writeString(parcel0, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel0, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzfdu zza(zzfdr zzfdr0, Context context0) {
        if(zzfdr0 == zzfdr.zza) {
            return new zzfdu(context0, zzfdr0, ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgl)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgr)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgt)))), ((String)zzba.zzc().zzb(zzbbr.zzgv)), ((String)zzba.zzc().zzb(zzbbr.zzgn)), ((String)zzba.zzc().zzb(zzbbr.zzgp)));
        }
        if(zzfdr0 == zzfdr.zzb) {
            return new zzfdu(context0, zzfdr0, ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgm)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgs)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgu)))), ((String)zzba.zzc().zzb(zzbbr.zzgw)), ((String)zzba.zzc().zzb(zzbbr.zzgo)), ((String)zzba.zzc().zzb(zzbbr.zzgq)));
        }
        return zzfdr0 == zzfdr.zzc ? new zzfdu(context0, zzfdr0, ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgz)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgB)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgC)))), ((String)zzba.zzc().zzb(zzbbr.zzgx)), ((String)zzba.zzc().zzb(zzbbr.zzgy)), ((String)zzba.zzc().zzb(zzbbr.zzgA))) : null;
    }
}

