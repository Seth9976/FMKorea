package w3;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import z3.k;

public abstract class h {
    public static final long a(Reader reader0, Writer writer0, int v) {
        k.e(reader0, "<this>");
        k.e(writer0, "out");
        char[] arr_c = new char[v];
        int v1 = reader0.read(arr_c);
        long v2 = 0L;
        while(v1 >= 0) {
            writer0.write(arr_c, 0, v1);
            v2 += (long)v1;
            v1 = reader0.read(arr_c);
        }
        return v2;
    }

    public static long b(Reader reader0, Writer writer0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        return h.a(reader0, writer0, v);
    }

    public static final String c(Reader reader0) {
        k.e(reader0, "<this>");
        StringWriter stringWriter0 = new StringWriter();
        h.b(reader0, stringWriter0, 0, 2, null);
        String s = stringWriter0.toString();
        k.d(s, "toString(...)");
        return s;
    }
}

