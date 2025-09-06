package z3;

import E3.b;
import E3.c;
import E3.d;
import E3.f;

public class w {
    public d a(i i0) [...] // Inlined contents

    public b b(Class class0) {
        return new e(class0);
    }

    public c c(Class class0, String s) {
        return new m(class0, s);
    }

    public E3.e d(n n0) [...] // Inlined contents

    public f e(p p0) [...] // Inlined contents

    public String f(h h0) {
        String s = h0.getClass().getGenericInterfaces()[0].toString();
        return s.startsWith("kotlin.jvm.functions.") ? s.substring(21) : s;
    }

    public String g(l l0) {
        return this.f(l0);
    }
}

