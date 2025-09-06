package com.google.android.gms.internal.ads;

final class zzalf implements Runnable {
    private final zzalp zza;
    private final zzalv zzb;
    private final Runnable zzc;

    public zzalf(zzalp zzalp0, zzalv zzalv0, Runnable runnable0) {
        this.zza = zzalp0;
        this.zzb = zzalv0;
        this.zzc = runnable0;
    }

    @Override
    public final void run() {
        zzalv zzalv0 = this.zzb;
        if(zzalv0.zzc()) {
            this.zza.zzo(zzalv0.zza);
        }
        else {
            this.zza.zzn(zzalv0.zzc);
        }
        if(this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        }
        else {
            this.zza.zzp("done");
        }
        Runnable runnable0 = this.zzc;
        if(runnable0 != null) {
            runnable0.run();
        }
    }
}

