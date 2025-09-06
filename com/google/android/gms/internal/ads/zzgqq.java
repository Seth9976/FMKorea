package com.google.android.gms.internal.ads;

import java.io.InputStream;

public abstract class zzgqq {
    int zza;
    final int zzb;
    zzgqr zzc;
    public static final int zzd = 0;
    private static volatile int zze = 100;

    static {
    }

    zzgqq(zzgqp zzgqp0) {
        this.zzb = zzgqq.zze;
    }

    public abstract void zzA(int arg1);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int arg1);

    public static int zzF(int v) [...] // Inlined contents

    public static long zzG(long v) [...] // Inlined contents

    public static zzgqq zzH(InputStream inputStream0, int v) {
        return new zzgqo(inputStream0, 0x1000, null);
    }

    static zzgqq zzI(byte[] arr_b, int v, int v1, boolean z) {
        zzgqq zzgqq0 = new zzgqk(arr_b, v, v1, z, null);
        try {
            ((zzgqk)zzgqq0).zze(v1);
            return zzgqq0;
        }
        catch(zzgsc zzgsc0) {
            throw new IllegalArgumentException(zzgsc0);
        }
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int arg1);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzgqi zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int arg1);
}

