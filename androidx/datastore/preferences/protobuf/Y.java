package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class y {
    public interface a {
        boolean a(int arg1);
    }

    public interface b extends List, RandomAccess {
        boolean J();

        void b();

        b g(int arg1);
    }

    static final Charset a;
    static final Charset b;
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final h e;

    static {
        y.a = Charset.forName("UTF-8");
        y.b = Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        y.c = arr_b;
        y.d = ByteBuffer.wrap(arr_b);
        y.e = h.h(arr_b);
    }

    static Object a(Object object0) {
        object0.getClass();
        return object0;
    }

    static Object b(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    // 去混淆评级： 低(20)
    public static int c(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int d(byte[] arr_b) {
        return y.e(arr_b, 0, arr_b.length);
    }

    static int e(byte[] arr_b, int v, int v1) {
        int v2 = y.i(v1, arr_b, v, v1);
        return v2 == 0 ? 1 : v2;
    }

    public static int f(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static boolean g(byte[] arr_b) {
        return q0.m(arr_b);
    }

    static Object h(Object object0, Object object1) {
        return ((O)object0).c().a(((O)object1)).h();
    }

    static int i(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    public static String j(byte[] arr_b) {
        return new String(arr_b, y.a);
    }
}

