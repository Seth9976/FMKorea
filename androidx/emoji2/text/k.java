package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.o;
import androidx.core.os.u;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import z.f;
import z.h.b;
import z.h;

public class k extends c {
    public static class a {
        public Typeface a(Context context0, b h$b0) {
            return h.a(context0, null, new b[]{h$b0});
        }

        public z.h.a b(Context context0, f f0) {
            return h.b(context0, null, f0);
        }

        public void c(Context context0, ContentObserver contentObserver0) {
            context0.getContentResolver().unregisterContentObserver(contentObserver0);
        }
    }

    static class androidx.emoji2.text.k.b implements androidx.emoji2.text.f.h {
        private final Context a;
        private final f b;
        private final a c;
        private final Object d;
        private Handler e;
        private Executor f;
        private ThreadPoolExecutor g;
        i h;
        private ContentObserver i;
        private Runnable j;

        androidx.emoji2.text.k.b(Context context0, f f0, a k$a0) {
            this.d = new Object();
            B.h.h(context0, "Context cannot be null");
            B.h.h(f0, "FontRequest cannot be null");
            this.a = context0.getApplicationContext();
            this.b = f0;
            this.c = k$a0;
        }

        @Override  // androidx.emoji2.text.f$h
        public void a(i f$i0) {
            B.h.h(f$i0, "LoaderCallback cannot be null");
            synchronized(this.d) {
                this.h = f$i0;
            }
            this.d();
        }

        private void b() {
            synchronized(this.d) {
                this.h = null;
                ContentObserver contentObserver0 = this.i;
                if(contentObserver0 != null) {
                    this.c.c(this.a, contentObserver0);
                    this.i = null;
                }
                Handler handler0 = this.e;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.j);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor0 = this.g;
                if(threadPoolExecutor0 != null) {
                    threadPoolExecutor0.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }

        // 检测为 Lambda 实现
        void c() [...]

        void d() {
            synchronized(this.d) {
                if(this.h == null) {
                    return;
                }
                if(this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor0 = androidx.emoji2.text.c.b("emojiCompat");
                    this.g = threadPoolExecutor0;
                    this.f = threadPoolExecutor0;
                }
                this.f.execute(() -> {
                    synchronized(this.d) {
                        if(this.h == null) {
                            return;
                        }
                    }
                    try {
                        b h$b0 = this.e();
                        int v = h$b0.b();
                        if(v != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + v + ")");
                        }
                        try {
                            u.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typeface0 = this.c.a(this.a, h$b0);
                            ByteBuffer byteBuffer0 = o.f(this.a, null, h$b0.d());
                            if(byteBuffer0 != null && typeface0 != null) {
                                n n0 = n.b(typeface0, byteBuffer0);
                                synchronized(this.d) {
                                    i f$i0 = this.h;
                                    if(f$i0 != null) {
                                        f$i0.b(n0);
                                    }
                                }
                                this.b();
                                return;
                            }
                        }
                        finally {
                            u.b();
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    catch(Throwable throwable0) {
                        synchronized(this.d) {
                            i f$i1 = this.h;
                            if(f$i1 != null) {
                                f$i1.a(throwable0);
                            }
                        }
                        this.b();
                    }
                });
            }
        }

        private b e() {
            z.h.a h$a0;
            try {
                h$a0 = this.c.b(this.a, this.b);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new RuntimeException("provider not found", packageManager$NameNotFoundException0);
            }
            if(h$a0.c() != 0) {
                throw new RuntimeException("fetchFonts failed (" + h$a0.c() + ")");
            }
            b[] arr_h$b = h$a0.b();
            if(arr_h$b == null || arr_h$b.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return arr_h$b[0];
        }

        public void f(Executor executor0) {
            synchronized(this.d) {
                this.f = executor0;
            }
        }
    }

    private static final a k;

    static {
        k.k = new a();
    }

    public k(Context context0, f f0) {
        super(new androidx.emoji2.text.k.b(context0, f0, k.k));
    }

    public k c(Executor executor0) {
        ((androidx.emoji2.text.k.b)this.a()).f(executor0);
        return this;
    }
}

