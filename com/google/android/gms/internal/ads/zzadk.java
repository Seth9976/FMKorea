package com.google.android.gms.internal.ads;

final class zzadk extends zzadj {
    private final zzfb zzb;
    private final zzfb zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzadk(zzace zzace0) {
        super(zzace0);
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfb0) {
        int v = zzfb0.zzl();
        if((v & 15) != 7) {
            throw new zzadi("Video format not supported: " + (v & 15));
        }
        this.zzg = v >> 4;
        return v >> 4 != 5;
    }

    @Override  // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfb0, long v) {
        int v1 = zzfb0.zzl();
        long v2 = (long)zzfb0.zzg();
        if(v1 == 0) {
            if(!this.zze) {
                zzfb zzfb1 = new zzfb(new byte[zzfb0.zza()]);
                zzfb0.zzC(zzfb1.zzI(), 0, zzfb0.zza());
                zzaag zzaag0 = zzaag.zza(zzfb1);
                this.zzd = zzaag0.zzb;
                zzak zzak0 = new zzak();
                zzak0.zzS("video/avc");
                zzak0.zzx(zzaag0.zzi);
                zzak0.zzX(zzaag0.zzc);
                zzak0.zzF(zzaag0.zzd);
                zzak0.zzP(zzaag0.zzh);
                zzak0.zzI(zzaag0.zza);
                zzam zzam0 = zzak0.zzY();
                this.zza.zzk(zzam0);
                this.zze = true;
                return false;
            }
        }
        else if(v1 == 1 && this.zze) {
            int v3 = this.zzg == 1 ? 1 : 0;
            if(!this.zzf && v3 == 0) {
                return false;
            }
            byte[] arr_b = this.zzc.zzI();
            arr_b[0] = 0;
            arr_b[1] = 0;
            arr_b[2] = 0;
            int v4 = 4 - this.zzd;
            int v5;
            for(v5 = 0; zzfb0.zza() > 0; v5 = v5 + 4 + v6) {
                zzfb0.zzC(this.zzc.zzI(), v4, this.zzd);
                this.zzc.zzG(0);
                int v6 = this.zzc.zzo();
                this.zzb.zzG(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfb0, v6);
            }
            this.zza.zzs(v + v2 * 1000L, v3, v5, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}

