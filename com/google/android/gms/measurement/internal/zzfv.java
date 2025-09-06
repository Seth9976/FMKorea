package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzfv {
    public String zza;
    public Bundle zzb;
    private String zzc;
    private long zzd;

    private zzfv(String s, String s1, Bundle bundle0, long v) {
        this.zza = s;
        this.zzc = s1;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.zzb = bundle0;
        this.zzd = v;
    }

    @Override
    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + this.zzb;
    }

    public static zzfv zza(zzbg zzbg0) {
        Bundle bundle0 = zzbg0.zzb.zzb();
        return new zzfv(zzbg0.zza, zzbg0.zzc, bundle0, zzbg0.zzd);
    }

    public final zzbg zza() {
        return new zzbg(this.zza, new zzbb(new Bundle(this.zzb)), this.zzc, this.zzd);
    }
}

