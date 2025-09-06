package com.onesignal;

import android.os.SystemClock;

public class w1 implements v1 {
    @Override  // com.onesignal.v1
    public long a() {
        return System.currentTimeMillis();
    }

    @Override  // com.onesignal.v1
    public long b() {
        return SystemClock.elapsedRealtime();
    }
}

