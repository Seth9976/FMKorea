package r0;

import android.webkit.WebSettings;
import s0.g;
import s0.k;
import s0.l;
import s0.m;

public abstract class a {
    private static k a(WebSettings webSettings0) {
        return m.c().a(webSettings0);
    }

    // 去混淆评级： 低(20)
    public static void b(WebSettings webSettings0, int v) {
        g.a(webSettings0, v);
    }

    public static void c(WebSettings webSettings0, int v) {
        if(!l.T.d()) {
            throw l.a();
        }
        a.a(webSettings0).b(v);
    }
}

