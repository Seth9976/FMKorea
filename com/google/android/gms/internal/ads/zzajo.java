package com.google.android.gms.internal.ads;

public final class zzajo implements zzakb {
    private final zzajn zza;
    private final zzfb zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzajo(zzajn zzajn0) {
        this.zza = zzajn0;
        this.zzb = new zzfb(0x20);
    }

    @Override  // com.google.android.gms.internal.ads.zzakb
    public final void zza(zzfb zzfb0, int v) {
        int v1 = (v & 1) == 0 ? -1 : zzfb0.zzc() + zzfb0.zzl();
        if(this.zzf) {
            if((v & 1) == 0) {
                return;
            }
            this.zzf = false;
            zzfb0.zzG(v1);
            this.zzd = 0;
        }
        while(zzfb0.zza() > 0) {
            int v2 = this.zzd;
            if(v2 < 3) {
                if(v2 == 0) {
                    int v3 = zzfb0.zzl();
                    zzfb0.zzG(zzfb0.zzc() - 1);
                    if(v3 == 0xFF) {
                        this.zzf = true;
                        return;
                    }
                }
                int v4 = Math.min(zzfb0.zza(), 3 - this.zzd);
                zzfb0.zzC(this.zzb.zzI(), this.zzd, v4);
                int v5 = this.zzd + v4;
                this.zzd = v5;
                if(v5 != 3) {
                    continue;
                }
                this.zzb.zzG(0);
                this.zzb.zzF(3);
                this.zzb.zzH(1);
                int v6 = this.zzb.zzl();
                int v7 = this.zzb.zzl();
                this.zze = (v6 & 0x80) != 0;
                this.zzc = ((v6 & 15) << 8 | v7) + 3;
                int v8 = this.zzc;
                if(this.zzb.zzb() >= v8) {
                    continue;
                }
                int v9 = this.zzb.zzb();
                this.zzb.zzA(Math.min(0x1002, Math.max(v8, v9 + v9)));
            }
            else {
                int v10 = Math.min(zzfb0.zza(), this.zzc - v2);
                zzfb0.zzC(this.zzb.zzI(), this.zzd, v10);
                int v11 = this.zzd + v10;
                this.zzd = v11;
                int v12 = this.zzc;
                if(v11 == v12) {
                    if(this.zze) {
                        if(zzfk.zzd(this.zzb.zzI(), 0, v12, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzF(this.zzc - 4);
                    }
                    else {
                        this.zzb.zzF(v12);
                    }
                    this.zzb.zzG(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzakb
    public final void zzb(zzfi zzfi0, zzabe zzabe0, zzaka zzaka0) {
        this.zza.zzb(zzfi0, zzabe0, zzaka0);
        this.zzf = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzakb
    public final void zzc() {
        this.zzf = true;
    }
}

