package androidx.profileinstaller;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n0.a;

public class ProfileInstallerInitializer implements a {
    static abstract class androidx.profileinstaller.ProfileInstallerInitializer.a {
        // 检测为 Lambda 实现
        private static void b(Runnable runnable0, long v) [...]

        public static void c(Runnable runnable0) {
            Choreographer.getInstance().postFrameCallback((long v) -> runnable0.run());
        }
    }

    static abstract class b {
        public static Handler a(Looper looper0) {
            return Handler.createAsync(looper0);
        }
    }

    public static class c {
    }

    @Override  // n0.a
    public List a() {
        return Collections.emptyList();
    }

    @Override  // n0.a
    public Object b(Context context0) {
        return this.f(context0);
    }

    public c f(Context context0) {
        if(Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        this.g(context0.getApplicationContext());
        return new c();
    }

    void g(Context context0) {
        androidx.profileinstaller.ProfileInstallerInitializer.a.c(() -> this.h(context0));
    }

    void h(Context context0) {
        Handler handler0 = Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : b.a(Looper.getMainLooper());
        int v = new Random().nextInt(1000);
        handler0.postDelayed(() -> new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new l(context0)), ((long)(v + 5000)));
    }

    // 检测为 Lambda 实现
    private void i(Context context0) [...]

    // 检测为 Lambda 实现
    private static void l(Context context0) [...]
}

