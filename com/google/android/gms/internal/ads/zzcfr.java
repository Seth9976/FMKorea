package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.zza;

public final class zzcfr implements zzfxk {
    public final Context zza;
    public final zzaqx zzb;
    public final zzcag zzc;
    public final zza zzd;
    public final zzecs zze;
    public final String zzf;

    public zzcfr(Context context0, zzaqx zzaqx0, zzcag zzcag0, zza zza0, zzecs zzecs0, String s) {
        this.zza = context0;
        this.zzb = zzaqx0;
        this.zzc = zzcag0;
        this.zzd = zza0;
        this.zze = zzecs0;
        this.zzf = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxk
    public final d zza() {
        zzcgx zzcgx0 = zzcgx.zza();
        zzaxe zzaxe0 = zzaxe.zza();
        zzcfi zzcfi0 = zzcfu.zza(this.zza, zzcgx0, "", false, false, this.zzb, null, this.zzc, null, null, this.zzd, zzaxe0, null, null, this.zze);
        d d0 = zzcar.zza(zzcfi0);
        zzcfi0.zzN().zzA(new zzcfs(((zzcar)d0)));
        zzcfi0.loadUrl(this.zzf);
        return d0;
    }
}

