package A0;

import java.util.List;
import x0.i;
import x0.j;
import x0.o;
import x0.u;
import x0.x;
import x0.z;
import z3.k;

public abstract class d {
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        k.d("WM-DiagnosticsWrkr", "tagWithPrefix(\"DiagnosticsWrkr\")");
        d.a = "WM-DiagnosticsWrkr";
    }

    // 去混淆评级： 低(20)
    public static final String a() [...] // 潜在的解密器

    private static final String c(u u0, String s, Integer integer0, String s1) {
        return '\n' + u0.a + "\t " + u0.c + "\t " + integer0 + "\t " + u0.b.name() + "\t " + s + "\t " + s1 + '\t';
    }

    private static final String d(o o0, z z0, j j0, List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for(Object object0: list0) {
            i i0 = j0.a(x.a(((u)object0)));
            stringBuilder0.append(d.c(((u)object0), m3.o.w(o0.b(((u)object0).a), ",", null, null, 0, null, null, 62, null), (i0 == null ? null : i0.c), m3.o.w(z0.a(((u)object0).a), ",", null, null, 0, null, null, 62, null)));
        }
        String s = stringBuilder0.toString();
        k.d(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

