package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzajp {
    private final List zza;
    private final zzace[] zzb;

    public zzajp(List list0) {
        this.zza = list0;
        this.zzb = new zzace[list0.size()];
    }

    public final void zza(long v, zzfb zzfb0) {
        zzaao.zza(v, zzfb0, this.zzb);
    }

    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        for(int v = 0; v < this.zzb.length; ++v) {
            zzaka0.zzc();
            zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 3);
            zzam zzam0 = (zzam)this.zza.get(v);
            zzdy.zze("application/cea-608".equals(zzam0.zzm) || "application/cea-708".equals(zzam0.zzm), "Invalid closed caption MIME type provided: " + zzam0.zzm);
            String s = zzam0.zzb == null ? zzaka0.zzb() : zzam0.zzb;
            zzak zzak0 = new zzak();
            zzak0.zzH(s);
            zzak0.zzS(zzam0.zzm);
            zzak0.zzU(zzam0.zze);
            zzak0.zzK(zzam0.zzd);
            zzak0.zzu(zzam0.zzE);
            zzak0.zzI(zzam0.zzo);
            zzace0.zzk(zzak0.zzY());
            this.zzb[v] = zzace0;
        }
    }
}

