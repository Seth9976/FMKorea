package com.google.android.gms.internal.ads;

final class zzakh implements zzakg {
    private final zzabe zza;
    private final zzace zzb;
    private final zzakj zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzakh(zzabe zzabe0, zzace zzace0, zzakj zzakj0, String s, int v) {
        this.zza = zzabe0;
        this.zzb = zzace0;
        this.zzc = zzakj0;
        int v1 = zzakj0.zzd;
        int v2 = zzakj0.zzb * zzakj0.zze / 8;
        if(v1 != v2) {
            throw zzcd.zza(("Expected block size: " + v2 + "; got: " + v1), null);
        }
        int v3 = zzakj0.zzc * v2;
        int v4 = Math.max(v2, v3 / 10);
        this.zze = v4;
        zzak zzak0 = new zzak();
        zzak0.zzS(s);
        zzak0.zzv(v3 * 8);
        zzak0.zzO(v3 * 8);
        zzak0.zzL(v4);
        zzak0.zzw(zzakj0.zzb);
        zzak0.zzT(zzakj0.zzc);
        zzak0.zzN(v);
        this.zzd = zzak0.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.zzakg
    public final void zza(int v, long v1) {
        zzakm zzakm0 = new zzakm(this.zzc, 1, ((long)v), v1);
        this.zza.zzN(zzakm0);
        this.zzb.zzk(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzakg
    public final void zzb(long v) {
        this.zzf = v;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzakg
    public final boolean zzc(zzabc zzabc0, long v) {
        int v1;
        while((v1 = Long.compare(v, 0L)) > 0) {
            int v2 = this.zzg;
            int v3 = this.zze;
            if(v2 >= v3) {
                break;
            }
            int v4 = zzacc.zza(this.zzb, zzabc0, ((int)Math.min(v3 - v2, v)), true);
            if(v4 == -1) {
                v = 0L;
            }
            else {
                this.zzg += v4;
                v -= (long)v4;
            }
        }
        zzakj zzakj0 = this.zzc;
        int v5 = zzakj0.zzd;
        int v6 = this.zzg / v5;
        if(v6 > 0) {
            long v7 = this.zzf;
            long v8 = zzfk.zzq(this.zzh, 1000000L, zzakj0.zzc);
            int v9 = v6 * v5;
            int v10 = this.zzg - v9;
            this.zzb.zzs(v7 + v8, 1, v9, v10, null);
            this.zzh += (long)v6;
            this.zzg = v10;
        }
        return v1 <= 0;
    }
}

