package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.n;
import l3.o;

final class f extends AtomicBoolean implements OutcomeReceiver {
    private final p3.f f;

    public f(p3.f f0) {
        super(false);
        this.f = f0;
    }

    @Override  // android.os.OutcomeReceiver
    public void onError(Throwable throwable0) {
        if(this.compareAndSet(false, true)) {
            Object object0 = n.a(o.a(throwable0));
            this.f.e(object0);
        }
    }

    @Override  // android.os.OutcomeReceiver
    public void onResult(Object object0) {
        if(this.compareAndSet(false, true)) {
            this.f.e(object0);
        }
    }

    @Override
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + this.get() + ')';
    }
}

