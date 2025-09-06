package com.onesignal;

class n2 extends m2 {
    n2(String s, boolean z) {
        super("email" + s, z);
    }

    @Override  // com.onesignal.m2
    protected void a() {
    }

    @Override  // com.onesignal.m2
    m2 p(String s) {
        return new n2(s, false);
    }
}

