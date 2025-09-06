package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

public final class zzcfq implements zzfry {
    public final Context zza;
    public final zzcgx zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final zzaqx zzf;
    public final zzbct zzg;
    public final zzcag zzh;
    public final zzl zzi;
    public final zza zzj;
    public final zzaxe zzk;
    public final zzfbe zzl;
    public final zzfbi zzm;
    public final zzecs zzn;

    public zzcfq(Context context0, zzcgx zzcgx0, String s, boolean z, boolean z1, zzaqx zzaqx0, zzbct zzbct0, zzcag zzcag0, zzbcj zzbcj0, zzl zzl0, zza zza0, zzaxe zzaxe0, zzfbe zzfbe0, zzfbi zzfbi0, zzecs zzecs0) {
        this.zza = context0;
        this.zzb = zzcgx0;
        this.zzc = s;
        this.zzd = z;
        this.zze = z1;
        this.zzf = zzaqx0;
        this.zzg = zzbct0;
        this.zzh = zzcag0;
        this.zzi = zzl0;
        this.zzj = zza0;
        this.zzk = zzaxe0;
        this.zzl = zzfbe0;
        this.zzm = zzfbi0;
        this.zzn = zzecs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfry
    public final Object zza() {
        try {
            TrafficStats.setThreadStatsTag(0x108);
            zzcfx zzcfx0 = new zzcfx(new zzcgb(new zzcgw(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm));
            zzcfx0.setWebViewClient(zzt.zzq().zzd(zzcfx0, this.zzk, this.zze, this.zzn));
            zzcfx0.setWebChromeClient(new zzcfh(zzcfx0));
            return zzcfx0;
        }
        finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}

