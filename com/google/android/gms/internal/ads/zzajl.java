package com.google.android.gms.internal.ads;

final class zzajl {
    private final zzaio zza;
    private final zzfi zzb;
    private final zzfa zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzajl(zzaio zzaio0, zzfi zzfi0) {
        this.zza = zzaio0;
        this.zzb = zzfi0;
        this.zzc = new zzfa(new byte[0x40], 0x40);
    }

    public final void zza(zzfb zzfb0) {
        long v8;
        long v6;
        zzfb0.zzC(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        int v = this.zzc.zzd(8);
        zzfb0.zzC(this.zzc.zza, 0, v);
        this.zzc.zzj(0);
        if(this.zzd) {
            this.zzc.zzl(4);
            long v1 = (long)this.zzc.zzd(3);
            this.zzc.zzl(1);
            int v2 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            long v3 = (long)this.zzc.zzd(15);
            this.zzc.zzl(1);
            if(this.zzf || !this.zze) {
                v6 = v1;
            }
            else {
                this.zzc.zzl(4);
                long v4 = ((long)this.zzc.zzd(3)) << 30;
                this.zzc.zzl(1);
                int v5 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                v6 = v1;
                long v7 = (long)this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb(((long)(v5 << 15)) | v4 | v7);
                this.zzf = true;
            }
            v8 = this.zzb.zzb(v6 << 30 | ((long)(v2 << 15)) | v3);
        }
        else {
            v8 = 0L;
        }
        this.zza.zzd(v8, 4);
        this.zza.zza(zzfb0);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}

