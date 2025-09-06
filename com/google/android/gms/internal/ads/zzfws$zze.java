package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class zzfws.zze extends zzfws.zza {
    final AtomicReferenceFieldUpdater zza;
    final AtomicReferenceFieldUpdater zzb;
    final AtomicReferenceFieldUpdater zzc;
    final AtomicReferenceFieldUpdater zzd;
    final AtomicReferenceFieldUpdater zze;

    zzfws.zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
        super(null);
        this.zza = atomicReferenceFieldUpdater0;
        this.zzb = atomicReferenceFieldUpdater1;
        this.zzc = atomicReferenceFieldUpdater2;
        this.zzd = atomicReferenceFieldUpdater3;
        this.zze = atomicReferenceFieldUpdater4;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final zzfws.zzd zza(zzfws zzfws0, zzfws.zzd zzfws$zzd0) {
        return (zzfws.zzd)this.zzd.getAndSet(zzfws0, zzfws$zzd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final zzfws.zzk zzb(zzfws zzfws0, zzfws.zzk zzfws$zzk0) {
        return (zzfws.zzk)this.zzc.getAndSet(zzfws0, zzfws$zzk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final void zzc(zzfws.zzk zzfws$zzk0, zzfws.zzk zzfws$zzk1) {
        this.zzb.lazySet(zzfws$zzk0, zzfws$zzk1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final void zzd(zzfws.zzk zzfws$zzk0, Thread thread0) {
        this.zza.lazySet(zzfws$zzk0, thread0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zze(zzfws zzfws0, zzfws.zzd zzfws$zzd0, zzfws.zzd zzfws$zzd1) {
        return zzfwt.zza(this.zzd, zzfws0, zzfws$zzd0, zzfws$zzd1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zzf(zzfws zzfws0, Object object0, Object object1) {
        return zzfwt.zza(this.zze, zzfws0, object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zzg(zzfws zzfws0, zzfws.zzk zzfws$zzk0, zzfws.zzk zzfws$zzk1) {
        return zzfwt.zza(this.zzc, zzfws0, zzfws$zzk0, zzfws$zzk1);
    }
}

