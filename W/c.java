package W;

import E3.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x3.a;
import y3.l;
import z3.k;

public final class c {
    private final List a;

    public c() {
        this.a = new ArrayList();
    }

    public final void a(b b0, l l0) {
        k.e(b0, "clazz");
        k.e(l0, "initializer");
        f f0 = new f(a.a(b0), l0);
        this.a.add(f0);
    }

    public final androidx.lifecycle.I.b b() {
        f[] arr_f = (f[])this.a.toArray(new f[0]);
        return new W.b(((f[])Arrays.copyOf(arr_f, arr_f.length)));
    }
}

