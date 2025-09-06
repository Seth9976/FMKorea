package com.google.android.gms.internal.ads;

public final class zzaje implements zzajn {
    private zzam zza;
    private zzfi zzb;
    private zzace zzc;

    public zzaje(String s) {
        zzak zzak0 = new zzak();
        zzak0.zzS(s);
        this.zza = zzak0.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfb0) {
        zzdy.zzb(this.zzb);
        long v = this.zzb.zzd();
        long v1 = this.zzb.zze();
        if(v != 0x8000000000000001L && v1 != 0x8000000000000001L) {
            zzam zzam0 = this.zza;
            if(v1 != zzam0.zzq) {
                zzak zzak0 = zzam0.zzb();
                zzak0.zzW(v1);
                zzam zzam1 = zzak0.zzY();
                this.zza = zzam1;
                this.zzc.zzk(zzam1);
            }
            int v2 = zzfb0.zza();
            this.zzc.zzq(zzfb0, v2);
            this.zzc.zzs(v, 1, v2, 0, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfi0, zzabe zzabe0, zzaka zzaka0) {
        this.zzb = zzfi0;
        zzaka0.zzc();
        zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 5);
        this.zzc = zzace0;
        zzace0.zzk(this.zza);
    }
}

