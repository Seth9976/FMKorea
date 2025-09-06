package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

final class zzarw implements Runnable {
    final int zza;
    final zzary zzb;

    zzarw(zzary zzary0, int v, boolean z) {
        this.zzb = zzary0;
        this.zza = v;
        super();
    }

    @Override
    public final void run() {
        zzaos zzaos0;
        zzary zzary0 = this.zzb;
        int v = this.zza;
        if(v > 0) {
            try {
                Thread.sleep(v * 1000);
            }
            catch(InterruptedException unused_ex) {
            }
        }
        try {
            PackageInfo packageInfo0 = zzary0.zza.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0);
            zzaos0 = null;
            zzaos0 = zzflk.zza(zzary0.zza, "com.fmkorea.m.fmk", Integer.toString(packageInfo0.versionCode));
        }
        catch(Throwable unused_ex) {
        }
        this.zzb.zzm = zzaos0;
        if(this.zza < 4 && (zzaos0 == null || !zzaos0.zzaj() || !zzaos0.zzak() || !zzaos0.zzf().zze() || zzaos0.zzf().zza() == -2L)) {
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}

