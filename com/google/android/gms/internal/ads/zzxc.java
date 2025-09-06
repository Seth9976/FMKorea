package com.google.android.gms.internal.ads;

final class zzxc extends zzwz {
    private final boolean zze;
    private final zzwr zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    public zzxc(int v, zzcy zzcy0, int v1, zzwr zzwr0, int v2, int v3, boolean z) {
        super(v, zzcy0, v1);
        int v7;
        boolean z2;
        boolean z1;
        this.zzf = zzwr0;
        int v4 = 1;
        int v5 = zzwr0.zzJ ? 24 : 16;
        if(z) {
            float f = this.zzd.zzt;
            z1 = f == -1.0f || f <= 2147483648.0f;
        }
        else {
            z1 = false;
        }
        this.zze = z1;
        if(z) {
            zzam zzam0 = this.zzd;
            if(zzam0.zzr != -1 && zzam0.zzr < 0) {
                z2 = false;
            }
            else if((zzam0.zzs == -1 || zzam0.zzs >= 0) && (zzam0.zzt == -1.0f || zzam0.zzt >= 0.0f) && (zzam0.zzi == -1 || zzam0.zzi >= 0)) {
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        else {
            z2 = false;
        }
        this.zzg = z2;
        this.zzh = zzxd.zzn(v2, false);
        this.zzi = this.zzd.zzi;
        this.zzj = this.zzd.zza();
        this.zzl = 0;
        this.zzm = true;
        int v6;
        for(v6 = 0; true; ++v6) {
            if(v6 >= zzwr0.zzo.size()) {
                v6 = 0x7FFFFFFF;
                break;
            }
            String s = this.zzd.zzm;
            if(s != null && s.equals(zzwr0.zzo.get(v6))) {
                break;
            }
        }
        this.zzk = v6;
        this.zzo = (v2 & 0x180) == 0x80;
        this.zzp = (v2 & 0x40) == 0x40;
        zzam zzam1 = this.zzd;
        String s1 = zzam1.zzm;
        if(s1 == null) {
            v7 = 0;
        }
        else {
            v7 = 4;
            switch(s1) {
                case "video/av01": {
                    break;
                }
                case "video/avc": {
                    v7 = 1;
                    break;
                }
                case "video/dolby-vision": {
                    v7 = 5;
                    break;
                }
                case "video/hevc": {
                    v7 = 3;
                    break;
                }
                case "video/x-vnd.on2.vp9": {
                    v7 = 2;
                    break;
                }
                default: {
                    v7 = 0;
                }
            }
        }
        this.zzq = v7;
        zzwr zzwr1 = this.zzf;
        if(zzxd.zzn(v2, zzwr1.zzR)) {
            boolean z3 = this.zze;
            if(!z3 && !zzwr1.zzH) {
                v4 = 0;
            }
            else if(zzxd.zzn(v2, false) && this.zzg && z3 && zzam1.zzi != -1 && (v5 & v2) != 0) {
                v4 = 2;
            }
        }
        else {
            v4 = 0;
        }
        this.zzn = v4;
    }

    public static int zza(zzxc zzxc0, zzxc zzxc1) {
        zzfvm zzfvm0;
        if(zzxc0.zze && zzxc0.zzh) {
            zzfvm0 = zzxd.zze();
            return zzfts.zzj().zzc(zzxc0.zzi, zzxc1.zzi, zzxd.zzf()).zzc(zzxc0.zzj, zzxc1.zzj, zzfvm0).zzc(zzxc0.zzi, zzxc1.zzi, zzfvm0).zza();
        }
        zzfvm0 = zzxd.zze().zza();
        return zzfts.zzj().zzc(zzxc0.zzi, zzxc1.zzi, zzxd.zzf()).zzc(zzxc0.zzj, zzxc1.zzj, zzfvm0).zzc(zzxc0.zzi, zzxc1.zzi, zzfvm0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzwz
    public final boolean zzc(zzwz zzwz0) {
        return zzfk.zzD(this.zzd.zzm, ((zzxc)zzwz0).zzd.zzm) && this.zzo == ((zzxc)zzwz0).zzo && this.zzp == ((zzxc)zzwz0).zzp;
    }

    public static int zzd(zzxc zzxc0, zzxc zzxc1) {
        zzfts zzfts0 = zzfts.zzj().zzd(zzxc0.zzh, zzxc1.zzh).zzb(zzxc0.zzl, zzxc1.zzl).zzd(true, true).zzd(zzxc0.zze, zzxc1.zze).zzd(zzxc0.zzg, zzxc1.zzg);
        zzfvm zzfvm0 = zzfvm.zzc().zza();
        zzfts zzfts1 = zzfts0.zzc(zzxc0.zzk, zzxc1.zzk, zzfvm0).zzd(zzxc0.zzo, zzxc1.zzo).zzd(zzxc0.zzp, zzxc1.zzp);
        if(zzxc0.zzo && zzxc0.zzp) {
            zzfts1 = zzfts1.zzb(zzxc0.zzq, zzxc1.zzq);
        }
        return zzfts1.zza();
    }
}

