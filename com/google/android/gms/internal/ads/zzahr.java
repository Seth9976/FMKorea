package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzahr {
    private final zzahs zza;
    private final zzfb zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    zzahr() {
        this.zza = new zzahs();
        this.zzb = new zzfb(new byte[0xFE01], 0);
        this.zzc = -1;
    }

    public final zzfb zza() {
        return this.zzb;
    }

    public final zzahs zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzD(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfb zzfb0 = this.zzb;
        if(zzfb0.zzI().length == 0xFE01) {
            return;
        }
        zzfb0.zzE(Arrays.copyOf(zzfb0.zzI(), Math.max(0xFE01, zzfb0.zzd())), this.zzb.zzd());
    }

    public final boolean zze(zzabc zzabc0) {
        if(this.zze) {
            this.zze = false;
            this.zzb.zzD(0);
        }
        while(true) {
            boolean z = true;
            if(this.zze) {
                break;
            }
            int v = this.zzc;
            if(v < 0) {
                if(this.zza.zzc(zzabc0, -1L) && this.zza.zzb(zzabc0, true)) {
                    int v1 = this.zza.zzd;
                    if((this.zza.zza & 1) != 1 || this.zzb.zzd() != 0) {
                        v = 0;
                    }
                    else {
                        v1 += this.zzf(0);
                        v = this.zzd;
                    }
                    if(!zzabf.zze(zzabc0, v1)) {
                        return false;
                    }
                    this.zzc = v;
                    goto label_19;
                }
                return false;
            }
        label_19:
            int v2 = this.zzf(v);
            int v3 = this.zzc + this.zzd;
            if(v2 > 0) {
                this.zzb.zzA(this.zzb.zzd() + v2);
                if(!zzabf.zzd(zzabc0, this.zzb.zzI(), this.zzb.zzd(), v2)) {
                    return false;
                }
                this.zzb.zzF(this.zzb.zzd() + v2);
                if(this.zza.zzf[v3 - 1] == 0xFF) {
                    z = false;
                }
                this.zze = z;
            }
            if(v3 == this.zza.zzc) {
                v3 = -1;
            }
            this.zzc = v3;
        }
        return true;
    }

    private final int zzf(int v) {
        int v1 = 0;
        this.zzd = 0;
        do {
            int v2 = this.zzd;
            int v3 = v + v2;
            zzahs zzahs0 = this.zza;
            if(v3 >= zzahs0.zzc) {
                break;
            }
            this.zzd = v2 + 1;
            int v4 = zzahs0.zzf[v3];
            v1 += v4;
        }
        while(v4 == 0xFF);
        return v1;
    }
}

