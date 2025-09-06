package com.google.android.gms.internal.ads;

public final class zzie {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzie(String s, zzam zzam0, zzam zzam1, int v, int v1) {
        boolean z = true;
        if(v != 0) {
            if(v1 == 0) {
                v1 = 0;
            }
            else {
                z = false;
            }
        }
        zzdy.zzd(z);
        zzdy.zzc(s);
        this.zza = s;
        zzam0.getClass();
        this.zzb = zzam0;
        zzam1.getClass();
        this.zzc = zzam1;
        this.zzd = v;
        this.zze = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzie.class == class0 && this.zzd == ((zzie)object0).zzd && this.zze == ((zzie)object0).zze && this.zza.equals(((zzie)object0).zza) && this.zzb.equals(((zzie)object0).zzb) && this.zzc.equals(((zzie)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((this.zzd + 0x20F) * 0x1F + this.zze) * 0x1F + this.zza.hashCode()) * 0x1F + this.zzb.hashCode()) * 0x1F + this.zzc.hashCode();
    }
}

