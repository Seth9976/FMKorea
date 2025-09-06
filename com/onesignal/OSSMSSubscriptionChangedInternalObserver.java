package com.onesignal;

class OSSMSSubscriptionChangedInternalObserver {
    static void a(j1 j10) {
        k1 k10 = new k1(I1.i0, ((j1)j10.clone()));
        if(I1.y0().c(k10)) {
            j1 j11 = (j1)j10.clone();
            I1.i0 = j11;
            j11.f();
        }
    }

    void changed(j1 j10) {
        OSSMSSubscriptionChangedInternalObserver.a(j10);
    }
}

