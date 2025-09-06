package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;

final class zzmd {
    protected long zza;
    final zzlx zzb;
    private long zzc;
    private final zzaw zzd;

    public zzmd(zzlx zzlx0) {
        this.zzb = zzlx0;
        super();
        this.zzd = new zzmg(this, zzlx0.zzu);
        long v = zzlx0.zzb().elapsedRealtime();
        this.zzc = v;
        this.zza = v;
    }

    static void zza(zzmd zzmd0) {
        zzmd0.zzb.zzt();
        zzmd0.zza(false, false, zzmd0.zzb.zzb().elapsedRealtime());
        zzmd0.zzb.zzc().zza(zzmd0.zzb.zzb().elapsedRealtime());
    }

    final long zza(long v) {
        long v1 = v - this.zza;
        this.zza = v;
        return v1;
    }

    final void zza() {
        this.zzd.zza();
        this.zzc = 0L;
        this.zza = 0L;
    }

    public final boolean zza(boolean z, boolean z1, long v) {
        this.zzb.zzt();
        this.zzb.zzu();
        if(!zzoh.zza() || !this.zzb.zze().zza(zzbi.zzbn) || this.zzb.zzu.zzac()) {
            zzgd zzgd0 = this.zzb.zzk();
            long v1 = this.zzb.zzb().currentTimeMillis();
            zzgd0.zzk.zza(v1);
        }
        long v2 = v - this.zzc;
        if(!z && v2 < 1000L) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", v2);
            return false;
        }
        if(!z1) {
            v2 = this.zza(v);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", v2);
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_et", v2);
        boolean z2 = this.zzb.zze().zzu();
        zznd.zza(this.zzb.zzn().zza(!z2), bundle0, true);
        if(!z1) {
            this.zzb.zzm().zzc("auto", "_e", bundle0);
        }
        this.zzc = v;
        this.zzd.zza();
        this.zzd.zza(3600000L);
        return true;
    }

    final void zzb(long v) {
        this.zzd.zza();
    }

    final void zzc(long v) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = v;
        this.zza = v;
    }
}

