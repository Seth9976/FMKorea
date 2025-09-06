package x0;

import java.util.List;
import z3.k;

public interface j {
    public static abstract class a {
        public static i a(j j0, m m0) {
            k.e(m0, "id");
            return j0.f(m0.b(), m0.a());
        }

        public static void b(j j0, m m0) {
            k.e(m0, "id");
            j0.d(m0.b(), m0.a());
        }
    }

    i a(m arg1);

    List b();

    void c(m arg1);

    void d(String arg1, int arg2);

    void e(String arg1);

    i f(String arg1, int arg2);

    void g(i arg1);
}

