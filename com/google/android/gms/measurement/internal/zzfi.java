package com.google.android.gms.measurement.internal;

public final class zzfi {
    private static final Object zza;
    private final String zzb;
    private final zzfg zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf;
    private volatile Object zzg;
    private volatile Object zzh;

    static {
        zzfi.zza = new Object();
    }

    private zzfi(String s, Object object0, Object object1, zzfg zzfg0) {
        this.zzf = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zzb = s;
        this.zzd = object0;
        this.zze = object1;
        this.zzc = zzfg0;
    }

    zzfi(String s, Object object0, Object object1, zzfg zzfg0, zzfh zzfh0) {
        this(s, object0, object1, zzfg0);
    }

    public final Object zza(Object object0) {
        Object object4;
        synchronized(this.zzf) {
        }
        if(object0 != null) {
            return object0;
        }
        if(zzff.zza == null) {
            return this.zzd;
        }
        synchronized(zzfi.zza) {
            if(zzae.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
        }
        try {
            for(Object object3: zzbi.zzcv) {
                zzfi zzfi0 = (zzfi)object3;
                if(zzae.zza()) {
                    throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                }
                try {
                    object4 = null;
                    zzfg zzfg0 = zzfi0.zzc;
                    if(zzfg0 != null) {
                        object4 = zzfg0.zza();
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                synchronized(zzfi.zza) {
                    zzfi0.zzh = object4;
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        zzfg zzfg1 = this.zzc;
        if(zzfg1 == null) {
            return this.zzd;
        }
        try {
            return zzfg1.zza();
        }
        catch(SecurityException unused_ex) {
            return this.zzd;
        }
        catch(IllegalStateException unused_ex) {
            return this.zzd;
        }
    }

    public final String zza() {
        return this.zzb;
    }
}

