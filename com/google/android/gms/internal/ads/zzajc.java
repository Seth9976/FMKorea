package com.google.android.gms.internal.ads;

public final class zzajc implements zzaio {
    private final zzfb zza;
    private final zzabu zzb;
    private final String zzc;
    private zzace zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzajc() {
        this(null);
    }

    public zzajc(String s) {
        this.zzf = 0;
        zzfb zzfb0 = new zzfb(4);
        this.zza = zzfb0;
        zzfb0.zzI()[0] = -1;
        this.zzb = new zzabu();
        this.zzl = 0x8000000000000001L;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        zzdy.zzb(this.zzd);
    label_1:
        while(zzfb0.zza() > 0) {
            switch(this.zzf) {
                case 0: {
                    byte[] arr_b = zzfb0.zzI();
                    int v4 = zzfb0.zzc();
                    int v5 = zzfb0.zzd();
                    while(v4 < v5) {
                        int v6 = arr_b[v4];
                        boolean z = this.zzi && (v6 & 0xE0) == 0xE0;
                        this.zzi = (v6 & 0xFF) == 0xFF;
                        if(z) {
                            zzfb0.zzG(v4 + 1);
                            this.zzi = false;
                            this.zza.zzI()[1] = arr_b[v4];
                            this.zzg = 2;
                            this.zzf = 1;
                            continue label_1;
                        }
                        ++v4;
                    }
                    zzfb0.zzG(v5);
                    continue;
                }
                case 1: {
                    int v7 = Math.min(zzfb0.zza(), 4 - this.zzg);
                    zzfb0.zzC(this.zza.zzI(), this.zzg, v7);
                    int v8 = this.zzg + v7;
                    this.zzg = v8;
                    if(v8 < 4) {
                        continue;
                    }
                    this.zza.zzG(0);
                    int v9 = this.zza.zzf();
                    if(!this.zzb.zza(v9)) {
                        this.zzg = 0;
                        this.zzf = 1;
                        continue;
                    }
                    zzabu zzabu0 = this.zzb;
                    this.zzk = zzabu0.zzc;
                    if(!this.zzh) {
                        this.zzj = ((long)zzabu0.zzg) * 1000000L / ((long)zzabu0.zzd);
                        zzak zzak0 = new zzak();
                        zzak0.zzH(this.zze);
                        zzak0.zzS(this.zzb.zzb);
                        zzak0.zzL(0x1000);
                        zzak0.zzw(this.zzb.zze);
                        zzak0.zzT(this.zzb.zzd);
                        zzak0.zzK(this.zzc);
                        zzam zzam0 = zzak0.zzY();
                        this.zzd.zzk(zzam0);
                        this.zzh = true;
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzfb0.zza(), this.zzk - this.zzg);
                    this.zzd.zzq(zzfb0, v);
                    int v1 = this.zzg + v;
                    this.zzg = v1;
                    int v2 = this.zzk;
                    if(v1 < v2) {
                        continue;
                    }
                    long v3 = this.zzl;
                    if(v3 != 0x8000000000000001L) {
                        this.zzd.zzs(v3, 1, v2, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                    continue;
                }
            }
            this.zza.zzG(0);
            this.zzd.zzq(this.zza, 4);
            this.zzf = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zze = zzaka0.zzb();
        this.zzd = zzabe0.zzv(zzaka0.zza(), 1);
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
        this.zzi = false;
        this.zzl = 0x8000000000000001L;
    }
}

