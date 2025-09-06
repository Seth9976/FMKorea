package com.google.android.gms.internal.ads;

final class zzsw implements zzvj {
    public final zzvj zza;
    final zzsx zzb;
    private boolean zzc;

    public zzsw(zzsx zzsx0, zzvj zzvj0) {
        this.zzb = zzsx0;
        super();
        this.zza = zzvj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzkn0, zzht zzht0, int v) {
        zzsx zzsx0 = this.zzb;
        if(zzsx0.zzq()) {
            return -3;
        }
        if(this.zzc) {
            zzht0.zzc(4);
            return -4;
        }
        long v1 = zzsx0.zzb();
        int v2 = this.zza.zza(zzkn0, zzht0, v);
        if(v2 == -5) {
            zzam zzam0 = zzkn0.zza;
            zzam0.getClass();
            int v3 = zzam0.zzC;
            int v4 = 0;
            if(v3 != 0) {
            label_16:
                if(this.zzb.zzb == 0x8000000000000000L) {
                    v4 = zzam0.zzD;
                }
                zzak zzak0 = zzam0.zzb();
                zzak0.zzC(v3);
                zzak0.zzD(v4);
                zzkn0.zza = zzak0.zzY();
            }
            else if(zzam0.zzD != 0) {
                v3 = 0;
                goto label_16;
            }
            return -5;
        }
        long v5 = this.zzb.zzb;
        if(v5 != 0x8000000000000000L && (v2 == -4 && zzht0.zzd >= v5 || v2 == -3 && v1 == 0x8000000000000000L && !zzht0.zzc)) {
            zzht0.zzb();
            zzht0.zzc(4);
            this.zzc = true;
            return -4;
        }
        return v2;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long v) {
        return this.zzb.zzq() ? -3 : this.zza.zzb(v);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        this.zza.zzd();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}

