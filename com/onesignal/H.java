package com.onesignal;

import android.content.Context;
import android.os.Process;
import android.util.Log;

abstract class h {
    static int a(Context context0, String s) {
        try {
            return context0.checkPermission(s, Process.myPid(), Process.myUid());
        }
        catch(Throwable unused_ex) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    static int b(Context context0, int v) {
        return context0.getColor(v);
    }
}

