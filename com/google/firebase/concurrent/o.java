package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class o implements ScheduledExecutorService {
    private final ExecutorService f;
    private final ScheduledExecutorService g;

    o(ExecutorService executorService0, ScheduledExecutorService scheduledExecutorService0) {
        this.f = executorService0;
        this.g = scheduledExecutorService0;
    }

    // 检测为 Lambda 实现
    public static ScheduledFuture a(o o0, Callable callable0, long v, TimeUnit timeUnit0, b p$b0) [...]

    @Override
    public boolean awaitTermination(long v, TimeUnit timeUnit0) {
        return this.f.awaitTermination(v, timeUnit0);
    }

    // 检测为 Lambda 实现
    public static ScheduledFuture c(o o0, Runnable runnable0, long v, long v1, TimeUnit timeUnit0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static ScheduledFuture d(o o0, Runnable runnable0, long v, long v1, TimeUnit timeUnit0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static void e(Callable callable0, b p$b0) [...]

    @Override
    public void execute(Runnable runnable0) {
        this.f.execute(runnable0);
    }

    // 检测为 Lambda 实现
    public static void f(Runnable runnable0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static void g(o o0, Runnable runnable0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static Future h(o o0, Callable callable0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static void i(Runnable runnable0, b p$b0) [...]

    @Override
    public List invokeAll(Collection collection0) {
        return this.f.invokeAll(collection0);
    }

    @Override
    public List invokeAll(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.f.invokeAll(collection0, v, timeUnit0);
    }

    @Override
    public Object invokeAny(Collection collection0) {
        return this.f.invokeAny(collection0);
    }

    @Override
    public Object invokeAny(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.f.invokeAny(collection0, v, timeUnit0);
    }

    @Override
    public boolean isShutdown() {
        return this.f.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.f.isTerminated();
    }

    // 检测为 Lambda 实现
    public static void j(o o0, Runnable runnable0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static void k(Runnable runnable0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static void l(o o0, Runnable runnable0, b p$b0) [...]

    // 检测为 Lambda 实现
    public static ScheduledFuture m(o o0, Runnable runnable0, long v, TimeUnit timeUnit0, b p$b0) [...]

    private static void n(Runnable runnable0, b p$b0) {
        try {
            runnable0.run();
            p$b0.set(null);
        }
        catch(Exception exception0) {
            p$b0.a(exception0);
        }
    }

    private void o(Runnable runnable0, b p$b0) {
        m m0 = () -> o.n(runnable0, p$b0);
        this.f.execute(m0);
    }

    private ScheduledFuture p(Runnable runnable0, long v, TimeUnit timeUnit0, b p$b0) {
        j j0 = () -> this.o(runnable0, p$b0);
        return this.g.schedule(j0, v, timeUnit0);
    }

    private static void q(Callable callable0, b p$b0) {
        try {
            p$b0.set(callable0.call());
        }
        catch(Exception exception0) {
            p$b0.a(exception0);
        }
    }

    private Future r(Callable callable0, b p$b0) {
        n n0 = () -> o.q(callable0, p$b0);
        return this.f.submit(n0);
    }

    private ScheduledFuture s(Callable callable0, long v, TimeUnit timeUnit0, b p$b0) {
        k k0 = () -> this.r(callable0, p$b0);
        return this.g.schedule(k0, v, timeUnit0);
    }

    @Override
    public ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        return new p((b p$b0) -> this.p(runnable0, v, timeUnit0, p$b0));
    }

    @Override
    public ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        return new p((b p$b0) -> this.s(callable0, v, timeUnit0, p$b0));
    }

    @Override
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return new p((b p$b0) -> this.v(runnable0, v, v1, timeUnit0, p$b0));
    }

    @Override
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return new p((b p$b0) -> this.x(runnable0, v, v1, timeUnit0, p$b0));
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public Future submit(Runnable runnable0) {
        return this.f.submit(runnable0);
    }

    @Override
    public Future submit(Runnable runnable0, Object object0) {
        return this.f.submit(runnable0, object0);
    }

    @Override
    public Future submit(Callable callable0) {
        return this.f.submit(callable0);
    }

    private static void t(Runnable runnable0, b p$b0) {
        try {
            runnable0.run();
        }
        catch(Exception exception0) {
            p$b0.a(exception0);
            throw exception0;
        }
    }

    private void u(Runnable runnable0, b p$b0) {
        d d0 = () -> o.t(runnable0, p$b0);
        this.f.execute(d0);
    }

    private ScheduledFuture v(Runnable runnable0, long v, long v1, TimeUnit timeUnit0, b p$b0) {
        i i0 = () -> this.u(runnable0, p$b0);
        return this.g.scheduleAtFixedRate(i0, v, v1, timeUnit0);
    }

    private void w(Runnable runnable0, b p$b0) {
        e e0 = () -> o.y(runnable0, p$b0);
        this.f.execute(e0);
    }

    private ScheduledFuture x(Runnable runnable0, long v, long v1, TimeUnit timeUnit0, b p$b0) {
        l l0 = () -> this.w(runnable0, p$b0);
        return this.g.scheduleWithFixedDelay(l0, v, v1, timeUnit0);
    }

    private static void y(Runnable runnable0, b p$b0) {
        try {
            runnable0.run();
        }
        catch(Exception exception0) {
            p$b0.a(exception0);
        }
    }
}

