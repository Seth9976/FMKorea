package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzig extends zzhn {
    static final class zza extends zzig {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zza(byte[] arr_b, int v, int v1) {
            super(null);
            if(arr_b == null) {
                throw new NullPointerException("buffer");
            }
            if((arr_b.length - v1 | v1) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v1));
            }
            this.zzb = arr_b;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = v1;
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(byte b) {
            try {
                int v = this.zze;
                this.zze = v + 1;
                this.zzb[v] = b;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v) {
            try {
                int v1 = this.zze;
                this.zze = v1 + 1;
                this.zzb[v1] = (byte)v;
                this.zze = v1 + 2;
                this.zzb[v1 + 1] = (byte)(v >> 8);
                this.zze = v1 + 3;
                this.zzb[v1 + 2] = (byte)(v >> 16);
                this.zze = v1 + 4;
                this.zzb[v1 + 3] = (byte)(v >>> 24);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v, int v1) {
            this.zzc(v, 5);
            this.zza(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v, long v1) {
            this.zzc(v, 1);
            this.zza(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v, zzhm zzhm0) {
            this.zzc(v, 2);
            this.zza(zzhm0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v, zzkj zzkj0) {
            this.zzc(1, 3);
            this.zzd(2, v);
            this.zzc(3, 2);
            this.zza(zzkj0);
            this.zzc(1, 4);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        final void zza(int v, zzkj zzkj0, zzlb zzlb0) {
            this.zzc(v, 2);
            this.zzc(((zzhd)zzkj0).zza(zzlb0));
            zzlb0.zza(zzkj0, this.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v, String s) {
            this.zzc(v, 2);
            this.zza(s);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(int v, boolean z) {
            this.zzc(v, 0);
            this.zza(((byte)z));
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(long v) {
            try {
                int v1 = this.zze;
                this.zze = v1 + 1;
                this.zzb[v1] = (byte)(((int)v));
                this.zze = v1 + 2;
                this.zzb[v1 + 1] = (byte)(((int)(v >> 8)));
                this.zze = v1 + 3;
                this.zzb[v1 + 2] = (byte)(((int)(v >> 16)));
                this.zze = v1 + 4;
                this.zzb[v1 + 3] = (byte)(((int)(v >> 24)));
                this.zze = v1 + 5;
                this.zzb[v1 + 4] = (byte)(((int)(v >> 0x20)));
                this.zze = v1 + 6;
                this.zzb[v1 + 5] = (byte)(((int)(v >> 40)));
                this.zze = v1 + 7;
                this.zzb[v1 + 6] = (byte)(((int)(v >> 0x30)));
                this.zze = v1 + 8;
                this.zzb[v1 + 7] = (byte)(((int)(v >> 56)));
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(zzhm zzhm0) {
            this.zzc(zzhm0.zzb());
            zzhm0.zza(this);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(zzkj zzkj0) {
            this.zzc(zzkj0.zzbw());
            zzkj0.zza(this);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zza(String s) {
            int v;
            try {
                v = this.zze;
                int v1 = zzig.zzj(s.length());
                if(v1 == zzig.zzj(s.length() * 3)) {
                    int v2 = v + v1;
                    this.zze = v2;
                    int v3 = this.zza();
                    int v4 = zzmh.zza(s, this.zzb, v2, v3);
                    this.zze = v;
                    this.zzc(v4 - v - v1);
                    this.zze = v4;
                    return;
                }
                this.zzc(zzmh.zza(s));
                int v5 = this.zze;
                int v6 = this.zza();
                this.zze = zzmh.zza(s, this.zzb, v5, v6);
                return;
            }
            catch(zzmk zzmk0) {
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(indexOutOfBoundsException0);
            }
            this.zze = v;
            this.zza(s, zzmk0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzhn
        public final void zza(byte[] arr_b, int v, int v1) {
            this.zzc(arr_b, v, v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int v) {
            if(v >= 0) {
                this.zzc(v);
                return;
            }
            this.zzb(((long)v));
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int v, int v1) {
            this.zzc(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int v, long v1) {
            this.zzc(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int v, zzhm zzhm0) {
            this.zzc(1, 3);
            this.zzd(2, v);
            this.zza(3, zzhm0);
            this.zzc(1, 4);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzb(long v) {
            if(zzig.zzc && this.zza() >= 10) {
                while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                    int v1 = this.zze;
                    this.zze = v1 + 1;
                    zzmg.zza(this.zzb, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
                int v2 = this.zze;
                this.zze = v2 + 1;
                zzmg.zza(this.zzb, ((long)v2), ((byte)(((int)v))));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                        int v3 = this.zze;
                        this.zze = v3 + 1;
                        this.zzb[v3] = (byte)(((int)v));
                        return;
                    }
                    int v4 = this.zze;
                    this.zze = v4 + 1;
                    this.zzb[v4] = (byte)(((int)v) & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzb(byte[] arr_b, int v, int v1) {
            this.zzc(v1);
            this.zzc(arr_b, 0, v1);
        }

        private final void zzc(byte[] arr_b, int v, int v1) {
            try {
                System.arraycopy(arr_b, v, this.zzb, this.zze, v1);
                this.zze += v1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, v1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzc(int v) {
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        int v1 = this.zze;
                        this.zze = v1 + 1;
                        this.zzb[v1] = (byte)v;
                        return;
                    }
                    int v2 = this.zze;
                    this.zze = v2 + 1;
                    this.zzb[v2] = (byte)(v & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzc(int v, int v1) {
            this.zzc(v << 3 | v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzig
        public final void zzd(int v, int v1) {
            this.zzc(v, 0);
            this.zzc(v1);
        }
    }

    public static final class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String s, Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, throwable0);
        }

        zzb(Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
        }
    }

    zzij zza;
    private static final Logger zzb;
    private static final boolean zzc;

    static {
        zzig.zzb = Logger.getLogger("com.google.android.gms.internal.measurement.zzig");
        zzig.zzc = zzmg.zzc();
    }

    private zzig() {
    }

    zzig(zzih zzih0) {
    }

    public static int zza(double f) {
        return 8;
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zza(int v, double f) {
        return zzig.zzj(v << 3) + 8;
    }

    public static int zza(int v, float f) {
        return zzig.zzj(v << 3) + 4;
    }

    // 去混淆评级： 低(20)
    public static int zza(int v, zzjn zzjn0) {
        return zzig.zzj(2, v) + 2 + zzig.zzb(3, zzjn0);
    }

    public static int zza(zzjn zzjn0) {
        int v = zzjn0.zzb();
        return zzig.zzj(v) + v;
    }

    static int zza(zzkj zzkj0, zzlb zzlb0) {
        int v = ((zzhd)zzkj0).zza(zzlb0);
        return zzig.zzj(v) + v;
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zza(byte[] arr_b) {
        return zzig.zzj(arr_b.length) + arr_b.length;
    }

    public abstract int zza();

    public abstract void zza(byte arg1);

    public abstract void zza(int arg1);

    public abstract void zza(int arg1, int arg2);

    public abstract void zza(int arg1, long arg2);

    public abstract void zza(int arg1, zzhm arg2);

    public abstract void zza(int arg1, zzkj arg2);

    abstract void zza(int arg1, zzkj arg2, zzlb arg3);

    public abstract void zza(int arg1, String arg2);

    public abstract void zza(int arg1, boolean arg2);

    public abstract void zza(long arg1);

    public abstract void zza(zzhm arg1);

    public abstract void zza(zzkj arg1);

    public abstract void zza(String arg1);

    final void zza(String s, zzmk zzmk0) {
        zzig.zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmk0);
        byte[] arr_b = s.getBytes(zziz.zza);
        try {
            this.zzc(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzb(indexOutOfBoundsException0);
        }
    }

    public static int zzb(int v, zzjn zzjn0) {
        int v1 = zzjn0.zzb();
        return zzig.zzj(v << 3) + (zzig.zzj(v1) + v1);
    }

    // 去混淆评级： 低(40)
    public static int zzb(int v, zzkj zzkj0) {
        return zzig.zzj(2, v) + 2 + (zzig.zzc(zzkj0) + 1);
    }

    @Deprecated
    static int zzb(int v, zzkj zzkj0, zzlb zzlb0) {
        return (zzig.zzj(v << 3) << 1) + ((zzhd)zzkj0).zza(zzlb0);
    }

    public static int zzb(int v, String s) {
        return zzig.zzj(v << 3) + zzig.zzb(s);
    }

    public static int zzb(int v, boolean z) {
        return zzig.zzj(v << 3) + 1;
    }

    public static int zzb(zzhm zzhm0) {
        int v = zzhm0.zzb();
        return zzig.zzj(v) + v;
    }

    @Deprecated
    public static int zzb(zzkj zzkj0) {
        return zzkj0.zzbw();
    }

    public static int zzb(String s) {
        int v;
        try {
            v = zzmh.zza(s);
            return zzig.zzj(v) + v;
        }
        catch(zzmk unused_ex) {
            v = s.getBytes(zziz.zza).length;
            return zzig.zzj(v) + v;
        }
    }

    public static zzig zzb(byte[] arr_b) {
        return new zza(arr_b, 0, arr_b.length);
    }

    public final void zzb() {
        if(this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(double f) {
        this.zza(Double.doubleToRawLongBits(f));
    }

    public final void zzb(float f) {
        this.zza(Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int arg1);

    public final void zzb(int v, double f) {
        this.zza(v, Double.doubleToRawLongBits(f));
    }

    public final void zzb(int v, float f) {
        this.zza(v, Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int arg1, int arg2);

    public abstract void zzb(int arg1, long arg2);

    public abstract void zzb(int arg1, zzhm arg2);

    public abstract void zzb(long arg1);

    public final void zzb(boolean z) {
        this.zza(((byte)z));
    }

    abstract void zzb(byte[] arg1, int arg2, int arg3);

    public static int zzc(int v, long v1) {
        return zzig.zzj(v << 3) + 8;
    }

    public static int zzc(int v, zzhm zzhm0) {
        int v1 = zzhm0.zzb();
        return zzig.zzj(v << 3) + (zzig.zzj(v1) + v1);
    }

    static int zzc(int v, zzkj zzkj0, zzlb zzlb0) {
        return zzig.zzj(v << 3) + zzig.zza(zzkj0, zzlb0);
    }

    public static int zzc(long v) {
        return 8;
    }

    public static int zzc(zzkj zzkj0) {
        int v = zzkj0.zzbw();
        return zzig.zzj(v) + v;
    }

    public abstract void zzc(int arg1);

    public abstract void zzc(int arg1, int arg2);

    public static int zzd(int v) {
        return zzig.zzf(v);
    }

    public static int zzd(int v, long v1) {
        return zzig.zzj(v << 3) + zzig.zzg(v1);
    }

    // 去混淆评级： 低(20)
    public static int zzd(int v, zzhm zzhm0) {
        return zzig.zzj(2, v) + 2 + zzig.zzc(3, zzhm0);
    }

    public static int zzd(long v) {
        return zzig.zzg(v);
    }

    public abstract void zzd(int arg1, int arg2);

    public static int zze(int v) {
        return 4;
    }

    public static int zze(int v, int v1) {
        return zzig.zzj(v << 3) + zzig.zzf(v1);
    }

    public static int zze(int v, long v1) {
        return zzig.zzj(v << 3) + 8;
    }

    public static int zze(long v) {
        return 8;
    }

    public static int zzf(int v) {
        return v < 0 ? 10 : zzig.zzj(v);
    }

    public static int zzf(int v, int v1) {
        return zzig.zzj(v << 3) + 4;
    }

    public static int zzf(int v, long v1) {
        return zzig.zzj(v << 3) + zzig.zzg(v1 >> 0x3F ^ v1 << 1);
    }

    public static int zzf(long v) {
        return zzig.zzg(v >> 0x3F ^ v << 1);
    }

    public static int zzg(int v) {
        return 4;
    }

    public static int zzg(int v, int v1) {
        return zzig.zzj(v << 3) + zzig.zzf(v1);
    }

    public static int zzg(int v, long v1) {
        return zzig.zzj(v << 3) + zzig.zzg(v1);
    }

    public static int zzg(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public static int zzh(int v) {
        return zzig.zzj(v >> 0x1F ^ v << 1);
    }

    public static int zzh(int v, int v1) {
        return zzig.zzj(v << 3) + 4;
    }

    public final void zzh(int v, long v1) {
        this.zzb(v, v1 >> 0x3F ^ v1 << 1);
    }

    public final void zzh(long v) {
        this.zzb(v >> 0x3F ^ v << 1);
    }

    public static int zzi(int v) {
        return zzig.zzj(v << 3);
    }

    public static int zzi(int v, int v1) {
        return zzig.zzj(v << 3) + zzig.zzj(v1 >> 0x1F ^ v1 << 1);
    }

    private static long zzi(long v) [...] // Inlined contents

    public static int zzj(int v) [...] // 潜在的解密器

    public static int zzj(int v, int v1) {
        return zzig.zzj(v << 3) + zzig.zzj(v1);
    }

    public final void zzk(int v) {
        this.zzc(v >> 0x1F ^ v << 1);
    }

    public final void zzk(int v, int v1) {
        this.zzd(v, v1 >> 0x1F ^ v1 << 1);
    }

    private static int zzl(int v) [...] // Inlined contents
}

