package com.google.android.gms.internal.ads;

final class zzajh implements zzaam {
    private final zzfi zza;
    private final zzfb zzb;

    zzajh(zzfi zzfi0, zzajg zzajg0) {
        this.zza = zzfi0;
        this.zzb = new zzfb();
    }

    @Override  // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabc0, long v) {
        long v1 = zzabc0.zzf();
        int v2 = (int)Math.min(20000L, zzabc0.zzd() - v1);
        this.zzb.zzD(v2);
        ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, v2, false);
        zzfb zzfb0 = this.zzb;
        int v3 = -1;
        long v4 = 0x8000000000000001L;
        int v5 = -1;
        while(zzfb0.zza() >= 4) {
            if(zzaji.zzh(zzfb0.zzI(), zzfb0.zzc()) == 442) {
                zzfb0.zzH(4);
                long v6 = zzajj.zzc(zzfb0);
                if(v6 != 0x8000000000000001L) {
                    long v7 = this.zza.zzb(v6);
                    if(v7 > v) {
                        return v4 == 0x8000000000000001L ? zzaal.zzd(v7, v1) : zzaal.zze(v1 + ((long)v5));
                    }
                    if(v7 + 100000L > v) {
                        return zzaal.zze(v1 + ((long)zzfb0.zzc()));
                    }
                    v5 = zzfb0.zzc();
                    v4 = v7;
                }
                int v8 = zzfb0.zzd();
                if(zzfb0.zza() < 10) {
                    zzfb0.zzG(v8);
                }
                else {
                    zzfb0.zzH(9);
                    int v9 = zzfb0.zzl() & 7;
                    if(zzfb0.zza() < v9) {
                        zzfb0.zzG(v8);
                    }
                    else {
                        zzfb0.zzH(v9);
                        if(zzfb0.zza() < 4) {
                            zzfb0.zzG(v8);
                        }
                        else {
                            if(zzaji.zzh(zzfb0.zzI(), zzfb0.zzc()) == 443) {
                                zzfb0.zzH(4);
                                int v10 = zzfb0.zzp();
                                if(zzfb0.zza() < v10) {
                                    zzfb0.zzG(v8);
                                    goto label_51;
                                }
                                else {
                                    zzfb0.zzH(v10);
                                }
                            }
                            while(zzfb0.zza() >= 4) {
                                int v11 = zzaji.zzh(zzfb0.zzI(), zzfb0.zzc());
                                if(v11 == 442 || v11 == 441 || v11 >>> 8 != 1) {
                                    break;
                                }
                                zzfb0.zzH(4);
                                if(zzfb0.zza() < 2) {
                                    zzfb0.zzG(v8);
                                    break;
                                }
                                zzfb0.zzG(Math.min(zzfb0.zzd(), zzfb0.zzc() + zzfb0.zzp()));
                            }
                        }
                    }
                }
            label_51:
                v3 = zzfb0.zzc();
            }
            else {
                zzfb0.zzH(1);
            }
        }
        return v4 == 0x8000000000000001L ? zzaal.zza : zzaal.zzf(v4, v1 + ((long)v3));
    }

    @Override  // com.google.android.gms.internal.ads.zzaam
    public final void zzb() {
        this.zzb.zzE(zzfk.zzf, 0);
    }
}

