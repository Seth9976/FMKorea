package com.google.android.gms.internal.measurement;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public class zzmn extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmm extends zzmn {
        private zzmm(String s, int v, zzmx zzmx0, int v1) {
            super(s, 8, zzmx0, 2, null);
        }

        zzmm(String s, int v, zzmx zzmx0, int v1, zzmp zzmp0) {
            this(s, 8, zzmx0, 2);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmo extends zzmn {
        private zzmo(String s, int v, zzmx zzmx0, int v1) {
            super(s, 9, zzmx0, 3, null);
        }

        zzmo(String s, int v, zzmx zzmx0, int v1, zzmr zzmr0) {
            this(s, 9, zzmx0, 3);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmq extends zzmn {
        private zzmq(String s, int v, zzmx zzmx0, int v1) {
            super(s, 10, zzmx0, 2, null);
        }

        zzmq(String s, int v, zzmx zzmx0, int v1, zzmt zzmt0) {
            this(s, 10, zzmx0, 2);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzms extends zzmn {
        private zzms(String s, int v, zzmx zzmx0, int v1) {
            super(s, 11, zzmx0, 2, null);
        }

        zzms(String s, int v, zzmx zzmx0, int v1, zzmv zzmv0) {
            this(s, 11, zzmx0, 2);
        }
    }

    public static final enum zzmn zza;
    public static final enum zzmn zzb;
    public static final enum zzmn zzc;
    public static final enum zzmn zzd;
    public static final enum zzmn zze;
    public static final enum zzmn zzf;
    public static final enum zzmn zzg;
    public static final enum zzmn zzh;
    public static final enum zzmn zzi;
    public static final enum zzmn zzj;
    public static final enum zzmn zzk;
    public static final enum zzmn zzl;
    public static final enum zzmn zzm;
    public static final enum zzmn zzn;
    public static final enum zzmn zzo;
    public static final enum zzmn zzp;
    public static final enum zzmn zzq;
    public static final enum zzmn zzr;
    private static final zzmn[] zzs;
    private final zzmx zzt;
    private final int zzu;

    static {
        zzmn.zza = new zzmn("DOUBLE", 0, zzmx.zzd, 1);
        zzmn.zzb = new zzmn("FLOAT", 1, zzmx.zzc, 5);
        zzmn.zzc = new zzmn("INT64", 2, zzmx.zzb, 0);
        zzmn.zzd = new zzmn("UINT64", 3, zzmx.zzb, 0);
        zzmn.zze = new zzmn("INT32", 4, zzmx.zza, 0);
        zzmn.zzf = new zzmn("FIXED64", 5, zzmx.zzb, 1);
        zzmn.zzg = new zzmn("FIXED32", 6, zzmx.zza, 5);
        zzmn.zzh = new zzmn("BOOL", 7, zzmx.zze, 0);
        zzmm zzmm0 = new zzmm("STRING", 8, zzmx.zzf, 2, null);
        zzmn.zzi = zzmm0;
        zzmo zzmo0 = new zzmo("GROUP", 9, zzmx.zzi, 3, null);
        zzmn.zzj = zzmo0;
        zzmq zzmq0 = new zzmq("MESSAGE", 10, zzmx.zzi, 2, null);
        zzmn.zzk = zzmq0;
        zzms zzms0 = new zzms("BYTES", 11, zzmx.zzg, 2, null);
        zzmn.zzl = zzms0;
        zzmn.zzm = new zzmn("UINT32", 12, zzmx.zza, 0);
        zzmn.zzn = new zzmn("ENUM", 13, zzmx.zzh, 0);
        zzmn.zzo = new zzmn("SFIXED32", 14, zzmx.zza, 5);
        zzmn.zzp = new zzmn("SFIXED64", 15, zzmx.zzb, 1);
        zzmn.zzq = new zzmn("SINT32", 16, zzmx.zza, 0);
        zzmn.zzr = new zzmn("SINT64", 17, zzmx.zzb, 0);
        zzmn.zzs = new zzmn[]{zzmn.zza, zzmn.zzb, zzmn.zzc, zzmn.zzd, zzmn.zze, zzmn.zzf, zzmn.zzg, zzmn.zzh, zzmm0, zzmo0, zzmq0, zzms0, zzmn.zzm, zzmn.zzn, zzmn.zzo, zzmn.zzp, zzmn.zzq, zzmn.zzr};
    }

    private zzmn(String s, int v, zzmx zzmx0, int v1) {
        super(s, v);
        this.zzt = zzmx0;
        this.zzu = v1;
    }

    zzmn(String s, int v, zzmx zzmx0, int v1, zzmu zzmu0) {
        this(s, v, zzmx0, v1);
    }

    public static zzmn[] values() {
        return (zzmn[])zzmn.zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzmx zzb() {
        return this.zzt;
    }
}

