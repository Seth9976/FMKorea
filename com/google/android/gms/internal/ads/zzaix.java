package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class zzaix implements zzaio {
    private final zzajp zza;
    private final zzajd zzb;
    private final zzajd zzc;
    private final zzajd zzd;
    private long zze;
    private final boolean[] zzf;
    private String zzg;
    private zzace zzh;
    private zzaiw zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private final zzfb zzm;

    public zzaix(zzajp zzajp0, boolean z, boolean z1) {
        this.zza = zzajp0;
        this.zzf = new boolean[3];
        this.zzb = new zzajd(7, 0x80);
        this.zzc = new zzajd(8, 0x80);
        this.zzd = new zzajd(6, 0x80);
        this.zzk = 0x8000000000000001L;
        this.zzm = new zzfb();
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        int v9;
        zzdy.zzb(this.zzh);
        int v = zzfb0.zzc();
        int v1 = zzfb0.zzd();
        byte[] arr_b = zzfb0.zzI();
        this.zze += (long)zzfb0.zza();
        this.zzh.zzq(zzfb0, zzfb0.zza());
        int v2;
        while((v2 = zzfy.zza(arr_b, v, v1, this.zzf)) != v1) {
            int v3 = arr_b[v2 + 3] & 0x1F;
            int v4 = v2 - v;
            if(v4 > 0) {
                this.zzf(arr_b, v, v2);
            }
            int v5 = v1 - v2;
            long v6 = this.zze - ((long)v5);
            int v7 = v4 >= 0 ? 0 : -v4;
            long v8 = this.zzk;
            if(this.zzj) {
                v9 = v2 + 3;
            }
            else {
                this.zzb.zzd(v7);
                this.zzc.zzd(v7);
                if(this.zzj) {
                    v9 = v2 + 3;
                    zzajd zzajd0 = this.zzb;
                    if(zzajd0.zze()) {
                        zzfx zzfx1 = zzfy.zze(zzajd0.zza, 4, zzajd0.zzb);
                        this.zzi.zzc(zzfx1);
                        this.zzb.zzb();
                    }
                    else {
                        zzajd zzajd1 = this.zzc;
                        if(zzajd1.zze()) {
                            zzfw zzfw1 = zzfy.zzd(zzajd1.zza, 4, zzajd1.zzb);
                            this.zzi.zzb(zzfw1);
                            this.zzc.zzb();
                        }
                    }
                }
                else if(!this.zzb.zze() || !this.zzc.zze()) {
                    v9 = v2 + 3;
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(Arrays.copyOf(this.zzb.zza, this.zzb.zzb));
                    arrayList0.add(Arrays.copyOf(this.zzc.zza, this.zzc.zzb));
                    zzfx zzfx0 = zzfy.zze(this.zzb.zza, 4, this.zzb.zzb);
                    zzfw zzfw0 = zzfy.zzd(this.zzc.zza, 4, this.zzc.zzb);
                    v9 = v2 + 3;
                    zzace zzace0 = this.zzh;
                    zzak zzak0 = new zzak();
                    zzak0.zzH(this.zzg);
                    zzak0.zzS("video/avc");
                    zzak0.zzx(zzea.zza(zzfx0.zza, zzfx0.zzb, zzfx0.zzc));
                    zzak0.zzX(zzfx0.zze);
                    zzak0.zzF(zzfx0.zzf);
                    zzak0.zzP(zzfx0.zzg);
                    zzak0.zzI(arrayList0);
                    zzace0.zzk(zzak0.zzY());
                    this.zzj = true;
                    this.zzi.zzc(zzfx0);
                    this.zzi.zzb(zzfw0);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
            }
            if(this.zzd.zzd(v7)) {
                int v10 = zzfy.zzb(this.zzd.zza, this.zzd.zzb);
                this.zzm.zzE(this.zzd.zza, v10);
                this.zzm.zzG(4);
                this.zza.zza(v8, this.zzm);
            }
            if(this.zzi.zzf(v6, v5, this.zzj, this.zzl)) {
                this.zzl = false;
            }
            long v11 = this.zzk;
            if(!this.zzj) {
                this.zzb.zzc(v3);
                this.zzc.zzc(v3);
            }
            this.zzd.zzc(v3);
            this.zzi.zze(v6, v3, v11);
            v = v9;
        }
        this.zzf(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzg = zzaka0.zzb();
        zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 2);
        this.zzh = zzace0;
        this.zzi = new zzaiw(zzace0, false, false);
        this.zza.zzb(zzabe0, zzaka0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzh);
        if(z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.zzk = v;
        }
        this.zzl |= (v1 & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = 0x8000000000000001L;
        zzfy.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaiw zzaiw0 = this.zzi;
        if(zzaiw0 != null) {
            zzaiw0.zzd();
        }
    }

    private final void zzf(byte[] arr_b, int v, int v1) {
        if(!this.zzj) {
            this.zzb.zza(arr_b, v, v1);
            this.zzc.zza(arr_b, v, v1);
        }
        this.zzd.zza(arr_b, v, v1);
    }
}

