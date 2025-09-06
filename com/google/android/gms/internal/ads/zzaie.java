package com.google.android.gms.internal.ads;

public final class zzaie implements zzaio {
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

    public zzaie() {
        this(null);
    }

    public zzaie(String s) {
        zzfa zzfa0 = new zzfa(new byte[0x80], 0x80);
        this.zza = zzfa0;
        this.zzb = new zzfb(zzfa0.zza);
        this.zzf = 0;
        this.zzl = 0x8000000000000001L;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        zzaab zzaab0;
        zzdy.zzb(this.zze);
        while(zzfb0.zza() > 0) {
            switch(this.zzf) {
                case 0: {
                    while(zzfb0.zza() > 0) {
                        if(this.zzh) {
                            int v4 = zzfb0.zzl();
                            if(v4 == 0x77) {
                                this.zzh = false;
                                this.zzf = 1;
                                this.zzb.zzI()[0] = 11;
                                this.zzb.zzI()[1] = 0x77;
                                this.zzg = 2;
                                break;
                            }
                            this.zzh = v4 == 11;
                        }
                        else {
                            this.zzh = zzfb0.zzl() == 11;
                        }
                    }
                    continue;
                }
                case 1: {
                    int v5 = Math.min(zzfb0.zza(), 0x80 - this.zzg);
                    zzfb0.zzC(this.zzb.zzI(), this.zzg, v5);
                    int v6 = this.zzg + v5;
                    this.zzg = v6;
                    if(v6 != 0x80) {
                        continue;
                    }
                    this.zza.zzj(0);
                    zzaab0 = zzaac.zze(this.zza);
                    if(this.zzj == null || zzaab0.zzc != this.zzj.zzz || zzaab0.zzb != this.zzj.zzA || !zzfk.zzD(zzaab0.zza, this.zzj.zzm)) {
                        zzak zzak0 = new zzak();
                        zzak0.zzH(this.zzd);
                        zzak0.zzS(zzaab0.zza);
                        zzak0.zzw(zzaab0.zzc);
                        zzak0.zzT(zzaab0.zzb);
                        zzak0.zzK(this.zzc);
                        zzak0.zzO(zzaab0.zzf);
                        if("audio/ac3".equals(zzaab0.zza)) {
                            zzak0.zzv(zzaab0.zzf);
                        }
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
            this.zzk = zzaab0.zzd;
            this.zzi = ((long)zzaab0.zze) * 1000000L / ((long)this.zzj.zzA);
            this.zzb.zzG(0);
            this.zze.zzq(this.zzb, 0x80);
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

