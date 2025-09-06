package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

public final class zzait implements zzaio {
    private static final float[] zza;
    private final zzakd zzb;
    private final zzfb zzc;
    private final boolean[] zzd;
    private final zzair zze;
    private final zzajd zzf;
    private zzais zzg;
    private long zzh;
    private String zzi;
    private zzace zzj;
    private boolean zzk;
    private long zzl;

    static {
        zzait.zza = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 1.0f};
    }

    public zzait() {
        this(null);
    }

    zzait(zzakd zzakd0) {
        this.zzb = zzakd0;
        this.zzd = new boolean[4];
        this.zze = new zzair(0x80);
        this.zzl = 0x8000000000000001L;
        this.zzf = new zzajd(0xB2, 0x80);
        this.zzc = new zzfb();
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        int v14;
        zzdy.zzb(this.zzg);
        zzdy.zzb(this.zzj);
        int v = zzfb0.zzc();
        int v1 = zzfb0.zzd();
        byte[] arr_b = zzfb0.zzI();
        this.zzh += (long)zzfb0.zza();
        this.zzj.zzq(zzfb0, zzfb0.zza());
        int v2;
        while((v2 = zzfy.zza(arr_b, v, v1, this.zzd)) != v1) {
            int v3 = zzfb0.zzI()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            if(!this.zzk) {
                if(v4 > 0) {
                    this.zze.zza(arr_b, v, v2);
                }
                if(this.zze.zzc(v3, (v4 >= 0 ? 0 : -v4))) {
                    zzace zzace0 = this.zzj;
                    int v5 = this.zze.zzb;
                    String s = this.zzi;
                    s.getClass();
                    byte[] arr_b1 = Arrays.copyOf(this.zze.zzc, this.zze.zza);
                    zzfa zzfa0 = new zzfa(arr_b1, arr_b1.length);
                    zzfa0.zzm(v5);
                    zzfa0.zzm(4);
                    zzfa0.zzk();
                    zzfa0.zzl(8);
                    if(zzfa0.zzn()) {
                        zzfa0.zzl(4);
                        zzfa0.zzl(3);
                    }
                    int v6 = zzfa0.zzd(4);
                    float f = 1.0f;
                    if(v6 == 15) {
                        int v7 = zzfa0.zzd(8);
                        int v8 = zzfa0.zzd(8);
                        if(v8 == 0) {
                            zzes.zzf("H263Reader", "Invalid aspect ratio");
                        }
                        else {
                            f = ((float)v7) / ((float)v8);
                        }
                    }
                    else if(v6 < 7) {
                        f = zzait.zza[v6];
                    }
                    else {
                        zzes.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    if(zzfa0.zzn()) {
                        zzfa0.zzl(2);
                        zzfa0.zzl(1);
                        if(zzfa0.zzn()) {
                            zzfa0.zzl(15);
                            zzfa0.zzk();
                            zzfa0.zzl(15);
                            zzfa0.zzk();
                            zzfa0.zzl(15);
                            zzfa0.zzk();
                            zzfa0.zzl(3);
                            zzfa0.zzl(11);
                            zzfa0.zzk();
                            zzfa0.zzl(15);
                            zzfa0.zzk();
                        }
                    }
                    if(zzfa0.zzd(2) != 0) {
                        zzes.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzfa0.zzk();
                    int v9 = zzfa0.zzd(16);
                    zzfa0.zzk();
                    if(zzfa0.zzn()) {
                        if(v9 == 0) {
                            zzes.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        }
                        else {
                            int v10 = v9 - 1;
                            int v11;
                            for(v11 = 0; v10 > 0; ++v11) {
                                v10 >>= 1;
                            }
                            zzfa0.zzl(v11);
                        }
                    }
                    zzfa0.zzk();
                    int v12 = zzfa0.zzd(13);
                    zzfa0.zzk();
                    int v13 = zzfa0.zzd(13);
                    zzfa0.zzk();
                    zzfa0.zzk();
                    zzak zzak0 = new zzak();
                    zzak0.zzH(s);
                    zzak0.zzS("video/mp4v-es");
                    zzak0.zzX(v12);
                    zzak0.zzF(v13);
                    zzak0.zzP(f);
                    zzak0.zzI(Collections.singletonList(arr_b1));
                    zzace0.zzk(zzak0.zzY());
                    this.zzk = true;
                }
            }
            this.zzg.zza(arr_b, v, v2);
            zzajd zzajd0 = this.zzf;
            if(v4 > 0) {
                zzajd0.zza(arr_b, v, v2);
                v14 = 0;
            }
            else {
                v14 = -v4;
            }
            if(this.zzf.zzd(v14)) {
                int v15 = zzfy.zzb(this.zzf.zza, this.zzf.zzb);
                this.zzc.zzE(this.zzf.zza, v15);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if(v3 == 0xB2) {
                if(zzfb0.zzI()[v2 + 2] == 1) {
                    this.zzf.zzc(0xB2);
                }
                v3 = 0xB2;
            }
            this.zzg.zzb(this.zzh - ((long)(v1 - v2)), v1 - v2, this.zzk);
            this.zzg.zzc(v3, this.zzl);
            v = v2 + 3;
        }
        if(!this.zzk) {
            this.zze.zza(arr_b, v, v1);
        }
        this.zzg.zza(arr_b, v, v1);
        this.zzf.zza(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzi = zzaka0.zzb();
        zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 2);
        this.zzj = zzace0;
        this.zzg = new zzais(zzace0);
        this.zzb.zzb(zzabe0, zzaka0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzg);
        if(z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.zzl = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        zzfy.zzf(this.zzd);
        this.zze.zzb();
        zzais zzais0 = this.zzg;
        if(zzais0 != null) {
            zzais0.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = 0x8000000000000001L;
    }
}

