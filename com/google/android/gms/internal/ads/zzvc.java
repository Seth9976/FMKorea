package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class zzvc {
    private final zzfb zza;
    private zzvb zzb;
    private zzvb zzc;
    private zzvb zzd;
    private long zze;
    private final zzxu zzf;

    public zzvc(zzxu zzxu0) {
        this.zzf = zzxu0;
        this.zza = new zzfb(0x20);
        zzvb zzvb0 = new zzvb(0L, 0x10000);
        this.zzb = zzvb0;
        this.zzc = zzvb0;
        this.zzd = zzvb0;
    }

    public final int zza(zzt zzt0, int v, boolean z) {
        int v1 = this.zzi(v);
        int v2 = zzt0.zza(this.zzd.zzc.zza, this.zzd.zza(this.zze), v1);
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        this.zzn(v2);
        return v2;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long v) {
        zzvb zzvb0;
        if(v != -1L) {
            while(true) {
                zzvb0 = this.zzb;
                if(v < zzvb0.zzb) {
                    break;
                }
                this.zzf.zzc(zzvb0.zzc);
                this.zzb = this.zzb.zzb();
            }
            if(this.zzc.zza < zzvb0.zza) {
                this.zzc = zzvb0;
            }
        }
    }

    public final void zzd(zzht zzht0, zzve zzve0) {
        zzvc.zzm(this.zzc, zzht0, zzve0, this.zza);
    }

    public final void zze(zzht zzht0, zzve zzve0) {
        this.zzc = zzvc.zzm(this.zzc, zzht0, zzve0, this.zza);
    }

    public final void zzf() {
        zzvb zzvb0 = this.zzb;
        if(zzvb0.zzc != null) {
            this.zzf.zzd(zzvb0);
            zzvb0.zzb();
        }
        this.zzb.zze(0L, 0x10000);
        this.zzc = this.zzb;
        this.zzd = this.zzb;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfb zzfb0, int v) {
        while(v > 0) {
            int v1 = this.zzi(v);
            zzfb0.zzC(this.zzd.zzc.zza, this.zzd.zza(this.zze), v1);
            v -= v1;
            this.zzn(v1);
        }
    }

    private final int zzi(int v) {
        zzvb zzvb0 = this.zzd;
        if(zzvb0.zzc == null) {
            zzxn zzxn0 = this.zzf.zzb();
            zzvb zzvb1 = new zzvb(this.zzd.zzb, 0x10000);
            zzvb0.zzc = zzxn0;
            zzvb0.zzd = zzvb1;
        }
        return Math.min(v, ((int)(this.zzd.zzb - this.zze)));
    }

    private static zzvb zzj(zzvb zzvb0, long v) {
        while(v >= zzvb0.zzb) {
            zzvb0 = zzvb0.zzd;
        }
        return zzvb0;
    }

    private static zzvb zzk(zzvb zzvb0, long v, ByteBuffer byteBuffer0, int v1) {
        zzvb zzvb1 = zzvc.zzj(zzvb0, v);
        while(v1 > 0) {
            int v2 = Math.min(v1, ((int)(zzvb1.zzb - v)));
            byteBuffer0.put(zzvb1.zzc.zza, zzvb1.zza(v), v2);
            v1 -= v2;
            v += (long)v2;
            if(v == zzvb1.zzb) {
                zzvb1 = zzvb1.zzd;
            }
        }
        return zzvb1;
    }

    private static zzvb zzl(zzvb zzvb0, long v, byte[] arr_b, int v1) {
        zzvb zzvb1 = zzvc.zzj(zzvb0, v);
        int v2 = v1;
        while(v2 > 0) {
            int v3 = Math.min(v2, ((int)(zzvb1.zzb - v)));
            System.arraycopy(zzvb1.zzc.zza, zzvb1.zza(v), arr_b, v1 - v2, v3);
            v2 -= v3;
            v += (long)v3;
            if(v == zzvb1.zzb) {
                zzvb1 = zzvb1.zzd;
            }
        }
        return zzvb1;
    }

    private static zzvb zzm(zzvb zzvb0, zzht zzht0, zzve zzve0, zzfb zzfb0) {
        int v5;
        zzvb zzvb2;
        if(zzht0.zzl()) {
            long v = zzve0.zzb;
            zzfb0.zzD(1);
            zzvb zzvb1 = zzvc.zzl(zzvb0, v, zzfb0.zzI(), 1);
            byte[] arr_b = zzfb0.zzI();
            int v2 = arr_b[0] & 0x80;
            int v3 = arr_b[0] & 0x7F;
            zzhq zzhq0 = zzht0.zza;
            byte[] arr_b1 = zzhq0.zza;
            if(arr_b1 == null) {
                zzhq0.zza = new byte[16];
            }
            else {
                Arrays.fill(arr_b1, 0);
            }
            zzvb2 = zzvc.zzl(zzvb1, v + 1L, zzhq0.zza, v3);
            long v4 = v + 1L + ((long)v3);
            if(v2 == 0) {
                v5 = 1;
            }
            else {
                zzfb0.zzD(2);
                zzvb2 = zzvc.zzl(zzvb2, v4, zzfb0.zzI(), 2);
                v4 += 2L;
                v5 = zzfb0.zzp();
            }
            int[] arr_v = zzhq0.zzd != null && zzhq0.zzd.length >= v5 ? zzhq0.zzd : new int[v5];
            int[] arr_v1 = zzhq0.zze != null && zzhq0.zze.length >= v5 ? zzhq0.zze : new int[v5];
            if(v2 == 0) {
                arr_v[0] = 0;
                arr_v1[0] = zzve0.zza - ((int)(v4 - zzve0.zzb));
            }
            else {
                zzfb0.zzD(v5 * 6);
                zzvb2 = zzvc.zzl(zzvb2, v4, zzfb0.zzI(), v5 * 6);
                v4 += (long)(v5 * 6);
                zzfb0.zzG(0);
                for(int v1 = 0; v1 < v5; ++v1) {
                    arr_v[v1] = zzfb0.zzp();
                    arr_v1[v1] = zzfb0.zzo();
                }
            }
            zzhq0.zzc(v5, arr_v, arr_v1, zzve0.zzc.zzb, zzhq0.zza, zzve0.zzc.zza, zzve0.zzc.zzc, zzve0.zzc.zzd);
            int v6 = (int)(v4 - zzve0.zzb);
            zzve0.zzb += (long)v6;
            zzve0.zza -= v6;
        }
        else {
            zzvb2 = zzvb0;
        }
        if(zzht0.zze()) {
            zzfb0.zzD(4);
            zzvb zzvb3 = zzvc.zzl(zzvb2, zzve0.zzb, zzfb0.zzI(), 4);
            int v7 = zzfb0.zzo();
            zzve0.zzb += 4L;
            zzve0.zza -= 4;
            zzht0.zzj(v7);
            zzvb zzvb4 = zzvc.zzk(zzvb3, zzve0.zzb, zzht0.zzb, v7);
            zzve0.zzb += (long)v7;
            int v8 = zzve0.zza - v7;
            zzve0.zza = v8;
            if(zzht0.zze != null && zzht0.zze.capacity() >= v8) {
                zzht0.zze.clear();
                return zzvc.zzk(zzvb4, zzve0.zzb, zzht0.zze, zzve0.zza);
            }
            zzht0.zze = ByteBuffer.allocate(v8);
            return zzvc.zzk(zzvb4, zzve0.zzb, zzht0.zze, zzve0.zza);
        }
        zzht0.zzj(zzve0.zza);
        return zzvc.zzk(zzvb2, zzve0.zzb, zzht0.zzb, zzve0.zza);
    }

    private final void zzn(int v) {
        long v1 = this.zze + ((long)v);
        this.zze = v1;
        zzvb zzvb0 = this.zzd;
        if(v1 == zzvb0.zzb) {
            this.zzd = zzvb0.zzd;
        }
    }
}

