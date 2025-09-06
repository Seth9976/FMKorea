package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

final class zzlg {
    public final zzcw zza;
    public final zzts zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzil zzf;
    public final boolean zzg;
    public final zzvs zzh;
    public final zzxm zzi;
    public final List zzj;
    public final zzts zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzch zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    private static final zzts zzt;

    static {
        zzlg.zzt = new zzts(new Object());
    }

    public zzlg(zzcw zzcw0, zzts zzts0, long v, long v1, int v2, zzil zzil0, boolean z, zzvs zzvs0, zzxm zzxm0, List list0, zzts zzts1, boolean z1, int v3, zzch zzch0, long v4, long v5, long v6, long v7, boolean z2) {
        this.zza = zzcw0;
        this.zzb = zzts0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = zzil0;
        this.zzg = z;
        this.zzh = zzvs0;
        this.zzi = zzxm0;
        this.zzj = list0;
        this.zzk = zzts1;
        this.zzl = z1;
        this.zzm = v3;
        this.zzn = zzch0;
        this.zzp = v4;
        this.zzq = v5;
        this.zzr = v6;
        this.zzs = v7;
        this.zzo = z2;
    }

    public final long zza() {
        long v1;
        long v;
        if(this.zzk()) {
            do {
                v = this.zzs;
                v1 = this.zzr;
            }
            while(v != this.zzs);
            long v2 = SystemClock.elapsedRealtime();
            return zzfk.zzp(zzfk.zzr(v1) + ((long)(((float)(v2 - v)) * this.zzn.zzc)));
        }
        return this.zzr;
    }

    public final zzlg zzb() {
        long v = this.zzp;
        long v1 = this.zzq;
        long v2 = this.zza();
        long v3 = SystemClock.elapsedRealtime();
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, v, v1, v2, v3, this.zzo);
    }

    public final zzlg zzc(zzts zzts0) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzts0, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzd(zzts zzts0, long v, long v1, long v2, long v3, zzvs zzvs0, zzxm zzxm0, List list0) {
        long v4 = this.zzp;
        long v5 = SystemClock.elapsedRealtime();
        return new zzlg(this.zza, zzts0, v1, v2, this.zze, this.zzf, this.zzg, zzvs0, zzxm0, list0, this.zzk, this.zzl, this.zzm, this.zzn, v4, v3, v, v5, this.zzo);
    }

    public final zzlg zze(boolean z, int v) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, v, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzf(zzil zzil0) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzil0, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzg(int v) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, v, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzh(zzcw zzcw0) {
        return new zzlg(zzcw0, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public static zzlg zzi(zzxm zzxm0) {
        return new zzlg(zzcw.zza, zzlg.zzt, 0x8000000000000001L, 0L, 1, null, false, zzvs.zza, zzxm0, zzfud.zzl(), zzlg.zzt, false, 0, zzch.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzts zzj() {
        return zzlg.zzt;
    }

    public final boolean zzk() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}

