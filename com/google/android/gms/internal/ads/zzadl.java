package com.google.android.gms.internal.ads;

public final class zzadl implements zzabb {
    private final zzfb zza;
    private zzabe zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private zzaff zzg;
    private zzabc zzh;
    private zzado zzi;
    private zzahc zzj;

    public zzadl() {
        this.zza = new zzfb(6);
        this.zzf = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzaff zzaff0;
        long v9;
        int v = this.zzc;
        switch(v) {
            case 0: {
                this.zza.zzD(2);
                ((zzaar)zzabc0).zzn(this.zza.zzI(), 0, 2, false);
                int v1 = this.zza.zzp();
                this.zzd = v1;
                if(v1 == 0xFFDA) {
                    if(this.zzf != -1L) {
                        this.zzc = 4;
                        return 0;
                    }
                    this.zzf();
                    return 0;
                }
                if((v1 < 0xFFD0 || v1 > 0xFFD9) && v1 != 0xFF01) {
                    this.zzc = 1;
                    return 0;
                }
                return 0;
            }
            case 1: {
                this.zza.zzD(2);
                ((zzaar)zzabc0).zzn(this.zza.zzI(), 0, 2, false);
                this.zze = this.zza.zzp() - 2;
                this.zzc = 2;
                return 0;
            }
            case 2: {
                if(this.zzd == 0xFFE1) {
                    zzfb zzfb0 = new zzfb(this.zze);
                    ((zzaar)zzabc0).zzn(zzfb0.zzI(), 0, this.zze, false);
                    if(this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzfb0.zzw('\u0000'))) {
                        String s = zzfb0.zzw('\u0000');
                        if(s != null) {
                            long v2 = zzabc0.zzd();
                            if(v2 == -1L) {
                                zzaff0 = null;
                            }
                            else {
                                zzadn zzadn0 = zzadr.zza(s);
                                if(zzadn0 == null || zzadn0.zzb.size() < 2) {
                                    zzaff0 = null;
                                }
                                else {
                                    int v3 = zzadn0.zzb.size() - 1;
                                    boolean z = false;
                                    long v4 = -1L;
                                    long v5 = -1L;
                                    long v6 = -1L;
                                    long v7 = -1L;
                                    while(v3 >= 0) {
                                        zzadm zzadm0 = (zzadm)zzadn0.zzb.get(v3);
                                        int v8 = "video/mp4".equals(zzadm0.zza) | z;
                                        if(v3 == 0) {
                                            v2 -= zzadm0.zzd;
                                            v9 = 0L;
                                        }
                                        else {
                                            v9 = v2 - zzadm0.zzc;
                                        }
                                        long v10 = v2;
                                        v2 = v9;
                                        long v11 = v10;
                                        if(v8 == 0 || v2 == v11) {
                                            z = v8;
                                        }
                                        else {
                                            v7 = v11 - v2;
                                            v6 = v2;
                                            z = false;
                                        }
                                        if(v3 == 0) {
                                            v5 = v11;
                                        }
                                        if(v3 == 0) {
                                            v4 = v2;
                                        }
                                        --v3;
                                    }
                                    zzaff0 = v6 == -1L || v7 == -1L || v4 == -1L || v5 == -1L ? null : new zzaff(v4, v5, zzadn0.zza, v6, v7);
                                }
                            }
                            this.zzg = zzaff0;
                            if(zzaff0 != null) {
                                this.zzf = zzaff0.zzd;
                            }
                        }
                    }
                }
                else {
                    ((zzaar)zzabc0).zzo(this.zze, false);
                }
                this.zzc = 0;
                return 0;
            }
            case 4: {
                long v12 = zzabc0.zzf();
                long v13 = this.zzf;
                if(v12 == v13) {
                    if(!zzabc0.zzm(this.zza.zzI(), 0, 1, true)) {
                        this.zzf();
                        return 0;
                    }
                    zzabc0.zzj();
                    if(this.zzj == null) {
                        this.zzj = new zzahc(0);
                    }
                    zzado zzado0 = new zzado(zzabc0, this.zzf);
                    this.zzi = zzado0;
                    if(this.zzj.zzd(zzado0)) {
                        zzahc zzahc0 = this.zzj;
                        long v14 = this.zzf;
                        zzabe zzabe0 = this.zzb;
                        zzabe0.getClass();
                        zzahc0.zzb(new zzadq(v14, zzabe0));
                        zzaff zzaff1 = this.zzg;
                        zzaff1.getClass();
                        this.zzg(new zzby[]{zzaff1});
                        this.zzc = 5;
                        return 0;
                    }
                    this.zzf();
                    return 0;
                }
                zzabx0.zza = v13;
                return 1;
            }
            case 5: {
                if(this.zzi == null || zzabc0 != this.zzh) {
                    this.zzh = zzabc0;
                    this.zzi = new zzado(zzabc0, this.zzf);
                }
                zzahc zzahc1 = this.zzj;
                zzahc1.getClass();
                int v15 = zzahc1.zza(this.zzi, zzabx0);
                if(v15 == 1) {
                    zzabx0.zza += this.zzf;
                }
                return v15;
            }
            default: {
                if(v != 6) {
                    throw new IllegalStateException();
                }
                return -1;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzb = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        if(v == 0L) {
            this.zzc = 0;
            this.zzj = null;
            return;
        }
        if(this.zzc == 5) {
            zzahc zzahc0 = this.zzj;
            zzahc0.getClass();
            zzahc0.zzc(v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        if(this.zze(zzabc0) != 0xFFD8) {
            return false;
        }
        int v = this.zze(zzabc0);
        this.zzd = v;
        if(v == 0xFFE0) {
            this.zza.zzD(2);
            ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 2, false);
            ((zzaar)zzabc0).zzl(this.zza.zzp() - 2, false);
            v = this.zze(zzabc0);
            this.zzd = v;
        }
        if(v == 0xFFE1) {
            ((zzaar)zzabc0).zzl(2, false);
            this.zza.zzD(6);
            ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 6, false);
            return this.zza.zzt() == 1165519206L && this.zza.zzp() == 0;
        }
        return false;
    }

    private final int zze(zzabc zzabc0) {
        this.zza.zzD(2);
        ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 2, false);
        return this.zza.zzp();
    }

    private final void zzf() {
        this.zzg(new zzby[0]);
        zzabe zzabe0 = this.zzb;
        zzabe0.getClass();
        zzabe0.zzC();
        this.zzb.zzN(new zzabz(0x8000000000000001L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzby[] arr_zzby) {
        zzabe zzabe0 = this.zzb;
        zzabe0.getClass();
        zzace zzace0 = zzabe0.zzv(0x400, 4);
        zzak zzak0 = new zzak();
        zzak0.zzz("image/jpeg");
        zzak0.zzM(new zzbz(0x8000000000000001L, arr_zzby));
        zzace0.zzk(zzak0.zzY());
    }
}

