package com.google.android.gms.internal.measurement;

final class zzmc extends zzma {
    private static void zza(Object object0, zzlz zzlz0) {
        ((zzix)object0).zzb = zzlz0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final int zza(Object object0) {
        return ((zzlz)object0).zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final Object zza() {
        return zzlz.zzd();
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final Object zza(Object object0, Object object1) {
        if(zzlz.zzc().equals(((zzlz)object1))) {
            return (zzlz)object0;
        }
        return zzlz.zzc().equals(((zzlz)object0)) ? zzlz.zza(((zzlz)object0), ((zzlz)object1)) : ((zzlz)object0).zza(((zzlz)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zza(Object object0, int v, int v1) {
        ((zzlz)object0).zza(v << 3 | 5, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zza(Object object0, int v, long v1) {
        ((zzlz)object0).zza(v << 3 | 1, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zza(Object object0, int v, zzhm zzhm0) {
        ((zzlz)object0).zza(v << 3 | 2, zzhm0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zza(Object object0, int v, Object object1) {
        ((zzlz)object0).zza(v << 3 | 3, ((zzlz)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zza(Object object0, zzmw zzmw0) {
        ((zzlz)object0).zza(zzmw0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final boolean zza(zzlc zzlc0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final int zzb(Object object0) {
        return ((zzlz)object0).zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zzb(Object object0, int v, long v1) {
        ((zzlz)object0).zza(v << 3, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zzb(Object object0, zzmw zzmw0) {
        ((zzlz)object0).zzb(zzmw0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zzb(Object object0, Object object1) {
        zzmc.zza(object0, ((zzlz)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final Object zzc(Object object0) {
        zzlz zzlz0 = ((zzix)object0).zzb;
        if(zzlz0 == zzlz.zzc()) {
            zzlz0 = zzlz.zzd();
            zzmc.zza(object0, zzlz0);
        }
        return zzlz0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zzc(Object object0, Object object1) {
        zzmc.zza(object0, ((zzlz)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final Object zzd(Object object0) {
        return ((zzix)object0).zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final Object zze(Object object0) {
        ((zzlz)object0).zze();
        return (zzlz)object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzma
    final void zzf(Object object0) {
        ((zzix)object0).zzb.zze();
    }
}

