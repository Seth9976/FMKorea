package androidx.core.os;

import android.os.CancellationSignal;

public final class d {
    public interface a {
        void a();
    }

    private boolean a;
    private a b;
    private Object c;
    private boolean d;

    public void a() {
        Object object0;
        a d$a0;
        synchronized(this) {
            if(this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            d$a0 = this.b;
            object0 = this.c;
        }
        try {
            if(d$a0 != null) {
                d$a0.a();
            }
            if(object0 != null) {
                ((CancellationSignal)object0).cancel();
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        synchronized(this) {
            this.d = false;
            this.notifyAll();
        }
        throw throwable0;
    label_24:
        synchronized(this) {
            this.d = false;
            this.notifyAll();
        }
    }

    public void b(a d$a0) {
        synchronized(this) {
            this.c();
            if(this.b == d$a0) {
                return;
            }
            this.b = d$a0;
            if(this.a && d$a0 != null) {
                d$a0.a();
            }
        }
    }

    private void c() {
        while(this.d) {
            try {
                this.wait();
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }
}

