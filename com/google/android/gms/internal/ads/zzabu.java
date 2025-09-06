package com.google.android.gms.internal.ads;

public final class zzabu {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int v) {
        if(!zzabv.zzd(v)) {
            return false;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return false;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return false;
        }
        int v3 = v >>> 12 & 15;
        if(v3 != 0 && v3 != 15) {
            int v4 = v >>> 10 & 3;
            if(v4 == 3) {
                return false;
            }
            this.zza = v1;
            this.zzb = zzabv.zzk()[3 - v2];
            int v5 = zzabv.zzj()[v4];
            this.zzd = v5;
            int v6 = 2;
            if(v1 == 2) {
                v5 /= 2;
                this.zzd = v5;
            }
            else if(v1 == 0) {
                v5 /= 4;
                this.zzd = v5;
            }
            int v7 = 0x90;
            int v8 = v >>> 9 & 1;
            this.zzg = zzabv.zza(v1, v2);
            if(v2 == 3) {
                int v9 = v1 == 3 ? zzabv.zze()[v3 - 1] : zzabv.zzi()[v3 - 1];
                this.zzf = v9;
                this.zzc = (v9 * 12 / v5 + v8) * 4;
            }
            else if(v1 == 3) {
                int v10 = v2 == 2 ? zzabv.zzf()[v3 - 1] : zzabv.zzg()[v3 - 1];
                this.zzf = v10;
                this.zzc = v10 * 0x90 / v5 + v8;
            }
            else {
                int v11 = zzabv.zzh()[v3 - 1];
                this.zzf = v11;
                if(v2 == 1) {
                    v7 = 72;
                }
                this.zzc = v7 * v11 / v5 + v8;
            }
            if((v >> 6 & 3) == 3) {
                v6 = 1;
            }
            this.zze = v6;
            return true;
        }
        return false;
    }
}

