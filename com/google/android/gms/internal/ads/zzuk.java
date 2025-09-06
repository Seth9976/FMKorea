package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzuk extends zztb {
    private static final zzbp zza;
    private final zztu[] zzb;
    private final zzcw[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfuz zzf;
    private int zzg;
    private long[][] zzh;
    private zzuj zzi;
    private final zztd zzj;

    static {
        zzar zzar0 = new zzar();
        zzar0.zza("MergingMediaSource");
        zzuk.zza = zzar0.zzc();
    }

    public zzuk(boolean z, boolean z1, zztu[] arr_zztu) {
        zztd zztd0 = new zztd();
        super();
        this.zzb = arr_zztu;
        this.zzj = zztd0;
        this.zzd = new ArrayList(Arrays.asList(arr_zztu));
        this.zzg = -1;
        this.zzc = new zzcw[arr_zztu.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfvh.zzb(8).zzb(2).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    protected final void zzA(Object object0, zztu zztu0, zzcw zzcw0) {
        int v;
        if(this.zzi == null) {
            if(this.zzg == -1) {
                v = zzcw0.zzb();
                this.zzg = v;
            }
            else {
                int v1 = zzcw0.zzb();
                int v2 = this.zzg;
                if(v1 != v2) {
                    this.zzi = new zzuj(0);
                    return;
                }
                v = v2;
            }
            if(this.zzh.length == 0) {
                this.zzh = new long[v][this.zzc.length];
            }
            this.zzd.remove(zztu0);
            this.zzc[((int)(((Integer)object0)))] = zzcw0;
            if(this.zzd.isEmpty()) {
                this.zzo(this.zzc[0]);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztq0) {
        for(int v = 0; true; ++v) {
            zztu[] arr_zztu = this.zzb;
            if(v >= arr_zztu.length) {
                break;
            }
            arr_zztu[v].zzG(((zzui)zztq0).zzn(v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zztq zzI(zzts zzts0, zzxu zzxu0, long v) {
        zztq[] arr_zztq = new zztq[this.zzb.length];
        int v2 = this.zzc[0].zza(zzts0.zza);
        for(int v1 = 0; v1 < this.zzb.length; ++v1) {
            zzts zzts1 = zzts0.zzc(this.zzc[v1].zzf(v2));
            arr_zztq[v1] = this.zzb[v1].zzI(zzts1, zzxu0, v - this.zzh[v2][v1]);
        }
        return new zzui(this.zzj, this.zzh[v2], arr_zztq);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zzbp zzJ() {
        return this.zzb.length <= 0 ? zzuk.zza : this.zzb[0].zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    protected final void zzn(zzhk zzhk0) {
        super.zzn(zzhk0);
        for(int v = 0; v < this.zzb.length; ++v) {
            this.zzB(v, this.zzb[v]);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzst
    public final void zzt(zzbp zzbp0) {
        this.zzb[0].zzt(zzbp0);
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    protected final zzts zzy(Object object0, zzts zzts0) {
        return ((int)(((Integer)object0))) == 0 ? zzts0 : null;
    }

    @Override  // com.google.android.gms.internal.ads.zztb
    public final void zzz() {
        zzuj zzuj0 = this.zzi;
        if(zzuj0 != null) {
            throw zzuj0;
        }
        super.zzz();
    }
}

