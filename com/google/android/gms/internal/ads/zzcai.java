package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

final class zzcai extends ScheduledThreadPoolExecutor {
    zzcai(int v, ThreadFactory threadFactory0) {
        super(3, threadFactory0);
    }
}

