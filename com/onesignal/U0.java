package com.onesignal;

import java.util.Timer;
import java.util.TimerTask;

abstract class u0 {
    static void a(TimerTask timerTask0, String s, long v) {
        I1.p1(C.k, "scheduleTrigger: " + s + " delay: " + v);
        new Timer("trigger_timer:" + s).schedule(timerTask0, v);
    }
}

