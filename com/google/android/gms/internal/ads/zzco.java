package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzco {
    public static final zzn zza;
    public final Object zzb;
    public final int zzc;
    public final zzbp zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;

    static {
        zzco.zzk = "0";
        zzco.zzl = "1";
        zzco.zzm = "2";
        zzco.zzn = "3";
        zzco.zzo = "4";
        zzco.zzp = "5";
        zzco.zzq = "6";
        zzco.zza = zzcn.zza;
    }

    public zzco(Object object0, int v, zzbp zzbp0, Object object1, int v1, long v2, long v3, int v4, int v5) {
        this.zzb = object0;
        this.zzc = v;
        this.zzd = zzbp0;
        this.zze = object1;
        this.zzf = v1;
        this.zzg = v2;
        this.zzh = v3;
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
            return zzco.class == class0 && this.zzc == ((zzco)object0).zzc && this.zzf == ((zzco)object0).zzf && this.zzg == ((zzco)object0).zzg && this.zzh == ((zzco)object0).zzh && this.zzi == ((zzco)object0).zzi && this.zzj == ((zzco)object0).zzj && zzfrd.zza(this.zzb, ((zzco)object0).zzb) && zzfrd.zza(this.zze, ((zzco)object0).zze) && zzfrd.zza(this.zzd, ((zzco)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }
}

