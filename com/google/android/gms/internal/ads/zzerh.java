package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import java.util.List;

public final class zzerh implements zzfxk {
    public final zzerk zza;
    public final String zzb;
    public final List zzc;
    public final Bundle zzd;
    public final boolean zze;
    public final boolean zzf;

    public zzerh(zzerk zzerk0, String s, List list0, Bundle bundle0, boolean z, boolean z1) {
        this.zza = zzerk0;
        this.zzb = s;
        this.zzc = list0;
        this.zzd = bundle0;
        this.zze = z;
        this.zzf = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxk
    public final d zza() {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

