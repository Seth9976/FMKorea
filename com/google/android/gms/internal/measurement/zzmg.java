package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzmg {
    static final class zza extends zzc {
        zza(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final double zza(Object object0, long v) {
            return Double.longBitsToDouble(this.zze(object0, v));
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, byte b) {
            if(zzmg.zza) {
                zzmg.zzc(object0, v, b);
                return;
            }
            zzmg.zzd(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, boolean z) {
            if(zzmg.zza) {
                zzmg.zza(object0, v, z);
                return;
            }
            zzmg.zzb(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final float zzb(Object object0, long v) {
            return Float.intBitsToFloat(this.zzd(object0, v));
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final boolean zzc(Object object0, long v) {
            return zzmg.zza ? zzmg.zzf(object0, v) : zzmg.zzg(object0, v);
        }
    }

    static final class zzb extends zzc {
        zzb(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final double zza(Object object0, long v) {
            return Double.longBitsToDouble(this.zze(object0, v));
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, byte b) {
            if(zzmg.zza) {
                zzmg.zzc(object0, v, b);
                return;
            }
            zzmg.zzd(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final void zza(Object object0, long v, boolean z) {
            if(zzmg.zza) {
                zzmg.zza(object0, v, z);
                return;
            }
            zzmg.zzb(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final float zzb(Object object0, long v) {
            return Float.intBitsToFloat(this.zzd(object0, v));
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.measurement.zzmg$zzc
        public final boolean zzc(Object object0, long v) {
            return zzmg.zza ? zzmg.zzf(object0, v) : zzmg.zzg(object0, v);
        }
    }

    static abstract class zzc {
        Unsafe zza;

        zzc(Unsafe unsafe0) {
            this.zza = unsafe0;
        }

        public abstract double zza(Object arg1, long arg2);

        public abstract void zza(Object arg1, long arg2, byte arg3);

        public abstract void zza(Object arg1, long arg2, double arg3);

        public abstract void zza(Object arg1, long arg2, float arg3);

        public final void zza(Object object0, long v, int v1) {
            this.zza.putInt(object0, v, v1);
        }

        public final void zza(Object object0, long v, long v1) {
            this.zza.putLong(object0, v, v1);
        }

        public abstract void zza(Object arg1, long arg2, boolean arg3);

        public final boolean zza() {
            Class class0 = Class.class;
            Class class1 = Object.class;
            Unsafe unsafe0 = this.zza;
            if(unsafe0 == null) {
                return false;
            }
            try {
                Class class2 = unsafe0.getClass();
                class2.getMethod("objectFieldOffset", Field.class);
                class2.getMethod("arrayBaseOffset", class0);
                class2.getMethod("arrayIndexScale", class0);
                Class class3 = Long.TYPE;
                class2.getMethod("getInt", class1, class3);
                class2.getMethod("putInt", class1, class3, Integer.TYPE);
                class2.getMethod("getLong", class1, class3);
                class2.getMethod("putLong", class1, class3, class3);
                class2.getMethod("getObject", class1, class3);
                class2.getMethod("putObject", class1, class3, class1);
                return true;
            }
            catch(Throwable throwable0) {
                zzmg.zza(throwable0);
                return false;
            }
        }

        public abstract float zzb(Object arg1, long arg2);

        public final boolean zzb() {
            Unsafe unsafe0 = this.zza;
            if(unsafe0 == null) {
                return false;
            }
            try {
                Class class0 = unsafe0.getClass();
                class0.getMethod("objectFieldOffset", Field.class);
                class0.getMethod("getLong", Object.class, Long.TYPE);
                return zzmg.zze() == null ? false : true;
            }
            catch(Throwable throwable0) {
                zzmg.zza(throwable0);
                return false;
            }
        }

        public abstract boolean zzc(Object arg1, long arg2);

        public final int zzd(Object object0, long v) {
            return this.zza.getInt(object0, v);
        }

        public final long zze(Object object0, long v) {
            return this.zza.getLong(object0, v);
        }
    }

    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    static {
        zza zzmg$zza0;
        Unsafe unsafe0 = zzmg.zzb();
        zzmg.zzb = unsafe0;
        zzmg.zzc = zzhj.zza();
        boolean z = zzmg.zzd(Long.TYPE);
        zzmg.zzd = z;
        boolean z1 = zzmg.zzd(Integer.TYPE);
        zzmg.zze = z1;
        if(unsafe0 == null) {
            zzmg$zza0 = null;
        }
        else if(z) {
            zzmg$zza0 = new zza(unsafe0);
        }
        else if(z1) {
            zzmg$zza0 = new zzb(unsafe0);
        }
        else {
            zzmg$zza0 = null;
        }
        zzmg.zzf = zzmg$zza0;
        boolean z2 = false;
        zzmg.zzg = zzmg$zza0 == null ? false : zzmg$zza0.zzb();
        zzmg.zzh = zzmg$zza0 == null ? false : zzmg$zza0.zza();
        long v = (long)zzmg.zzb(byte[].class);
        zzmg.zzi = v;
        zzmg.zzj = (long)zzmg.zzb(boolean[].class);
        zzmg.zzk = (long)zzmg.zzc(boolean[].class);
        zzmg.zzl = (long)zzmg.zzb(int[].class);
        zzmg.zzm = (long)zzmg.zzc(int[].class);
        zzmg.zzn = (long)zzmg.zzb(long[].class);
        zzmg.zzo = (long)zzmg.zzc(long[].class);
        zzmg.zzp = (long)zzmg.zzb(float[].class);
        zzmg.zzq = (long)zzmg.zzc(float[].class);
        zzmg.zzr = (long)zzmg.zzb(double[].class);
        zzmg.zzs = (long)zzmg.zzc(double[].class);
        zzmg.zzt = (long)zzmg.zzb(Object[].class);
        zzmg.zzu = (long)zzmg.zzc(Object[].class);
        Field field0 = zzmg.zze();
        zzmg.zzv = field0 == null || zzmg$zza0 == null ? -1L : zzmg$zza0.zza.objectFieldOffset(field0);
        zzmg.zzw = (int)(v & 7L);
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        }
        zzmg.zza = z2;
    }

    static double zza(Object object0, long v) {
        return zzmg.zzf.zza(object0, v);
    }

    static Object zza(Class class0) {
        try {
            return zzmg.zzb.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    private static Field zza(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void zza(Object object0, long v, double f) {
        zzmg.zzf.zza(object0, v, f);
    }

    static void zza(Object object0, long v, float f) {
        zzmg.zzf.zza(object0, v, f);
    }

    static void zza(Object object0, long v, int v1) {
        zzmg.zzf.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, long v1) {
        zzmg.zzf.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, Object object1) {
        zzmg.zzf.zza.putObject(object0, v, object1);
    }

    static void zza(Object object0, long v, boolean z) {
        zzmg.zzc(object0, v, ((byte)z));
    }

    static void zza(Throwable throwable0) {
        Logger.getLogger("com.google.android.gms.internal.measurement.zzmg").logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable0);
    }

    static void zza(byte[] arr_b, long v, byte b) {
        zzmg.zzf.zza(arr_b, zzmg.zzi + v, b);
    }

    static float zzb(Object object0, long v) {
        return zzmg.zzf.zzb(object0, v);
    }

    // 去混淆评级： 低(20)
    private static int zzb(Class class0) {
        return zzmg.zzh ? zzmg.zzf.zza.arrayBaseOffset(class0) : -1;
    }

    static Unsafe zzb() {
        try {
            return (Unsafe)AccessController.doPrivileged(new zzmf());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void zzb(Object object0, long v, boolean z) {
        zzmg.zzd(object0, v, ((byte)z));
    }

    // 去混淆评级： 低(20)
    private static int zzc(Class class0) {
        return zzmg.zzh ? zzmg.zzf.zza.arrayIndexScale(class0) : -1;
    }

    static int zzc(Object object0, long v) {
        return zzmg.zzf.zzd(object0, v);
    }

    private static void zzc(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        zzmg.zza(object0, -4L & v, (0xFF & b) << v1 | zzmg.zzc(object0, -4L & v) & ~(0xFF << v1));
    }

    static void zzc(Object object0, long v, boolean z) {
        zzmg.zzf.zza(object0, v, z);
    }

    static boolean zzc() {
        return zzmg.zzh;
    }

    static long zzd(Object object0, long v) {
        return zzmg.zzf.zze(object0, v);
    }

    private static void zzd(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        zzmg.zza(object0, -4L & v, (0xFF & b) << v1 | zzmg.zzc(object0, -4L & v) & ~(0xFF << v1));
    }

    static boolean zzd() {
        return zzmg.zzg;
    }

    private static boolean zzd(Class class0) {
        try {
            Class class1 = Boolean.TYPE;
            zzmg.zzc.getMethod("peekLong", class0, class1);
            zzmg.zzc.getMethod("pokeLong", class0, Long.TYPE, class1);
            Class class2 = Integer.TYPE;
            zzmg.zzc.getMethod("pokeInt", class0, class2, class1);
            zzmg.zzc.getMethod("peekInt", class0, class1);
            zzmg.zzc.getMethod("pokeByte", class0, Byte.TYPE);
            zzmg.zzc.getMethod("peekByte", class0);
            zzmg.zzc.getMethod("pokeByteArray", class0, byte[].class, class2, class2);
            zzmg.zzc.getMethod("peekByteArray", class0, byte[].class, class2, class2);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    static Object zze(Object object0, long v) {
        return zzmg.zzf.zza.getObject(object0, v);
    }

    private static Field zze() {
        Class class0 = Buffer.class;
        Field field0 = zzmg.zza(class0, "effectiveDirectAddress");
        if(field0 != null) {
            return field0;
        }
        Field field1 = zzmg.zza(class0, "address");
        return field1 == null || field1.getType() != Long.TYPE ? null : field1;
    }

    static boolean zzf(Object object0, long v) {
        return ((byte)(zzmg.zzc(object0, -4L & v) >>> ((int)((~v & 3L) << 3)))) != 0;
    }

    static boolean zzg(Object object0, long v) {
        return ((byte)(zzmg.zzc(object0, -4L & v) >>> ((int)((v & 3L) << 3)))) != 0;
    }

    static boolean zzh(Object object0, long v) {
        return zzmg.zzf.zzc(object0, v);
    }
}

