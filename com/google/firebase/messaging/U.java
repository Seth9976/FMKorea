package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class u implements Runnable {
    public final FirebaseMessaging f;
    public final TaskCompletionSource g;

    public u(FirebaseMessaging firebaseMessaging0, TaskCompletionSource taskCompletionSource0) {
        this.f = firebaseMessaging0;
        this.g = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.f.v(this.g);
    }
}

