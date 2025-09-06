package com.google.android.gms.internal.ads;

public final class zzaim implements zzaio {
    private final zzfb zza;
    private final String zzb;
    private String zzc;
    private zzace zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzam zzi;
    private int zzj;
    private long zzk;

    public zzaim(String s) {
        this.zza = new zzfb(new byte[18]);
        this.zze = 0;
        this.zzk = 0x8000000000000001L;
        this.zzb = s;
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        int v12;
        int v11;
        int v10;
        zzdy.zzb(this.zzd);
    label_1:
        while(zzfb0.zza() > 0) {
        alab1:
            switch(this.zze) {
                case 0: {
                    do {
                        if(zzfb0.zza() <= 0) {
                            continue label_1;
                        }
                        int v4 = this.zzg << 8;
                        this.zzg = v4;
                        int v5 = v4 | zzfb0.zzl();
                        this.zzg = v5;
                    }
                    while(v5 != 0xFE7F0180 && v5 != 0xFF1F00E8 && v5 != 0x1FFFE800 && v5 != 0x7FFE8001);
                    byte[] arr_b = this.zza.zzI();
                    int v6 = this.zzg;
                    arr_b[0] = (byte)(v6 >> 24 & 0xFF);
                    arr_b[1] = (byte)(v6 >> 16 & 0xFF);
                    arr_b[2] = (byte)(v6 >> 8 & 0xFF);
                    arr_b[3] = (byte)(v6 & 0xFF);
                    this.zzf = 4;
                    this.zzg = 0;
                    this.zze = 1;
                    continue;
                }
                case 1: {
                    int v7 = Math.min(zzfb0.zza(), 18 - this.zzf);
                    zzfb0.zzC(this.zza.zzI(), this.zzf, v7);
                    int v8 = this.zzf + v7;
                    this.zzf = v8;
                    if(v8 != 18) {
                        continue;
                    }
                    byte[] arr_b1 = this.zza.zzI();
                    if(this.zzi == null) {
                        zzam zzam0 = zzaay.zza(arr_b1, this.zzc, this.zzb, null);
                        this.zzi = zzam0;
                        this.zzd.zzk(zzam0);
                    }
                    int v9 = arr_b1[0];
                    switch(v9) {
                        case -2: {
                            v10 = ((3 & arr_b1[4]) << 12 | (arr_b1[7] & 0xFF) << 4 | (arr_b1[6] & 0xF0) >> 4) + 1;
                            break;
                        }
                        case -1: {
                            v10 = (((3 & arr_b1[7]) << 12 | (arr_b1[6] & 0xFF) << 4 | (arr_b1[9] & 60) >> 2) + 1) * 16 / 14;
                            break;
                        }
                        case 0x1F: {
                            v10 = (((3 & arr_b1[6]) << 12 | (arr_b1[7] & 0xFF) << 4 | (arr_b1[8] & 60) >> 2) + 1) * 16 / 14;
                            break;
                        }
                        default: {
                            v10 = ((arr_b1[5] & 3) << 12 | (arr_b1[6] & 0xFF) << 4 | (arr_b1[7] & 0xF0) >> 4) + 1;
                        }
                    }
                    this.zzj = v10;
                    switch(v9) {
                        case -2: {
                            v11 = (arr_b1[5] & 1) << 6;
                            v12 = arr_b1[4] & 0xFC;
                            break alab1;
                        }
                        case -1: {
                            v11 = (arr_b1[4] & 7) << 4;
                            v12 = arr_b1[7] & 60;
                            break alab1;
                        }
                        case 0x1F: {
                            v11 = (arr_b1[5] & 7) << 4;
                            v12 = arr_b1[6] & 60;
                            break alab1;
                        }
                        default: {
                            v11 = (arr_b1[4] & 1) << 6;
                            v12 = arr_b1[5] & 0xFC;
                            break alab1;
                        }
                    }
                }
                default: {
                    int v = Math.min(zzfb0.zza(), this.zzj - this.zzf);
                    this.zzd.zzq(zzfb0, v);
                    int v1 = this.zzf + v;
                    this.zzf = v1;
                    int v2 = this.zzj;
                    if(v1 != v2) {
                        continue;
                    }
                    long v3 = this.zzk;
                    if(v3 != 0x8000000000000001L) {
                        this.zzd.zzs(v3, 1, v2, 0, null);
                        this.zzk += this.zzh;
                    }
                    this.zze = 0;
                    continue;
                }
            }
            this.zzh = (long)(((int)(((long)(((v12 >> 2 | v11) + 1) * 0x20)) * 1000000L / ((long)this.zzi.zzA))));
            this.zza.zzG(0);
            this.zzd.zzq(this.zza, 18);
            this.zze = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzc = zzaka0.zzb();
        this.zzd = zzabe0.zzv(zzaka0.zza(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.zzk = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = 0x8000000000000001L;
    }
}

