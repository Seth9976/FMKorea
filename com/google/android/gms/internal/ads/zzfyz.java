package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class zzfyz extends TimeoutException {
    zzfyz(String s, zzfyy zzfyy0) {
        super(s);
    }

    @Override
    public final Throwable fillInStackTrace() {
        synchronized(this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }
}

