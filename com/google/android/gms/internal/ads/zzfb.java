package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzfb {
    private static final zzfui zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    static {
        zzfb.zza = zzfui.zzo(zzfqu.zza, zzfqu.zzc, zzfqu.zzf, zzfqu.zzd, zzfqu.zze);
    }

    public zzfb() {
        this.zzb = zzfk.zzf;
    }

    public zzfb(int v) {
        this.zzb = new byte[v];
        this.zzd = v;
    }

    public zzfb(byte[] arr_b) {
        this.zzb = arr_b;
        this.zzd = arr_b.length;
    }

    public zzfb(byte[] arr_b, int v) {
        this.zzb = arr_b;
        this.zzd = v;
    }

    public final void zzA(int v) {
        byte[] arr_b = this.zzb;
        if(v > arr_b.length) {
            this.zzb = Arrays.copyOf(arr_b, v);
        }
    }

    public final void zzB(zzfa zzfa0, int v) {
        this.zzC(zzfa0.zza, 0, v);
        zzfa0.zzj(0);
    }

    public final void zzC(byte[] arr_b, int v, int v1) {
        System.arraycopy(this.zzb, this.zzc, arr_b, v, v1);
        this.zzc += v1;
    }

    public final void zzD(int v) {
        this.zzE((this.zzb.length >= v ? this.zzb : new byte[v]), v);
    }

    public final void zzE(byte[] arr_b, int v) {
        this.zzb = arr_b;
        this.zzd = v;
        this.zzc = 0;
    }

    public final void zzF(int v) {
        zzdy.zzd(v >= 0 && v <= this.zzb.length);
        this.zzd = v;
    }

    public final void zzG(int v) {
        zzdy.zzd(v >= 0 && v <= this.zzd);
        this.zzc = v;
    }

    public final void zzH(int v) {
        this.zzG(this.zzc + v);
    }

    public final byte[] zzI() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzd - this.zzc;
    }

    public final int zzb() {
        return this.zzb.length;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zzb[this.zzc] & 0xFF;
    }

    public final int zzf() {
        int v = this.zzc;
        this.zzc = v + 4;
        return this.zzb[v + 3] & 0xFF | ((this.zzb[v] & 0xFF) << 24 | (this.zzb[v + 1] & 0xFF) << 16 | (this.zzb[v + 2] & 0xFF) << 8);
    }

    public final int zzg() {
        int v = this.zzc;
        this.zzc = v + 3;
        return this.zzb[v + 2] & 0xFF | ((this.zzb[v] & 0xFF) << 24 >> 8 | (this.zzb[v + 1] & 0xFF) << 8);
    }

    public final int zzh() {
        int v = this.zzc;
        this.zzc = v + 4;
        return (this.zzb[v + 3] & 0xFF) << 24 | ((this.zzb[v + 1] & 0xFF) << 8 | this.zzb[v] & 0xFF | (this.zzb[v + 2] & 0xFF) << 16);
    }

    public final int zzi() {
        int v = this.zzh();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzj() {
        int v = this.zzc;
        this.zzc = v + 2;
        return (this.zzb[v + 1] & 0xFF) << 8 | this.zzb[v] & 0xFF;
    }

    public final int zzk() {
        return this.zzl() << 21 | this.zzl() << 14 | this.zzl() << 7 | this.zzl();
    }

    public final int zzl() {
        int v = this.zzc;
        this.zzc = v + 1;
        return this.zzb[v] & 0xFF;
    }

    public final int zzm() {
        int v = this.zzc;
        this.zzc = v + 4;
        return this.zzb[v + 1] & 0xFF | (this.zzb[v] & 0xFF) << 8;
    }

    public final int zzn() {
        int v = this.zzc;
        this.zzc = v + 3;
        return this.zzb[v + 2] & 0xFF | ((this.zzb[v] & 0xFF) << 16 | (this.zzb[v + 1] & 0xFF) << 8);
    }

    public final int zzo() {
        int v = this.zzf();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzp() {
        int v = this.zzc;
        this.zzc = v + 2;
        return this.zzb[v + 1] & 0xFF | (this.zzb[v] & 0xFF) << 8;
    }

    public final long zzq() {
        int v = this.zzc;
        this.zzc = v + 8;
        return (((long)this.zzb[v + 7]) & 0xFFL) << 56 | ((((long)this.zzb[v + 6]) & 0xFFL) << 0x30 | ((((long)this.zzb[v + 1]) & 0xFFL) << 8 | ((long)this.zzb[v]) & 0xFFL | (((long)this.zzb[v + 2]) & 0xFFL) << 16 | (((long)this.zzb[v + 3]) & 0xFFL) << 24 | (((long)this.zzb[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzb[v + 5]) & 0xFFL) << 40));
    }

    public final long zzr() {
        int v = this.zzc;
        this.zzc = v + 4;
        return (((long)this.zzb[v + 3]) & 0xFFL) << 24 | (((long)this.zzb[v]) & 0xFFL | (((long)this.zzb[v + 1]) & 0xFFL) << 8 | (((long)this.zzb[v + 2]) & 0xFFL) << 16);
    }

    public final long zzs() {
        int v = this.zzc;
        this.zzc = v + 8;
        return ((long)this.zzb[v + 7]) & 0xFFL | ((((long)this.zzb[v]) & 0xFFL) << 56 | (((long)this.zzb[v + 1]) & 0xFFL) << 0x30 | (((long)this.zzb[v + 2]) & 0xFFL) << 40 | (((long)this.zzb[v + 3]) & 0xFFL) << 0x20 | (((long)this.zzb[v + 4]) & 0xFFL) << 24 | (((long)this.zzb[v + 5]) & 0xFFL) << 16 | (((long)this.zzb[v + 6]) & 0xFFL) << 8);
    }

    public final long zzt() {
        int v = this.zzc;
        this.zzc = v + 4;
        return ((long)this.zzb[v + 3]) & 0xFFL | ((((long)this.zzb[v]) & 0xFFL) << 24 | (((long)this.zzb[v + 1]) & 0xFFL) << 16 | (((long)this.zzb[v + 2]) & 0xFFL) << 8);
    }

    public final long zzu() {
        long v = this.zzs();
        if(v < 0L) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final long zzv() {
        int v3;
        int v2;
        long v = (long)this.zzb[this.zzc];
        for(int v1 = 7; true; --v1) {
            v2 = 0;
            v3 = 1;
            if(v1 < 0) {
                break;
            }
            if((((long)(1 << v1)) & v) == 0L) {
                if(v1 < 6) {
                    v &= (long)((1 << v1) - 1);
                    v2 = 7 - v1;
                    break;
                }
                if(v1 != 7) {
                    break;
                }
                v2 = 1;
                break;
            }
        }
        if(v2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + v);
        }
        while(v3 < v2) {
            int v4 = this.zzb[this.zzc + v3];
            if((v4 & 0xC0) != 0x80) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + v);
            }
            v = v << 6 | ((long)(v4 & 0x3F));
            ++v3;
        }
        this.zzc += v2;
        return v;
    }

    public final String zzw(char c) {
        int v = this.zzc;
        if(this.zzd - v != 0) {
            while(v < this.zzd && this.zzb[v] != 0) {
                ++v;
            }
            String s = zzfk.zzx(this.zzb, this.zzc, v - this.zzc);
            this.zzc = v;
            if(v < this.zzd) {
                this.zzc = v + 1;
            }
            return s;
        }
        return null;
    }

    public final String zzx(int v) {
        if(v == 0) {
            return "";
        }
        int v1 = this.zzc + v - 1;
        String s = zzfk.zzx(this.zzb, this.zzc, (v1 >= this.zzd || this.zzb[v1] != 0 ? v : v - 1));
        this.zzc += v;
        return s;
    }

    public final String zzy(int v, Charset charset0) {
        int v1 = this.zzc;
        String s = new String(this.zzb, v1, v, charset0);
        this.zzc = v1 + v;
        return s;
    }

    public final short zzz() {
        int v = this.zzc;
        this.zzc = v + 2;
        return (short)(this.zzb[v + 1] & 0xFF | (this.zzb[v] & 0xFF) << 8);
    }
}

