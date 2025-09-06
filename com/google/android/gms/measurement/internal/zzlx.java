package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzcp;

public final class zzlx extends zze {
    protected final zzmf zza;
    protected final zzmd zzb;
    private Handler zzc;
    private boolean zzd;
    private final zzmc zze;

    zzlx(zzhf zzhf0) {
        super(zzhf0);
        this.zzd = true;
        this.zza = new zzmf(this);
        this.zzb = new zzmd(this);
        this.zze = new zzmc(this);
    }

    static void zza(zzlx zzlx0, long v) {
        zzlx0.zzt();
        zzlx0.zzab();
        zzlx0.zzj().zzp().zza("Activity paused, time", v);
        zzlx0.zze.zza(v);
        if(zzlx0.zze().zzu()) {
            zzlx0.zzb.zzb(v);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    final void zza(boolean z) {
        this.zzt();
        this.zzd = z;
    }

    public final boolean zza(boolean z, boolean z1, long v) {
        return this.zzb.zza(z, z1, v);
    }

    final boolean zzaa() {
        this.zzt();
        return this.zzd;
    }

    private final void zzab() {
        this.zzt();
        if(this.zzc == null) {
            this.zzc = new zzcp(Looper.getMainLooper());
        }
    }

    static void zzb(zzlx zzlx0, long v) {
        zzlx0.zzt();
        zzlx0.zzab();
        zzlx0.zzj().zzp().zza("Activity resumed, time", v);
        if(!zzlx0.zze().zza(zzbi.zzcj)) {
            if(zzlx0.zze().zzu() || zzlx0.zzk().zzn.zza()) {
                zzlx0.zzb.zzc(v);
            }
        }
        else if(zzlx0.zze().zzu() || zzlx0.zzd) {
            zzlx0.zzb.zzc(v);
        }
        zzlx0.zze.zza();
        zzmf zzmf0 = zzlx0.zza;
        zzmf0.zza.zzt();
        if(zzmf0.zza.zzu.zzac()) {
            zzmf0.zza(zzmf0.zza.zzb().currentTimeMillis(), false);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzb zzc() {
        return super.zzc();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzfl zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzfo zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zziq zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzkh zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzkp zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzlx zzp() {
        return super.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzt() {
        super.zzt();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }
}

