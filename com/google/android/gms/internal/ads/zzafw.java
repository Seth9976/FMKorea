package com.google.android.gms.internal.ads;

final class zzafw {
    private static final long[] zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    static {
        zzafw.zza = new long[]{0x80L, 0x40L, 0x20L, 16L, 8L, 4L, 2L, 1L};
    }

    public zzafw() {
        this.zzb = new byte[8];
    }

    public final int zza() {
        return this.zzd;
    }

    public static int zzb(int v) {
        int v1 = 0;
        while(v1 < 8) {
            int v2 = Long.compare(zzafw.zza[v1] & ((long)v), 0L);
            ++v1;
            if(v2 != 0) {
                return v1;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    public static long zzc(byte[] arr_b, int v, boolean z) {
        long v1 = ((long)arr_b[0]) & 0xFFL;
        if(z) {
            v1 &= ~zzafw.zza[v - 1];
        }
        for(int v2 = 1; v2 < v; ++v2) {
            v1 = v1 << 8 | ((long)arr_b[v2]) & 0xFFL;
        }
        return v1;
    }

    public final long zzd(zzabc zzabc0, boolean z, boolean z1, int v) {
        if(this.zzc == 0) {
            if(!zzabc0.zzn(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int v1 = zzafw.zzb(this.zzb[0] & 0xFF);
            this.zzd = v1;
            if(v1 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int v2 = this.zzd;
        if(v2 > v) {
            this.zzc = 0;
            return -2L;
        }
        if(v2 != 1) {
            ((zzaar)zzabc0).zzn(this.zzb, 1, v2 - 1, false);
        }
        this.zzc = 0;
        return zzafw.zzc(this.zzb, this.zzd, z1);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}

