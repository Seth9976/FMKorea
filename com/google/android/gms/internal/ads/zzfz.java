package com.google.android.gms.internal.ads;

public final class zzfz {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzfz(byte[] arr_b, int v, int v1) {
        this.zza = arr_b;
        this.zzc = v;
        this.zzb = v1;
        this.zzd = 0;
        this.zzh();
    }

    public final int zza(int v) {
        int v3;
        int v2;
        this.zzd += v;
        int v1 = 0;
        while(true) {
            v2 = this.zzd;
            v3 = 2;
            if(v2 <= 8) {
                break;
            }
            this.zzd = v2 - 8;
            int v4 = this.zzc;
            v1 |= (this.zza[v4] & 0xFF) << v2 - 8;
            if(!this.zzi(v4 + 1)) {
                v3 = 1;
            }
            this.zzc = v4 + v3;
        }
        int v5 = this.zzc;
        int v6 = v1 | (this.zza[v5] & 0xFF) >> 8 - v2;
        if(v2 == 8) {
            this.zzd = 0;
            if(!this.zzi(v5 + 1)) {
                v3 = 1;
            }
            this.zzc = v5 + v3;
        }
        this.zzh();
        return -1 >>> 0x20 - v & v6;
    }

    public final int zzb() {
        int v = this.zzg();
        return (v % 2 == 0 ? -1 : 1) * ((v + 1) / 2);
    }

    public final int zzc() {
        return this.zzg();
    }

    public final void zzd() {
        int v = 1;
        int v1 = this.zzd + 1;
        this.zzd = v1;
        if(v1 == 8) {
            this.zzd = 0;
            int v2 = this.zzc;
            if(this.zzi(v2 + 1)) {
                v = 2;
            }
            this.zzc = v2 + v;
        }
        this.zzh();
    }

    public final void zze(int v) {
        int v1 = this.zzc;
        int v2 = v1 + v / 8;
        this.zzc = v2;
        int v3 = this.zzd + (v - v / 8 * 8);
        this.zzd = v3;
        if(v3 > 7) {
            this.zzc = v2 + 1;
            this.zzd = v3 - 8;
        }
        while(true) {
            ++v1;
            if(v1 > this.zzc) {
                break;
            }
            if(this.zzi(v1)) {
                ++this.zzc;
                v1 += 2;
            }
        }
        this.zzh();
    }

    public final boolean zzf() {
        int v = this.zza[this.zzc] & 0x80 >> this.zzd;
        this.zzd();
        return v != 0;
    }

    private final int zzg() {
        int v = 0;
        int v1;
        for(v1 = 0; !this.zzf(); ++v1) {
        }
        if(v1 > 0) {
            v = this.zza(v1);
        }
        return (1 << v1) - 1 + v;
    }

    private final void zzh() {
        zzdy.zzf(this.zzc >= 0 && (this.zzc < this.zzb || this.zzc == this.zzb && this.zzd == 0));
    }

    private final boolean zzi(int v) {
        return v >= 2 && v < this.zzb && (this.zza[v] == 3 && this.zza[v - 2] == 0 && this.zza[v - 1] == 0);
    }
}

