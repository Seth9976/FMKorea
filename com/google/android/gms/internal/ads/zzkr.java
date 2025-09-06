package com.google.android.gms.internal.ads;

final class zzkr {
    public final zzts zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzkr(zzts zzts0, long v, long v1, long v2, long v3, boolean z, boolean z1, boolean z2, boolean z3) {
        boolean z4 = true;
        zzdy.zzd(!z3 || z1);
        if(z2 && !z1) {
            z4 = false;
        }
        zzdy.zzd(z4);
        this.zza = zzts0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = false;
        this.zzg = z1;
        this.zzh = z2;
        this.zzi = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzkr.class == class0 && this.zzb == ((zzkr)object0).zzb && this.zzc == ((zzkr)object0).zzc && this.zzd == ((zzkr)object0).zzd && this.zze == ((zzkr)object0).zze && this.zzg == ((zzkr)object0).zzg && this.zzh == ((zzkr)object0).zzh && this.zzi == ((zzkr)object0).zzi && zzfk.zzD(this.zza, ((zzkr)object0).zza);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((((((this.zza.hashCode() + 0x20F) * 0x1F + ((int)this.zzb)) * 0x1F + ((int)this.zzc)) * 0x1F + ((int)this.zzd)) * 0x1F + ((int)this.zze)) * 961 + this.zzg) * 0x1F + this.zzh) * 0x1F + this.zzi;
    }

    public final zzkr zza(long v) {
        return v == this.zzc ? this : new zzkr(this.zza, this.zzb, v, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkr zzb(long v) {
        return v == this.zzb ? this : new zzkr(this.zza, v, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}

