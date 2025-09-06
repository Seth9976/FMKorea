package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

class zzid implements zzif {
    protected final zzhf zzu;

    zzid(zzhf zzhf0) {
        Preconditions.checkNotNull(zzhf0);
        this.zzu = zzhf0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public Context zza() {
        return this.zzu.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public Clock zzb() {
        return this.zzu.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public zzae zzd() {
        return this.zzu.zzd();
    }

    public zzaf zze() {
        return this.zzu.zzf();
    }

    public zzba zzf() {
        return this.zzu.zzg();
    }

    public zzfq zzi() {
        return this.zzu.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public zzfr zzj() {
        return this.zzu.zzj();
    }

    public zzgd zzk() {
        return this.zzu.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public zzgy zzl() {
        return this.zzu.zzl();
    }

    public zznd zzq() {
        return this.zzu.zzt();
    }

    public void zzr() {
        this.zzu.zzl().zzr();
    }

    public void zzs() {
        this.zzu.zzy();
    }

    public void zzt() {
        this.zzu.zzl().zzt();
    }
}

