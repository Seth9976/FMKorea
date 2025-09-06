package com.google.android.gms.internal.ads;

import java.io.OutputStream;

final class zzgqv extends zzgqs {
    private final OutputStream zzg;

    zzgqv(OutputStream outputStream0, int v) {
        super(v);
        this.zzg = outputStream0;
    }

    private final void zzG() {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int v) {
        if(this.zzb - this.zzc < v) {
            this.zzG();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzI() {
        if(this.zzc > 0) {
            this.zzG();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzJ(byte b) {
        if(this.zzc == this.zzb) {
            this.zzG();
        }
        this.zzc(b);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzK(int v, boolean z) {
        this.zzH(11);
        this.zzf(v << 3);
        this.zzc(((byte)z));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzL(int v, zzgqi zzgqi0) {
        this.zzs(v << 3 | 2);
        this.zzs(zzgqi0.zzd());
        zzgqi0.zzo(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zza(byte[] arr_b, int v, int v1) {
        this.zzp(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzh(int v, int v1) {
        this.zzH(14);
        this.zzf(v << 3 | 5);
        this.zzd(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzi(int v) {
        this.zzH(4);
        this.zzd(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzj(int v, long v1) {
        this.zzH(18);
        this.zzf(v << 3 | 1);
        this.zze(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzk(long v) {
        this.zzH(8);
        this.zze(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzl(int v, int v1) {
        this.zzH(20);
        this.zzf(v << 3);
        if(v1 >= 0) {
            this.zzf(v1);
            return;
        }
        this.zzg(((long)v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzm(int v) {
        if(v >= 0) {
            this.zzs(v);
            return;
        }
        this.zzu(((long)v));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    final void zzn(int v, zzgta zzgta0, zzgtt zzgtt0) {
        this.zzs(v << 3 | 2);
        this.zzs(((zzgpr)zzgta0).zzat(zzgtt0));
        zzgtt0.zzm(zzgta0, this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzo(int v, String s) {
        this.zzs(v << 3 | 2);
        this.zzv(s);
    }

    public final void zzp(byte[] arr_b, int v, int v1) {
        int v2 = this.zzc;
        int v3 = this.zzb - v2;
        if(v3 >= v1) {
            System.arraycopy(arr_b, v, this.zza, v2, v1);
            this.zzc += v1;
            this.zzd += v1;
            return;
        }
        System.arraycopy(arr_b, v, this.zza, v2, v3);
        int v4 = v + v3;
        this.zzc = this.zzb;
        this.zzd += v3;
        this.zzG();
        int v5 = v1 - v3;
        if(v5 <= this.zzb) {
            System.arraycopy(arr_b, v4, this.zza, 0, v5);
            this.zzc = v5;
        }
        else {
            this.zzg.write(arr_b, v4, v5);
        }
        this.zzd += v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzq(int v, int v1) {
        this.zzs(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzr(int v, int v1) {
        this.zzH(20);
        this.zzf(v << 3);
        this.zzf(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzs(int v) {
        this.zzH(5);
        this.zzf(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzt(int v, long v1) {
        this.zzH(20);
        this.zzf(v << 3);
        this.zzg(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzu(long v) {
        this.zzH(10);
        this.zzg(v);
    }

    public final void zzv(String s) {
        int v9;
        int v6;
        int v5;
        try {
            int v = s.length();
            int v1 = zzgqx.zzA(v * 3);
            int v2 = v1 + v * 3;
            int v3 = this.zzb;
            if(v2 > v3) {
                byte[] arr_b = new byte[v * 3];
                int v4 = zzguz.zzd(s, arr_b, 0, v * 3);
                this.zzs(v4);
                this.zzp(arr_b, 0, v4);
                return;
            }
            if(v2 > v3 - this.zzc) {
                this.zzG();
            }
            v5 = zzgqx.zzA(s.length());
            v6 = this.zzc;
            if(v5 == v1) {
                goto label_15;
            }
            else {
                goto label_23;
            }
            this.zzd += v9;
        }
        catch(zzguy zzguy0) {
            this.zzE(s, zzguy0);
        }
        return;
        try {
        label_15:
            int v7 = v6 + v5;
            this.zzc = v7;
            int v8 = zzguz.zzd(s, this.zza, v7, this.zzb - v7);
            this.zzc = v6;
            v9 = v8 - v6 - v5;
            this.zzf(v9);
            this.zzc = v8;
            this.zzd += v9;
            return;
        label_23:
            v9 = zzguz.zze(s);
            this.zzf(v9);
            this.zzc = zzguz.zzd(s, this.zza, this.zzc, v9);
            this.zzd += v9;
            return;
        }
        catch(zzguy zzguy1) {
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new zzgqu(arrayIndexOutOfBoundsException0);
        }
        try {
            this.zzd -= this.zzc - v6;
            this.zzc = v6;
            throw zzguy1;
        }
        catch(zzguy zzguy0) {
        }
        this.zzE(s, zzguy0);
    }
}

