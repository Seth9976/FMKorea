package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class zzfjh {
    private static final zzfjh zza;
    private final ArrayList zzb;
    private final ArrayList zzc;

    static {
        zzfjh.zza = new zzfjh();
    }

    private zzfjh() {
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    public static zzfjh zza() {
        return zzfjh.zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfit zzfit0) {
        this.zzb.add(zzfit0);
    }

    public final void zze(zzfit zzfit0) {
        boolean z = this.zzg();
        this.zzb.remove(zzfit0);
        this.zzc.remove(zzfit0);
        if(z && !this.zzg()) {
            zzfjo.zzb().zzg();
        }
    }

    public final void zzf(zzfit zzfit0) {
        boolean z = this.zzg();
        this.zzc.add(zzfit0);
        if(!z) {
            zzfjo.zzb().zzf();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}

