package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

public final class zzaxa {
    private zzawp zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd;

    zzaxa(Context context0) {
        this.zzd = new Object();
        this.zzc = context0;
    }

    static zzawp zza(zzaxa zzaxa0) {
        return zzaxa0.zza;
    }

    static Object zzb(zzaxa zzaxa0) {
        return zzaxa0.zzd;
    }

    final Future zzc(zzawq zzawq0) {
        Future future0 = new zzawu(this);
        zzawy zzawy0 = new zzawy(this, zzawq0, ((zzcas)future0));
        zzawz zzawz0 = new zzawz(this, ((zzcas)future0));
        synchronized(this.zzd) {
            Looper looper0 = zzt.zzt().zzb();
            zzawp zzawp0 = new zzawp(this.zzc, looper0, zzawy0, zzawz0);
            this.zza = zzawp0;
            zzawp0.checkAvailabilityAndConnect();
            return future0;
        }
    }

    static void zzd(zzaxa zzaxa0, boolean z) {
        zzaxa0.zzb = true;
    }

    static void zze(zzaxa zzaxa0) {
        synchronized(zzaxa0.zzd) {
            zzawp zzawp0 = zzaxa0.zza;
            if(zzawp0 == null) {
                return;
            }
            zzawp0.disconnect();
            zzaxa0.zza = null;
            Binder.flushPendingCommands();
        }
    }

    static boolean zzf(zzaxa zzaxa0) {
        return zzaxa0.zzb;
    }
}

