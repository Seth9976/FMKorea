package com.google.android.gms.internal.ads;

import java.util.ArrayList;

public final class zzacr implements zzabb {
    private final zzfb zza;
    private final zzacq zzb;
    private int zzc;
    private zzabe zzd;
    private zzacs zze;
    private long zzf;
    private zzacu[] zzg;
    private long zzh;
    private zzacu zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private int zzm;
    private boolean zzn;

    public zzacr() {
        this.zza = new zzfb(12);
        this.zzb = new zzacq(null);
        this.zzd = new zzaaz();
        this.zzg = new zzacu[0];
        this.zzk = -1L;
        this.zzl = -1L;
        this.zzj = -1;
        this.zzf = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        long v22;
        int v14;
        int v11;
        boolean z;
        long v = this.zzh;
        if(Long.compare(v, -1L) == 0) {
            z = false;
        }
        else {
            long v1 = zzabc0.zzf();
            if(v < v1 || v > v1 + 0x40000L) {
                zzabx0.zza = v;
                z = true;
            }
            else {
                ((zzaar)zzabc0).zzo(((int)(v - v1)), false);
                z = false;
            }
        }
        this.zzh = -1L;
        if(z) {
            return 1;
        }
        int v2 = 12;
        zzacu zzacu0 = null;
        switch(this.zzc) {
            case 0: {
                if(!this.zzd(zzabc0)) {
                    throw zzcd.zza("AVI Header List not found", null);
                }
                ((zzaar)zzabc0).zzo(12, false);
                this.zzc = 1;
                return 0;
            }
            case 1: {
                ((zzaar)zzabc0).zzn(this.zza.zzI(), 0, 12, false);
                this.zza.zzG(0);
                zzacq zzacq0 = this.zzb;
                zzfb zzfb0 = this.zza;
                zzacq0.zza(zzfb0);
                int v5 = zzacq0.zza;
                if(v5 != 0x5453494C) {
                    throw zzcd.zza(("LIST expected, found: " + v5), null);
                }
                zzacq0.zzc = zzfb0.zzh();
                zzacq zzacq1 = this.zzb;
                int v6 = zzacq1.zzc;
                if(v6 != 0x6C726468) {
                    throw zzcd.zza(("hdrl expected, found: " + v6), null);
                }
                this.zzj = zzacq1.zzb;
                this.zzc = 2;
                return 0;
            }
            case 2: {
                int v7 = this.zzj - 4;
                zzfb zzfb1 = new zzfb(v7);
                ((zzaar)zzabc0).zzn(zzfb1.zzI(), 0, v7, false);
                zzacv zzacv0 = zzacv.zzc(0x6C726468, zzfb1);
                if(zzacv0.zza() != 0x6C726468) {
                    throw zzcd.zza(("Unexpected header list type " + zzacv0.zza()), null);
                }
                zzacs zzacs0 = (zzacs)zzacv0.zzb(zzacs.class);
                if(zzacs0 == null) {
                    throw zzcd.zza("AviHeader not found", null);
                }
                this.zze = zzacs0;
                this.zzf = ((long)zzacs0.zzc) * ((long)zzacs0.zza);
                ArrayList arrayList0 = new ArrayList();
                zzfud zzfud0 = zzacv0.zza;
                int v8 = zzfud0.size();
                int v9 = 0;
                int v10 = 0;
                while(v9 < v8) {
                    zzacn zzacn0 = (zzacn)zzfud0.get(v9);
                    if(zzacn0.zza() == 1819440243) {
                        zzact zzact0 = (zzact)((zzacv)zzacn0).zzb(zzact.class);
                        zzacw zzacw0 = (zzacw)((zzacv)zzacn0).zzb(zzacw.class);
                        if(zzact0 == null) {
                            zzes.zzf("AviExtractor", "Missing Stream Header");
                            v11 = v10 + 1;
                        }
                        else if(zzacw0 == null) {
                            zzes.zzf("AviExtractor", "Missing Stream Format");
                            v11 = v10 + 1;
                        }
                        else {
                            v11 = v10 + 1;
                            long v12 = zzfk.zzq(zzact0.zzd, ((long)zzact0.zzb) * 1000000L, zzact0.zzc);
                            zzam zzam0 = zzacw0.zza;
                            zzak zzak0 = zzam0.zzb();
                            zzak0.zzG(v10);
                            int v13 = zzact0.zze;
                            if(v13 != 0) {
                                zzak0.zzL(v13);
                            }
                            zzacx zzacx0 = (zzacx)((zzacv)zzacn0).zzb(zzacx.class);
                            if(zzacx0 != null) {
                                zzak0.zzJ(zzacx0.zza);
                            }
                            switch(zzcc.zzb(zzam0.zzm)) {
                                case 1: {
                                    v14 = 1;
                                    goto label_113;
                                }
                                case 2: {
                                    v14 = 2;
                                label_113:
                                    zzace zzace0 = this.zzd.zzv(v10, v14);
                                    zzace0.zzk(zzak0.zzY());
                                    zzacu zzacu3 = new zzacu(v10, v14, v12, zzact0.zzd, zzace0);
                                    this.zzf = v12;
                                    zzacu0 = zzacu3;
                                }
                            }
                        }
                        if(zzacu0 != null) {
                            arrayList0.add(zzacu0);
                        }
                        v10 = v11;
                    }
                    ++v9;
                    zzacu0 = null;
                }
                this.zzg = (zzacu[])arrayList0.toArray(new zzacu[0]);
                this.zzd.zzC();
                this.zzc = 3;
                return 0;
            }
            case 3: {
                long v15 = this.zzk;
                if(v15 != -1L && zzabc0.zzf() != v15) {
                    this.zzh = v15;
                    return 0;
                }
                ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 12, false);
                zzabc0.zzj();
                this.zza.zzG(0);
                this.zzb.zza(this.zza);
                int v16 = this.zza.zzh();
                zzacq zzacq2 = this.zzb;
                int v17 = zzacq2.zza;
                if(v17 == 1179011410) {
                    ((zzaar)zzabc0).zzo(12, false);
                    return 0;
                }
                if(v17 == 0x5453494C && v16 == 0x69766F6D) {
                    long v18 = zzabc0.zzf();
                    this.zzk = v18;
                    long v19 = v18 + ((long)zzacq2.zzb) + 8L;
                    this.zzl = v19;
                    if(!this.zzn) {
                        zzacs zzacs1 = this.zze;
                        zzacs1.getClass();
                        if((zzacs1.zzb & 16) != 16) {
                            this.zzd.zzN(new zzabz(this.zzf, 0L));
                            this.zzn = true;
                            this.zzh = zzabc0.zzf() + 12L;
                            this.zzc = 6;
                            return 0;
                        }
                        this.zzc = 4;
                        this.zzh = v19;
                        return 0;
                    }
                    this.zzh = zzabc0.zzf() + 12L;
                    this.zzc = 6;
                    return 0;
                }
                this.zzh = zzabc0.zzf() + ((long)zzacq2.zzb) + 8L;
                return 0;
            }
            case 4: {
                ((zzaar)zzabc0).zzn(this.zza.zzI(), 0, 8, false);
                this.zza.zzG(0);
                int v20 = this.zza.zzh();
                int v21 = this.zza.zzh();
                if(v20 == 829973609) {
                    this.zzc = 5;
                    this.zzm = v21;
                    return 0;
                }
                this.zzh = zzabc0.zzf() + ((long)v21);
                return 0;
            }
            case 5: {
                zzfb zzfb2 = new zzfb(this.zzm);
                ((zzaar)zzabc0).zzn(zzfb2.zzI(), 0, this.zzm, false);
                if(zzfb2.zza() < 16) {
                    v22 = 0L;
                }
                else {
                    zzfb2.zzH(8);
                    v22 = ((long)zzfb2.zzh()) <= this.zzk ? this.zzk + 8L : 0L;
                    zzfb2.zzG(zzfb2.zzc());
                }
                while(zzfb2.zza() >= 16) {
                    int v23 = zzfb2.zzh();
                    int v24 = zzfb2.zzh();
                    long v25 = ((long)zzfb2.zzh()) + v22;
                    zzfb2.zzh();
                    zzacu zzacu4 = this.zzf(v23);
                    if(zzacu4 != null) {
                        if((v24 & 16) == 16) {
                            zzacu4.zzb(v25);
                        }
                        zzacu4.zzd();
                    }
                }
                zzacu[] arr_zzacu = this.zzg;
                for(int v26 = 0; v26 < arr_zzacu.length; ++v26) {
                    arr_zzacu[v26].zzc();
                }
                this.zzn = true;
                this.zzd.zzN(new zzaco(this, this.zzf));
                this.zzc = 6;
                this.zzh = this.zzk;
                return 0;
            }
            default: {
                if(zzabc0.zzf() >= this.zzl) {
                    return -1;
                }
                zzacu zzacu1 = this.zzi;
                if(zzacu1 == null) {
                    if((zzabc0.zzf() & 1L) == 1L) {
                        ((zzaar)zzabc0).zzo(1, false);
                    }
                    ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 12, false);
                    this.zza.zzG(0);
                    int v3 = this.zza.zzh();
                    if(v3 == 0x5453494C) {
                        this.zza.zzG(8);
                        if(this.zza.zzh() != 0x69766F6D) {
                            v2 = 8;
                        }
                        ((zzaar)zzabc0).zzo(v2, false);
                        zzabc0.zzj();
                        return 0;
                    }
                    int v4 = this.zza.zzh();
                    if(v3 == 0x4B4E554A) {
                        this.zzh = zzabc0.zzf() + ((long)v4) + 8L;
                        return 0;
                    }
                    ((zzaar)zzabc0).zzo(8, false);
                    zzabc0.zzj();
                    zzacu zzacu2 = this.zzf(v3);
                    if(zzacu2 == null) {
                        this.zzh = zzabc0.zzf() + ((long)v4);
                        return 0;
                    }
                    zzacu2.zze(v4);
                    this.zzi = zzacu2;
                }
                else if(zzacu1.zzh(zzabc0)) {
                    this.zzi = null;
                    return 0;
                }
                return 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzc = 0;
        this.zzd = zzabe0;
        this.zzh = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        int v3;
        this.zzh = -1L;
        this.zzi = null;
        zzacu[] arr_zzacu = this.zzg;
        for(int v2 = 0; v2 < arr_zzacu.length; ++v2) {
            arr_zzacu[v2].zzf(v);
        }
        if(v == 0L) {
            if(this.zzg.length == 0) {
                this.zzc = 0;
                return;
            }
            v3 = 3;
        }
        else {
            v3 = 6;
        }
        this.zzc = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        if(this.zza.zzh() != 1179011410) {
            return false;
        }
        this.zza.zzH(4);
        return this.zza.zzh() == 0x20495641;
    }

    static zzacu[] zze(zzacr zzacr0) {
        return zzacr0.zzg;
    }

    private final zzacu zzf(int v) {
        zzacu[] arr_zzacu = this.zzg;
        for(int v1 = 0; v1 < arr_zzacu.length; ++v1) {
            zzacu zzacu0 = arr_zzacu[v1];
            if(zzacu0.zzg(v)) {
                return zzacu0;
            }
        }
        return null;
    }
}

