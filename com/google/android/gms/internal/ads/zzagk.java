package com.google.android.gms.internal.ads;

final class zzagk {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private int zzh;
    private int zzi;

    public zzagk(zzfb zzfb0, zzfb zzfb1, boolean z) {
        this.zzg = zzfb0;
        this.zzf = zzfb1;
        this.zze = z;
        zzfb1.zzG(12);
        this.zza = zzfb1.zzo();
        zzfb0.zzG(12);
        this.zzi = zzfb0.zzo();
        zzabf.zzb(zzfb0.zzf() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int v = this.zzb + 1;
        this.zzb = v;
        if(v == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzu() : this.zzf.zzt();
        if(this.zzb == this.zzh) {
            this.zzc = this.zzg.zzo();
            this.zzg.zzH(4);
            int v1 = -1;
            int v2 = this.zzi - 1;
            this.zzi = v2;
            if(v2 > 0) {
                v1 = this.zzg.zzo() - 1;
            }
            this.zzh = v1;
        }
        return true;
    }
}

