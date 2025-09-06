package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

final class zzeya implements zzfei {
    public final zzeyu zza;
    public final zzeyw zzb;
    public final zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final zzw zzf;
    public final zzfdx zzg;

    public zzeya(zzeyu zzeyu0, zzeyw zzeyw0, zzl zzl0, String s, Executor executor0, zzw zzw0, zzfdx zzfdx0) {
        this.zza = zzeyu0;
        this.zzb = zzeyw0;
        this.zzc = zzl0;
        this.zzd = s;
        this.zze = executor0;
        this.zzf = zzw0;
        this.zzg = zzfdx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfei
    public final zzfdx zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfei
    public final Executor zzb() {
        return this.zze;
    }
}

