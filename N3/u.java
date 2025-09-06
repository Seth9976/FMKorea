package N3;

import F3.f;
import I3.B0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class u {
    public static final u a;
    public static final B0 b;

    static {
        u u0 = new u();
        u.a = u0;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        u.b = u0.a();
    }

    private final B0 a() {
        Object object0;
        try {
            List list0 = f.q(f.c(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator iterator0 = list0.iterator();
            if(iterator0.hasNext()) {
                object0 = iterator0.next();
                if(iterator0.hasNext()) {
                    int v = ((t)object0).c();
                    while(true) {
                        Object object1 = iterator0.next();
                        int v1 = ((t)object1).c();
                        if(v < v1) {
                            object0 = object1;
                            v = v1;
                        }
                        if(!iterator0.hasNext()) {
                            break;
                        }
                    }
                }
            }
            else {
                object0 = null;
            }
            if(((t)object0) != null) {
                B0 b00 = v.e(((t)object0), list0);
                if(b00 != null) {
                    return b00;
                }
            }
            v.b(null, null, 3, null);
            return null;
        }
        catch(Throwable throwable0) {
        }
        v.b(throwable0, null, 2, null);
        return null;
    }
}

