package com.facebook.internal;

import com.facebook.h;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import z3.k;

public final class u {
    private Object a;
    private CountDownLatch b;

    public u(Callable callable0) {
        static final class a implements Callable {
            final u a;
            final Callable b;

            a(u u0, Callable callable0) {
                this.a = u0;
                this.b = callable0;
                super();
            }

            public final Void a() {
                CountDownLatch countDownLatch0;
                try {
                    Object object0 = this.b.call();
                    this.a.a = object0;
                    countDownLatch0 = this.a.b;
                }
                catch(Throwable throwable0) {
                    CountDownLatch countDownLatch1 = this.a.b;
                    if(countDownLatch1 != null) {
                        countDownLatch1.countDown();
                    }
                    throw throwable0;
                }
                if(countDownLatch0 != null) {
                    countDownLatch0.countDown();
                }
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        k.e(callable0, "callable");
        super();
        this.b = new CountDownLatch(1);
        h.m().execute(new FutureTask(new a(this, callable0)));
    }
}

