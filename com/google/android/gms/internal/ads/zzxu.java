package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzxu {
    private int zza;
    private int zzb;
    private int zzc;
    private zzxn[] zzd;

    public zzxu(boolean z, int v) {
        this.zzc = 0;
        this.zzd = new zzxn[100];
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.zzb * 0x10000;
    }

    public final zzxn zzb() {
        zzxn zzxn0;
        synchronized(this) {
            ++this.zzb;
            int v1 = this.zzc;
            if(v1 > 0) {
                zzxn[] arr_zzxn = this.zzd;
                this.zzc = v1 - 1;
                zzxn0 = arr_zzxn[v1 - 1];
                if(zzxn0 == null) {
                    throw null;
                }
                arr_zzxn[v1 - 1] = null;
                return zzxn0;
            }
            zzxn0 = new zzxn(new byte[0x10000], 0);
            zzxn[] arr_zzxn1 = this.zzd;
            if(this.zzb <= arr_zzxn1.length) {
                return zzxn0;
            }
            this.zzd = (zzxn[])Arrays.copyOf(arr_zzxn1, arr_zzxn1.length + arr_zzxn1.length);
            return zzxn0;
        }
    }

    public final void zzc(zzxn zzxn0) {
        synchronized(this) {
            int v1 = this.zzc;
            this.zzc = v1 + 1;
            this.zzd[v1] = zzxn0;
            --this.zzb;
            this.notifyAll();
        }
    }

    public final void zzd(zzxo zzxo0) {
        synchronized(this) {
            while(zzxo0 != null) {
                zzxn[] arr_zzxn = this.zzd;
                int v1 = this.zzc;
                this.zzc = v1 + 1;
                arr_zzxn[v1] = zzxo0.zzc();
                --this.zzb;
                zzxo0 = zzxo0.zzd();
            }
            this.notifyAll();
        }
    }

    public final void zze() {
        synchronized(this) {
            this.zzf(0);
        }
    }

    public final void zzf(int v) {
        synchronized(this) {
            int v2 = this.zza;
            this.zza = v;
            if(v < v2) {
                this.zzg();
            }
        }
    }

    public final void zzg() {
        synchronized(this) {
            int v1 = Math.max(0, (this.zza + 0xFFFF) / 0x10000 - this.zzb);
            int v2 = this.zzc;
            if(v1 >= v2) {
                return;
            }
            Arrays.fill(this.zzd, v1, v2, null);
            this.zzc = v1;
        }
    }
}

