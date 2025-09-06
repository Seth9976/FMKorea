package I3;

import java.util.concurrent.CancellationException;
import z3.k;

public final class r0 extends CancellationException {
    public final transient q0 f;

    public r0(String s, Throwable throwable0, q0 q00) {
        super(s);
        this.f = q00;
        if(throwable0 != null) {
            this.initCause(throwable0);
        }
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof r0 && k.a(((r0)object0).getMessage(), this.getMessage()) && k.a(((r0)object0).f, this.f) && k.a(((r0)object0).getCause(), this.getCause());
    }

    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public int hashCode() {
        String s = this.getMessage();
        k.b(s);
        int v = s.hashCode();
        int v1 = this.f.hashCode();
        Throwable throwable0 = this.getCause();
        return throwable0 == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + throwable0.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "; job=" + this.f;
    }
}

