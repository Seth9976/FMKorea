package com.onesignal;

import android.app.Activity;
import androidx.core.app.b;

abstract class g {
    static void a(Activity activity0, String[] arr_s, int v) {
        activity0.requestPermissions(arr_s, v);
    }

    static boolean b(Activity activity0, String s) {
        return b.f(activity0, s);
    }
}

