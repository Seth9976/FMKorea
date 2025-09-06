package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzacu {
    protected final zzace zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzacu(int v, int v1, long v2, int v3, zzace zzace0) {
        if(v1 != 1) {
            v1 = 2;
        }
        this.zzd = v2;
        this.zze = v3;
        this.zza = zzace0;
        this.zzb = v % 10 + 0x30 << 8 | v / 10 + 0x30 | (v1 == 2 ? 0x63640000 : 0x62770000);
        this.zzc = v1 == 2 ? v % 10 + 0x30 << 8 | v / 10 + 0x30 | 0x62640000 : -1;
        this.zzk = new long[0x200];
        this.zzl = new int[0x200];
    }

    public final zzaby zza(long v) {
        int v1 = (int)(v / this.zzj(1));
        int v2 = zzfk.zzb(this.zzl, v1, true, true);
        if(this.zzl[v2] == v1) {
            zzacb zzacb0 = this.zzk(v2);
            return new zzaby(zzacb0, zzacb0);
        }
        zzacb zzacb1 = this.zzk(v2);
        return v2 + 1 >= this.zzk.length ? new zzaby(zzacb1, zzacb1) : new zzaby(zzacb1, this.zzk(v2 + 1));
    }

    public final void zzb(long v) {
        if(this.zzj == this.zzl.length) {
            this.zzk = Arrays.copyOf(this.zzk, this.zzk.length * 3 / 2);
            this.zzl = Arrays.copyOf(this.zzl, this.zzl.length * 3 / 2);
        }
        int v1 = this.zzj;
        this.zzk[v1] = v;
        this.zzl[v1] = this.zzi;
        this.zzj = v1 + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        ++this.zzi;
    }

    public final void zze(int v) {
        this.zzf = v;
        this.zzg = v;
    }

    public final void zzf(long v) {
        if(this.zzj == 0) {
            this.zzh = 0;
            return;
        }
        this.zzh = this.zzl[zzfk.zzc(this.zzk, v, true, true)];
    }

    public final boolean zzg(int v) {
        return this.zzb == v || this.zzc == v;
    }

    public final boolean zzh(zzabc zzabc0) {
        int v = this.zzg - this.zza.zze(zzabc0, this.zzg, false);
        this.zzg = v;
        if(v == 0) {
            if(this.zzf > 0) {
                long v1 = this.zzj(this.zzh);
                int v2 = Arrays.binarySearch(this.zzl, this.zzh);
                this.zza.zzs(v1, (v2 < 0 ? 0 : 1), this.zzf, 0, null);
            }
            ++this.zzh;
        }
        return v == 0;
    }

    private static int zzi(int v, int v1) [...] // Inlined contents

    private final long zzj(int v) {
        return this.zzd * ((long)v) / ((long)this.zze);
    }

    private final zzacb zzk(int v) {
        return new zzacb(((long)this.zzl[v]) * this.zzj(1), this.zzk[v]);
    }
}

