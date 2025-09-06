package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

abstract class f {
    static int a(int v) [...] // Inlined contents

    static byte[] b(byte[] arr_b) {
        Deflater deflater0 = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(DeflaterOutputStream deflaterOutputStream0 = new DeflaterOutputStream(byteArrayOutputStream0, deflater0)) {
            deflaterOutputStream0.write(arr_b);
        }
        finally {
            deflater0.end();
        }
        return byteArrayOutputStream0.toByteArray();
    }

    static RuntimeException c(String s) {
        return new IllegalStateException(s);
    }

    static byte[] d(InputStream inputStream0, int v) {
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 < 0) {
                throw f.c(("Not enough bytes to read: " + v));
            }
        }
        return arr_b;
    }

    static byte[] e(InputStream inputStream0, int v, int v1) {
        int v3;
        Inflater inflater0 = new Inflater();
        try {
            byte[] arr_b = new byte[v1];
            byte[] arr_b1 = new byte[0x800];
            v3 = 0;
            int v4 = 0;
            while(!inflater0.finished() && !inflater0.needsDictionary() && v3 < v) {
                int v5 = inputStream0.read(arr_b1);
                if(v5 < 0) {
                    throw f.c(("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + v + " bytes"));
                }
                inflater0.setInput(arr_b1, 0, v5);
                try {
                    v4 += inflater0.inflate(arr_b, v4, v1 - v4);
                    v3 += v5;
                }
                catch(DataFormatException dataFormatException0) {
                    throw f.c(dataFormatException0.getMessage());
                }
            }
            if(v3 == v) {
                if(!inflater0.finished()) {
                    throw f.c("Inflater did not finish");
                }
                return arr_b;
            }
        }
        finally {
            inflater0.end();
        }
        throw f.c(("Didn\'t read enough bytes during decompression. expected=" + v + " actual=" + v3));
    }

    static String f(InputStream inputStream0, int v) {
        return new String(f.d(inputStream0, v), StandardCharsets.UTF_8);
    }

    static long g(InputStream inputStream0, int v) {
        byte[] arr_b = f.d(inputStream0, v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((long)(arr_b[v2] & 0xFF)) << v2 * 8;
        }
        return v1;
    }

    static int h(InputStream inputStream0) {
        return (int)f.g(inputStream0, 2);
    }

    static long i(InputStream inputStream0) {
        return f.g(inputStream0, 4);
    }

    static int j(InputStream inputStream0) {
        return (int)f.g(inputStream0, 1);
    }

    static int k(String s) {
        return s.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream0, OutputStream outputStream0) {
        byte[] arr_b = new byte[0x200];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    static void m(OutputStream outputStream0, byte[] arr_b) {
        f.q(outputStream0, ((long)arr_b.length));
        byte[] arr_b1 = f.b(arr_b);
        f.q(outputStream0, ((long)arr_b1.length));
        outputStream0.write(arr_b1);
    }

    static void n(OutputStream outputStream0, String s) {
        outputStream0.write(s.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream0, long v, int v1) {
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b[v2] = (byte)(((int)(v >> v2 * 8 & 0xFFL)));
        }
        outputStream0.write(arr_b);
    }

    static void p(OutputStream outputStream0, int v) {
        f.o(outputStream0, ((long)v), 2);
    }

    static void q(OutputStream outputStream0, long v) {
        f.o(outputStream0, v, 4);
    }

    static void r(OutputStream outputStream0, int v) {
        f.o(outputStream0, ((long)v), 1);
    }
}

