package m1;

import android.util.Base64;
import k1.d;

public abstract class p {
    public static abstract class a {
        public abstract p a();

        public abstract a b(String arg1);

        public abstract a c(byte[] arg1);

        public abstract a d(d arg1);
    }

    public static a a() {
        return new b().d(d.f);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public boolean e() {
        return this.c() != null;
    }

    public p f(d d0) {
        return p.a().b(this.b()).d(d0).c(this.c()).a();
    }

    @Override
    public final String toString() {
        String s = this.b();
        d d0 = this.d();
        return this.c() == null ? String.format("TransportContext(%s, %s, %s)", s, d0, "") : String.format("TransportContext(%s, %s, %s)", s, d0, Base64.encodeToString(this.c(), 2));
    }
}

