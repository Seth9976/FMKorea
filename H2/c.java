package h2;

import android.os.Bundle;
import g2.f;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements a, b {
    private final e a;
    private final int b;
    private final TimeUnit c;
    private final Object d;
    private CountDownLatch e;
    private boolean f;

    public c(e e0, int v, TimeUnit timeUnit0) {
        this.d = new Object();
        this.f = false;
        this.a = e0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // h2.a
    public void a(String s, Bundle bundle0) {
        synchronized(this.d) {
            f.f().i("Logging event " + s + " to Firebase Analytics with params " + bundle0);
            this.e = new CountDownLatch(1);
            this.f = false;
            this.a.a(s, bundle0);
            f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if(this.e.await(((long)this.b), this.c)) {
                    this.f = true;
                    f.f().i("App exception callback received from Analytics listener.");
                }
                else {
                    f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            }
            catch(InterruptedException unused_ex) {
                f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.e = null;
        }
    }

    @Override  // h2.b
    public void onEvent(String s, Bundle bundle0) {
        CountDownLatch countDownLatch0 = this.e;
        if(countDownLatch0 == null) {
            return;
        }
        if("_ae".equals(s)) {
            countDownLatch0.countDown();
        }
    }
}

