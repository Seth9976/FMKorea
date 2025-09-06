package com.google.android.gms.internal.ads;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class zzgse extends Enum {
    public static final enum zzgse zza;
    public static final enum zzgse zzb;
    public static final enum zzgse zzc;
    public static final enum zzgse zzd;
    public static final enum zzgse zze;
    public static final enum zzgse zzf;
    public static final enum zzgse zzg;
    public static final enum zzgse zzh;
    public static final enum zzgse zzi;
    public static final enum zzgse zzj;
    private static final zzgse[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzgse.zza = new zzgse("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        zzgse.zzb = new zzgse("INT", 1, class0, Integer.class, 0);
        zzgse.zzc = new zzgse("LONG", 2, Long.TYPE, Long.class, 0L);
        zzgse.zzd = new zzgse("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        zzgse.zze = new zzgse("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        zzgse.zzf = new zzgse("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzgse.zzg = new zzgse("STRING", 6, String.class, String.class, "");
        zzgse.zzh = new zzgse("BYTE_STRING", 7, zzgqi.class, zzgqi.class, zzgqi.zzb);
        zzgse.zzi = new zzgse("ENUM", 8, class0, Integer.class, null);
        zzgse.zzj = new zzgse("MESSAGE", 9, Object.class, Object.class, null);
        zzgse.zzk = new zzgse[]{zzgse.zza, zzgse.zzb, zzgse.zzc, zzgse.zzd, zzgse.zze, zzgse.zzf, zzgse.zzg, zzgse.zzh, zzgse.zzi, zzgse.zzj};
    }

    private zzgse(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.zzl = class0;
        this.zzm = class1;
        this.zzn = object0;
    }

    public static zzgse[] values() {
        return (zzgse[])zzgse.zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}

