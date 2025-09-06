package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzvn extends zzcw {
    private static final Object zzc;
    private static final zzbp zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbp zzh;
    private final zzbf zzi;

    static {
        zzvn.zzc = new Object();
        zzar zzar0 = new zzar();
        zzar0.zza("SinglePeriodTimeline");
        zzar0.zzb(Uri.EMPTY);
        zzvn.zzd = zzar0.zzc();
    }

    public zzvn(long v, long v1, long v2, long v3, long v4, long v5, long v6, boolean z, boolean z1, boolean z2, Object object0, zzbp zzbp0, zzbf zzbf0) {
        this.zze = v3;
        this.zzf = v4;
        this.zzg = z;
        zzbp0.getClass();
        this.zzh = zzbp0;
        this.zzi = zzbf0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zza(Object object0) {
        return zzvn.zzc.equals(object0) ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int v, zzct zzct0, boolean z) {
        zzdy.zza(v, 0, 1);
        zzct0.zzl(null, (z ? zzvn.zzc : null), 0, this.zze, 0L, zzd.zza, false);
        return zzct0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int v, zzcv zzcv0, long v1) {
        zzdy.zza(v, 0, 1);
        zzcv0.zza(zzcv.zza, this.zzh, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzcv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int v) {
        zzdy.zza(v, 0, 1);
        return zzvn.zzc;
    }
}

