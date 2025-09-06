package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzabo {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzabn zzk;
    private final zzbz zzl;

    private zzabo(int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, zzabn zzabn0, zzbz zzbz0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = zzabo.zzi(v4);
        this.zzg = v5;
        this.zzh = v6;
        this.zzi = zzabo.zzh(v6);
        this.zzj = v7;
        this.zzk = zzabn0;
        this.zzl = zzbz0;
    }

    public zzabo(byte[] arr_b, int v) {
        zzfa zzfa0 = new zzfa(arr_b, arr_b.length);
        zzfa0.zzj(v * 8);
        this.zza = zzfa0.zzd(16);
        this.zzb = zzfa0.zzd(16);
        this.zzc = zzfa0.zzd(24);
        this.zzd = zzfa0.zzd(24);
        int v1 = zzfa0.zzd(20);
        this.zze = v1;
        this.zzf = zzabo.zzi(v1);
        this.zzg = zzfa0.zzd(3) + 1;
        int v2 = zzfa0.zzd(5);
        this.zzh = v2 + 1;
        this.zzi = zzabo.zzh(v2 + 1);
        this.zzj = (((long)zzfa0.zzd(4)) & 0xFFFFFFFFL) << 0x20 | ((long)zzfa0.zzd(0x20)) & 0xFFFFFFFFL;
        this.zzk = null;
        this.zzl = null;
    }

    public final long zza() {
        return this.zzj == 0L ? 0x8000000000000001L : this.zzj * 1000000L / ((long)this.zze);
    }

    public final long zzb(long v) {
        return Math.max(0L, Math.min(v * ((long)this.zze) / 1000000L, this.zzj - 1L));
    }

    public final zzam zzc(byte[] arr_b, zzbz zzbz0) {
        arr_b[4] = (byte)0x80;
        zzbz zzbz1 = this.zzd(zzbz0);
        zzak zzak0 = new zzak();
        zzak0.zzS("audio/flac");
        zzak0.zzL((this.zzd > 0 ? this.zzd : -1));
        zzak0.zzw(this.zzg);
        zzak0.zzT(this.zze);
        zzak0.zzI(Collections.singletonList(arr_b));
        zzak0.zzM(zzbz1);
        return zzak0.zzY();
    }

    public final zzbz zzd(zzbz zzbz0) {
        return this.zzl == null ? zzbz0 : this.zzl.zzd(zzbz0);
    }

    public final zzabo zze(List list0) {
        zzbz zzbz0 = this.zzd(new zzbz(list0));
        return new zzabo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzbz0);
    }

    public final zzabo zzf(zzabn zzabn0) {
        return new zzabo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzabn0, this.zzl);
    }

    public final zzabo zzg(List list0) {
        zzbz zzbz0 = this.zzd(zzack.zzb(list0));
        return new zzabo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzbz0);
    }

    private static int zzh(int v) {
        switch(v) {
            case 8: {
                return 1;
            }
            case 12: {
                return 2;
            }
            case 16: {
                return 4;
            }
            case 20: {
                return 5;
            }
            case 24: {
                return 6;
            }
            default: {
                return -1;
            }
        }
    }

    private static int zzi(int v) {
        switch(v) {
            case 8000: {
                return 4;
            }
            case 16000: {
                return 5;
            }
            case 22050: {
                return 6;
            }
            case 24000: {
                return 7;
            }
            case 32000: {
                return 8;
            }
            case 44100: {
                return 9;
            }
            case 48000: {
                return 10;
            }
            case 88200: {
                return 1;
            }
            case 96000: {
                return 11;
            }
            case 176400: {
                return 2;
            }
            case 192000: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }
}

