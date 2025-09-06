package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzcv {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    public static final Object zza;
    public static final zzn zzb;
    public Object zzc;
    @Deprecated
    public Object zzd;
    public zzbp zze;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    @Deprecated
    public boolean zzk;
    public zzbf zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    private static final Object zzr;
    private static final zzbp zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    static {
        zzcv.zza = new Object();
        zzcv.zzr = new Object();
        zzar zzar0 = new zzar();
        zzar0.zza("androidx.media3.common.Timeline");
        zzar0.zzb(Uri.EMPTY);
        zzcv.zzs = zzar0.zzc();
        zzcv.zzt = "1";
        zzcv.zzu = "2";
        zzcv.zzv = "3";
        zzcv.zzw = "4";
        zzcv.zzx = "5";
        zzcv.zzy = "6";
        zzcv.zzz = "7";
        zzcv.zzA = "8";
        zzcv.zzB = "9";
        zzcv.zzC = "a";
        zzcv.zzD = "b";
        zzcv.zzE = "c";
        zzcv.zzF = "d";
        zzcv.zzb = zzcu.zza;
    }

    public zzcv() {
        this.zzc = zzcv.zza;
        this.zze = zzcv.zzs;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzcv.class.equals(class0) && zzfk.zzD(this.zzc, ((zzcv)object0).zzc) && zzfk.zzD(this.zze, ((zzcv)object0).zze) && zzfk.zzD(null, null) && zzfk.zzD(this.zzl, ((zzcv)object0).zzl) && this.zzf == ((zzcv)object0).zzf && this.zzg == ((zzcv)object0).zzg && this.zzh == ((zzcv)object0).zzh && this.zzi == ((zzcv)object0).zzi && this.zzj == ((zzcv)object0).zzj && this.zzm == ((zzcv)object0).zzm && this.zzo == ((zzcv)object0).zzo && this.zzp == ((zzcv)object0).zzp && this.zzq == ((zzcv)object0).zzq;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzc.hashCode();
        int v1 = this.zze.hashCode();
        return this.zzl == null ? (((((((((((v + 0xD9) * 0x1F + v1) * 0x745F + ((int)(this.zzf ^ this.zzf >>> 0x20))) * 0x1F + ((int)(this.zzg ^ this.zzg >>> 0x20))) * 0x1F + ((int)(this.zzh ^ this.zzh >>> 0x20))) * 0x1F + this.zzi) * 0x1F + this.zzj) * 0x1F + this.zzm) * 961 + ((int)(this.zzo ^ this.zzo >>> 0x20))) * 0x1F + this.zzp) * 0x1F + this.zzq) * 0x1F : ((((((((((v * 0x745F + v1 * 961 + 0x70713408) * 0x1F + ((int)(this.zzf ^ this.zzf >>> 0x20))) * 0x1F + ((int)(this.zzg ^ this.zzg >>> 0x20))) * 0x1F + ((int)(this.zzh ^ this.zzh >>> 0x20))) * 0x1F + this.zzi) * 0x1F + this.zzj) * 0x1F + this.zzm) * 961 + ((int)(this.zzo ^ this.zzo >>> 0x20))) * 0x1F + this.zzp) * 0x1F + this.zzq) * 0x1F;
    }

    public final zzcv zza(Object object0, zzbp zzbp0, Object object1, long v, long v1, long v2, boolean z, boolean z1, zzbf zzbf0, long v3, long v4, int v5, int v6, long v7) {
        this.zzc = object0;
        this.zze = zzbp0 == null ? zzcv.zzs : zzbp0;
        this.zzd = null;
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzi = z;
        this.zzj = z1;
        this.zzk = zzbf0 != null;
        this.zzl = zzbf0;
        this.zzn = 0L;
        this.zzo = v4;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        zzdy.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}

