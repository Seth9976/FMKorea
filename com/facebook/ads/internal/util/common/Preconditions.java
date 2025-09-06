package com.facebook.ads.internal.util.common;

import android.os.Looper;
import androidx.annotation.Keep;

@Keep
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("Must be called from the UiThread");
        }
    }

    public static void checkIsTrue(boolean z, String s) {
        if(!z) {
            throw new IllegalArgumentException(s);
        }
    }

    public static Object checkNotNull(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(s);
        }
        return object0;
    }
}

