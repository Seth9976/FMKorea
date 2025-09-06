package com.google.android.gms.internal.ads;

abstract class zzgqs extends zzgqx {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzgqs(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] arr_b = new byte[Math.max(v, 20)];
        this.zza = arr_b;
        this.zzb = arr_b.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqx
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzc(byte b) {
        int v = this.zzc;
        this.zzc = v + 1;
        this.zza[v] = b;
        ++this.zzd;
    }

    final void zzd(int v) {
        int v1 = this.zzc;
        this.zzc = v1 + 1;
        this.zza[v1] = (byte)(v & 0xFF);
        this.zzc = v1 + 2;
        this.zza[v1 + 1] = (byte)(v >> 8 & 0xFF);
        this.zzc = v1 + 3;
        this.zza[v1 + 2] = (byte)(v >> 16 & 0xFF);
        this.zzc = v1 + 4;
        this.zza[v1 + 3] = (byte)(v >> 24 & 0xFF);
        this.zzd += 4;
    }

    final void zze(long v) {
        int v1 = this.zzc;
        this.zzc = v1 + 1;
        this.zza[v1] = (byte)(((int)(v & 0xFFL)));
        this.zzc = v1 + 2;
        this.zza[v1 + 1] = (byte)(((int)(v >> 8 & 0xFFL)));
        this.zzc = v1 + 3;
        this.zza[v1 + 2] = (byte)(((int)(v >> 16 & 0xFFL)));
        this.zzc = v1 + 4;
        this.zza[v1 + 3] = (byte)(((int)(0xFFL & v >> 24)));
        this.zzc = v1 + 5;
        this.zza[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
        this.zzc = v1 + 6;
        this.zza[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
        this.zzc = v1 + 7;
        this.zza[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
        this.zzc = v1 + 8;
        this.zza[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        this.zzd += 8;
    }

    final void zzf(int v) {
        if(zzgqx.zzb) {
            long v1 = (long)this.zzc;
            while((v & 0xFFFFFF80) != 0) {
                int v2 = this.zzc;
                this.zzc = v2 + 1;
                zzguu.zzq(this.zza, ((long)v2), ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.zzc;
            this.zzc = v3 + 1;
            zzguu.zzq(this.zza, ((long)v3), ((byte)v));
            this.zzd += (int)(((long)this.zzc) - v1);
            return;
        }
        while((v & 0xFFFFFF80) != 0) {
            int v4 = this.zzc;
            this.zzc = v4 + 1;
            this.zza[v4] = (byte)(v & 0x7F | 0x80);
            ++this.zzd;
            v >>>= 7;
        }
        int v5 = this.zzc;
        this.zzc = v5 + 1;
        this.zza[v5] = (byte)v;
        ++this.zzd;
    }

    final void zzg(long v) {
        if(zzgqx.zzb) {
            long v1 = (long)this.zzc;
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.zzc;
                this.zzc = v2 + 1;
                zzguu.zzq(this.zza, ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.zzc;
            this.zzc = v3 + 1;
            zzguu.zzq(this.zza, ((long)v3), ((byte)(((int)v))));
            this.zzd += (int)(((long)this.zzc) - v1);
            return;
        }
        while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
            int v4 = this.zzc;
            this.zzc = v4 + 1;
            this.zza[v4] = (byte)(((int)v) & 0x7F | 0x80);
            ++this.zzd;
            v >>>= 7;
        }
        int v5 = this.zzc;
        this.zzc = v5 + 1;
        this.zza[v5] = (byte)(((int)v));
        ++this.zzd;
    }
}

