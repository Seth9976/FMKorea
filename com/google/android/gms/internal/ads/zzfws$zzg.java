package com.google.android.gms.internal.ads;

final class zzfws.zzg extends zzfws.zza {
    private zzfws.zzg() {
        super(null);
    }

    zzfws.zzg(zzfwu zzfwu0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final zzfws.zzd zza(zzfws zzfws0, zzfws.zzd zzfws$zzd0) {
        synchronized(zzfws0) {
            zzfws.zzd zzfws$zzd1 = zzfws0.listeners;
            if(zzfws$zzd1 != zzfws$zzd0) {
                zzfws0.listeners = zzfws$zzd0;
            }
            return zzfws$zzd1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final zzfws.zzk zzb(zzfws zzfws0, zzfws.zzk zzfws$zzk0) {
        synchronized(zzfws0) {
            zzfws.zzk zzfws$zzk1 = zzfws0.waiters;
            if(zzfws$zzk1 != zzfws$zzk0) {
                zzfws0.waiters = zzfws$zzk0;
            }
            return zzfws$zzk1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final void zzc(zzfws.zzk zzfws$zzk0, zzfws.zzk zzfws$zzk1) {
        zzfws$zzk0.next = zzfws$zzk1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final void zzd(zzfws.zzk zzfws$zzk0, Thread thread0) {
        zzfws$zzk0.thread = thread0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zze(zzfws zzfws0, zzfws.zzd zzfws$zzd0, zzfws.zzd zzfws$zzd1) {
        synchronized(zzfws0) {
            if(zzfws0.listeners == zzfws$zzd0) {
                zzfws0.listeners = zzfws$zzd1;
                return true;
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zzf(zzfws zzfws0, Object object0, Object object1) {
        synchronized(zzfws0) {
            if(zzfws0.value == object0) {
                zzfws0.value = object1;
                return true;
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zzg(zzfws zzfws0, zzfws.zzk zzfws$zzk0, zzfws.zzk zzfws$zzk1) {
        synchronized(zzfws0) {
            if(zzfws0.waiters == zzfws$zzk0) {
                zzfws0.waiters = zzfws$zzk1;
                return true;
            }
            return false;
        }
    }
}

