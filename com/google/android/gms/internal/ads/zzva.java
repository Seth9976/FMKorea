package com.google.android.gms.internal.ads;

import android.os.Looper;

public final class zzva extends zzst implements zzur {
    private final zzgh zza;
    private final zzqz zzb;
    private final int zzc;
    private boolean zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private zzhk zzh;
    private zzbp zzi;
    private final zzux zzj;
    private final zzxy zzk;

    zzva(zzbp zzbp0, zzgh zzgh0, zzux zzux0, zzqz zzqz0, zzxy zzxy0, int v, zzuz zzuz0) {
        this.zzi = zzbp0;
        this.zza = zzgh0;
        this.zzj = zzux0;
        this.zzb = zzqz0;
        this.zzk = zzxy0;
        this.zzc = v;
        this.zzd = true;
        this.zze = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztq0) {
        ((zzuv)zztq0).zzM();
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zztq zzI(zzts zzts0, zzxu zzxu0, long v) {
        zzgi zzgi0 = this.zza.zza();
        zzhk zzhk0 = this.zzh;
        if(zzhk0 != null) {
            zzgi0.zzf(zzhk0);
        }
        zzbp zzbp0 = this.zzJ();
        zzbp0.zzd.getClass();
        this.zzb();
        zzsv zzsv0 = new zzsv(this.zzj.zza);
        zzqt zzqt0 = this.zzc(zzts0);
        zzub zzub0 = this.zze(zzts0);
        return new zzuv(zzbp0.zzd.zzb, zzgi0, zzsv0, this.zzb, zzqt0, this.zzk, zzub0, this, zzxu0, null, this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zzbp zzJ() {
        synchronized(this) {
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zza(long v, boolean z, boolean z1) {
        if(v == 0x8000000000000001L) {
            v = this.zze;
        }
        if(!this.zzd && this.zze == v && this.zzf == z && this.zzg == z1) {
            return;
        }
        this.zze = v;
        this.zzf = z;
        this.zzg = z1;
        this.zzd = false;
        this.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    protected final void zzn(zzhk zzhk0) {
        this.zzh = zzhk0;
        Looper.myLooper().getClass();
        this.zzb();
        this.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    protected final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zzt(zzbp zzbp0) {
        synchronized(this) {
            this.zzi = zzbp0;
        }
    }

    private final void zzw() {
        long v = this.zze;
        boolean z = this.zzf;
        boolean z1 = this.zzg;
        zzbp zzbp0 = this.zzJ();
        zzvn zzvn0 = new zzvn(0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, v, v, 0L, 0L, z, false, false, null, zzbp0, (z1 ? zzbp0.zzf : null));
        zzuw zzuw0 = this.zzd ? new zzuw(this, zzvn0) : zzvn0;
        this.zzo(zzuw0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzz() {
    }
}

