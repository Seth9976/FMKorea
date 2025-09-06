package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfqb extends zzfpy {
    final TaskCompletionSource zza;
    final zzfpy zzb;
    final zzfqi zzc;

    zzfqb(zzfqi zzfqi0, TaskCompletionSource taskCompletionSource0, TaskCompletionSource taskCompletionSource1, zzfpy zzfpy0) {
        this.zzc = zzfqi0;
        this.zza = taskCompletionSource1;
        this.zzb = zzfpy0;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        synchronized(zzfqi.zzg(this.zzc)) {
            zzfqi.zzn(this.zzc, this.zza);
            if(zzfqi.zzi(this.zzc).getAndIncrement() > 0) {
                zzfqi.zzf(this.zzc).zzc("Already connected to the service.", new Object[0]);
            }
            zzfqi.zzp(this.zzc, this.zzb);
        }
    }
}

