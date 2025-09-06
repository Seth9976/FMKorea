package I3;

import java.util.concurrent.locks.LockSupport;

public abstract class c0 extends a0 {
    protected abstract Thread t0();

    protected final void u0() {
        Thread thread0 = this.t0();
        if(Thread.currentThread() != thread0) {
            LockSupport.unpark(thread0);
        }
    }
}

