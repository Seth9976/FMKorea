package r3;

import java.lang.reflect.Field;
import z3.k;

public abstract class g {
    private static final void a(int v, int v1) {
        if(v1 > v) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + v + ", got " + v1 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final f b(a a0) {
        return (f)a0.getClass().getAnnotation(f.class);
    }

    private static final int c(a a0) {
        try {
            Field field0 = a0.getClass().getDeclaredField("label");
            field0.setAccessible(true);
            Object object0 = field0.get(a0);
            Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
            return integer0 == null ? -1 : ((int)integer0) - 1;
        }
        catch(Exception unused_ex) {
            return -1;
        }
    }

    public static final StackTraceElement d(a a0) {
        k.e(a0, "<this>");
        f f0 = g.b(a0);
        if(f0 == null) {
            return null;
        }
        g.a(1, f0.v());
        int v = g.c(a0);
        int v1 = v >= 0 ? f0.l()[v] : -1;
        String s = i.a.b(a0);
        return s == null ? new StackTraceElement(f0.c(), f0.m(), f0.f(), v1) : new StackTraceElement(s + '/' + f0.c(), f0.m(), f0.f(), v1);
    }
}

