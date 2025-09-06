package com.google.android.gms.internal.ads;

public final class zzaja implements zzaio {
    private final zzfb zza;
    private zzace zzb;
    private boolean zzc;
    private long zzd;
    private int zze;
    private int zzf;

    public zzaja() {
        this.zza = new zzfb(10);
        this.zzd = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfb0) {
        zzdy.zzb(this.zzb);
        if(!this.zzc) {
            return;
        }
        int v = zzfb0.zza();
        int v1 = this.zzf;
        if(v1 < 10) {
            int v2 = Math.min(v, 10 - v1);
            System.arraycopy(zzfb0.zzI(), zzfb0.zzc(), this.zza.zzI(), this.zzf, v2);
            if(this.zzf + v2 == 10) {
                this.zza.zzG(0);
                if(this.zza.zzl() == 73 && this.zza.zzl() == 68 && this.zza.zzl() == 51) {
                    this.zza.zzH(3);
                    this.zze = this.zza.zzk() + 10;
                    goto label_17;
                }
                zzes.zzf("Id3Reader", "Discarding invalid ID3 tag");
                this.zzc = false;
                return;
            }
        }
    label_17:
        int v3 = Math.min(v, this.zze - this.zzf);
        this.zzb.zzq(zzfb0, v3);
        this.zzf += v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabe0, zzaka zzaka0) {
        zzaka0.zzc();
        zzace zzace0 = zzabe0.zzv(zzaka0.zza(), 5);
        this.zzb = zzace0;
        zzak zzak0 = new zzak();
        zzak0.zzH(zzaka0.zzb());
        zzak0.zzS("application/id3");
        zzace0.zzk(zzak0.zzY());
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzb);
        if(this.zzc) {
            int v = this.zze;
            if(v != 0 && this.zzf == v) {
                long v1 = this.zzd;
                if(v1 != 0x8000000000000001L) {
                    this.zzb.zzs(v1, 1, v, 0, null);
                }
                this.zzc = false;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long v, int v1) {
        if((v1 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if(v != 0x8000000000000001L) {
            this.zzd = v;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzc = false;
        this.zzd = 0x8000000000000001L;
    }
}

