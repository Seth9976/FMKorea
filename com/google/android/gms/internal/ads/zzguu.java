package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzguu {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgut zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    static {
        boolean z4;
        boolean z3;
        boolean z = false;
        Class class0 = Class.class;
        Unsafe unsafe0 = zzguu.zzi();
        zzguu.zzc = unsafe0;
        zzguu.zzd = Memory.class;
        Class class1 = Long.TYPE;
        boolean z1 = zzguu.zzy(class1);
        zzguu.zze = z1;
        boolean z2 = zzguu.zzy(Integer.TYPE);
        zzgut zzgut0 = null;
        if(unsafe0 != null) {
            if(z1) {
                zzgut0 = new zzgus(unsafe0);
            }
            else if(z2) {
                zzgut0 = new zzgur(unsafe0);
            }
        }
        zzguu.zzf = zzgut0;
        Class class2 = Field.class;
        Class class3 = Object.class;
        if(zzgut0 == null) {
        label_31:
            z3 = false;
        }
        else {
            try {
                Class class4 = zzgut0.zza.getClass();
                class4.getMethod("objectFieldOffset", class2);
                class4.getMethod("getLong", class3, class1);
                if(zzguu.zzE() == null) {
                    goto label_31;
                }
                else {
                    goto label_29;
                }
            }
            catch(Throwable throwable0) {
                zzguu.zzj(throwable0);
                z3 = false;
            }
            goto label_34;
        label_29:
            z3 = true;
        }
    label_34:
        zzguu.zzg = z3;
        zzgut zzgut1 = zzguu.zzf;
        if(zzgut1 == null) {
            z4 = false;
        }
        else {
            try {
                Class class5 = zzgut1.zza.getClass();
                class5.getMethod("objectFieldOffset", class2);
                class5.getMethod("arrayBaseOffset", class0);
                class5.getMethod("arrayIndexScale", class0);
                Class class6 = Long.TYPE;
                class5.getMethod("getInt", class3, class6);
                class5.getMethod("putInt", class3, class6, Integer.TYPE);
                class5.getMethod("getLong", class3, class6);
                class5.getMethod("putLong", class3, class6, class6);
                class5.getMethod("getObject", class3, class6);
                class5.getMethod("putObject", class3, class6, class3);
                z4 = true;
            }
            catch(Throwable throwable1) {
                zzguu.zzj(throwable1);
                z4 = false;
            }
        }
        zzguu.zzh = z4;
        zzguu.zza = (long)zzguu.zzC(byte[].class);
        zzguu.zzC(boolean[].class);
        zzguu.zzD(boolean[].class);
        zzguu.zzC(int[].class);
        zzguu.zzD(int[].class);
        zzguu.zzC(long[].class);
        zzguu.zzD(long[].class);
        zzguu.zzC(float[].class);
        zzguu.zzD(float[].class);
        zzguu.zzC(double[].class);
        zzguu.zzD(double[].class);
        zzguu.zzC(Object[].class);
        zzguu.zzD(Object[].class);
        Field field0 = zzguu.zzE();
        long v = -1L;
        if(field0 != null) {
            zzgut zzgut2 = zzguu.zzf;
            if(zzgut2 != null) {
                v = zzgut2.zza.objectFieldOffset(field0);
            }
        }
        zzguu.zzi = v;
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        zzguu.zzb = z;
    }

    static boolean zzA() {
        return zzguu.zzh;
    }

    static boolean zzB() {
        return zzguu.zzg;
    }

    // 去混淆评级： 低(20)
    private static int zzC(Class class0) {
        return zzguu.zzh ? zzguu.zzf.zza.arrayBaseOffset(class0) : -1;
    }

    // 去混淆评级： 低(20)
    private static int zzD(Class class0) {
        return zzguu.zzh ? zzguu.zzf.zza.arrayIndexScale(class0) : -1;
    }

    private static Field zzE() {
        Class class0 = Buffer.class;
        Field field0 = zzguu.zzF(class0, "effectiveDirectAddress");
        if(field0 == null) {
            Field field1 = zzguu.zzF(class0, "address");
            return field1 == null || field1.getType() != Long.TYPE ? null : field1;
        }
        return field0;
    }

    private static Field zzF(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static void zzG(Object object0, long v, byte b) {
        int v1 = zzguu.zzf.zza.getInt(object0, -4L & v);
        int v2 = (~((int)v) & 3) << 3;
        zzguu.zzf.zza.putInt(object0, -4L & v, (0xFF & b) << v2 | v1 & ~(0xFF << v2));
    }

    private static void zzH(Object object0, long v, byte b) {
        int v1 = zzguu.zzf.zza.getInt(object0, -4L & v);
        int v2 = (((int)v) & 3) << 3;
        zzguu.zzf.zza.putInt(object0, -4L & v, (0xFF & b) << v2 | v1 & ~(0xFF << v2));
    }

    static byte zza(long v) {
        return zzguu.zzf.zza(v);
    }

    static double zzb(Object object0, long v) {
        return zzguu.zzf.zzb(object0, v);
    }

    static float zzc(Object object0, long v) {
        return zzguu.zzf.zzc(object0, v);
    }

    static int zzd(Object object0, long v) {
        return zzguu.zzf.zza.getInt(object0, v);
    }

    static long zze(ByteBuffer byteBuffer0) {
        return zzguu.zzf.zza.getLong(byteBuffer0, zzguu.zzi);
    }

    static long zzf(Object object0, long v) {
        return zzguu.zzf.zza.getLong(object0, v);
    }

    static Object zzg(Class class0) {
        try {
            return zzguu.zzc.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    static Object zzh(Object object0, long v) {
        return zzguu.zzf.zza.getObject(object0, v);
    }

    static Unsafe zzi() {
        try {
            return (Unsafe)AccessController.doPrivileged(new zzguq());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void zzj(Throwable throwable0) {
        Logger.getLogger("com.google.android.gms.internal.ads.zzguu").logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable0.toString());
    }

    static void zzk(Object object0, long v, boolean z) {
        zzguu.zzG(object0, v, ((byte)z));
    }

    static void zzl(Object object0, long v, boolean z) {
        zzguu.zzH(object0, v, ((byte)z));
    }

    static void zzm(Object object0, long v, byte b) {
        zzguu.zzG(object0, v, b);
    }

    static void zzn(Object object0, long v, byte b) {
        zzguu.zzH(object0, v, b);
    }

    static void zzo(long v, byte[] arr_b, long v1, long v2) {
        zzguu.zzf.zzd(v, arr_b, v1, v2);
    }

    static void zzp(Object object0, long v, boolean z) {
        zzguu.zzf.zze(object0, v, z);
    }

    static void zzq(byte[] arr_b, long v, byte b) {
        zzguu.zzf.zzf(arr_b, zzguu.zza + v, b);
    }

    static void zzr(Object object0, long v, double f) {
        zzguu.zzf.zzg(object0, v, f);
    }

    static void zzs(Object object0, long v, float f) {
        zzguu.zzf.zzh(object0, v, f);
    }

    static void zzt(Object object0, long v, int v1) {
        zzguu.zzf.zza.putInt(object0, v, v1);
    }

    static void zzu(Object object0, long v, long v1) {
        zzguu.zzf.zza.putLong(object0, v, v1);
    }

    static void zzv(Object object0, long v, Object object1) {
        zzguu.zzf.zza.putObject(object0, v, object1);
    }

    static boolean zzw(Object object0, long v) {
        return ((byte)(zzguu.zzf.zza.getInt(object0, -4L & v) >>> ((int)((~v & 3L) << 3)) & 0xFF)) != 0;
    }

    static boolean zzx(Object object0, long v) {
        return ((byte)(zzguu.zzf.zza.getInt(object0, -4L & v) >>> ((int)((v & 3L) << 3)) & 0xFF)) != 0;
    }

    static boolean zzy(Class class0) {
        try {
            Class class1 = Boolean.TYPE;
            zzguu.zzd.getMethod("peekLong", class0, class1);
            zzguu.zzd.getMethod("pokeLong", class0, Long.TYPE, class1);
            Class class2 = Integer.TYPE;
            zzguu.zzd.getMethod("pokeInt", class0, class2, class1);
            zzguu.zzd.getMethod("peekInt", class0, class1);
            zzguu.zzd.getMethod("pokeByte", class0, Byte.TYPE);
            zzguu.zzd.getMethod("peekByte", class0);
            zzguu.zzd.getMethod("pokeByteArray", class0, byte[].class, class2, class2);
            zzguu.zzd.getMethod("peekByteArray", class0, byte[].class, class2, class2);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    static boolean zzz(Object object0, long v) {
        return zzguu.zzf.zzi(object0, v);
    }
}

