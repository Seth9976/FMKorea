package com.google.android.gms.internal.ads;

final class zzgqt extends zzgqx {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzgqt(byte[] arr_b, int v, int v1) {
        super(null);
        if((arr_b.length - v1 | v1) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v1));
        }
        this.zza = arr_b;
        this.zzc = 0;
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzI() {
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzJ(byte b) {
        try {
            int v = this.zzc;
            this.zzc = v + 1;
            this.zza[v] = b;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", this.zzc, this.zzb, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzK(int v, boolean z) {
        this.zzs(v << 3);
        this.zzJ(((byte)z));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzL(int v, zzgqi zzgqi0) {
        this.zzs(v << 3 | 2);
        this.zzs(zzgqi0.zzd());
        zzgqi0.zzo(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zza(byte[] arr_b, int v, int v1) {
        this.zze(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] arr_b, int v, int v1) {
        try {
            System.arraycopy(arr_b, v, this.zza, this.zzc, v1);
            this.zzc += v1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", this.zzc, this.zzb, v1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzh(int v, int v1) {
        this.zzs(v << 3 | 5);
        this.zzi(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzi(int v) {
        try {
            int v1 = this.zzc;
            this.zzc = v1 + 1;
            this.zza[v1] = (byte)(v & 0xFF);
            this.zzc = v1 + 2;
            this.zza[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.zzc = v1 + 3;
            this.zza[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.zzc = v1 + 4;
            this.zza[v1 + 3] = (byte)(v >> 24 & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", this.zzc, this.zzb, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzj(int v, long v1) {
        this.zzs(v << 3 | 1);
        this.zzk(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzk(long v) {
        try {
            int v1 = this.zzc;
            this.zzc = v1 + 1;
            this.zza[v1] = (byte)(((int)v) & 0xFF);
            this.zzc = v1 + 2;
            this.zza[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
            this.zzc = v1 + 3;
            this.zza[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
            this.zzc = v1 + 4;
            this.zza[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
            this.zzc = v1 + 5;
            this.zza[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.zzc = v1 + 6;
            this.zza[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.zzc = v1 + 7;
            this.zza[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.zzc = v1 + 8;
            this.zza[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", this.zzc, this.zzb, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzl(int v, int v1) {
        this.zzs(v << 3);
        this.zzm(v1);
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
        this.zzp(s);
    }

    public final void zzp(String s) {
        int v;
        try {
            v = this.zzc;
            int v1 = zzgqx.zzA(s.length());
            if(v1 == zzgqx.zzA(s.length() * 3)) {
                int v2 = v + v1;
                this.zzc = v2;
                int v3 = zzguz.zzd(s, this.zza, v2, this.zzb - v2);
                this.zzc = v;
                this.zzs(v3 - v - v1);
                this.zzc = v3;
                return;
            }
            this.zzs(zzguz.zze(s));
            this.zzc = zzguz.zzd(s, this.zza, this.zzc, this.zzb - this.zzc);
            return;
        }
        catch(zzguy zzguy0) {
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgqu(indexOutOfBoundsException0);
        }
        this.zzc = v;
        this.zzE(s, zzguy0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzq(int v, int v1) {
        this.zzs(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzr(int v, int v1) {
        this.zzs(v << 3);
        this.zzs(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzs(int v) {
        try {
            while(true) {
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.zzc;
                    this.zzc = v1 + 1;
                    this.zza[v1] = (byte)v;
                    return;
                }
                int v2 = this.zzc;
                this.zzc = v2 + 1;
                this.zza[v2] = (byte)(v & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", this.zzc, this.zzb, 1), indexOutOfBoundsException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzt(int v, long v1) {
        this.zzs(v << 3);
        this.zzu(v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final void zzu(long v) {
        if(zzgqx.zzb && this.zzb - this.zzc >= 10) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v1 = this.zzc;
                this.zzc = v1 + 1;
                zzguu.zzq(this.zza, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v2 = this.zzc;
            this.zzc = v2 + 1;
            zzguu.zzq(this.zza, ((long)v2), ((byte)(((int)v))));
            return;
        }
        try {
            while(true) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    int v3 = this.zzc;
                    this.zzc = v3 + 1;
                    this.zza[v3] = (byte)(((int)v));
                    return;
                }
                int v4 = this.zzc;
                this.zzc = v4 + 1;
                this.zza[v4] = (byte)(((int)v) & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new zzgqu(String.format("Pos: %d, limit: %d, len: %d", this.zzc, this.zzb, 1), indexOutOfBoundsException0);
    }
}

