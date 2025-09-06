package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

public final class zzerg implements Runnable {
    public final zzerk zza;
    public final zzbqc zzb;
    public final Bundle zzc;
    public final List zzd;
    public final zzejw zze;
    public final zzcas zzf;

    public zzerg(zzerk zzerk0, zzbqc zzbqc0, Bundle bundle0, List list0, zzejw zzejw0, zzcas zzcas0) {
        this.zza = zzerk0;
        this.zzb = zzbqc0;
        this.zzc = bundle0;
        this.zzd = list0;
        this.zze = zzejw0;
        this.zzf = zzcas0;
    }

    @Override
    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

