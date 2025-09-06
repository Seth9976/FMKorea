package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

public final class zzaiq implements zzaio {
    private static final double[] zza;
    private String zzb;
    private zzace zzc;
    private final zzakd zzd;
    private final zzfb zze;
    private final zzajd zzf;
    private final boolean[] zzg;
    private final zzaip zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    static {
        zzaiq.zza = new double[]{23.976024, 24.0, 25.0, 29.97003, 30.0, 50.0, 59.94006, 60.0};
    }

    public zzaiq() {
        this(null);
    }

    zzaiq(zzakd zzakd0) {
        zzfb zzfb0;
        this.zzd = zzakd0;
        this.zzg = new boolean[4];
        this.zzh = new zzaip(0x80);
        if(zzakd0 == null) {
            zzfb0 = null;
            this.zzf = null;
        }
        else {
            this.zzf = new zzajd(0xB2, 0x80);
            zzfb0 = new zzfb();
        }
        this.zze = zzfb0;
        this.zzm = 0x8000000000000001L;
        this.zzo = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        int v18;
        int v17;
        float f;
        int v8;
        zzdy.zzb(this.zzc);
        int v = zzfb0.zzc();
        int v1 = zzfb0.zzd();
        byte[] arr_b = zzfb0.zzI();
        this.zzi += (long)zzfb0.zza();
        this.zzc.zzq(zzfb0, zzfb0.zza());
        int v2;
        while((v2 = zzfy.zza(arr_b, v, v1, this.zzg)) != v1) {
            int v3 = zzfb0.zzI()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            if(this.zzk) {
                v8 = v2 + 3;
                v17 = v4;
            }
            else {
                if(v4 > 0) {
                    this.zzh.zza(arr_b, v, v2);
                }
                if(this.zzh.zzc(v3, (v4 >= 0 ? 0 : -v4))) {
                    zzaip zzaip0 = this.zzh;
                    String s = this.zzb;
                    s.getClass();
                    byte[] arr_b1 = Arrays.copyOf(zzaip0.zzc, zzaip0.zza);
                    int v5 = arr_b1[4] & 0xFF;
                    int v6 = arr_b1[5];
                    int v7 = arr_b1[6] & 0xFF;
                    v8 = v2 + 3;
                    int v9 = (v6 & 0xFF) >> 4 | v5 << 4;
                    int v10 = (arr_b1[7] & 0xF0) >> 4;
                    int v11 = v7 | (v6 & 15) << 8;
                    if(v10 == 2) {
                        f = ((float)(v11 * 4)) / ((float)(v9 * 3));
                    }
                    else {
                        switch(v10) {
                            case 3: {
                                f = ((float)(v11 * 16)) / ((float)(v9 * 9));
                                break;
                            }
                            case 4: {
                                f = ((float)(v11 * 0x79)) / ((float)(v9 * 100));
                                break;
                            }
                            default: {
                                f = 1.0f;
                            }
                        }
                    }
                    zzak zzak0 = new zzak();
                    zzak0.zzH(s);
                    zzak0.zzS("video/mpeg2");
                    zzak0.zzX(v9);
                    zzak0.zzF(v11);
                    zzak0.zzP(f);
                    zzak0.zzI(Collections.singletonList(arr_b1));
                    zzam zzam0 = zzak0.zzY();
                    int v12 = (arr_b1[7] & 15) - 1;
                    long v13 = 0L;
                    if(v12 < 0 || v12 >= 8) {
                        v17 = v4;
                    }
                    else {
                        double f1 = zzaiq.zza[v12];
                        int v14 = arr_b1[zzaip0.zzb + 9];
                        int v15 = (v14 & 0x60) >> 5;
                        int v16 = v14 & 0x1F;
                        if(v15 == v16) {
                            v17 = v4;
                        }
                        else {
                            v17 = v4;
                            f1 *= (((double)v15) + 1.0) / ((double)(v16 + 1));
                        }
                        v13 = (long)(1000000.0 / f1);
                    }
                    Pair pair0 = Pair.create(zzam0, v13);
                    this.zzc.zzk(((zzam)pair0.first));
                    this.zzl = (long)(((Long)pair0.second));
                    this.zzk = true;
                }
            }
            zzajd zzajd0 = this.zzf;
            if(zzajd0 != null) {
                if(v17 > 0) {
                    zzajd0.zza(arr_b, v, v2);
                    v18 = 0;
                }
                else {
                    v18 = -v17;
                }
                if(this.zzf.zzd(v18)) {
                    int v19 = zzfy.zzb(this.zzf.zza, this.zzf.zzb);
                    this.zze.zzE(this.zzf.zza, v19);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if(v3 == 0xB2) {
                    if(zzfb0.zzI()[v2 + 2] == 1) {
                        this.zzf.zzc(0xB2);
                    }
                    v3 = 0xB2;
                }
            }
            switch(v3) {
                case 0: 
                case 0xB3: {
                    int v20 = v1 - v2;
                    if(this.zzq && this.zzk) {
                        long v21 = this.zzo;
                        if(v21 != 0x8000000000000001L) {
                            this.zzc.zzs(v21, ((int)this.zzp), ((int)(this.zzi - this.zzn)) - v20, v20, null);
                        }
                    }
                    if(!this.zzj || this.zzq) {
                        this.zzn = this.zzi - ((long)v20);
                        long v22 = this.zzm;
                        if(v22 == 0x8000000000000001L) {
                            v22 = this.zzo == 0x8000000000000001L ? 0x8000000000000001L : this.zzo + this.zzl;
                        }
                        this.zzo = v22;
                        this.zzp = false;
                        this.zzm = 0x8000000000000001L;
                        this.zzj = true;
                    }
                    this.zzq = v3 == 0;
                    break;
                }
                case 0xB8: {
                    this.zzp = true;
                }
            }
            v = v8;
        }
        if(!this.zzk) {
            this.zzh.zza(arr_b, v, v1);
        }
        zzajd zzajd1 = this.zzf;
        if(zzajd1 != null) {
            zzajd1.zza(arr_b, v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzb = zzaka0.zzb();
        this.zzc = zzabe0.zzv(zzaka0.zza(), 2);
        zzakd zzakd0 = this.zzd;
        if(zzakd0 != null) {
            zzakd0.zzb(zzabe0, zzaka0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzc);
        if(z) {
            this.zzc.zzs(this.zzo, ((int)this.zzp), ((int)(this.zzi - this.zzn)), 0, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        this.zzm = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        zzfy.zzf(this.zzg);
        this.zzh.zzb();
        zzajd zzajd0 = this.zzf;
        if(zzajd0 != null) {
            zzajd0.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = 0x8000000000000001L;
        this.zzo = 0x8000000000000001L;
    }
}

