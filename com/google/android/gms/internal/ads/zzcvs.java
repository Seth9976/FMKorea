package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class zzcvs {
    private final Context zza;
    private final zzfca zzb;
    private final Bundle zzc;
    private final zzfbs zzd;
    private final zzcvk zze;
    private final zzeds zzf;

    zzcvs(zzcvq zzcvq0, zzcvr zzcvr0) {
        this.zza = zzcvq0.zza;
        this.zzb = zzcvq.zzm(zzcvq0);
        this.zzc = zzcvq0.zzc;
        this.zzd = zzcvq0.zzd;
        this.zze = zzcvq0.zze;
        this.zzf = zzcvq0.zzf;
    }

    final Context zza(Context context0) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzcvk zzc() {
        return this.zze;
    }

    final zzcvq zzd() {
        zzcvq zzcvq0 = new zzcvq();
        zzcvq0.zze(this.zza);
        zzcvq0.zzi(this.zzb);
        zzcvq0.zzf(this.zzc);
        zzcvq0.zzg(this.zze);
        zzcvq0.zzd(this.zzf);
        return zzcvq0;
    }

    final zzeds zze(String s) {
        return this.zzf == null ? new zzeds(s) : this.zzf;
    }

    final zzfbs zzf() {
        return this.zzd;
    }

    final zzfca zzg() {
        return this.zzb;
    }
}

