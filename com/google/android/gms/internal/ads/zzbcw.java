package com.google.android.gms.internal.ads;

public class zzbcw {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbcw(String s, Object object0, int v) {
        this.zza = s;
        this.zzb = object0;
        this.zzc = v;
    }

    public static zzbcw zza(String s, double f) {
        return new zzbcw(s, f, 3);
    }

    public static zzbcw zzb(String s, long v) {
        return new zzbcw(s, v, 2);
    }

    public static zzbcw zzc(String s, String s1) {
        return new zzbcw(s, s1, 4);
    }

    public static zzbcw zzd(String s, boolean z) {
        return new zzbcw(s, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbdz zzbdz0 = zzbeb.zza();
        if(zzbdz0 == null) {
            if(zzbeb.zzb() != null) {
                zzbeb.zzb().zza();
            }
            return this.zzb;
        }
        switch(this.zzc - 1) {
            case 0: {
                return zzbdz0.zza(this.zza, ((Boolean)this.zzb).booleanValue());
            }
            case 1: {
                return zzbdz0.zzc(this.zza, ((long)(((Long)this.zzb))));
            }
            case 2: {
                return zzbdz0.zzb(this.zza, ((double)(((Double)this.zzb))));
            }
            default: {
                return zzbdz0.zzd(this.zza, ((String)this.zzb));
            }
        }
    }
}

