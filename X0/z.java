package x0;

import java.util.List;
import java.util.Set;
import z3.k;

public interface z {
    public static abstract class a {
        public static void a(z z0, String s, Set set0) {
            k.e(s, "id");
            k.e(set0, "tags");
            for(Object object0: set0) {
                z0.c(new y(((String)object0), s));
            }
        }
    }

    List a(String arg1);

    void b(String arg1, Set arg2);

    void c(y arg1);
}

