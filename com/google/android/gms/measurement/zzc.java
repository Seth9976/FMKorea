package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.List;
import java.util.Map;

final class zzc extends zza {
    private final zzjz zza;

    public zzc(zzjz zzjz0) {
        super(null);
        Preconditions.checkNotNull(zzjz0);
        this.zza = zzjz0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final int zza(String s) {
        return this.zza.zza(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final long zza() {
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final Object zza(int v) {
        return this.zza.zza(v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final List zza(String s, String s1) {
        return this.zza.zza(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final Map zza(String s, String s1, boolean z) {
        return this.zza.zza(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Map zza(boolean z) {
        return this.zza.zza(null, null, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(Bundle bundle0) {
        this.zza.zza(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(zzil zzil0) {
        this.zza.zza(zzil0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(zzim zzim0) {
        this.zza.zza(zzim0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(String s, String s1, Bundle bundle0) {
        this.zza.zza(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.zza.zza(s, s1, bundle0, v);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Boolean zzb() {
        return (Boolean)this.zza.zza(4);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzb(zzil zzil0) {
        this.zza.zzb(zzil0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzb(String s) {
        this.zza.zzb(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zza.zzb(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Double zzc() {
        return (Double)this.zza.zza(2);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final void zzc(String s) {
        this.zza.zzc(s);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Integer zzd() {
        return (Integer)this.zza.zza(3);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Long zze() {
        return (Long)this.zza.zza(1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzf() {
        return this.zza.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzg() {
        return this.zza.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjz
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final String zzj() {
        return (String)this.zza.zza(0);
    }
}

