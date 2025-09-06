package androidx.core.location;

import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

public abstract class a {
    static abstract class androidx.core.location.a.a {
        static float a(Location location0) {
            return location0.getBearingAccuracyDegrees();
        }

        static float b(Location location0) {
            return location0.getSpeedAccuracyMetersPerSecond();
        }

        static float c(Location location0) {
            return location0.getVerticalAccuracyMeters();
        }

        static boolean d(Location location0) {
            return location0.hasBearingAccuracy();
        }

        static boolean e(Location location0) {
            return location0.hasSpeedAccuracy();
        }

        static boolean f(Location location0) {
            return location0.hasVerticalAccuracy();
        }

        static void g(Location location0) {
            try {
                int v = a.d().getByte(location0);
                int v1 = a.e();
                a.d().setByte(location0, ((byte)(v & ~v1)));
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                NoSuchFieldError noSuchFieldError0 = new NoSuchFieldError();
                noSuchFieldError0.initCause(noSuchFieldException0);
                throw noSuchFieldError0;
            }
            catch(IllegalAccessException illegalAccessException0) {
                IllegalAccessError illegalAccessError0 = new IllegalAccessError();
                illegalAccessError0.initCause(illegalAccessException0);
                throw illegalAccessError0;
            }
        }

        static void h(Location location0) {
            try {
                int v = a.d().getByte(location0);
                int v1 = a.f();
                a.d().setByte(location0, ((byte)(v & ~v1)));
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                NoSuchFieldError noSuchFieldError0 = new NoSuchFieldError();
                noSuchFieldError0.initCause(noSuchFieldException0);
                throw noSuchFieldError0;
            }
            catch(IllegalAccessException illegalAccessException0) {
                IllegalAccessError illegalAccessError0 = new IllegalAccessError();
                illegalAccessError0.initCause(illegalAccessException0);
                throw illegalAccessError0;
            }
        }

        static void i(Location location0) {
            try {
                int v = a.d().getByte(location0);
                int v1 = a.g();
                a.d().setByte(location0, ((byte)(v & ~v1)));
            }
            catch(NoSuchFieldException | IllegalAccessException noSuchFieldException0) {
                IllegalAccessError illegalAccessError0 = new IllegalAccessError();
                illegalAccessError0.initCause(noSuchFieldException0);
                throw illegalAccessError0;
            }
        }

        static void j(Location location0, float f) {
            location0.setBearingAccuracyDegrees(f);
        }

        static void k(Location location0, float f) {
            location0.setSpeedAccuracyMetersPerSecond(f);
        }

        static void l(Location location0, float f) {
            location0.setVerticalAccuracyMeters(f);
        }
    }

    private static Field a;
    private static Integer b;
    private static Integer c;
    private static Integer d;

    private static boolean a(Location location0, String s) {
        Bundle bundle0 = location0.getExtras();
        return bundle0 != null && bundle0.containsKey(s);
    }

    public static float b(Location location0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.a.a.a(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 == null ? 0.0f : bundle0.getFloat("bearingAccuracy", 0.0f);
    }

    public static long c(Location location0) {
        return TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos());
    }

    static Field d() {
        if(a.a == null) {
            Field field0 = Location.class.getDeclaredField("mFieldsMask");
            a.a = field0;
            field0.setAccessible(true);
        }
        return a.a;
    }

    static int e() {
        if(a.c == null) {
            Field field0 = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            field0.setAccessible(true);
            a.c = field0.getInt(null);
        }
        return (int)a.c;
    }

    static int f() {
        if(a.b == null) {
            Field field0 = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            field0.setAccessible(true);
            a.b = field0.getInt(null);
        }
        return (int)a.b;
    }

    static int g() {
        if(a.d == null) {
            Field field0 = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            field0.setAccessible(true);
            a.d = field0.getInt(null);
        }
        return (int)a.d;
    }

    public static float h(Location location0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.a.a.b(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 == null ? 0.0f : bundle0.getFloat("speedAccuracy", 0.0f);
    }

    public static float i(Location location0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.a.a.c(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 == null ? 0.0f : bundle0.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean j(Location location0) {
        return Build.VERSION.SDK_INT < 26 ? a.a(location0, "bearingAccuracy") : androidx.core.location.a.a.d(location0);
    }

    public static boolean k(Location location0) {
        return Build.VERSION.SDK_INT < 26 ? a.a(location0, "speedAccuracy") : androidx.core.location.a.a.e(location0);
    }

    public static boolean l(Location location0) {
        return Build.VERSION.SDK_INT < 26 ? a.a(location0, "verticalAccuracy") : androidx.core.location.a.a.f(location0);
    }

    public static boolean m(Location location0) {
        return location0.isFromMockProvider();
    }
}

