package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class zzcds implements Runnable {
    final String zza;
    final String zzb;
    final long zzc;
    final zzcdu zzd;

    zzcds(zzcdu zzcdu0, String s, String s1, long v) {
        this.zzd = zzcdu0;
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        super();
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheComplete");
        hashMap0.put("src", this.zza);
        hashMap0.put("cachedSrc", this.zzb);
        hashMap0.put("totalDuration", Long.toString(this.zzc));
        zzcdu.zze(this.zzd, "onPrecacheEvent", hashMap0);
    }
}

