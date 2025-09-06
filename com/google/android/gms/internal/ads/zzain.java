package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzain implements zzaio {
    private final List zza;
    private final zzace[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf;

    public zzain(List list0) {
        this.zza = list0;
        this.zzb = new zzace[list0.size()];
        this.zzf = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        if(!this.zzc || this.zzd == 2 && !this.zzf(zzfb0, 0x20)) {
            return;
        }
        if(this.zzd == 1 && !this.zzf(zzfb0, 0)) {
            return;
        }
        int v1 = zzfb0.zzc();
        int v2 = zzfb0.zza();
        zzace[] arr_zzace = this.zzb;
        for(int v = 0; v < arr_zzace.length; ++v) {
            zzace zzace0 = arr_zzace[v];
            zzfb0.zzG(v1);
            zzace0.zzq(zzfb0, v2);
        }
        this.zze += v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        for(int v = 0; v < this.zzb.length; ++v) {
            zzajx zzajx0 = (zzajx)this.zza.get(v);
            zzaka0.zzc();
            zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 3);
            zzak zzak0 = new zzak();
            zzak0.zzH(zzaka0.zzb());
            zzak0.zzS("application/dvbsubs");
            zzak0.zzI(Collections.singletonList(zzajx0.zzb));
            zzak0.zzK(zzajx0.zza);
            zzace0.zzk(zzak0.zzY());
            this.zzb[v] = zzace0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        if(this.zzc) {
            if(Long.compare(this.zzf, 0x8000000000000001L) != 0) {
                zzace[] arr_zzace = this.zzb;
                for(int v = 0; v < arr_zzace.length; ++v) {
                    arr_zzace[v].zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if(v != 0x8000000000000001L) {
            this.zzf = v;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzc = false;
        this.zzf = 0x8000000000000001L;
    }

    private final boolean zzf(zzfb zzfb0, int v) {
        if(zzfb0.zza() == 0) {
            return false;
        }
        if(zzfb0.zzl() != v) {
            this.zzc = false;
        }
        --this.zzd;
        return this.zzc;
    }
}

