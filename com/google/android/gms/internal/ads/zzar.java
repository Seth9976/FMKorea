package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class zzar {
    private String zza;
    private Uri zzb;
    private final zzat zzc;
    private final zzba zzd;
    private final List zze;
    private final zzfud zzf;
    private final zzbd zzg;
    private final zzbl zzh;

    public zzar() {
        this.zzc = new zzat();
        this.zzd = new zzba(null);
        this.zze = Collections.emptyList();
        this.zzf = zzfud.zzl();
        this.zzg = new zzbd();
        this.zzh = zzbl.zza;
    }

    public final zzar zza(String s) {
        this.zza = s;
        return this;
    }

    public final zzar zzb(Uri uri0) {
        this.zzb = uri0;
        return this;
    }

    public final zzbp zzc() {
        zzbi zzbi0 = this.zzb == null ? null : new zzbi(this.zzb, null, null, null, this.zze, null, this.zzf, null, null);
        return new zzbp((this.zza == null ? "" : this.zza), new zzax(this.zzc, null), zzbi0, new zzbf(this.zzg, null), zzbv.zza, this.zzh, null);
    }
}

