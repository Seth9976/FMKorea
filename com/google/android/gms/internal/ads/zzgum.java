package com.google.android.gms.internal.ads;

final class zzgum extends zzguk {
    @Override  // com.google.android.gms.internal.ads.zzguk
    final int zza(Object object0) {
        return ((zzgul)object0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final int zzb(Object object0) {
        return ((zzgul)object0).zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final Object zzc(Object object0) {
        zzgul zzgul0 = ((zzgrq)object0).zzc;
        if(zzgul0 == zzgul.zzc()) {
            zzgul0 = zzgul.zzf();
            ((zzgrq)object0).zzc = zzgul0;
        }
        return zzgul0;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final Object zzd(Object object0) {
        return ((zzgrq)object0).zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final Object zze(Object object0, Object object1) {
        if(!zzgul.zzc().equals(object1)) {
            if(zzgul.zzc().equals(object0)) {
                return zzgul.zze(((zzgul)object0), ((zzgul)object1));
            }
            ((zzgul)object0).zzd(((zzgul)object1));
        }
        return object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final Object zzf() {
        return zzgul.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final Object zzg(Object object0) {
        ((zzgul)object0).zzh();
        return object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzh(Object object0, int v, int v1) {
        ((zzgul)object0).zzj(v << 3 | 5, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzi(Object object0, int v, long v1) {
        ((zzgul)object0).zzj(v << 3 | 1, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzj(Object object0, int v, Object object1) {
        ((zzgul)object0).zzj(v << 3 | 3, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzk(Object object0, int v, zzgqi zzgqi0) {
        ((zzgul)object0).zzj(v << 3 | 2, zzgqi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzl(Object object0, int v, long v1) {
        ((zzgul)object0).zzj(v << 3, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzm(Object object0) {
        ((zzgrq)object0).zzc.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzn(Object object0, Object object1) {
        ((zzgrq)object0).zzc = (zzgul)object1;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzo(Object object0, Object object1) {
        ((zzgrq)object0).zzc = (zzgul)object1;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final boolean zzq(zzgtl zzgtl0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzguk
    final void zzr(Object object0, zzgqy zzgqy0) {
        ((zzgul)object0).zzk(zzgqy0);
    }
}

