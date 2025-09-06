package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import n0.a;

public class EmojiCompatInitializer implements a {
    static class androidx.emoji2.text.EmojiCompatInitializer.a extends c {
        protected androidx.emoji2.text.EmojiCompatInitializer.a(Context context0) {
            super(new b(context0));
            this.b(1);
        }
    }

    static class b implements h {
        private final Context a;

        b(Context context0) {
            this.a = context0.getApplicationContext();
        }

        @Override  // androidx.emoji2.text.f$h
        public void a(i f$i0) {
            ThreadPoolExecutor threadPoolExecutor0 = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutor0.execute(() -> this.c(f$i0, threadPoolExecutor0));
        }

        void c(i f$i0, ThreadPoolExecutor threadPoolExecutor0) {
            class androidx.emoji2.text.EmojiCompatInitializer.b.a extends i {
                final i a;
                final ThreadPoolExecutor b;
                final b c;

                androidx.emoji2.text.EmojiCompatInitializer.b.a(i f$i0, ThreadPoolExecutor threadPoolExecutor0) {
                    this.a = f$i0;
                    this.b = threadPoolExecutor0;
                    super();
                }

                @Override  // androidx.emoji2.text.f$i
                public void a(Throwable throwable0) {
                    try {
                        this.a.a(throwable0);
                    }
                    finally {
                        this.b.shutdown();
                    }
                }

                @Override  // androidx.emoji2.text.f$i
                public void b(n n0) {
                    try {
                        this.a.b(n0);
                    }
                    finally {
                        this.b.shutdown();
                    }
                }
            }

            try {
                k k0 = d.a(this.a);
                if(k0 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                k0.c(threadPoolExecutor0);
                k0.a().a(new androidx.emoji2.text.EmojiCompatInitializer.b.a(this, f$i0, threadPoolExecutor0));
                return;
            }
            catch(Throwable throwable0) {
            }
            f$i0.a(throwable0);
            threadPoolExecutor0.shutdown();
        }

        // 检测为 Lambda 实现
        private void d(i f$i0, ThreadPoolExecutor threadPoolExecutor0) [...]
    }

    static class androidx.emoji2.text.EmojiCompatInitializer.c implements Runnable {
        @Override
        public void run() {
            try {
                u.a("EmojiCompat.EmojiCompatInitializer.run");
            }
            finally {
                u.b();
            }
        }
    }

    @Override  // n0.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override  // n0.a
    public Object b(Context context0) {
        return this.c(context0);
    }

    public Boolean c(Context context0) {
        f.h(new androidx.emoji2.text.EmojiCompatInitializer.a(context0));
        this.d(context0);
        return true;
    }

    void d(Context context0) {
        androidx.lifecycle.h h0 = ((androidx.lifecycle.n)androidx.startup.a.e(context0).f(ProcessLifecycleInitializer.class)).getLifecycle();
        h0.a(new androidx.lifecycle.d() {
            final EmojiCompatInitializer g;

            @Override  // androidx.lifecycle.d
            public void a(androidx.lifecycle.n n0) {
                EmojiCompatInitializer.this.e();
                h0.c(this);
            }

            @Override  // androidx.lifecycle.d
            public void b(androidx.lifecycle.n n0) {
                androidx.lifecycle.c.a(this, n0);
            }

            @Override  // androidx.lifecycle.d
            public void d(androidx.lifecycle.n n0) {
                androidx.lifecycle.c.c(this, n0);
            }

            @Override  // androidx.lifecycle.d
            public void e(androidx.lifecycle.n n0) {
                androidx.lifecycle.c.e(this, n0);
            }

            @Override  // androidx.lifecycle.d
            public void f(androidx.lifecycle.n n0) {
                androidx.lifecycle.c.b(this, n0);
            }

            @Override  // androidx.lifecycle.d
            public void g(androidx.lifecycle.n n0) {
                androidx.lifecycle.c.d(this, n0);
            }
        });
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new androidx.emoji2.text.EmojiCompatInitializer.c(), 500L);
    }
}

