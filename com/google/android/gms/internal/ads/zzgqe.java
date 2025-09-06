package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

class zzgqe extends zzgqd {
    protected final byte[] zza;

    zzgqe(byte[] arr_b) {
        arr_b.getClass();
        this.zza = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgqi)) {
            return false;
        }
        if(this.zzd() != ((zzgqi)object0).zzd()) {
            return false;
        }
        if(this.zzd() == 0) {
            return true;
        }
        if(object0 instanceof zzgqe) {
            int v = this.zzr();
            int v1 = ((zzgqe)object0).zzr();
            return v == 0 || v1 == 0 || v == v1 ? this.zzg(((zzgqe)object0), 0, this.zzd()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public byte zza(int v) {
        return this.zza[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    byte zzb(int v) {
        return this.zza[v];
    }

    protected int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public int zzd() {
        return this.zza.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected void zze(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.zza, v, arr_b, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqd
    final boolean zzg(zzgqi zzgqi0, int v, int v1) {
        if(v1 > zzgqi0.zzd()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.zzd());
        }
        int v2 = v + v1;
        if(v2 > zzgqi0.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + zzgqi0.zzd());
        }
        if(zzgqi0 instanceof zzgqe) {
            byte[] arr_b = this.zza;
            byte[] arr_b1 = ((zzgqe)zzgqi0).zza;
            int v3 = this.zzc();
            int v4 = this.zzc();
            for(int v5 = ((zzgqe)zzgqi0).zzc() + v; v4 < v3 + v1; ++v5) {
                if(arr_b[v4] != arr_b1[v5]) {
                    return false;
                }
                ++v4;
            }
            return true;
        }
        return zzgqi0.zzk(v, v2).equals(this.zzk(0, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final int zzi(int v, int v1, int v2) {
        return zzgsa.zzb(v, this.zza, this.zzc() + v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final int zzj(int v, int v1, int v2) {
        int v3 = this.zzc();
        return zzguz.zzf(v, this.zza, v3 + v1, v2 + (v3 + v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final zzgqi zzk(int v, int v1) {
        int v2 = zzgqi.zzq(v, v1, this.zzd());
        return v2 == 0 ? zzgqi.zzb : new zzgqb(this.zza, this.zzc() + v, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final zzgqq zzl() {
        int v = this.zzd();
        return zzgqq.zzI(this.zza, this.zzc(), v, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final String zzm(Charset charset0) {
        int v = this.zzd();
        return new String(this.zza, this.zzc(), v, charset0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final ByteBuffer zzn() {
        int v = this.zzd();
        return ByteBuffer.wrap(this.zza, this.zzc(), v).asReadOnlyBuffer();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    final void zzo(zzgpx zzgpx0) {
        int v = this.zzd();
        zzgpx0.zza(this.zza, this.zzc(), v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final boolean zzp() {
        int v = this.zzc();
        int v1 = this.zzd();
        return zzguz.zzj(this.zza, v, v1 + v);
    }
}

