package com.google.android.gms.internal.ads;

final class zzbbo implements zzbdz {
    final zzbbp zza;

    zzbbo(zzbbp zzbbp0) {
        this.zza = zzbbp0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbdz
    public final Boolean zza(String s, boolean z) {
        try {
            return Boolean.valueOf(zzbbp.zza(this.zza).getBoolean(s, z));
        }
        catch(ClassCastException unused_ex) {
            return Boolean.valueOf(zzbbp.zza(this.zza).getString(s, String.valueOf(z)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbdz
    public final Double zzb(String s, double f) {
        try {
            return (double)zzbbp.zza(this.zza).getFloat(s, ((float)f));
        }
        catch(ClassCastException unused_ex) {
            return Double.valueOf(zzbbp.zza(this.zza).getString(s, String.valueOf(f)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbdz
    public final Long zzc(String s, long v) {
        try {
            return zzbbp.zza(this.zza).getLong(s, v);
        }
        catch(ClassCastException unused_ex) {
            return (long)zzbbp.zza(this.zza).getInt(s, ((int)v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbdz
    public final String zzd(String s, String s1) {
        return zzbbp.zza(this.zza).getString(s, s1);
    }
}

