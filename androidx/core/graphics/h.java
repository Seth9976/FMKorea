package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.h.e;
import z.h.b;
import z.h.c;

public abstract class h {
    public static class a extends c {
        private e a;

        public a(e h$e0) {
            this.a = h$e0;
        }

        @Override  // z.h$c
        public void a(int v) {
            e h$e0 = this.a;
            if(h$e0 != null) {
                h$e0.h(v);
            }
        }

        @Override  // z.h$c
        public void b(Typeface typeface0) {
            e h$e0 = this.a;
            if(h$e0 != null) {
                h$e0.i(typeface0);
            }
        }
    }

    private static final n a;
    private static final androidx.collection.e b;

    static {
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            h.a = new m();
        }
        else if(v >= 28) {
            h.a = new l();
        }
        else if(v >= 26) {
            h.a = new k();
        }
        else if(v < 24 || !j.j()) {
            h.a = new i();
        }
        else {
            h.a = new j();
        }
        h.b = new androidx.collection.e(16);
    }

    public static Typeface a(Context context0, Typeface typeface0, int v) {
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface0, v);
    }

    public static Typeface b(Context context0, CancellationSignal cancellationSignal0, b[] arr_h$b, int v) {
        return h.a.b(context0, cancellationSignal0, arr_h$b, v);
    }

    public static Typeface c(Context context0, androidx.core.content.res.e.b e$b0, Resources resources0, int v, String s, int v1, int v2, e h$e0, Handler handler0, boolean z) {
        Typeface typeface1;
        boolean z1;
        if(e$b0 instanceof androidx.core.content.res.e.e) {
            Typeface typeface0 = h.g(((androidx.core.content.res.e.e)e$b0).c());
            if(typeface0 != null) {
                if(h$e0 != null) {
                    h$e0.d(typeface0, handler0);
                }
                return typeface0;
            }
            if(!z) {
                z1 = h$e0 == null;
            }
            else if(((androidx.core.content.res.e.e)e$b0).a() == 0) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            typeface1 = z.h.c(context0, ((androidx.core.content.res.e.e)e$b0).b(), v2, z1, (z ? ((androidx.core.content.res.e.e)e$b0).d() : -1), e.e(handler0), new a(h$e0));
        }
        else {
            typeface1 = h.a.a(context0, ((androidx.core.content.res.e.c)e$b0), resources0, v2);
            if(h$e0 != null) {
                if(typeface1 == null) {
                    h$e0.c(-3, handler0);
                }
                else {
                    h$e0.d(typeface1, handler0);
                }
            }
        }
        if(typeface1 != null) {
            String s1 = h.e(resources0, v, s, v1, v2);
            h.b.put(s1, typeface1);
        }
        return typeface1;
    }

    public static Typeface d(Context context0, Resources resources0, int v, String s, int v1, int v2) {
        Typeface typeface0 = h.a.d(context0, resources0, v, s, v2);
        if(typeface0 != null) {
            String s1 = h.e(resources0, v, s, v1, v2);
            h.b.put(s1, typeface0);
        }
        return typeface0;
    }

    private static String e(Resources resources0, int v, String s, int v1, int v2) {
        return resources0.getResourcePackageName(v) + '-' + s + '-' + v1 + '-' + v + '-' + v2;
    }

    public static Typeface f(Resources resources0, int v, String s, int v1, int v2) {
        String s1 = h.e(resources0, v, s, v1, v2);
        return (Typeface)h.b.get(s1);
    }

    private static Typeface g(String s) {
        if(s != null && !s.isEmpty()) {
            Typeface typeface0 = Typeface.create(s, 0);
            return typeface0 == null || typeface0.equals(Typeface.create(Typeface.DEFAULT, 0)) ? null : typeface0;
        }
        return null;
    }
}

