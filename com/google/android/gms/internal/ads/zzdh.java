package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzdh {
    public static final zzdh zza;
    public static final zzn zzb;
    private static final String zzc;
    private final zzfud zzd;

    static {
        zzdh.zza = new zzdh(zzfud.zzl());
        zzdh.zzc = "0";
        zzdh.zzb = zzde.zza;
    }

    public zzdh(List list0) {
        this.zzd = zzfud.zzj(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzdh.class == class0 ? this.zzd.equals(((zzdh)object0).zzd) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfud zza() {
        return this.zzd;
    }

    public final boolean zzb(int v) {
        for(int v1 = 0; v1 < this.zzd.size(); ++v1) {
            zzdg zzdg0 = (zzdg)this.zzd.get(v1);
            if(zzdg0.zzc() && zzdg0.zza() == v) {
                return true;
            }
        }
        return false;
    }
}

