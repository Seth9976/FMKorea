package Q0;

import b1.a;
import com.facebook.internal.l.b;
import com.facebook.internal.l;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c {
    private static final AtomicBoolean a;

    static {
        c.a = new AtomicBoolean(false);
    }

    public static void a() {
        Class class0 = c.class;
        if(a.d(class0)) {
            return;
        }
        try {
            c.a.set(true);
            c.b();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    public static void b() {
        Class class0 = c.class;
        if(a.d(class0)) {
            return;
        }
        try {
            if(!c.a.get() || c.c() && l.g(b.u)) {
                return;
            }
            Q0.a.g();
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private static boolean c() {
        a.d(c.class);
        return false;
    }
}

