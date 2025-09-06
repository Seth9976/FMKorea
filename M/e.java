package M;

import java.util.Arrays;
import z3.k;

public abstract class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final a b(b[] arr_d$b) {
        k.e(arr_d$b, "pairs");
        a a0 = new a(null, false, 1, null);
        a0.g(((b[])Arrays.copyOf(arr_d$b, arr_d$b.length)));
        return a0;
    }
}

