package com.google.android.gms.internal.ads;

final class zzahs {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf;
    private final zzfb zzg;

    zzahs() {
        this.zzf = new int[0xFF];
        this.zzg = new zzfb(0xFF);
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzabc zzabc0, boolean z) {
        this.zza();
        this.zzg.zzD(27);
        if(zzabf.zzc(zzabc0, this.zzg.zzI(), 0, 27, z) && this.zzg.zzt() == 0x4F676753L) {
            if(this.zzg.zzl() != 0) {
                if(!z) {
                    throw zzcd.zzc("unsupported bit stream revision");
                }
                return false;
            }
            this.zza = this.zzg.zzl();
            this.zzb = this.zzg.zzq();
            this.zzg.zzr();
            this.zzg.zzr();
            this.zzg.zzr();
            int v1 = this.zzg.zzl();
            this.zzc = v1;
            this.zzd = v1 + 27;
            this.zzg.zzD(v1);
            if(zzabf.zzc(zzabc0, this.zzg.zzI(), 0, this.zzc, z)) {
                for(int v = 0; v < this.zzc; ++v) {
                    this.zzf[v] = this.zzg.zzl();
                    this.zze += this.zzf[v];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzabc zzabc0, long v) {
        zzdy.zzd(Long.compare(zzabc0.zzf(), zzabc0.zze()) == 0);
        this.zzg.zzD(4);
        while(true) {
            int v1 = Long.compare(v, -1L);
            if(v1 != 0 && zzabc0.zzf() + 4L >= v || !zzabf.zzc(zzabc0, this.zzg.zzI(), 0, 4, true)) {
                break;
            }
            this.zzg.zzG(0);
            if(this.zzg.zzt() != 0x4F676753L) {
                ((zzaar)zzabc0).zzo(1, false);
                continue;
            }
            zzabc0.zzj();
            return true;
        }
        while((v1 == 0 || zzabc0.zzf() < v) && zzabc0.zzc(1) != -1) {
        }
        return false;
    }
}

