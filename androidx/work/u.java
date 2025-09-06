package androidx.work;

import android.content.Context;
import androidx.work.impl.F;
import java.util.Collections;
import java.util.List;

public abstract class u {
    public abstract n a(String arg1);

    public final n b(v v0) {
        return this.c(Collections.singletonList(v0));
    }

    public abstract n c(List arg1);

    public n d(String s, e e0, m m0) {
        return this.e(s, e0, Collections.singletonList(m0));
    }

    public abstract n e(String arg1, e arg2, List arg3);

    public static u f(Context context0) {
        return F.m(context0);
    }

    public static void g(Context context0, b b0) {
        F.g(context0, b0);
    }
}

