package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzrq {
    private int zza;
    private int zzb;
    private int zzc;
    private int[] zzd;
    private int zze;

    public zzrq() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new int[16];
        this.zze = 15;
    }

    public final int zza() {
        int v = this.zzc;
        if(v == 0) {
            throw new NoSuchElementException();
        }
        int v1 = this.zza;
        this.zza = v1 + 1 & this.zze;
        this.zzc = v - 1;
        return this.zzd[v1];
    }

    public final void zzb(int v) {
        int[] arr_v = this.zzd;
        if(this.zzc == arr_v.length) {
            int v1 = arr_v.length + arr_v.length;
            if(v1 < 0) {
                throw new IllegalStateException();
            }
            int[] arr_v1 = new int[v1];
            int v2 = this.zza;
            int v3 = arr_v.length - v2;
            System.arraycopy(arr_v, v2, arr_v1, 0, v3);
            System.arraycopy(this.zzd, 0, arr_v1, v3, v2);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = arr_v1;
            this.zze = arr_v1.length - 1;
            arr_v = arr_v1;
        }
        int v4 = this.zzb + 1 & this.zze;
        this.zzb = v4;
        arr_v[v4] = v;
        ++this.zzc;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }
}

