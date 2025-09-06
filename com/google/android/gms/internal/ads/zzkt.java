package com.google.android.gms.internal.ads;

import android.util.Pair;

final class zzkt {
    private final zzct zza;
    private final zzcv zzb;
    private final zzlx zzc;
    private final zzej zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkq zzh;
    private zzkq zzi;
    private zzkq zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzkt(zzlx zzlx0, zzej zzej0) {
        this.zzc = zzlx0;
        this.zzd = zzej0;
        this.zza = new zzct();
        this.zzb = new zzcv();
    }

    private final boolean zzA(zzcw zzcw0, zzts zzts0) {
        if(!zzkt.zzC(zzts0)) {
            return false;
        }
        int v = zzcw0.zzn(zzts0.zza, this.zza).zzd;
        int v1 = zzcw0.zza(zzts0.zza);
        return zzcw0.zze(v, this.zzb, 0L).zzq == v1;
    }

    private final boolean zzB(zzcw zzcw0) {
        zzkq zzkq0 = this.zzh;
        if(zzkq0 == null) {
            return true;
        }
        int v = zzcw0.zza(zzkq0.zzb);
        while(true) {
            v = zzcw0.zzi(v, this.zza, this.zzb, this.zzf, this.zzg);
            while(zzkq0.zzg() != null && !zzkq0.zzf.zzg) {
                zzkq0 = zzkq0.zzg();
            }
            zzkq zzkq1 = zzkq0.zzg();
            if(v == -1 || zzkq1 == null || zzcw0.zza(zzkq1.zzb) != v) {
                break;
            }
            zzkq0 = zzkq1;
        }
        boolean z = this.zzm(zzkq0);
        zzkq0.zzf = this.zzg(zzcw0, zzkq0.zzf);
        return !z;
    }

    private static final boolean zzC(zzts zzts0) {
        return !zzts0.zzb() && zzts0.zze == -1;
    }

    public final zzkq zza() {
        zzkq zzkq0 = this.zzh;
        if(zzkq0 == null) {
            return null;
        }
        if(zzkq0 == this.zzi) {
            this.zzi = zzkq0.zzg();
        }
        zzkq0.zzn();
        int v = this.zzk - 1;
        this.zzk = v;
        if(v == 0) {
            this.zzj = null;
            this.zzl = this.zzh.zzb;
            this.zzm = this.zzh.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        this.zzy();
        return this.zzh;
    }

    public final zzkq zzb() {
        zzdy.zzf(this.zzi != null && this.zzi.zzg() != null);
        this.zzi = this.zzi.zzg();
        this.zzy();
        return this.zzi;
    }

    public final zzkq zzc() {
        return this.zzj;
    }

    public final zzkq zzd() {
        return this.zzh;
    }

    public final zzkq zze() {
        return this.zzi;
    }

    public final zzkr zzf(long v, zzlg zzlg0) {
        return this.zzj == null ? this.zzu(zzlg0.zza, zzlg0.zzb, zzlg0.zzc, zzlg0.zzr) : this.zzt(zzlg0.zza, this.zzj, v);
    }

    public final zzkr zzg(zzcw zzcw0, zzkr zzkr0) {
        long v1;
        zzts zzts0 = zzkr0.zza;
        boolean z = zzkt.zzC(zzts0);
        boolean z1 = this.zzA(zzcw0, zzts0);
        boolean z2 = this.zzz(zzcw0, zzts0, z);
        zzcw0.zzn(zzkr0.zza.zza, this.zza);
        long v = !zzts0.zzb() && zzts0.zze != -1 ? 0L : 0x8000000000000001L;
        if(zzts0.zzb()) {
            v1 = this.zza.zzh(zzts0.zzb, zzts0.zzc);
            return zzts0.zzb() ? new zzkr(zzts0, zzkr0.zzb, zzkr0.zzc, v, v1, false, z, z1, z2) : new zzkr(zzts0, zzkr0.zzb, zzkr0.zzc, v, v1, false, z, z1, z2);
        }
        if(v != 0x8000000000000001L) {
            return zzts0.zzb() ? new zzkr(zzts0, zzkr0.zzb, zzkr0.zzc, 0L, 0L, false, z, z1, z2) : new zzkr(zzts0, zzkr0.zzb, zzkr0.zzc, 0L, 0L, false, z, z1, z2);
        }
        v1 = this.zza.zze;
        return zzts0.zzb() ? new zzkr(zzts0, zzkr0.zzb, zzkr0.zzc, 0x8000000000000001L, v1, false, z, z1, z2) : new zzkr(zzts0, zzkr0.zzb, zzkr0.zzc, 0x8000000000000001L, v1, false, z, z1, z2);
    }

    public final zzts zzh(zzcw zzcw0, Object object0, long v) {
        zzcv zzcv0;
        long v3;
        zzkq zzkq0;
        Object object2;
        int v5;
        int v1 = zzcw0.zzn(object0, this.zza).zzd;
        Object object1 = this.zzl;
        if(object1 == null) {
            zzkq0 = this.zzh;
        alab1:
            while(true) {
            label_10:
                if(zzkq0 == null) {
                    for(zzkq zzkq1 = this.zzh; zzkq1 != null; zzkq1 = zzkq1.zzg()) {
                        int v4 = zzcw0.zza(zzkq1.zzb);
                        if(v4 != -1 && zzcw0.zzd(v4, this.zza, false).zzd == v1) {
                            v3 = zzkq1.zzf.zza.zzd;
                            break alab1;
                        }
                    }
                    v3 = this.zze;
                    this.zze = v3 + 1L;
                    if(this.zzh == null) {
                        this.zzl = object0;
                        this.zzm = v3;
                    }
                    break;
                }
                if(zzkq0.zzb.equals(object0)) {
                    v3 = zzkq0.zzf.zza.zzd;
                    break;
                }
                zzkq0 = zzkq0.zzg();
            }
            zzcw0.zzn(object0, this.zza);
            zzcw0.zze(this.zza.zzd, this.zzb, 0L);
            v5 = zzcw0.zza(object0);
            object2 = object0;
        }
        else {
            int v2 = zzcw0.zza(object1);
            if(v2 == -1 || zzcw0.zzd(v2, this.zza, false).zzd != v1) {
                zzkq0 = this.zzh;
                goto label_10;
            }
            else {
                v3 = this.zzm;
                zzcw0.zzn(object0, this.zza);
                zzcw0.zze(this.zza.zzd, this.zzb, 0L);
                v5 = zzcw0.zza(object0);
                object2 = object0;
            }
        }
        while(true) {
            zzcv0 = this.zzb;
            if(v5 < zzcv0.zzp) {
                break;
            }
            zzcw0.zzd(v5, this.zza, true);
            if(this.zza.zzd(this.zza.zze) != -1) {
                object2 = this.zza.zzc;
                object2.getClass();
            }
            --v5;
        }
        return zzkt.zzx(zzcw0, object2, v, v3, zzcv0, this.zza);
    }

    public final void zzi() {
        if(this.zzk == 0) {
            return;
        }
        zzkq zzkq0 = this.zzh;
        zzdy.zzb(zzkq0);
        this.zzl = zzkq0.zzb;
        this.zzm = zzkq0.zzf.zza.zzd;
        while(zzkq0 != null) {
            zzkq0.zzn();
            zzkq0 = zzkq0.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        this.zzy();
    }

    // 检测为 Lambda 实现
    final void zzj(zzfua zzfua0, zzts zzts0) [...]

    public final void zzk(long v) {
        zzkq zzkq0 = this.zzj;
        if(zzkq0 != null) {
            zzkq0.zzm(v);
        }
    }

    public final boolean zzl(zztq zztq0) {
        return this.zzj != null && this.zzj.zza == zztq0;
    }

    public final boolean zzm(zzkq zzkq0) {
        boolean z = false;
        zzdy.zzf(zzkq0 != null);
        if(zzkq0.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkq0;
        while(zzkq0.zzg() != null) {
            zzkq0 = zzkq0.zzg();
            if(zzkq0 == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzkq0.zzn();
            --this.zzk;
        }
        this.zzj.zzo(null);
        this.zzy();
        return z;
    }

    // 去混淆评级： 低(20)
    public final boolean zzn() {
        return this.zzj == null || !this.zzj.zzf.zzi && this.zzj.zzr() && this.zzj.zzf.zze != 0x8000000000000001L && this.zzk < 100;
    }

    public final boolean zzo(zzcw zzcw0, long v, long v1) {
        zzkr zzkr1;
        zzkq zzkq0 = this.zzh;
        zzkq zzkq1 = null;
        while(zzkq0 != null) {
            zzkr zzkr0 = zzkq0.zzf;
            if(zzkq1 == null) {
                zzkr1 = this.zzg(zzcw0, zzkr0);
            }
            else {
                zzkr zzkr2 = this.zzt(zzcw0, zzkq1, v);
                if(zzkr2 == null) {
                    return !this.zzm(zzkq1);
                }
                if(zzkr0.zzb != zzkr2.zzb || !zzkr0.zza.equals(zzkr2.zza)) {
                    return !this.zzm(zzkq1);
                }
                zzkr1 = zzkr2;
            }
            zzkq0.zzf = zzkr1.zza(zzkr0.zzc);
            if(Long.compare(zzkr0.zze, 0x8000000000000001L) != 0 && zzkr0.zze != zzkr1.zze) {
                zzkq0.zzq();
                boolean z = zzkq0 == this.zzi && (v1 == 0x8000000000000000L || v1 >= (zzkr1.zze == 0x8000000000000001L ? 0x7FFFFFFFFFFFFFFFL : zzkr1.zze + zzkq0.zze()));
                return !this.zzm(zzkq0) && !z;
            }
            zzkq1 = zzkq0;
            zzkq0 = zzkq0.zzg();
        }
        return true;
    }

    public final boolean zzp(zzcw zzcw0, int v) {
        this.zzf = v;
        return this.zzB(zzcw0);
    }

    public final boolean zzq(zzcw zzcw0, boolean z) {
        this.zzg = z;
        return this.zzB(zzcw0);
    }

    public final zzkq zzr(zzlp[] arr_zzlp, zzxl zzxl0, zzxu zzxu0, zzlf zzlf0, zzkr zzkr0, zzxm zzxm0) {
        zzkq zzkq0 = new zzkq(arr_zzlp, (this.zzj == null ? 1000000000000L : this.zzj.zze() + this.zzj.zzf.zze - zzkr0.zzb), zzxl0, zzxu0, zzlf0, zzkr0, zzxm0);
        zzkq zzkq1 = this.zzj;
        if(zzkq1 == null) {
            this.zzh = zzkq0;
            this.zzi = zzkq0;
        }
        else {
            zzkq1.zzo(zzkq0);
        }
        this.zzl = null;
        this.zzj = zzkq0;
        ++this.zzk;
        this.zzy();
        return zzkq0;
    }

    private final long zzs(zzcw zzcw0, Object object0, int v) {
        zzcw0.zzn(object0, this.zza);
        return 0L;
    }

    private final zzkr zzt(zzcw zzcw0, zzkq zzkq0, long v) {
        long v7;
        zzkr zzkr0 = zzkq0.zzf;
        long v1 = zzkq0.zze() + zzkr0.zze - v;
        if(zzkr0.zzg) {
            long v2 = 0L;
            int v3 = zzcw0.zzi(zzcw0.zza(zzkr0.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if(v3 == -1) {
                return null;
            }
            int v4 = zzcw0.zzd(v3, this.zza, true).zzd;
            Object object0 = this.zza.zzc;
            object0.getClass();
            long v5 = zzkr0.zza.zzd;
            if(zzcw0.zze(v4, this.zzb, 0L).zzp == v3) {
                Pair pair0 = zzcw0.zzm(this.zzb, this.zza, v4, 0x8000000000000001L, Math.max(0L, v1));
                if(pair0 == null) {
                    return null;
                }
                object0 = pair0.first;
                long v6 = (long)(((Long)pair0.second));
                zzkq zzkq1 = zzkq0.zzg();
                if(zzkq1 == null || !zzkq1.zzb.equals(object0)) {
                    v5 = this.zze;
                    this.zze = v5 + 1L;
                }
                else {
                    v5 = zzkq1.zzf.zza.zzd;
                }
                v7 = v6;
                v2 = 0x8000000000000001L;
            }
            else {
                v7 = 0L;
            }
            zzts zzts0 = zzkt.zzx(zzcw0, object0, v7, v5, this.zzb, this.zza);
            if(v2 != 0x8000000000000001L && zzkr0.zzc != 0x8000000000000001L) {
                zzcw0.zzn(zzkr0.zza.zza, this.zza).zzb();
            }
            return this.zzu(zzcw0, zzts0, v2, v7);
        }
        zzts zzts1 = zzkr0.zza;
        zzcw0.zzn(zzts1.zza, this.zza);
        if(zzts1.zzb()) {
            int v8 = zzts1.zzb;
            if(this.zza.zza(v8) != -1) {
                int v9 = this.zza.zzf(v8, zzts1.zzc);
                if(v9 < 0) {
                    return this.zzv(zzcw0, zzts1.zza, v8, v9, zzkr0.zzc, zzts1.zzd);
                }
                long v10 = zzkr0.zzc;
                if(v10 != 0x8000000000000001L) {
                    this.zzs(zzcw0, zzts1.zza, zzts1.zzb);
                    return this.zzw(zzcw0, zzts1.zza, Math.max(0L, v10), zzkr0.zzc, zzts1.zzd);
                }
                Pair pair1 = zzcw0.zzm(this.zzb, this.zza, this.zza.zzd, 0x8000000000000001L, Math.max(0L, v1));
                if(pair1 != null) {
                    v10 = (long)(((Long)pair1.second));
                    this.zzs(zzcw0, zzts1.zza, zzts1.zzb);
                    return this.zzw(zzcw0, zzts1.zza, Math.max(0L, v10), zzkr0.zzc, zzts1.zzd);
                }
            }
            return null;
        }
        int v11 = this.zza.zze(zzts1.zze);
        if(v11 != this.zza.zza(zzts1.zze)) {
            return this.zzv(zzcw0, zzts1.zza, zzts1.zze, v11, zzkr0.zze, zzts1.zzd);
        }
        this.zzs(zzcw0, zzts1.zza, zzts1.zze);
        return this.zzw(zzcw0, zzts1.zza, 0L, zzkr0.zze, zzts1.zzd);
    }

    private final zzkr zzu(zzcw zzcw0, zzts zzts0, long v, long v1) {
        zzcw0.zzn(zzts0.zza, this.zza);
        return zzts0.zzb() ? this.zzv(zzcw0, zzts0.zza, zzts0.zzb, zzts0.zzc, v, zzts0.zzd) : this.zzw(zzcw0, zzts0.zza, v1, v, zzts0.zzd);
    }

    private final zzkr zzv(zzcw zzcw0, Object object0, int v, int v1, long v2, long v3) {
        zzts zzts0 = new zzts(object0, v, v1, v3);
        long v4 = zzcw0.zzn(zzts0.zza, this.zza).zzh(zzts0.zzb, zzts0.zzc);
        boolean z = v1 != this.zza.zze(v);
        return Long.compare(v4, 0x8000000000000001L) == 0 || v4 > 0L ? new zzkr(zzts0, 0L, v2, 0x8000000000000001L, v4, false, false, false, false) : new zzkr(zzts0, Math.max(0L, v4 - 1L), v2, 0x8000000000000001L, v4, false, false, false, false);
    }

    private final zzkr zzw(zzcw zzcw0, Object object0, long v, long v1, long v2) {
        zzcw0.zzn(object0, this.zza);
        zzts zzts0 = new zzts(object0, v2, -1);
        boolean z = zzkt.zzC(zzts0);
        boolean z1 = this.zzA(zzcw0, zzts0);
        boolean z2 = this.zzz(zzcw0, zzts0, z);
        long v3 = this.zza.zze;
        if(v3 != 0x8000000000000001L && v >= v3) {
            v = Math.max(0L, v3 - 1L);
        }
        return new zzkr(zzts0, v, v1, 0x8000000000000001L, v3, false, z, z1, z2);
    }

    private static zzts zzx(zzcw zzcw0, Object object0, long v, long v1, zzcv zzcv0, zzct zzct0) {
        zzcw0.zzn(object0, zzct0);
        zzcw0.zze(zzct0.zzd, zzcv0, 0L);
        zzcw0.zza(object0);
        zzcw0.zzn(object0, zzct0);
        int v2 = zzct0.zzd(v);
        return v2 == -1 ? new zzts(object0, v1, -1) : new zzts(object0, v2, zzct0.zze(v2), v1);
    }

    private final void zzy() {
        zzfua zzfua0 = new zzfua();
        for(zzkq zzkq0 = this.zzh; zzkq0 != null; zzkq0 = zzkq0.zzg()) {
            zzfua0.zzf(zzkq0.zzf.zza);
        }
        zzks zzks0 = () -> {
            zzfud zzfud0 = zzfua0.zzi();
            this.zzc.zzQ(zzfud0, (this.zzi == null ? null : this.zzi.zzf.zza));
        };
        this.zzd.zzh(zzks0);
    }

    private final boolean zzz(zzcw zzcw0, zzts zzts0, boolean z) {
        int v = zzcw0.zza(zzts0.zza);
        return !zzcw0.zze(zzcw0.zzd(v, this.zza, false).zzd, this.zzb, 0L).zzj && zzcw0.zzi(v, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }
}

