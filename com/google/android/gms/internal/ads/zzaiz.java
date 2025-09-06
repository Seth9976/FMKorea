package com.google.android.gms.internal.ads;

import java.util.Collections;

public final class zzaiz implements zzaio {
    private final zzajp zza;
    private String zzb;
    private zzace zzc;
    private zzaiy zzd;
    private boolean zze;
    private final boolean[] zzf;
    private final zzajd zzg;
    private final zzajd zzh;
    private final zzajd zzi;
    private final zzajd zzj;
    private final zzajd zzk;
    private long zzl;
    private long zzm;
    private final zzfb zzn;

    public zzaiz(zzajp zzajp0) {
        this.zza = zzajp0;
        this.zzf = new boolean[3];
        this.zzg = new zzajd(0x20, 0x80);
        this.zzh = new zzajd(33, 0x80);
        this.zzi = new zzajd(34, 0x80);
        this.zzj = new zzajd(39, 0x80);
        this.zzk = new zzajd(40, 0x80);
        this.zzm = 0x8000000000000001L;
        this.zzn = new zzfb();
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        long v13;
        int v12;
        byte[] arr_b1;
        int v11;
        int v9;
        zzdy.zzb(this.zzc);
        while(zzfb0.zza() > 0) {
            int v = zzfb0.zzc();
            int v1 = zzfb0.zzd();
            byte[] arr_b = zzfb0.zzI();
            this.zzl += (long)zzfb0.zza();
            this.zzc.zzq(zzfb0, zzfb0.zza());
            while(v < v1) {
                int v2 = zzfy.zza(arr_b, v, v1, this.zzf);
                if(v2 != v1) {
                    int v3 = arr_b[v2 + 3] & 0x7E;
                    int v4 = v2 - v;
                    if(v4 > 0) {
                        this.zzf(arr_b, v, v2);
                    }
                    int v5 = v1 - v2;
                    long v6 = this.zzl - ((long)v5);
                    int v7 = v4 >= 0 ? 0 : -v4;
                    long v8 = this.zzm;
                    this.zzd.zzb(v6, v5, this.zze);
                    if(this.zze) {
                        v11 = v1;
                        arr_b1 = arr_b;
                        v9 = v2 + 3;
                        v13 = v6;
                        v12 = v5;
                    }
                    else {
                        this.zzg.zzd(v7);
                        this.zzh.zzd(v7);
                        this.zzi.zzd(v7);
                        zzajd zzajd0 = this.zzg;
                        if(zzajd0.zze()) {
                            zzajd zzajd1 = this.zzh;
                            if(zzajd1.zze()) {
                                zzajd zzajd2 = this.zzi;
                                if(zzajd2.zze()) {
                                    zzace zzace0 = this.zzc;
                                    v9 = v2 + 3;
                                    String s = this.zzb;
                                    int v10 = zzajd0.zzb;
                                    v11 = v1;
                                    arr_b1 = arr_b;
                                    byte[] arr_b2 = new byte[zzajd1.zzb + v10 + zzajd2.zzb];
                                    v12 = v5;
                                    System.arraycopy(zzajd0.zza, 0, arr_b2, 0, v10);
                                    v13 = v6;
                                    System.arraycopy(zzajd1.zza, 0, arr_b2, zzajd0.zzb, zzajd1.zzb);
                                    System.arraycopy(zzajd2.zza, 0, arr_b2, zzajd0.zzb + zzajd1.zzb, zzajd2.zzb);
                                    zzfv zzfv0 = zzfy.zzc(zzajd1.zza, 5, zzajd1.zzb);
                                    String s1 = zzea.zzb(zzfv0.zza, zzfv0.zzb, zzfv0.zzc, zzfv0.zzd, zzfv0.zze, zzfv0.zzf);
                                    zzak zzak0 = new zzak();
                                    zzak0.zzH(s);
                                    zzak0.zzS("video/hevc");
                                    zzak0.zzx(s1);
                                    zzak0.zzX(zzfv0.zzg);
                                    zzak0.zzF(zzfv0.zzh);
                                    zzak0.zzP(zzfv0.zzi);
                                    zzak0.zzI(Collections.singletonList(arr_b2));
                                    zzace0.zzk(zzak0.zzY());
                                    this.zze = true;
                                }
                            }
                        }
                    }
                    if(this.zzj.zzd(v7)) {
                        int v14 = zzfy.zzb(this.zzj.zza, this.zzj.zzb);
                        this.zzn.zzE(this.zzj.zza, v14);
                        this.zzn.zzH(5);
                        this.zza.zza(v8, this.zzn);
                    }
                    if(this.zzk.zzd(v7)) {
                        int v15 = zzfy.zzb(this.zzk.zza, this.zzk.zzb);
                        this.zzn.zzE(this.zzk.zza, v15);
                        this.zzn.zzH(5);
                        this.zza.zza(v8, this.zzn);
                    }
                    this.zzd.zze(v13, v12, v3 >> 1, this.zzm, this.zze);
                    if(!this.zze) {
                        this.zzg.zzc(v3 >> 1);
                        this.zzh.zzc(v3 >> 1);
                        this.zzi.zzc(v3 >> 1);
                    }
                    this.zzj.zzc(v3 >> 1);
                    this.zzk.zzc(v3 >> 1);
                    v = v9;
                    v1 = v11;
                    arr_b = arr_b1;
                    continue;
                }
                this.zzf(arr_b, v, v1);
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzb = zzaka0.zzb();
        zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 2);
        this.zzc = zzace0;
        this.zzd = new zzaiy(zzace0);
        this.zza.zzb(zzabe0, zzaka0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzc);
        if(z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.zzm = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzl = 0L;
        this.zzm = 0x8000000000000001L;
        zzfy.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaiy zzaiy0 = this.zzd;
        if(zzaiy0 != null) {
            zzaiy0.zzd();
        }
    }

    private final void zzf(byte[] arr_b, int v, int v1) {
        this.zzd.zzc(arr_b, v, v1);
        if(!this.zze) {
            this.zzg.zza(arr_b, v, v1);
            this.zzh.zza(arr_b, v, v1);
            this.zzi.zza(arr_b, v, v1);
        }
        this.zzj.zza(arr_b, v, v1);
        this.zzk.zza(arr_b, v, v1);
    }
}

