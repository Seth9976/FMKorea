package com.google.android.gms.internal.ads;

public final class zzpu {
    private final zzdr[] zza;
    private final zzqm zzb;
    private final zzdu zzc;

    public zzpu(zzdr[] arr_zzdr) {
        zzqm zzqm0 = new zzqm();
        zzdu zzdu0 = new zzdu();
        super();
        zzdr[] arr_zzdr1 = new zzdr[2];
        this.zza = arr_zzdr1;
        System.arraycopy(arr_zzdr, 0, arr_zzdr1, 0, 0);
        this.zzb = zzqm0;
        this.zzc = zzdu0;
        arr_zzdr1[0] = zzqm0;
        arr_zzdr1[1] = zzdu0;
    }

    public final long zza(long v) {
        return this.zzc.zzi(v);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzch zzc(zzch zzch0) {
        this.zzc.zzk(zzch0.zzc);
        this.zzc.zzj(zzch0.zzd);
        return zzch0;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzdr[] zze() {
        return this.zza;
    }
}

