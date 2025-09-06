package I0;

import android.util.Log;
import java.util.ArrayList;

public class g {
    public interface a {
        void a(String arg1, String arg2, Exception arg3, int arg4);
    }

    private final ArrayList a;
    private static g b;

    private g() {
        this.a = new ArrayList();
    }

    public static g a() {
        synchronized(g.class) {
            if(g.b == null) {
                g.b = new g();
            }
            return g.b;
        }
    }

    public void b(String s, String s1) {
        this.d(s, s1, null, 0);
    }

    public void c(String s, String s1, Exception exception0) {
        this.d(s, s1, exception0, 0);
    }

    public void d(String s, String s1, Exception exception0, int v) {
        Log.e(s, s1, exception0);
        for(Object object0: this.a) {
            ((a)object0).a(s, s1, exception0, v);
        }
    }

    public void e(a g$a0) {
        this.a.add(g$a0);
    }

    public void f(a g$a0) {
        this.a.remove(g$a0);
    }
}

