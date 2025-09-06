package K3;

import E3.d;
import I3.l;
import N3.F;
import N3.G;
import y3.p;
import z3.j;

public abstract class c {
    private static final h a;
    public static final int b;
    private static final int c;
    public static final F d;
    private static final F e;
    private static final F f;
    private static final F g;
    private static final F h;
    private static final F i;
    private static final F j;
    private static final F k;
    private static final F l;
    private static final F m;
    private static final F n;
    private static final F o;
    private static final F p;
    private static final F q;
    private static final F r;
    private static final F s;

    static {
        c.a = new h(-1L, null, null, 0);
        c.b = G.g("kotlinx.coroutines.bufferedChannel.segmentSize", 0x20, 0, 0, 12, null);
        c.c = G.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        c.d = new F("BUFFERED");
        c.e = new F("SHOULD_BUFFER");
        c.f = new F("S_RESUMING_BY_RCV");
        c.g = new F("RESUMING_BY_EB");
        c.h = new F("POISONED");
        c.i = new F("DONE_RCV");
        c.j = new F("INTERRUPTED_SEND");
        c.k = new F("INTERRUPTED_RCV");
        c.l = new F("CHANNEL_CLOSED");
        c.m = new F("SUSPEND");
        c.n = new F("SUSPEND_NO_WAITER");
        c.o = new F("FAILED");
        c.p = new F("NO_RECEIVE_RESULT");
        c.q = new F("CLOSE_HANDLER_CLOSED");
        c.r = new F("CLOSE_HANDLER_INVOKED");
        c.s = new F("NO_CLOSE_CAUSE");
    }

    private static final boolean A(l l0, Object object0, y3.l l1) {
        Object object1 = l0.b(object0, null, l1);
        if(object1 != null) {
            l0.p(object1);
            return true;
        }
        return false;
    }

    static boolean B(l l0, Object object0, y3.l l1, int v, Object object1) {
        if((v & 2) != 0) {
            l1 = null;
        }
        return c.A(l0, object0, l1);
    }

    public static final long b(long v, int v1) {
        return (((long)v1) << 60) + v;
    }

    public static final F d() {
        return c.q;
    }

    public static final F e() {
        return c.r;
    }

    public static final long s(int v) {
        return c.z(v);
    }

    // 去混淆评级： 低(20)
    private static final long u(long v, boolean z) {
        return z ? v + 0x4000000000000000L : v;
    }

    private static final long v(long v, int v1) [...] // Inlined contents

    private static final h w(long v, h h0) {
        return new h(v, h0, h0.u(), 0);
    }

    public static final d x() {
        final class a extends j implements p {
            public static final a o;

            static {
                a.o = new a();
            }

            a() {
                super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.p(((Number)object0).longValue(), ((h)object1));
            }

            public final h p(long v, h h0) {
                return c.w(v, h0);
            }
        }

        return a.o;
    }

    public static final F y() {
        return c.l;
    }

    private static final long z(int v) {
        switch(v) {
            case 0: {
                return 0L;
            }
            case 0x7FFFFFFF: {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            default: {
                return (long)v;
            }
        }
    }
}

