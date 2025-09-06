package com.google.android.gms.internal.ads;

final class zzada implements zzaam {
    private final zzabo zza;
    private final int zzb;
    private final zzabj zzc;

    zzada(zzabo zzabo0, int v, zzacz zzacz0) {
        this.zza = zzabo0;
        this.zzb = v;
        this.zzc = new zzabj();
    }

    @Override  // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabc0, long v) {
        long v1 = zzabc0.zzf();
        long v2 = this.zzc(zzabc0);
        long v3 = zzabc0.zze();
        ((zzaar)zzabc0).zzl(Math.max(6, this.zza.zzc), false);
        long v4 = this.zzc(zzabc0);
        long v5 = zzabc0.zze();
        if(Long.compare(v2, v) <= 0 && v4 > v) {
            return zzaal.zze(v3);
        }
        return v4 > v ? zzaal.zzd(v2, v1) : zzaal.zzf(v4, v5);
    }

    @Override  // com.google.android.gms.internal.ads.zzaam
    public final void zzb() {
    }

    private final long zzc(zzabc zzabc0) {
        while(Long.compare(zzabc0.zze(), zzabc0.zzd() - 6L) < 0) {
            zzabo zzabo0 = this.zza;
            int v = this.zzb;
            zzabj zzabj0 = this.zzc;
            long v1 = zzabc0.zze();
            byte[] arr_b = new byte[2];
            ((zzaar)zzabc0).zzm(arr_b, 0, 2, false);
            if(((arr_b[0] & 0xFF) << 8 | arr_b[1] & 0xFF) == v) {
                zzfb zzfb0 = new zzfb(16);
                System.arraycopy(arr_b, 0, zzfb0.zzI(), 0, 2);
                zzfb0.zzF(zzabf.zza(zzabc0, zzfb0.zzI(), 2, 14));
                zzabc0.zzj();
                ((zzaar)zzabc0).zzl(((int)(v1 - zzabc0.zzf())), false);
                if(!zzabk.zzc(zzfb0, zzabo0, v, zzabj0)) {
                    goto label_17;
                }
                break;
            }
            else {
                zzabc0.zzj();
                ((zzaar)zzabc0).zzl(((int)(v1 - zzabc0.zzf())), false);
            }
        label_17:
            ((zzaar)zzabc0).zzl(1, false);
        }
        if(zzabc0.zze() >= zzabc0.zzd() - 6L) {
            ((zzaar)zzabc0).zzl(((int)(zzabc0.zzd() - zzabc0.zze())), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }
}

