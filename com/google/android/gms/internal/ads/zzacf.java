package com.google.android.gms.internal.ads;

public final class zzacf {
    private final byte[] zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzacf() {
        this.zza = new byte[10];
    }

    public final void zza(zzace zzace0, zzacd zzacd0) {
        if(this.zzc > 0) {
            zzace0.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzacd0);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzace zzace0, long v, int v1, int v2, int v3, zzacd zzacd0) {
        if(this.zzg > v2 + v3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if(!this.zzb) {
            return;
        }
        int v4 = this.zzc;
        this.zzc = v4 + 1;
        if(v4 == 0) {
            this.zzd = v;
            this.zze = v1;
            this.zzf = 0;
        }
        this.zzf += v2;
        this.zzg = v3;
        if(v4 + 1 >= 16) {
            this.zza(zzace0, zzacd0);
        }
    }

    public final void zzd(zzabc zzabc0) {
        if(this.zzb) {
            return;
        }
        zzabc0.zzh(this.zza, 0, 10);
        zzabc0.zzj();
        if(this.zza[4] == -8 && this.zza[5] == 0x72 && this.zza[6] == 0x6F && (this.zza[7] & 0xFE) == 0xBA) {
            this.zzb = true;
        }
    }
}

