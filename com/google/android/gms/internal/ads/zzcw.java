package com.google.android.gms.internal.ads;

import android.util.Pair;

public abstract class zzcw {
    public static final zzcw zza;
    public static final zzn zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        zzcw.zza = new zzcr();
        zzcw.zzc = "0";
        zzcw.zzd = "1";
        zzcw.zze = "2";
        zzcw.zzb = zzcq.zza;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzcw)) {
            return false;
        }
        if(((zzcw)object0).zzc() == this.zzc() && ((zzcw)object0).zzb() == this.zzb()) {
            zzcv zzcv0 = new zzcv();
            zzct zzct0 = new zzct();
            zzcv zzcv1 = new zzcv();
            zzct zzct1 = new zzct();
            for(int v = 0; v < this.zzc(); ++v) {
                if(!this.zze(v, zzcv0, 0L).equals(((zzcw)object0).zze(v, zzcv1, 0L))) {
                    return false;
                }
            }
            for(int v1 = 0; v1 < this.zzb(); ++v1) {
                if(!this.zzd(v1, zzct0, true).equals(((zzcw)object0).zzd(v1, zzct1, true))) {
                    return false;
                }
            }
            int v2 = this.zzg(true);
            if(v2 != ((zzcw)object0).zzg(true)) {
                return false;
            }
            int v3 = this.zzh(true);
            if(v3 == ((zzcw)object0).zzh(true)) {
                while(v2 != v3) {
                    int v4 = this.zzj(v2, 0, true);
                    if(v4 == ((zzcw)object0).zzj(v2, 0, true)) {
                        v2 = v4;
                        continue;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        zzcv zzcv0 = new zzcv();
        zzct zzct0 = new zzct();
        int v = this.zzc() + 0xD9;
        for(int v1 = 0; v1 < this.zzc(); ++v1) {
            v = v * 0x1F + this.zze(v1, zzcv0, 0L).hashCode();
        }
        int v2 = v * 0x1F + this.zzb();
        for(int v3 = 0; v3 < this.zzb(); ++v3) {
            v2 = v2 * 0x1F + this.zzd(v3, zzct0, true).hashCode();
        }
        for(int v4 = this.zzg(true); v4 != -1; v4 = this.zzj(v4, 0, true)) {
            v2 = v2 * 0x1F + v4;
        }
        return v2;
    }

    public abstract int zza(Object arg1);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzct zzd(int arg1, zzct arg2, boolean arg3);

    public abstract zzcv zze(int arg1, zzcv arg2, long arg3);

    public abstract Object zzf(int arg1);

    // 去混淆评级： 低(20)
    public int zzg(boolean z) {
        return this.zzo() ? -1 : 0;
    }

    // 去混淆评级： 低(20)
    public int zzh(boolean z) {
        return this.zzo() ? -1 : this.zzc() - 1;
    }

    public final int zzi(int v, zzct zzct0, zzcv zzcv0, int v1, boolean z) {
        int v2 = this.zzd(v, zzct0, false).zzd;
        if(this.zze(v2, zzcv0, 0L).zzq == v) {
            int v3 = this.zzj(v2, v1, z);
            return v3 == -1 ? -1 : this.zze(v3, zzcv0, 0L).zzp;
        }
        return v + 1;
    }

    public int zzj(int v, int v1, boolean z) {
        switch(v1) {
            case 0: {
                return v == this.zzh(z) ? -1 : v + 1;
            }
            case 1: {
                return v;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException();
                }
                return v == this.zzh(z) ? this.zzg(z) : v + 1;
            }
        }
    }

    public int zzk(int v, int v1, boolean z) {
        return v == this.zzg(false) ? -1 : v - 1;
    }

    public final Pair zzl(zzcv zzcv0, zzct zzct0, int v, long v1) {
        Pair pair0 = this.zzm(zzcv0, zzct0, v, v1, 0L);
        pair0.getClass();
        return pair0;
    }

    public final Pair zzm(zzcv zzcv0, zzct zzct0, int v, long v1, long v2) {
        zzdy.zza(v, 0, this.zzc());
        this.zze(v, zzcv0, v2);
        if(Long.compare(v1, 0x8000000000000001L) == 0) {
            v1 = 0L;
        }
        int v3 = zzcv0.zzp;
        this.zzd(v3, zzct0, false);
        while(v3 < zzcv0.zzq) {
            int v4 = Long.compare(v1, 0L);
            if(v4 == 0) {
                break;
            }
            this.zzd(v3 + 1, zzct0, false);
            if(v4 < 0) {
                break;
            }
            ++v3;
        }
        this.zzd(v3, zzct0, true);
        long v5 = zzct0.zze;
        if(v5 != 0x8000000000000001L) {
            v1 = Math.min(v1, v5 - 1L);
        }
        Object object0 = zzct0.zzc;
        object0.getClass();
        return Pair.create(object0, Math.max(0L, v1));
    }

    public zzct zzn(Object object0, zzct zzct0) {
        return this.zzd(this.zza(object0), zzct0, true);
    }

    public final boolean zzo() {
        return this.zzc() == 0;
    }
}

