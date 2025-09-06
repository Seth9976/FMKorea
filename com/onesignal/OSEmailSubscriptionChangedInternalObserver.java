package com.onesignal;

class OSEmailSubscriptionChangedInternalObserver {
    static void a(v0 v00) {
        w0 w00 = new w0(I1.f0, ((v0)v00.clone()));
        if(I1.j0().c(w00)) {
            v0 v01 = (v0)v00.clone();
            I1.f0 = v01;
            v01.f();
        }
    }

    void changed(v0 v00) {
        OSEmailSubscriptionChangedInternalObserver.a(v00);
    }
}

