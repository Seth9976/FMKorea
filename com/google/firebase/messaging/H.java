package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class h implements Runnable {
    public final i f;
    public final Intent g;
    public final TaskCompletionSource h;

    public h(i i0, Intent intent0, TaskCompletionSource taskCompletionSource0) {
        this.f = i0;
        this.g = intent0;
        this.h = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.f.i(this.g, this.h);
    }
}

