package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.h;
import java.util.concurrent.locks.ReentrantReadWriteLock;

abstract class b {
    private static final String a = "b";
    private static ReentrantReadWriteLock b;
    private static String c;
    private static volatile boolean d;

    static {
        b.b = new ReentrantReadWriteLock();
        b.d = false;
    }

    public static String b() {
        if(!b.d) {
            Log.w("b", "initStore should have been called before calling setUserID");
            b.c();
        }
        b.b.readLock().lock();
        String s = b.c;
        b.b.readLock().unlock();
        return s;
    }

    private static void c() {
        if(b.d) {
            return;
        }
        b.b.writeLock().lock();
        try {
            if(b.d) {
                return;
            }
            b.c = PreferenceManager.getDefaultSharedPreferences(h.e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            b.d = true;
        }
        finally {
            b.b.writeLock().unlock();
        }
    }

    public static void d() {
        static final class a implements Runnable {
            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    b.c();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        if(b.d) {
            return;
        }
        m.b().execute(new a());
    }
}

