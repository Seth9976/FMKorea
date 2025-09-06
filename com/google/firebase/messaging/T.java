package com.google.firebase.messaging;

public final class t implements Runnable {
    public final FirebaseMessaging f;

    public t(FirebaseMessaging firebaseMessaging0) {
        this.f = firebaseMessaging0;
    }

    @Override
    public final void run() {
        this.f.y();
    }
}

