package x2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import u2.d;
import u2.e;
import v2.b;

public class h {
    public static final class a implements b {
        private final Map a;
        private final Map b;
        private d c;
        private static final d d;

        static {
            a.d = (Object object0, e e0) -> a.e(object0, e0);
        }

        public a() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = a.d;
        }

        @Override  // v2.b
        public b a(Class class0, d d0) {
            return this.f(class0, d0);
        }

        // 检测为 Lambda 实现
        public static void b(Object object0, e e0) [...]

        public h c() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(v2.a a0) {
            a0.a(this);
            return this;
        }

        private static void e(Object object0, e e0) {
            throw new u2.b("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());
        }

        public a f(Class class0, d d0) {
            this.a.put(class0, d0);
            this.b.remove(class0);
            return this;
        }
    }

    private final Map a;
    private final Map b;
    private final d c;

    h(Map map0, Map map1, d d0) {
        this.a = map0;
        this.b = map1;
        this.c = d0;
    }

    public static a a() {
        return new a();
    }

    public void b(Object object0, OutputStream outputStream0) {
        new f(outputStream0, this.a, this.b, this.c).t(object0);
    }

    public byte[] c(Object object0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            this.b(object0, byteArrayOutputStream0);
        }
        catch(IOException unused_ex) {
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

