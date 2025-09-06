package com.google.firebase.messaging;

public final class r implements Runnable {
    public final FirebaseMessaging f;

    public r(FirebaseMessaging firebaseMessaging0) {
        this.f = firebaseMessaging0;
    }

    @Override
    public final void run() {
        this.f.w();
    }
}

