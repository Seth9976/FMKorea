package com.google.android.gms.internal.ads;

public final class zzbp {
    public static final zzbp zza;
    public static final zzn zzb;
    public final String zzc;
    public final zzbi zzd;
    @Deprecated
    public final zzbi zze;
    public final zzbf zzf;
    public final zzbv zzg;
    public final zzav zzh;
    @Deprecated
    public final zzax zzi;
    public final zzbl zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;

    static {
        zzbp.zza = new zzar().zzc();
        zzbp.zzk = "0";
        zzbp.zzl = "1";
        zzbp.zzm = "2";
        zzbp.zzn = "3";
        zzbp.zzo = "4";
        zzbp.zzp = "5";
        zzbp.zzb = zzao.zza;
    }

    zzbp(String s, zzax zzax0, zzbi zzbi0, zzbf zzbf0, zzbv zzbv0, zzbl zzbl0, zzbo zzbo0) {
        this.zzc = s;
        this.zzd = zzbi0;
        this.zze = zzbi0;
        this.zzf = zzbf0;
        this.zzg = zzbv0;
        this.zzh = zzax0;
        this.zzi = zzax0;
        this.zzj = zzbl0;
    }

    // 去混淆评级： 低(23)
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbp ? zzfk.zzD(this.zzc, ((zzbp)object0).zzc) && this.zzh.equals(((zzbp)object0).zzh) && zzfk.zzD(this.zzd, ((zzbp)object0).zzd) && zzfk.zzD(this.zzf, ((zzbp)object0).zzf) && zzfk.zzD(this.zzg, ((zzbp)object0).zzg) && zzfk.zzD(this.zzj, ((zzbp)object0).zzj) : false;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        int v = this.zzc.hashCode();
        return this.zzd == null ? (648590145 + 0xE1781 * v + this.zzg.hashCode()) * 0x1F : (648590145 + 0xE1781 * v + 0x745F * this.zzd.hashCode() + this.zzg.hashCode()) * 0x1F;
    }
}

