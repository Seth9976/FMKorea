package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class zzgc implements zzgi {
    private final boolean zza;
    private final ArrayList zzb;
    private int zzc;
    private zzgn zzd;

    protected zzgc(boolean z) {
        this.zza = z;
        this.zzb = new ArrayList(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public Map zze() {
        return Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhk0) {
        zzhk0.getClass();
        if(!this.zzb.contains(zzhk0)) {
            this.zzb.add(zzhk0);
            ++this.zzc;
        }
    }

    protected final void zzg(int v) {
        zzgn zzgn0 = this.zzd;
        for(int v1 = 0; v1 < this.zzc; ++v1) {
            ((zzhk)this.zzb.get(v1)).zza(this, zzgn0, this.zza, v);
        }
    }

    protected final void zzh() {
        zzgn zzgn0 = this.zzd;
        for(int v = 0; v < this.zzc; ++v) {
            ((zzhk)this.zzb.get(v)).zzb(this, zzgn0, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzgn zzgn0) {
        for(int v = 0; v < this.zzc; ++v) {
            ((zzhk)this.zzb.get(v)).zzc(this, zzgn0, this.zza);
        }
    }

    protected final void zzj(zzgn zzgn0) {
        this.zzd = zzgn0;
        for(int v = 0; v < this.zzc; ++v) {
            ((zzhk)this.zzb.get(v)).zzd(this, zzgn0, this.zza);
        }
    }
}

