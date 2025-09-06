package com.google.android.gms.internal.ads;

public final class zzaih implements zzaio {
    private final zzfa zza;
    private final zzfb zzb;
    private final String zzc;
    private String zzd;
    private zzace zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzaih() {
        this(null);
    }

    public zzaih(String s) {
        zzfa zzfa0 = new zzfa(new byte[16], 16);
        this.zza = zzfa0;
        this.zzb = new zzfb(zzfa0.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = 0x8000000000000001L;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        zzaae zzaae0;
        byte b;
        zzdy.zzb(this.zze);
    label_1:
        while(zzfb0.zza() > 0) {
            switch(this.zzf) {
                case 0: {
                    while(true) {
                        if(zzfb0.zza() <= 0) {
                            continue label_1;
                        }
                        if(this.zzh) {
                            int v4 = zzfb0.zzl();
                            this.zzh = v4 == 0xAC;
                            b = 0x40;
                            if(v4 == 0x40) {
                                break;
                            }
                            if(v4 == 65) {
                                v4 = 65;
                                break;
                            }
                        }
                        else {
                            this.zzh = zzfb0.zzl() == 0xAC;
                        }
                    }
                    this.zzf = 1;
                    this.zzb.zzI()[0] = -84;
                    byte[] arr_b = this.zzb.zzI();
                    if(v4 == 65) {
                        b = 65;
                    }
                    arr_b[1] = b;
                    this.zzg = 2;
                    continue;
                }
                case 1: {
                    int v5 = Math.min(zzfb0.zza(), 16 - this.zzg);
                    zzfb0.zzC(this.zzb.zzI(), this.zzg, v5);
                    int v6 = this.zzg + v5;
                    this.zzg = v6;
                    if(v6 != 16) {
                        continue;
                    }
                    this.zza.zzj(0);
                    zzaae0 = zzaaf.zza(this.zza);
                    if(this.zzj == null || this.zzj.zzz != 2 || zzaae0.zza != this.zzj.zzA || !"audio/ac4".equals(this.zzj.zzm)) {
                        zzak zzak0 = new zzak();
                        zzak0.zzH(this.zzd);
                        zzak0.zzS("audio/ac4");
                        zzak0.zzw(2);
                        zzak0.zzT(zzaae0.zza);
                        zzak0.zzK(this.zzc);
                        zzam zzam0 = zzak0.zzY();
                        this.zzj = zzam0;
                        this.zze.zzk(zzam0);
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzfb0.zza(), this.zzk - this.zzg);
                    this.zze.zzq(zzfb0, v);
                    int v1 = this.zzg + v;
                    this.zzg = v1;
                    int v2 = this.zzk;
                    if(v1 != v2) {
                        continue;
                    }
                    long v3 = this.zzl;
                    if(v3 != 0x8000000000000001L) {
                        this.zze.zzs(v3, 1, v2, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                    continue;
                }
            }
            this.zzk = zzaae0.zzb;
            this.zzi = ((long)zzaae0.zzc) * 1000000L / ((long)this.zzj.zzA);
            this.zzb.zzG(0);
            this.zze.zzq(this.zzb, 16);
            this.zzf = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzd = zzaka0.zzb();
        this.zze = zzabe0.zzv(zzaka0.zza(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.zzl = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = 0x8000000000000001L;
    }
}

