package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzik {
    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object object0, int v) {
            this.zza = object0;
            this.zzb = v;
        }

        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof zza ? this.zza == ((zza)object0).zza && this.zzb == ((zza)object0).zzb : false;
        }

        @Override
        public final int hashCode() {
            return System.identityHashCode(this.zza) * 0xFFFF + this.zzb;
        }
    }

    static final zzik zza = null;
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private static volatile zzik zzd;
    private final Map zze;

    static {
        zzik.zza = new zzik(true);
    }

    zzik() {
        this.zze = new HashMap();
    }

    private zzik(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzik zza() {
        zzik zzik0 = zzik.zzd;
        if(zzik0 != null) {
            return zzik0;
        }
        synchronized(zzik.class) {
            zzik zzik1 = zzik.zzd;
            if(zzik1 != null) {
                return zzik1;
            }
            zzik zzik2 = zziv.zza(zzik.class);
            zzik.zzd = zzik2;
            return zzik2;
        }
    }

    public final zzf zza(zzkj zzkj0, int v) {
        zza zzik$zza0 = new zza(zzkj0, v);
        return (zzf)this.zze.get(zzik$zza0);
    }
}

