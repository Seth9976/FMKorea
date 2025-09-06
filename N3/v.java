package N3;

import I3.B0;
import java.util.List;
import l3.e;

public abstract class v {
    static {
    }

    private static final w a(Throwable throwable0, String s) {
        if(throwable0 != null) {
            throw throwable0;
        }
        v.d();
        throw new e();
    }

    static w b(Throwable throwable0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        return v.a(throwable0, s);
    }

    public static final boolean c(B0 b00) {
        return b00.h0() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'");
    }

    public static final B0 e(t t0, List list0) {
        try {
            return t0.b(list0);
        }
        catch(Throwable throwable0) {
            return v.a(throwable0, t0.a());
        }
    }
}

