package com.google.android.gms.internal.ads;

final class zzaqr implements Runnable {
    final zzaqs zza;

    zzaqr(zzaqs zzaqs0) {
        this.zza = zzaqs0;
        super();
    }

    @Override
    public final void run() {
        boolean z1;
        boolean z;
        if(this.zza.zzb != null) {
            return;
        }
        synchronized(zzaqs.zza()) {
            if(this.zza.zzb != null) {
                return;
            }
            try {
                z = false;
                z1 = false;
                z1 = ((Boolean)zzbbr.zzcm.zze()).booleanValue();
            }
            catch(IllegalStateException unused_ex) {
            }
            if(z1) {
                try {
                    zzaqs.zza = zzfne.zzb(zzaqs.zzb(this.zza).zza, "ADSHIELD", null);
                label_15:
                    z = z1;
                }
                catch(Throwable unused_ex) {
                }
            }
            else {
                goto label_15;
            }
            this.zza.zzb = Boolean.valueOf(z);
            zzaqs.zza().open();
        }
    }
}

