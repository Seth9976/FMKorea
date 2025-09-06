package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

public final class s implements OnSuccessListener {
    public final FirebaseMessaging a;

    public s(FirebaseMessaging firebaseMessaging0) {
        this.a = firebaseMessaging0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.a.x(((a0)object0));
    }
}

