package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzly {
    public final long zza;
    public final zzcw zzb;
    public final int zzc;
    public final zzts zzd;
    public final long zze;
    public final zzcw zzf;
    public final int zzg;
    public final zzts zzh;
    public final long zzi;
    public final long zzj;

    public zzly(long v, zzcw zzcw0, int v1, zzts zzts0, long v2, zzcw zzcw1, int v3, zzts zzts1, long v4, long v5) {
        this.zza = v;
        this.zzb = zzcw0;
        this.zzc = v1;
        this.zzd = zzts0;
        this.zze = v2;
        this.zzf = zzcw1;
        this.zzg = v3;
        this.zzh = zzts1;
        this.zzi = v4;
        this.zzj = v5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzly.class == class0 && this.zza == ((zzly)object0).zza && this.zzc == ((zzly)object0).zzc && this.zze == ((zzly)object0).zze && this.zzg == ((zzly)object0).zzg && this.zzi == ((zzly)object0).zzi && this.zzj == ((zzly)object0).zzj && zzfrd.zza(this.zzb, ((zzly)object0).zzb) && zzfrd.zza(this.zzd, ((zzly)object0).zzd) && zzfrd.zza(this.zzf, ((zzly)object0).zzf) && zzfrd.zza(this.zzh, ((zzly)object0).zzh);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }
}

