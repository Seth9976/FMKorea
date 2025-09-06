package com.google.android.gms.internal.ads;

final class zzaju implements zzajn {
    final zzajw zza;
    private final zzfa zzb;

    public zzaju(zzajw zzajw0) {
        this.zza = zzajw0;
        super();
        this.zzb = new zzfa(new byte[4], 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfb0) {
        if(zzfb0.zzl() != 0) {
            return;
        }
        if((zzfb0.zzl() & 0x80) == 0) {
            return;
        }
        zzfb0.zzH(6);
        int v = zzfb0.zza();
        for(int v1 = 0; v1 < v / 4; ++v1) {
            zzfb0.zzB(this.zzb, 4);
            int v2 = this.zzb.zzd(16);
            this.zzb.zzl(3);
            if(v2 == 0) {
                this.zzb.zzl(13);
            }
            else {
                int v3 = this.zzb.zzd(13);
                if(zzajw.zzf(this.zza).get(v3) == null) {
                    zzajw.zzf(this.zza).put(v3, new zzajo(new zzajv(this.zza, v3)));
                    zzajw.zzm(this.zza, zzajw.zze(this.zza) + 1);
                }
            }
        }
        zzajw.zzf(this.zza).remove(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfi0, zzabe zzabe0, zzaka zzaka0) {
    }
}

