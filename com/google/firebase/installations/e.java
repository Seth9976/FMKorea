package com.google.firebase.installations;

import D2.d;
import com.google.android.gms.tasks.TaskCompletionSource;

class e implements h {
    private final i a;
    private final TaskCompletionSource b;

    public e(i i0, TaskCompletionSource taskCompletionSource0) {
        this.a = i0;
        this.b = taskCompletionSource0;
    }

    @Override  // com.google.firebase.installations.h
    public boolean a(d d0) {
        if(d0.k() && !this.a.f(d0)) {
            g g0 = g.a().b(d0.b()).d(d0.c()).c(d0.h()).a();
            this.b.setResult(g0);
            return true;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.h
    public boolean b(Exception exception0) {
        this.b.trySetException(exception0);
        return true;
    }
}

