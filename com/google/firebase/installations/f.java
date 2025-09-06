package com.google.firebase.installations;

import D2.d;
import com.google.android.gms.tasks.TaskCompletionSource;

class f implements h {
    final TaskCompletionSource a;

    public f(TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.firebase.installations.h
    public boolean a(d d0) {
        if(!d0.l() && !d0.k() && !d0.i()) {
            return false;
        }
        String s = d0.d();
        this.a.trySetResult(s);
        return true;
    }

    @Override  // com.google.firebase.installations.h
    public boolean b(Exception exception0) {
        return false;
    }
}

