package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.b;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class zzfxg extends zzfxf {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    zzfxg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0) {
        super(null);
        this.zza = atomicReferenceFieldUpdater0;
        this.zzb = atomicIntegerFieldUpdater0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxf
    final int zza(zzfxj zzfxj0) {
        return this.zzb.decrementAndGet(zzfxj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxf
    final void zzb(zzfxj zzfxj0, Set set0, Set set1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.zza;
        while(!b.a(atomicReferenceFieldUpdater0, zzfxj0, null, set1) && atomicReferenceFieldUpdater0.get(zzfxj0) == null) {
        }
    }
}

