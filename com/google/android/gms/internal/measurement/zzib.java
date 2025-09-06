package com.google.android.gms.internal.measurement;

public abstract class zzib {
    int zza;
    int zzb;
    zzif zzc;
    private static volatile int zzd = 100;
    private int zze;
    private boolean zzf;

    static {
    }

    private zzib() {
        this.zzb = zzib.zzd;
        this.zze = 0x7FFFFFFF;
        this.zzf = false;
    }

    zzib(zzic zzic0) {
    }

    public static long zza(long v) [...] // Inlined contents

    static zzib zza(byte[] arr_b, int v, int v1, boolean z) {
        zzib zzib0 = new zzia(arr_b, 0, v1, false, null);
        try {
            zzib0.zza(v1);
            return zzib0;
        }
        catch(zzji zzji0) {
            throw new IllegalArgumentException(zzji0);
        }
    }

    public abstract double zza();

    public abstract int zza(int arg1);

    public abstract float zzb();

    public abstract void zzb(int arg1);

    public abstract int zzc();

    public abstract void zzc(int arg1);

    public abstract int zzd();

    public abstract boolean zzd(int arg1);

    public static int zze(int v) [...] // Inlined contents

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzhm zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();
}

