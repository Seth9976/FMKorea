package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zznc;
import java.util.List;
import java.util.Map;

final class zza extends com.google.android.gms.measurement.AppMeasurement.zza {
    private final zzhf zza;
    private final zziq zzb;

    public zza(zzhf zzhf0) {
        super(null);
        Preconditions.checkNotNull(zzhf0);
        this.zza = zzhf0;
        this.zzb = zzhf0.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final int zza(String s) {
        Preconditions.checkNotEmpty(s);
        return 25;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final long zza() {
        return this.zza.zzt().zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final Object zza(int v) {
        switch(v) {
            case 0: {
                return this.zzj();
            }
            case 1: {
                return this.zze();
            }
            case 2: {
                return this.zzc();
            }
            case 3: {
                return this.zzd();
            }
            case 4: {
                return this.zzb();
            }
            default: {
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final List zza(String s, String s1) {
        return this.zzb.zza(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final Map zza(String s, String s1, boolean z) {
        return this.zzb.zza(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Map zza(boolean z) {
        List list0 = this.zzb.zza(z);
        Map map0 = new a(list0.size());
        for(Object object0: list0) {
            zznc zznc0 = (zznc)object0;
            Object object1 = zznc0.zza();
            if(object1 != null) {
                map0.put(zznc0.zza, object1);
            }
        }
        return map0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(Bundle bundle0) {
        this.zzb.zzb(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(zzil zzil0) {
        this.zzb.zza(zzil0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(zzim zzim0) {
        this.zzb.zza(zzim0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(String s, String s1, Bundle bundle0) {
        this.zza.zzp().zza(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.zzb.zza(s, s1, bundle0, true, false, v);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Boolean zzb() {
        return this.zzb.zzaa();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzb(zzil zzil0) {
        this.zzb.zzb(zzil0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzb(String s) {
        this.zza.zze().zza(s, this.zza.zzb().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zzb.zzb(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Double zzc() {
        return this.zzb.zzab();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzc(String s) {
        this.zza.zze().zzb(s, this.zza.zzb().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Integer zzd() {
        return this.zzb.zzac();
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Long zze() {
        return this.zzb.zzad();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzf() {
        return this.zzb.zzae();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzg() {
        return this.zzb.zzaf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzh() {
        return this.zzb.zzag();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzi() {
        return this.zzb.zzae();
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final String zzj() {
        return this.zzb.zzai();
    }
}

