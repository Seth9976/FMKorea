package androidx.work;

import android.util.Log;

public abstract class k {
    public static class a extends k {
        private final int d;

        public a(int v) {
            super(v);
            this.d = v;
        }

        @Override  // androidx.work.k
        public void a(String s, String s1) {
            if(this.d <= 3) {
                Log.d(s, s1);
            }
        }

        @Override  // androidx.work.k
        public void b(String s, String s1, Throwable throwable0) {
            if(this.d <= 3) {
                Log.d(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.k
        public void c(String s, String s1) {
            if(this.d <= 6) {
                Log.e(s, s1);
            }
        }

        @Override  // androidx.work.k
        public void d(String s, String s1, Throwable throwable0) {
            if(this.d <= 6) {
                Log.e(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.k
        public void f(String s, String s1) {
            if(this.d <= 4) {
                Log.i(s, s1);
            }
        }

        @Override  // androidx.work.k
        public void g(String s, String s1, Throwable throwable0) {
            if(this.d <= 4) {
                Log.i(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.k
        public void j(String s, String s1) {
            if(this.d <= 2) {
                Log.v(s, s1);
            }
        }

        @Override  // androidx.work.k
        public void k(String s, String s1) {
            if(this.d <= 5) {
                Log.w(s, s1);
            }
        }

        @Override  // androidx.work.k
        public void l(String s, String s1, Throwable throwable0) {
            if(this.d <= 5) {
                Log.w(s, s1, throwable0);
            }
        }
    }

    private static final Object a = null;
    private static volatile k b = null;
    private static final int c = 20;

    static {
        k.a = new Object();
    }

    public k(int v) {
    }

    public abstract void a(String arg1, String arg2);

    public abstract void b(String arg1, String arg2, Throwable arg3);

    public abstract void c(String arg1, String arg2);

    public abstract void d(String arg1, String arg2, Throwable arg3);

    public static k e() {
        synchronized(k.a) {
            if(k.b == null) {
                k.b = new a(3);
            }
            return k.b;
        }
    }

    public abstract void f(String arg1, String arg2);

    public abstract void g(String arg1, String arg2, Throwable arg3);

    public static void h(k k0) {
        synchronized(k.a) {
            k.b = k0;
        }
    }

    public static String i(String s) {
        StringBuilder stringBuilder0 = new StringBuilder(23);
        stringBuilder0.append("WM-");
        if(s.length() >= k.c) {
            stringBuilder0.append(s.substring(0, 20));
            return stringBuilder0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public abstract void j(String arg1, String arg2);

    public abstract void k(String arg1, String arg2);

    public abstract void l(String arg1, String arg2, Throwable arg3);
}

