package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;

public final class zzb extends zzf {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzb(zzhf zzhf0) {
        super(zzhf0);
        this.zzb = new a();
        this.zza = new a();
    }

    private final void zza(long v, zzki zzki0) {
        if(zzki0 == null) {
            this.zzj().zzp().zza("Not logging ad exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.zzj().zzp().zza("Not logging ad exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_xt", v);
        zznd.zza(zzki0, bundle0, true);
        this.zzm().zzc("am", "_xa", bundle0);
    }

    static void zza(zzb zzb0, String s, long v) {
        zzb0.zzt();
        Preconditions.checkNotEmpty(s);
        if(zzb0.zzb.isEmpty()) {
            zzb0.zzc = v;
        }
        Integer integer0 = (Integer)zzb0.zzb.get(s);
        if(integer0 != null) {
            zzb0.zzb.put(s, ((int)(((int)integer0) + 1)));
            return;
        }
        if(zzb0.zzb.size() >= 100) {
            zzb0.zzj().zzu().zza("Too many ads visible");
            return;
        }
        zzb0.zzb.put(s, 1);
        zzb0.zza.put(s, v);
    }

    private final void zza(String s, long v, zzki zzki0) {
        if(zzki0 == null) {
            this.zzj().zzp().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.zzj().zzp().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s);
        bundle0.putLong("_xt", v);
        zznd.zza(zzki0, bundle0, true);
        this.zzm().zzc("am", "_xu", bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    public final void zza(long v) {
        zzki zzki0 = this.zzn().zza(false);
        for(Object object0: this.zza.keySet()) {
            this.zza(((String)object0), v - ((long)(((Long)this.zza.get(((String)object0))))), zzki0);
        }
        if(!this.zza.isEmpty()) {
            this.zza(v - this.zzc, zzki0);
        }
        this.zzb(v);
    }

    public final void zza(String s, long v) {
        if(s != null && s.length() != 0) {
            this.zzl().zzb(new zza(this, s, v));
            return;
        }
        this.zzj().zzg().zza("Ad unit id must be a non-empty string");
    }

    private final void zzb(long v) {
        for(Object object0: this.zza.keySet()) {
            this.zza.put(((String)object0), v);
        }
        if(!this.zza.isEmpty()) {
            this.zzc = v;
        }
    }

    static void zzb(zzb zzb0, String s, long v) {
        zzb0.zzt();
        Preconditions.checkNotEmpty(s);
        Integer integer0 = (Integer)zzb0.zzb.get(s);
        if(integer0 != null) {
            zzki zzki0 = zzb0.zzn().zza(false);
            int v1 = (int)integer0;
            if(v1 - 1 == 0) {
                zzb0.zzb.remove(s);
                Long long0 = (Long)zzb0.zza.get(s);
                if(long0 == null) {
                    zzb0.zzj().zzg().zza("First ad unit exposure time was never set");
                }
                else {
                    zzb0.zza.remove(s);
                    zzb0.zza(s, v - ((long)long0), zzki0);
                }
                if(zzb0.zzb.isEmpty()) {
                    long v2 = zzb0.zzc;
                    if(v2 == 0L) {
                        zzb0.zzj().zzg().zza("First ad exposure time was never set");
                        return;
                    }
                    zzb0.zza(v - v2, zzki0);
                    zzb0.zzc = 0L;
                }
                return;
            }
            zzb0.zzb.put(s, ((int)(v1 - 1)));
            return;
        }
        zzb0.zzj().zzg().zza("Call to endAdUnitExposure for unknown ad unit id", s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    public final void zzb(String s, long v) {
        if(s != null && s.length() != 0) {
            this.zzl().zzb(new zzd(this, s, v));
            return;
        }
        this.zzj().zzg().zza("Ad unit id must be a non-empty string");
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
}

