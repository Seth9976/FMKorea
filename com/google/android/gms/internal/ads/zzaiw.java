package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class zzaiw {
    private final zzace zza;
    private final SparseArray zzb;
    private final SparseArray zzc;
    private final zzfz zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzaiv zzi;
    private final zzaiv zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;

    public zzaiw(zzace zzace0, boolean z, boolean z1) {
        this.zza = zzace0;
        this.zzb = new SparseArray();
        this.zzc = new SparseArray();
        this.zzi = new zzaiv(null);
        this.zzj = new zzaiv(null);
        byte[] arr_b = new byte[0x80];
        this.zze = arr_b;
        this.zzd = new zzfz(arr_b, 0, 0);
        this.zzk = false;
    }

    public final void zza(long v) {
        this.zzg = v;
        this.zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzfw zzfw0) {
        this.zzc.append(zzfw0.zza, zzfw0);
    }

    public final void zzc(zzfx zzfx0) {
        this.zzb.append(zzfx0.zzd, zzfx0);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long v, int v1, long v2) {
        this.zzf = v1;
        this.zzh = v2;
        this.zzg = v;
    }

    public final boolean zzf(long v, int v1, boolean z, boolean z1) {
        boolean z2 = false;
        if(this.zzf == 9) {
            if(z && this.zzk) {
                this.zzg(v1 + ((int)(v - this.zzg)));
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z3 = this.zzn;
        if(this.zzf == 5 || z1 && this.zzf == 1) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        this.zzn = z4;
        return z4;
    }

    private final void zzg(int v) {
        long v1 = this.zzm;
        if(v1 == 0x8000000000000001L) {
            return;
        }
        this.zza.zzs(v1, ((int)this.zzn), ((int)(this.zzg - this.zzl)), v, null);
    }
}

