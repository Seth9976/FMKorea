package w3;

import java.io.Closeable;
import l3.a;

public abstract class b {
    public static final void a(Closeable closeable0, Throwable throwable0) {
        if(closeable0 != null) {
            if(throwable0 == null) {
                closeable0.close();
                return;
            }
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                a.a(throwable0, throwable1);
            }
        }
    }
}

