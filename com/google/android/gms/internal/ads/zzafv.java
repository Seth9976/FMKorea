package com.google.android.gms.internal.ads;

final class zzafv {
    private final zzfb zza;
    private int zzb;

    public zzafv() {
        this.zza = new zzfb(8);
    }

    public final boolean zza(zzabc zzabc0) {
        long v = zzabc0.zzd();
        int v1 = Long.compare(v, -1L);
        ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 4, false);
        long v2 = this.zza.zzt();
        this.zzb = 4;
        while(Long.compare(v2, 0x1A45DFA3L) != 0) {
            int v3 = this.zzb + 1;
            this.zzb = v3;
            if(v3 == ((int)(v1 == 0 || v > 0x400L ? 0x400L : v))) {
                return false;
            }
            ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 1, false);
            v2 = v2 << 8 & 0xFFFFFFFFFFFFFF00L | ((long)(this.zza.zzI()[0] & 0xFF));
        }
        long v4 = this.zzb(zzabc0);
        long v5 = (long)this.zzb;
        if(v4 != 0x8000000000000000L && (v1 == 0 || v5 + v4 < v)) {
            int v6;
            while((v6 = Long.compare(this.zzb, v5 + v4)) < 0) {
                if(this.zzb(zzabc0) == 0x8000000000000000L) {
                    return false;
                }
                long v7 = this.zzb(zzabc0);
                int v8 = Long.compare(v7, 0L);
                if(v8 >= 0) {
                    if(v8 == 0) {
                        continue;
                    }
                    ((zzaar)zzabc0).zzl(((int)v7), false);
                    this.zzb += (int)v7;
                    continue;
                }
                return false;
            }
            return v6 == 0;
        }
        return false;
    }

    private final long zzb(zzabc zzabc0) {
        int v = 0;
        ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 1, false);
        int v1 = this.zza.zzI()[0] & 0xFF;
        if(v1 != 0) {
            int v2 = 0x80;
            int v3;
            for(v3 = 0; (v1 & v2) == 0; ++v3) {
                v2 >>= 1;
            }
            int v4 = v1 & ~v2;
            ((zzaar)zzabc0).zzm(this.zza.zzI(), 1, v3, false);
            while(v < v3) {
                ++v;
                v4 = (this.zza.zzI()[v] & 0xFF) + (v4 << 8);
            }
            this.zzb += v3 + 1;
            return (long)v4;
        }
        return 0x8000000000000000L;
    }
}

