package com.google.android.gms.internal.measurement;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class zzjk extends Enum {
    public static final enum zzjk zza;
    public static final enum zzjk zzb;
    public static final enum zzjk zzc;
    public static final enum zzjk zzd;
    public static final enum zzjk zze;
    public static final enum zzjk zzf;
    public static final enum zzjk zzg;
    public static final enum zzjk zzh;
    public static final enum zzjk zzi;
    public static final enum zzjk zzj;
    private static final zzjk[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzjk.zza = new zzjk("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        zzjk.zzb = new zzjk("INT", 1, class0, Integer.class, 0);
        zzjk.zzc = new zzjk("LONG", 2, Long.TYPE, Long.class, 0L);
        zzjk.zzd = new zzjk("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        zzjk.zze = new zzjk("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        zzjk.zzf = new zzjk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzjk.zzg = new zzjk("STRING", 6, String.class, String.class, "");
        zzjk.zzh = new zzjk("BYTE_STRING", 7, zzhm.class, zzhm.class, zzhm.zza);
        zzjk.zzi = new zzjk("ENUM", 8, class0, Integer.class, null);
        zzjk.zzj = new zzjk("MESSAGE", 9, Object.class, Object.class, null);
        zzjk.zzk = new zzjk[]{zzjk.zza, zzjk.zzb, zzjk.zzc, zzjk.zzd, zzjk.zze, zzjk.zzf, zzjk.zzg, zzjk.zzh, zzjk.zzi, zzjk.zzj};
    }

    private zzjk(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.zzl = class0;
        this.zzm = class1;
        this.zzn = object0;
    }

    public static zzjk[] values() {
        return (zzjk[])zzjk.zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}

