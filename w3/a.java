package w3;

import java.io.InputStream;
import java.io.OutputStream;
import z3.k;

public abstract class a {
    public static final long a(InputStream inputStream0, OutputStream outputStream0, int v) {
        k.e(inputStream0, "<this>");
        k.e(outputStream0, "out");
        byte[] arr_b = new byte[v];
        int v1 = inputStream0.read(arr_b);
        long v2 = 0L;
        while(v1 >= 0) {
            outputStream0.write(arr_b, 0, v1);
            v2 += (long)v1;
            v1 = inputStream0.read(arr_b);
        }
        return v2;
    }

    public static long b(InputStream inputStream0, OutputStream outputStream0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        return a.a(inputStream0, outputStream0, v);
    }
}

