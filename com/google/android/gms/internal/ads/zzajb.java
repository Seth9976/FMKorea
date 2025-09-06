package com.google.android.gms.internal.ads;

import java.util.Collections;

public final class zzajb implements zzaio {
    private final String zza;
    private final zzfb zzb;
    private final zzfa zzc;
    private zzace zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzajb(String s) {
        this.zza = s;
        zzfb zzfb0 = new zzfb(0x400);
        this.zzb = zzfb0;
        byte[] arr_b = zzfb0.zzI();
        this.zzc = new zzfa(arr_b, arr_b.length);
        this.zzk = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        int v9;
        int v4;
        int v3;
        zzdy.zzb(this.zzd);
        while(zzfb0.zza() > 0) {
            switch(this.zzg) {
                case 0: {
                    if(zzfb0.zzl() != 86) {
                        continue;
                    }
                    this.zzg = 1;
                    continue;
                }
                case 1: {
                    int v12 = zzfb0.zzl();
                    if((v12 & 0xE0) == 0xE0) {
                        this.zzj = v12;
                        this.zzg = 2;
                    }
                    else {
                        if(v12 == 86) {
                            continue;
                        }
                        this.zzg = 0;
                    }
                    continue;
                }
                case 2: {
                    int v13 = (this.zzj & 0xFFFFFF1F) << 8 | zzfb0.zzl();
                    this.zzi = v13;
                    zzfb zzfb1 = this.zzb;
                    if(v13 > zzfb1.zzI().length) {
                        zzfb1.zzD(v13);
                        byte[] arr_b1 = this.zzb.zzI();
                        this.zzc.zzi(arr_b1, arr_b1.length);
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzfb0.zza(), this.zzi - this.zzh);
                    zzfb0.zzC(this.zzc.zza, this.zzh, v);
                    int v1 = this.zzh + v;
                    this.zzh = v1;
                    if(v1 != this.zzi) {
                        continue;
                    }
                    this.zzc.zzj(0);
                    zzfa zzfa0 = this.zzc;
                    if(!zzfa0.zzn()) {
                        this.zzl = true;
                        int v2 = zzfa0.zzd(1);
                        if(v2 == 1) {
                            v3 = zzfa0.zzd(1);
                            v4 = 1;
                        }
                        else {
                            v4 = v2;
                            v3 = 0;
                        }
                        this.zzm = v3;
                        if(v3 != 0) {
                            throw zzcd.zza(null, null);
                        }
                        if(v4 == 1) {
                            zzajb.zzg(zzfa0);
                            v4 = 1;
                        }
                        if(!zzfa0.zzn()) {
                            throw zzcd.zza(null, null);
                        }
                        this.zzn = zzfa0.zzd(6);
                        if(zzfa0.zzd(4) != 0 || zzfa0.zzd(3) != 0) {
                            throw zzcd.zza(null, null);
                        }
                        if(v4 == 0) {
                            int v5 = this.zzf(zzfa0);
                            zzfa0.zzj(zzfa0.zzc());
                            byte[] arr_b = new byte[(v5 + 7) / 8];
                            zzfa0.zzg(arr_b, 0, v5);
                            zzak zzak0 = new zzak();
                            zzak0.zzH(this.zze);
                            zzak0.zzS("audio/mp4a-latm");
                            zzak0.zzx(this.zzu);
                            zzak0.zzw(this.zzt);
                            zzak0.zzT(this.zzr);
                            zzak0.zzI(Collections.singletonList(arr_b));
                            zzak0.zzK(this.zza);
                            zzam zzam0 = zzak0.zzY();
                            if(!zzam0.equals(this.zzf)) {
                                this.zzf = zzam0;
                                this.zzs = 1024000000L / ((long)zzam0.zzA);
                                this.zzd.zzk(zzam0);
                            }
                        }
                        else {
                            zzfa0.zzl(((int)zzajb.zzg(zzfa0)) - this.zzf(zzfa0));
                        }
                        int v6 = zzfa0.zzd(3);
                        this.zzo = v6;
                        switch(v6) {
                            case 0: {
                                zzfa0.zzl(8);
                                break;
                            }
                            case 1: {
                                zzfa0.zzl(9);
                                break;
                            }
                            case 3: 
                            case 4: 
                            case 5: {
                                zzfa0.zzl(6);
                                break;
                            }
                            case 6: 
                            case 7: {
                                zzfa0.zzl(1);
                                break;
                            }
                            default: {
                                throw new IllegalStateException();
                            }
                        }
                        boolean z = zzfa0.zzn();
                        this.zzp = z;
                        this.zzq = 0L;
                        if(z) {
                            if(v4 == 1) {
                                this.zzq = zzajb.zzg(zzfa0);
                            }
                            else {
                                do {
                                    boolean z1 = zzfa0.zzn();
                                    this.zzq = (this.zzq << 8) + ((long)zzfa0.zzd(8));
                                }
                                while(z1);
                            }
                        }
                        if(zzfa0.zzn()) {
                            zzfa0.zzl(8);
                        }
                        goto label_75;
                    }
                    else if(this.zzl) {
                    label_75:
                        if(this.zzm != 0 || this.zzn != 0 || this.zzo != 0) {
                            throw zzcd.zza(null, null);
                        }
                        for(int v7 = 0; true; v7 = v9) {
                            int v8 = zzfa0.zzd(8);
                            v9 = v7 + v8;
                            if(v8 != 0xFF) {
                                break;
                            }
                        }
                        int v10 = zzfa0.zzc();
                        if((v10 & 7) == 0) {
                            this.zzb.zzG(v10 >> 3);
                        }
                        else {
                            zzfa0.zzg(this.zzb.zzI(), 0, v9 * 8);
                            this.zzb.zzG(0);
                        }
                        this.zzd.zzq(this.zzb, v9);
                        long v11 = this.zzk;
                        if(v11 != 0x8000000000000001L) {
                            this.zzd.zzs(v11, 1, v9, 0, null);
                            this.zzk += this.zzs;
                        }
                        if(this.zzp) {
                            zzfa0.zzl(((int)this.zzq));
                        }
                    }
                    this.zzg = 0;
                    continue;
                }
            }
            this.zzh = 0;
            this.zzg = 3;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        this.zzd = zzabe0.zzv(zzaka0.zza(), 1);
        this.zze = zzaka0.zzb();
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
        this.zzg = 0;
        this.zzk = 0x8000000000000001L;
        this.zzl = false;
    }

    private final int zzf(zzfa zzfa0) {
        zzzy zzzy0 = zzzz.zzb(zzfa0, true);
        this.zzu = zzzy0.zzc;
        this.zzr = zzzy0.zza;
        this.zzt = zzzy0.zzb;
        return 0;
    }

    private static long zzg(zzfa zzfa0) {
        return (long)zzfa0.zzd((zzfa0.zzd(2) + 1) * 8);
    }
}

