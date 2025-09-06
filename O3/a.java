package o3;

import z3.k;

public abstract class a {
    public static final Thread a(boolean z, boolean z1, ClassLoader classLoader0, String s, int v, y3.a a0) {
        public static final class o3.a.a extends Thread {
            final y3.a f;

            o3.a.a(y3.a a0) {
                this.f = a0;
                super();
            }

            @Override
            public void run() {
                this.f.a();
            }
        }

        k.e(a0, "block");
        Thread thread0 = new o3.a.a(a0);
        if(z1) {
            thread0.setDaemon(true);
        }
        if(v > 0) {
            thread0.setPriority(v);
        }
        if(s != null) {
            thread0.setName(s);
        }
        if(classLoader0 != null) {
            thread0.setContextClassLoader(classLoader0);
        }
        if(z) {
            thread0.start();
        }
        return thread0;
    }

    public static Thread b(boolean z, boolean z1, ClassLoader classLoader0, String s, int v, y3.a a0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        if((v1 & 2) != 0) {
            z1 = false;
        }
        if((v1 & 16) != 0) {
            v = -1;
        }
        return a.a(z, z1, ((v1 & 4) == 0 ? classLoader0 : null), ((v1 & 8) == 0 ? s : null), v, a0);
    }
}

