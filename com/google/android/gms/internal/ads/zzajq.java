package com.google.android.gms.internal.ads;

final class zzajq implements zzaam {
    private final zzfi zza;
    private final zzfb zzb;
    private final int zzc;

    public zzajq(int v, zzfi zzfi0, int v1) {
        this.zzc = v;
        this.zza = zzfi0;
        this.zzb = new zzfb();
    }

    @Override  // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabc0, long v) {
        long v1 = zzabc0.zzf();
        int v2 = (int)Math.min(112800L, zzabc0.zzd() - v1);
        this.zzb.zzD(v2);
        ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, v2, false);
        zzfb zzfb0 = this.zzb;
        int v3 = zzfb0.zzd();
        long v4 = -1L;
        long v5 = 0x8000000000000001L;
        long v6 = -1L;
        while(zzfb0.zza() >= 0xBC) {
            int v7 = zzakc.zza(zzfb0.zzI(), zzfb0.zzc(), v3);
            if(v7 + 0xBC > v3) {
                break;
            }
            long v8 = zzakc.zzb(zzfb0, v7, this.zzc);
            if(v8 != 0x8000000000000001L) {
                long v9 = this.zza.zzb(v8);
                if(v9 > v) {
                    return v5 == 0x8000000000000001L ? zzaal.zzd(v9, v1) : zzaal.zze(v1 + v6);
                }
                if(v9 + 100000L > v) {
                    return zzaal.zze(v1 + ((long)v7));
                }
                v6 = (long)v7;
                v5 = v9;
            }
            zzfb0.zzG(v7 + 0xBC);
            v4 = (long)(v7 + 0xBC);
        }
        return v5 == 0x8000000000000001L ? zzaal.zza : zzaal.zzf(v5, v1 + v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzaam
    public final void zzb() {
        this.zzb.zzE(zzfk.zzf, 0);
    }
}

