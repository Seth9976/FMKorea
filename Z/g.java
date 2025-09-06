package z;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import androidx.core.graphics.h;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

abstract class g {
    static final class e {
        final Typeface a;
        final int b;

        e(int v) {
            this.a = null;
            this.b = v;
        }

        e(Typeface typeface0) {
            this.a = typeface0;
            this.b = 0;
        }

        boolean a() {
            return this.b == 0;
        }
    }

    static final androidx.collection.e a;
    private static final ExecutorService b;
    static final Object c;
    static final androidx.collection.g d;

    static {
        g.a = new androidx.collection.e(16);
        g.b = i.a("fonts-androidx", 10, 10000);
        g.c = new Object();
        g.d = new androidx.collection.g();
    }

    private static String a(f f0, int v) {
        return f0.d() + "-" + v;
    }

    private static int b(a h$a0) {
        int v = 1;
        switch(h$a0.c()) {
            case 0: {
                b[] arr_h$b = h$a0.b();
                if(arr_h$b != null && arr_h$b.length != 0) {
                    v = 0;
                    for(int v1 = 0; v1 < arr_h$b.length; ++v1) {
                        int v2 = arr_h$b[v1].b();
                        if(v2 != 0) {
                            return v2 < 0 ? -3 : v2;
                        }
                    }
                }
                return v;
            }
            case 1: {
                return -2;
            }
            default: {
                return -3;
            }
        }
    }

    static e c(String s, Context context0, f f0, int v) {
        a h$a0;
        androidx.collection.e e0 = g.a;
        Typeface typeface0 = (Typeface)e0.get(s);
        if(typeface0 != null) {
            return new e(typeface0);
        }
        try {
            h$a0 = z.e.e(context0, f0, null);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return new e(-1);
        }
        int v1 = g.b(h$a0);
        if(v1 != 0) {
            return new e(v1);
        }
        Typeface typeface1 = h.b(context0, null, h$a0.b(), v);
        if(typeface1 != null) {
            e0.put(s, typeface1);
            return new e(typeface1);
        }
        return new e(-3);
    }

    static Typeface d(Context context0, f f0, int v, Executor executor0, z.a a0) {
        class z.g.b implements B.a {
            final z.a a;

            z.g.b(z.a a0) {
            }

            @Override  // B.a
            public void a(Object object0) {
                this.b(((e)object0));
            }

            public void b(e g$e0) {
                if(g$e0 == null) {
                    g$e0 = new e(-3);
                }
                this.a.b(g$e0);
            }
        }


        class c implements Callable {
            final String a;
            final Context b;
            final f c;
            final int d;

            c(String s, Context context0, f f0, int v) {
                this.b = context0;
                this.c = f0;
                this.d = v;
                super();
            }

            public e a() {
                try {
                    return g.c(this.a, this.b, this.c, this.d);
                }
                catch(Throwable unused_ex) {
                    return new e(-3);
                }
            }

            @Override
            public Object call() {
                return this.a();
            }
        }


        class d implements B.a {
            final String a;

            d(String s) {
            }

            @Override  // B.a
            public void a(Object object0) {
                this.b(((e)object0));
            }

            public void b(e g$e0) {
                ArrayList arrayList0;
                synchronized(g.c) {
                    androidx.collection.g g0 = g.d;
                    arrayList0 = (ArrayList)g0.get(this.a);
                    if(arrayList0 == null) {
                        return;
                    }
                    g0.remove(this.a);
                }
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    ((B.a)arrayList0.get(v1)).a(g$e0);
                }
            }
        }

        String s = g.a(f0, v);
        Typeface typeface0 = (Typeface)g.a.get(s);
        if(typeface0 != null) {
            a0.b(new e(typeface0));
            return typeface0;
        }
        z.g.b g$b0 = new z.g.b(a0);
        synchronized(g.c) {
            androidx.collection.g g0 = g.d;
            ArrayList arrayList0 = (ArrayList)g0.get(s);
            if(arrayList0 != null) {
                arrayList0.add(g$b0);
                return null;
            }
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(g$b0);
            g0.put(s, arrayList1);
        }
        c g$c0 = new c(s, context0, f0, v);
        if(executor0 == null) {
            executor0 = g.b;
        }
        i.b(executor0, g$c0, new d(s));
        return null;
    }

    static Typeface e(Context context0, f f0, z.a a0, int v, int v1) {
        class z.g.a implements Callable {
            final String a;
            final Context b;
            final f c;
            final int d;

            z.g.a(String s, Context context0, f f0, int v) {
                this.b = context0;
                this.c = f0;
                this.d = v;
                super();
            }

            public e a() {
                return g.c(this.a, this.b, this.c, this.d);
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        String s = g.a(f0, v);
        Typeface typeface0 = (Typeface)g.a.get(s);
        if(typeface0 != null) {
            a0.b(new e(typeface0));
            return typeface0;
        }
        if(v1 == -1) {
            e g$e0 = g.c(s, context0, f0, v);
            a0.b(g$e0);
            return g$e0.a;
        }
        z.g.a g$a0 = new z.g.a(s, context0, f0, v);
        try {
            e g$e1 = (e)i.c(g.b, g$a0, v1);
            a0.b(g$e1);
            return g$e1.a;
        }
        catch(InterruptedException unused_ex) {
            a0.b(new e(-3));
            return null;
        }
    }
}

