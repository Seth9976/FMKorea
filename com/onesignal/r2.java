package com.onesignal;

class r2 extends m2 {
    r2(String s, boolean z) {
        super("sms" + s, z);
    }

    @Override  // com.onesignal.m2
    protected void a() {
    }

    @Override  // com.onesignal.m2
    m2 p(String s) {
        return new r2(s, false);
    }
}

