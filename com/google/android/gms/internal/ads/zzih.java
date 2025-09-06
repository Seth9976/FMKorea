package com.google.android.gms.internal.ads;

public final class zzih implements zzko {
    private final zzxu zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zzih() {
        zzxu zzxu0 = new zzxu(true, 0x10000);
        super();
        zzih.zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzih.zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzih.zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzih.zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzih.zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzih.zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzxu0;
        this.zzc = 50000000L;
        this.zzd = 50000000L;
        this.zze = 2500000L;
        this.zzf = 5000000L;
        this.zzh = 0xC80000;
        this.zzg = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final long zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zzb() {
        this.zzk(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zzc() {
        this.zzk(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zzd() {
        this.zzk(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final void zze(zzcw zzcw0, zzbw zzbw0, zzln[] arr_zzln, zzvs zzvs0, zzxf[] arr_zzxf) {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            int v2 = 0xC80000;
            if(v >= 2) {
                break;
            }
            if(arr_zzxf[v] != null) {
                if(arr_zzln[v].zzb() != 1) {
                    v2 = 0x7D00000;
                }
                v1 += v2;
            }
        }
        int v3 = Math.max(0xC80000, v1);
        this.zzh = v3;
        this.zzb.zzf(v3);
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(long v, long v1, float f) {
        int v2 = this.zzb.zza();
        int v3 = this.zzh;
        boolean z = false;
        if(Long.compare(v1, Math.max((Float.compare(f, 1.0f) <= 0 ? this.zzc : Math.min(zzfk.zzn(this.zzc, f), this.zzd)), 500000L)) < 0) {
            if(v2 < v3) {
                z = true;
            }
            this.zzi = z;
            if(!z && v1 < 500000L) {
                zzes.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                return this.zzi;
            }
        }
        else if(v1 >= this.zzd || v2 >= v3) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(zzcw zzcw0, zzbw zzbw0, long v, float f, boolean z, long v1) {
        long v2 = zzfk.zzo(v, f);
        long v3 = z ? this.zzf : this.zze;
        if(v1 != 0x8000000000000001L) {
            v3 = Math.min(v1 / 2L, v3);
        }
        return v3 <= 0L || v2 >= v3 || this.zzb.zza() >= this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzko
    public final zzxu zzi() {
        return this.zzb;
    }

    private static void zzj(int v, int v1, String s, String s1) {
        zzdy.zze(v >= v1, s + " cannot be less than " + s1);
    }

    private final void zzk(boolean z) {
        this.zzh = 0xC80000;
        this.zzi = false;
        if(z) {
            this.zzb.zze();
        }
    }
}

