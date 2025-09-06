package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzadg implements zzabb {
    public static final zzabi zza;
    private final zzfb zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfb zze;
    private final zzadh zzf;
    private zzabe zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzade zzp;
    private zzadk zzq;

    static {
        zzadg.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzadg()};
    }

    public zzadg() {
        this.zzb = new zzfb(4);
        this.zzc = new zzfb(9);
        this.zzd = new zzfb(11);
        this.zze = new zzfb();
        this.zzf = new zzadh();
        this.zzh = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        boolean z1;
        boolean z;
        long v2;
        zzdy.zzb(this.zzg);
        while(true) {
            int v = this.zzh;
            int v1 = 8;
            if(v != 1) {
                switch(v) {
                    case 2: {
                        ((zzaar)zzabc0).zzo(this.zzk, false);
                        this.zzk = 0;
                        this.zzh = 3;
                        continue;
                    }
                    case 3: {
                        if(!zzabc0.zzn(this.zzd.zzI(), 0, 11, true)) {
                            return -1;
                        }
                        this.zzd.zzG(0);
                        this.zzl = this.zzd.zzl();
                        this.zzm = this.zzd.zzn();
                        this.zzn = (long)this.zzd.zzn();
                        this.zzn = (((long)(this.zzd.zzl() << 24)) | this.zzn) * 1000L;
                        this.zzd.zzH(3);
                        this.zzh = 4;
                        continue;
                    }
                    case 4: {
                        if(this.zzi) {
                            v2 = this.zzj + this.zzn;
                        }
                        else {
                            v2 = this.zzf.zzc() == 0x8000000000000001L ? 0L : this.zzn;
                        }
                        int v3 = this.zzl;
                        if(v3 != 8) {
                            v1 = v3;
                        }
                        else if(this.zzp != null) {
                            this.zzf();
                            z = this.zzp.zzf(this.zze(zzabc0), v2);
                            z1 = true;
                            goto label_51;
                        }
                        if(v1 != 9) {
                            if(v1 == 18 && !this.zzo) {
                                zzfb zzfb0 = this.zze(zzabc0);
                                z = this.zzf.zzf(zzfb0, v2);
                                zzadh zzadh0 = this.zzf;
                                long v4 = zzadh0.zzc();
                                if(v4 != 0x8000000000000001L) {
                                    this.zzg.zzN(new zzabt(zzadh0.zzd(), zzadh0.zze(), v4));
                                    this.zzo = true;
                                }
                                z1 = true;
                            }
                        }
                        else if(this.zzq != null) {
                            this.zzf();
                            z = this.zzq.zzf(this.zze(zzabc0), v2);
                            z1 = true;
                        }
                        else {
                            ((zzaar)zzabc0).zzo(this.zzm, false);
                            z = false;
                            z1 = false;
                        }
                    label_51:
                        if(!this.zzi && z) {
                            this.zzi = true;
                            this.zzj = this.zzf.zzc() == 0x8000000000000001L ? -this.zzn : 0L;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if(!z1) {
                            continue;
                        }
                        return 0;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
            if(!zzabc0.zzn(this.zzc.zzI(), 0, 9, true)) {
                return -1;
            }
            this.zzc.zzG(0);
            this.zzc.zzH(4);
            int v5 = this.zzc.zzl();
            if((v5 & 4) != 0 && this.zzp == null) {
                this.zzp = new zzade(this.zzg.zzv(8, 1));
            }
            if((v5 & 1) != 0 && this.zzq == null) {
                this.zzq = new zzadk(this.zzg.zzv(9, 2));
            }
            this.zzg.zzC();
            this.zzk = this.zzc.zzf() - 5;
            this.zzh = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzg = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        if(Long.compare(v, 0L) == 0) {
            this.zzh = 1;
            this.zzi = false;
        }
        else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, 3, false);
        this.zzb.zzG(0);
        if(this.zzb.zzn() != 4607062) {
            return false;
        }
        ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, 2, false);
        this.zzb.zzG(0);
        if((this.zzb.zzp() & 0xFA) != 0) {
            return false;
        }
        ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        int v = this.zzb.zzf();
        zzabc0.zzj();
        ((zzaar)zzabc0).zzl(v, false);
        ((zzaar)zzabc0).zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        return this.zzb.zzf() == 0;
    }

    private final zzfb zze(zzabc zzabc0) {
        if(this.zzm > this.zze.zzb()) {
            int v = this.zze.zzb();
            this.zze.zzE(new byte[Math.max(v + v, this.zzm)], 0);
        }
        else {
            this.zze.zzG(0);
        }
        this.zze.zzF(this.zzm);
        ((zzaar)zzabc0).zzn(this.zze.zzI(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if(!this.zzo) {
            this.zzg.zzN(new zzabz(0x8000000000000001L, 0L));
            this.zzo = true;
        }
    }
}

