package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class w implements SuccessContinuation {
    public final FirebaseMessaging a;
    public final String b;
    public final a c;

    public w(FirebaseMessaging firebaseMessaging0, String s, a v$a0) {
        this.a = firebaseMessaging0;
        this.b = s;
        this.c = v$a0;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return this.a.u(this.b, this.c, ((String)object0));
    }
}

