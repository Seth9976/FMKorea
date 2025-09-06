package I3;

import p3.f;

public interface l extends f {
    public static abstract class a {
        public static boolean a(l l0, Throwable throwable0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                throwable0 = null;
            }
            return l0.m(throwable0);
        }
    }

    Object b(Object arg1, Object arg2, y3.l arg3);

    void i(y3.l arg1);

    boolean m(Throwable arg1);

    void o(Object arg1, y3.l arg2);

    void p(Object arg1);
}

