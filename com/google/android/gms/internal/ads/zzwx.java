package com.google.android.gms.internal.ads;

final class zzwx extends zzwz implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzwx(int v, zzcy zzcy0, int v1, zzwr zzwr0, int v2, String s) {
        super(v, zzcy0, v1);
        boolean z2;
        int v6;
        int v3 = 0;
        this.zzf = zzxd.zzn(v2, false);
        this.zzg = 1 == (this.zzd.zze & 1);
        this.zzh = (this.zzd.zze & 2) != 0;
        zzfud zzfud0 = zzwr0.zzw.isEmpty() ? zzfud.zzm("") : zzwr0.zzw;
        int v4;
        for(v4 = 0; true; ++v4) {
            if(v4 >= zzfud0.size()) {
                v4 = 0x7FFFFFFF;
                v6 = 0;
                break;
            }
            String s1 = (String)zzfud0.get(v4);
            int v5 = zzxd.zza(this.zzd, s1, false);
            if(v5 > 0) {
                v6 = v5;
                break;
            }
        }
        this.zzi = v4;
        this.zzj = v6;
        this.zzk = 0;
        this.zzm = false;
        boolean z = zzxd.zzg(s) == null;
        int v7 = zzxd.zza(this.zzd, s, z);
        this.zzl = v7;
        if(v6 <= 0) {
            boolean z1 = !zzwr0.zzw.isEmpty();
            z2 = this.zzg || this.zzh && v7 > 0;
        }
        else {
            z2 = true;
        }
        if(zzxd.zzn(v2, zzwr0.zzR) && z2) {
            v3 = 1;
        }
        this.zze = v3;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzwx)object0));
    }

    public final int zza(zzwx zzwx0) {
        zzfts zzfts0 = zzfts.zzj().zzd(this.zzf, zzwx0.zzf);
        zzfvm zzfvm0 = zzfvm.zzc().zza();
        zzfts zzfts1 = zzfts0.zzc(this.zzi, zzwx0.zzi, zzfvm0).zzb(this.zzj, zzwx0.zzj).zzb(this.zzk, zzwx0.zzk).zzd(this.zzg, zzwx0.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzwx0.zzh), (this.zzj == 0 ? zzfvm.zzc() : zzfvm.zzc().zza())).zzb(this.zzl, zzwx0.zzl);
        if(this.zzk == 0) {
            zzfts1 = zzfts1.zze(false, false);
        }
        return zzfts1.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzwz
    public final boolean zzc(zzwz zzwz0) {
        zzwx zzwx0 = (zzwx)zzwz0;
        return false;
    }
}

