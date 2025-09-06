package com.google.android.gms.internal.ads;

final class zztl extends zztg {
    public static final Object zzd;
    private final Object zze;
    private final Object zzf;

    static {
        zztl.zzd = new Object();
    }

    private zztl(zzcw zzcw0, Object object0, Object object1) {
        super(zzcw0);
        this.zze = object0;
        this.zzf = object1;
    }

    @Override  // com.google.android.gms.internal.ads.zztg
    public final int zza(Object object0) {
        zzcw zzcw0 = this.zzc;
        if(zztl.zzd.equals(object0)) {
            Object object1 = this.zzf;
            if(object1 != null) {
                object0 = object1;
            }
        }
        return zzcw0.zza(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zztg
    public final zzct zzd(int v, zzct zzct0, boolean z) {
        this.zzc.zzd(v, zzct0, z);
        if(zzfk.zzD(zzct0.zzc, this.zzf) && z) {
            zzct0.zzc = zztl.zzd;
        }
        return zzct0;
    }

    @Override  // com.google.android.gms.internal.ads.zztg
    public final zzcv zze(int v, zzcv zzcv0, long v1) {
        this.zzc.zze(v, zzcv0, v1);
        if(zzfk.zzD(zzcv0.zzc, this.zze)) {
            zzcv0.zzc = zzcv.zza;
        }
        return zzcv0;
    }

    @Override  // com.google.android.gms.internal.ads.zztg
    public final Object zzf(int v) {
        Object object0 = this.zzc.zzf(v);
        return zzfk.zzD(object0, this.zzf) ? zztl.zzd : object0;
    }

    public final zztl zzp(zzcw zzcw0) {
        return new zztl(zzcw0, this.zze, this.zzf);
    }

    public static zztl zzq(zzbp zzbp0) {
        return new zztl(new zztm(zzbp0), zzcv.zza, zztl.zzd);
    }

    public static zztl zzr(zzcw zzcw0, Object object0, Object object1) {
        return new zztl(zzcw0, object0, object1);
    }
}

