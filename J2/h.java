package j2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class h {
    private static final AtomicLong a;
    private static String b;

    static {
        h.a = new AtomicLong(0L);
    }

    h(y y0) {
        byte[] arr_b = new byte[10];
        this.e(arr_b);
        this.d(arr_b);
        this.c(arr_b);
        String s = i.C(y0.a().c());
        String s1 = i.w(arr_b);
        h.b = String.format(Locale.US, "%s%s%s%s", s1.substring(0, 12), s1.substring(12, 16), s1.subSequence(16, 20), s.substring(0, 12)).toUpperCase(Locale.US);
    }

    private static byte[] a(long v) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.putInt(((int)v));
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.position(0);
        return byteBuffer0.array();
    }

    private static byte[] b(long v) [...] // 潜在的解密器

    private void c(byte[] arr_b) {
        arr_b[8] = 21;
        arr_b[9] = (byte)0x91;
    }

    private void d(byte[] arr_b) {
        arr_b[6] = 0;
        arr_b[7] = 1;
    }

    private void e(byte[] arr_b) {
        long v = new Date().getTime();
        byte[] arr_b1 = h.a(v / 1000L);
        arr_b[0] = arr_b1[0];
        arr_b[1] = arr_b1[1];
        arr_b[2] = arr_b1[2];
        arr_b[3] = arr_b1[3];
        byte[] arr_b2 = h.b(v % 1000L);
        arr_b[4] = arr_b2[0];
        arr_b[5] = arr_b2[1];
    }

    @Override
    public String toString() {
        return h.b;
    }
}

