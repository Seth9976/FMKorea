package com.onesignal;

class OSSubscriptionChangedInternalObserver {
    static void a(OSSubscriptionState oSSubscriptionState0) {
        p1 p10 = new p1(I1.c0, ((OSSubscriptionState)oSSubscriptionState0.clone()));
        if(I1.F0().c(p10)) {
            OSSubscriptionState oSSubscriptionState1 = (OSSubscriptionState)oSSubscriptionState0.clone();
            I1.c0 = oSSubscriptionState1;
            oSSubscriptionState1.i();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState0) {
        OSSubscriptionChangedInternalObserver.a(oSSubscriptionState0);
    }
}

