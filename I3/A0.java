package I3;

import m3.h;

public abstract class a0 extends F {
    private long h;
    private boolean i;
    private h j;

    public final void h0(boolean z) {
        long v = this.h - this.j0(z);
        this.h = v;
        if(v > 0L) {
            return;
        }
        if(this.i) {
            this.shutdown();
        }
    }

    public static void i0(a0 a00, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if((v & 1) != 0) {
            z = false;
        }
        a00.h0(z);
    }

    // 去混淆评级： 低(20)
    private final long j0(boolean z) [...] // 潜在的解密器

    public final void k0(U u0) {
        h h0 = this.j;
        if(h0 == null) {
            h0 = new h();
            this.j = h0;
        }
        h0.addLast(u0);
    }

    protected long l0() {
        h h0 = this.j;
        if(h0 == null) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return h0.isEmpty() ? 0x7FFFFFFFFFFFFFFFL : 0L;
    }

    public final void m0(boolean z) {
        this.h += this.j0(z);
        if(!z) {
            this.i = true;
        }
    }

    public static void n0(a0 a00, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if((v & 1) != 0) {
            z = false;
        }
        a00.m0(z);
    }

    // 去混淆评级： 低(20)
    public final boolean o0() {
        return this.h >= 0x100000000L;
    }

    public final boolean p0() {
        return this.j == null ? true : this.j.isEmpty();
    }

    public abstract long q0();

    public final boolean r0() {
        h h0 = this.j;
        if(h0 == null) {
            return false;
        }
        U u0 = (U)h0.p();
        if(u0 == null) {
            return false;
        }
        u0.run();
        return true;
    }

    public boolean s0() [...] // Inlined contents

    public abstract void shutdown();
}

