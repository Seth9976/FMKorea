package com.google.android.gms.measurement.internal;

public final class zzr implements Runnable {
    private zzhf zza;

    public zzr(zzhf zzhf0) {
        this.zza = zzhf0;
    }

    @Override
    public final void run() {
        zzhf zzhf0 = this.zza;
        if(!zzhf0.zzt().zzw()) {
            zzhf0.zzj().zzu().zza("registerTrigger called but app not eligible");
            return;
        }
        zziq zziq0 = zzhf0.zzp();
        zziq0.getClass();
        new Thread(new zzs(zziq0)).start();
    }
}

