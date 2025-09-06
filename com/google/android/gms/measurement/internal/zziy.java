package com.google.android.gms.measurement.internal;

public final class zziy implements Runnable {
    private zziq zza;
    private String zzb;

    public zziy(zziq zziq0, String s) {
        this.zza = zziq0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zziq zziq0 = this.zza;
        String s = this.zzb;
        if(zziq0.zzg().zzb(s)) {
            zziq0.zzg().zzag();
        }
    }
}

