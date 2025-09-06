package com.google.android.gms.internal.ads;

public final class zzajf implements zzakb {
    private final zzaio zza;
    private final zzfa zzb;
    private int zzc;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzajf(zzaio zzaio0) {
        this.zza = zzaio0;
        this.zzb = new zzfa(new byte[10], 10);
        this.zzc = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzakb
    public final void zza(zzfb zzfb0, int v) {
        long v19;
        int v18;
        int v8;
        zzdy.zzb(this.zze);
        if((v & 1) != 0) {
            switch(this.zzc) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    zzes.zzf("PesReader", "Unexpected start indicator reading extended header");
                    break;
                }
                default: {
                    int v1 = this.zzj;
                    if(v1 != -1) {
                        zzes.zzf("PesReader", "Unexpected start indicator: expected " + v1 + " more bytes");
                    }
                    this.zza.zzc(zzfb0.zzd() == 0);
                }
            }
            this.zzd(1);
        }
        int v2 = v;
        while(zzfb0.zza() > 0) {
            switch(this.zzc) {
                case 0: {
                    zzfb0.zzH(zzfb0.zza());
                    continue;
                }
                case 1: {
                    if(!this.zze(zzfb0, this.zzb.zza, 9)) {
                        continue;
                    }
                    this.zzb.zzj(0);
                    int v7 = this.zzb.zzd(24);
                    if(v7 == 1) {
                        this.zzb.zzl(8);
                        int v9 = this.zzb.zzd(16);
                        this.zzb.zzl(5);
                        this.zzk = this.zzb.zzn();
                        this.zzb.zzl(2);
                        this.zzf = this.zzb.zzn();
                        this.zzg = this.zzb.zzn();
                        this.zzb.zzl(6);
                        int v10 = this.zzb.zzd(8);
                        this.zzi = v10;
                        if(v9 == 0) {
                            this.zzj = -1;
                        }
                        else {
                            int v11 = v9 - 3 - v10;
                            this.zzj = v11;
                            if(v11 < 0) {
                                zzes.zzf("PesReader", "Found negative packet payload size: " + v11);
                                this.zzj = -1;
                            }
                        }
                        v8 = 2;
                    }
                    else {
                        zzes.zzf("PesReader", "Unexpected start code prefix: " + v7);
                        this.zzj = -1;
                        v8 = 0;
                    }
                    this.zzd(v8);
                    continue;
                }
                case 2: {
                    if(!this.zze(zzfb0, this.zzb.zza, Math.min(10, this.zzi)) || !this.zze(zzfb0, null, this.zzi)) {
                        continue;
                    }
                    this.zzb.zzj(0);
                    if(this.zzf) {
                        this.zzb.zzl(4);
                        long v12 = (long)this.zzb.zzd(3);
                        this.zzb.zzl(1);
                        int v13 = this.zzb.zzd(15) << 15;
                        this.zzb.zzl(1);
                        long v14 = (long)this.zzb.zzd(15);
                        this.zzb.zzl(1);
                        if(this.zzh || !this.zzg) {
                            v18 = v13;
                        }
                        else {
                            this.zzb.zzl(4);
                            long v15 = ((long)this.zzb.zzd(3)) << 30;
                            this.zzb.zzl(1);
                            int v16 = this.zzb.zzd(15);
                            this.zzb.zzl(1);
                            long v17 = (long)this.zzb.zzd(15);
                            this.zzb.zzl(1);
                            v18 = v13;
                            this.zze.zzb(v15 | ((long)(v16 << 15)) | v17);
                            this.zzh = true;
                        }
                        v19 = this.zze.zzb(v12 << 30 | ((long)v18) | v14);
                    }
                    else {
                        v19 = 0x8000000000000001L;
                    }
                    break;
                }
                default: {
                    int v3 = zzfb0.zza();
                    int v4 = this.zzj == -1 ? 0 : v3 - this.zzj;
                    if(v4 > 0) {
                        v3 -= v4;
                        zzfb0.zzF(zzfb0.zzc() + v3);
                    }
                    this.zza.zza(zzfb0);
                    int v5 = this.zzj;
                    if(v5 == -1) {
                        continue;
                    }
                    int v6 = v5 - v3;
                    this.zzj = v6;
                    if(v6 != 0) {
                        continue;
                    }
                    this.zza.zzc(((boolean)0));
                    this.zzd(1);
                    continue;
                }
            }
            v2 |= (this.zzk ? 4 : 0);
            this.zza.zzd(v19, v2);
            this.zzd(3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzakb
    public final void zzb(zzfi zzfi0, zzabe zzabe0, zzaka zzaka0) {
        this.zze = zzfi0;
        this.zza.zzb(zzabe0, zzaka0);
    }

    @Override  // com.google.android.gms.internal.ads.zzakb
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    private final void zzd(int v) {
        this.zzc = v;
        this.zzd = 0;
    }

    private final boolean zze(zzfb zzfb0, byte[] arr_b, int v) {
        int v1 = Math.min(zzfb0.zza(), v - this.zzd);
        if(v1 <= 0) {
            return true;
        }
        if(arr_b == null) {
            zzfb0.zzH(v1);
        }
        else {
            zzfb0.zzC(arr_b, this.zzd, v1);
        }
        int v2 = this.zzd + v1;
        this.zzd = v2;
        return v2 == v;
    }
}

