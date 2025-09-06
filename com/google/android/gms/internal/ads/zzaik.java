package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

public final class zzaik implements zzaio {
    private static final byte[] zza;
    private final boolean zzb;
    private final zzfa zzc;
    private final zzfb zzd;
    private final String zze;
    private String zzf;
    private zzace zzg;
    private zzace zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzace zzu;
    private long zzv;

    static {
        zzaik.zza = new byte[]{73, 68, 51};
    }

    public zzaik(boolean z, String s) {
        this.zzc = new zzfa(new byte[7], 7);
        this.zzd = new zzfb(Arrays.copyOf(zzaik.zza, 10));
        this.zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = 0x8000000000000001L;
        this.zzt = 0x8000000000000001L;
        this.zzb = z;
        this.zze = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        this.zzg.getClass();
    label_1:
        while(zzfb0.zza() > 0) {
            switch(this.zzi) {
                case 0: {
                    byte[] arr_b = zzfb0.zzI();
                    int v4 = zzfb0.zzc();
                    int v5 = zzfb0.zzd();
                    while(v4 < v5) {
                        int v6 = arr_b[v4];
                        int v7 = v6 & 0xFF;
                        if(this.zzk == 0x200 && zzaik.zzl(((byte)-1), ((byte)v7))) {
                            if(this.zzm) {
                            label_48:
                                this.zzp = (v6 & 8) >> 3;
                                this.zzl = 1 == (v6 & 1 ^ 1);
                                if(this.zzm) {
                                    this.zzi();
                                }
                                else {
                                    this.zzi = 1;
                                    this.zzj = 0;
                                }
                                zzfb0.zzG(v4 + 1);
                                continue label_1;
                            }
                            else {
                                zzfb0.zzG(v4);
                                if(zzaik.zzm(zzfb0, this.zzc.zza, 1)) {
                                    this.zzc.zzj(4);
                                    int v8 = this.zzc.zzd(1);
                                    if(this.zzn == -1 || v8 == this.zzn) {
                                        if(this.zzo == -1) {
                                        label_33:
                                            if(zzaik.zzm(zzfb0, this.zzc.zza, 4)) {
                                                this.zzc.zzj(14);
                                                int v9 = this.zzc.zzd(13);
                                                if(v9 >= 7) {
                                                    byte[] arr_b1 = zzfb0.zzI();
                                                    int v10 = zzfb0.zzd();
                                                    int v11 = v4 - 1 + v9;
                                                    if(v11 < v10) {
                                                        int v12 = arr_b1[v11];
                                                        if(v12 != -1) {
                                                            if(v12 == 73 && (v11 + 1 == v10 || arr_b1[v11 + 1] == 68 && (v11 + 2 == v10 || arr_b1[v11 + 2] == 51))) {
                                                                goto label_48;
                                                            }
                                                        }
                                                        else if(v11 + 1 != v10) {
                                                            int v13 = arr_b1[v11 + 1];
                                                            if(zzaik.zzl(((byte)-1), ((byte)v13)) && (v13 & 8) >> 3 == v8) {
                                                                goto label_48;
                                                            }
                                                        }
                                                        else {
                                                            goto label_48;
                                                        }
                                                    }
                                                    else {
                                                        goto label_48;
                                                    }
                                                }
                                            }
                                            else {
                                                goto label_48;
                                            }
                                        }
                                        else if(zzaik.zzm(zzfb0, this.zzc.zza, 1)) {
                                            this.zzc.zzj(2);
                                            if(this.zzc.zzd(4) == this.zzo) {
                                                zzfb0.zzG(v4 + 1);
                                                goto label_33;
                                            }
                                        }
                                        else {
                                            goto label_48;
                                        }
                                    }
                                }
                            }
                        }
                        int v14 = this.zzk;
                        switch(v14 | v7) {
                            case 329: {
                                this.zzk = 0x300;
                                ++v4;
                                continue;
                            }
                            case 0x1FF: {
                                this.zzk = 0x200;
                                ++v4;
                                continue;
                            }
                            case 836: {
                                this.zzk = 0x400;
                                ++v4;
                                continue;
                            }
                            case 1075: {
                                break;
                            }
                            default: {
                                if(v14 != 0x100) {
                                    this.zzk = 0x100;
                                    continue;
                                }
                                ++v4;
                                continue;
                            }
                        }
                        this.zzi = 2;
                        this.zzj = 3;
                        this.zzs = 0;
                        this.zzd.zzG(0);
                        zzfb0.zzG(v4 + 1);
                        continue label_1;
                    }
                    zzfb0.zzG(v4);
                    continue;
                }
                case 1: {
                    if(zzfb0.zza() == 0) {
                        continue;
                    }
                    this.zzc.zza[0] = zzfb0.zzI()[zzfb0.zzc()];
                    this.zzc.zzj(2);
                    int v15 = this.zzc.zzd(4);
                    if(this.zzo == -1 || v15 == this.zzo) {
                        if(!this.zzm) {
                            this.zzm = true;
                            this.zzn = this.zzp;
                            this.zzo = v15;
                        }
                        this.zzi();
                    }
                    else {
                        this.zzg();
                    }
                    continue;
                }
                case 2: {
                    if(!this.zzk(zzfb0, this.zzd.zzI(), 10)) {
                        continue;
                    }
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzG(6);
                    this.zzj(this.zzh, 0L, 10, this.zzd.zzk() + 10);
                    continue;
                }
                case 3: {
                    if(!this.zzk(zzfb0, this.zzc.zza, (this.zzl ? 7 : 5))) {
                        continue;
                    }
                    this.zzc.zzj(0);
                    if(this.zzq) {
                        this.zzc.zzl(10);
                    }
                    else {
                        int v16 = this.zzc.zzd(2) + 1;
                        if(v16 != 2) {
                            zzes.zzf("AdtsReader", "Detected audio object type: " + v16 + ", but assuming AAC LC.");
                        }
                        this.zzc.zzl(5);
                        byte b = (byte)(this.zzc.zzd(3) << 3 & 120 | this.zzo << 7 & 0x80);
                        byte[] arr_b2 = {((byte)(this.zzo >> 1 & 7 | 16)), b};
                        zzzy zzzy0 = zzzz.zza(arr_b2);
                        zzak zzak0 = new zzak();
                        zzak0.zzH(this.zzf);
                        zzak0.zzS("audio/mp4a-latm");
                        zzak0.zzx(zzzy0.zzc);
                        zzak0.zzw(zzzy0.zzb);
                        zzak0.zzT(zzzy0.zza);
                        zzak0.zzI(Collections.singletonList(arr_b2));
                        zzak0.zzK(this.zze);
                        zzam zzam0 = zzak0.zzY();
                        this.zzr = 1024000000L / ((long)zzam0.zzA);
                        this.zzg.zzk(zzam0);
                        this.zzq = true;
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzfb0.zza(), this.zzs - this.zzj);
                    this.zzu.zzq(zzfb0, v);
                    int v1 = this.zzj + v;
                    this.zzj = v1;
                    int v2 = this.zzs;
                    if(v1 != v2) {
                        continue;
                    }
                    long v3 = this.zzt;
                    if(v3 != 0x8000000000000001L) {
                        this.zzu.zzs(v3, 1, v2, 0, null);
                        this.zzt += this.zzv;
                    }
                    this.zzh();
                    continue;
                }
            }
            this.zzc.zzl(4);
            int v17 = this.zzc.zzd(13);
            this.zzj(this.zzg, this.zzr, 0, (this.zzl ? v17 - 9 : v17 - 7));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzf = zzaka0.zzb();
        zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 1);
        this.zzg = zzace0;
        this.zzu = zzace0;
        if(this.zzb) {
            zzaka0.zzc();
            zzace zzace1 = zzabe0.zzv(zzaka0.zza(), 5);
            this.zzh = zzace1;
            zzak zzak0 = new zzak();
            zzak0.zzH(zzaka0.zzb());
            zzak0.zzS("application/id3");
            zzace1.zzk(zzak0.zzY());
            return;
        }
        this.zzh = new zzaba();
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.zzt = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzt = 0x8000000000000001L;
        this.zzg();
    }

    public static boolean zzf(int v) {
        return (v & 0xFFF6) == 0xFFF0;
    }

    private final void zzg() {
        this.zzm = false;
        this.zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 0x100;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzace zzace0, long v, int v1, int v2) {
        this.zzi = 4;
        this.zzj = v1;
        this.zzu = zzace0;
        this.zzv = v;
        this.zzs = v2;
    }

    private final boolean zzk(zzfb zzfb0, byte[] arr_b, int v) {
        int v1 = Math.min(zzfb0.zza(), v - this.zzj);
        zzfb0.zzC(arr_b, this.zzj, v1);
        int v2 = this.zzj + v1;
        this.zzj = v2;
        return v2 == v;
    }

    private static final boolean zzl(byte b, byte b1) {
        return zzaik.zzf(b1 & 0xFF | 0xFF00);
    }

    private static final boolean zzm(zzfb zzfb0, byte[] arr_b, int v) {
        if(zzfb0.zza() < v) {
            return false;
        }
        zzfb0.zzC(arr_b, 0, v);
        return true;
    }
}

