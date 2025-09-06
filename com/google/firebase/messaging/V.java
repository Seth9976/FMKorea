package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;

public final class v implements a {
    public final FirebaseMessaging a;
    public final String b;
    public final com.google.firebase.messaging.V.a c;

    public v(FirebaseMessaging firebaseMessaging0, String s, com.google.firebase.messaging.V.a v$a0) {
        this.a = firebaseMessaging0;
        this.b = s;
        this.c = v$a0;
    }

    @Override  // com.google.firebase.messaging.P$a
    public final Task start() {
        return this.a.t(this.b, this.c);
    }
}

