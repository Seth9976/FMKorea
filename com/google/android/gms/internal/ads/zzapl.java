package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

final class zzapl implements Runnable {
    private zzapl() {
    }

    zzapl(zzapk zzapk0) {
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch0;
        try {
            zzapm.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch0 = zzapm.zzb;
        }
        catch(NoSuchAlgorithmException unused_ex) {
            countDownLatch0 = zzapm.zzb;
        }
        catch(Throwable throwable0) {
            zzapm.zzb.countDown();
            throw throwable0;
        }
        countDownLatch0.countDown();
    }
}

