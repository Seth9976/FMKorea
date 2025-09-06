package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class g implements Runnable {
    public final b f;
    public final i g;
    public final ThreadPoolExecutor h;

    public g(b emojiCompatInitializer$b0, i f$i0, ThreadPoolExecutor threadPoolExecutor0) {
        this.f = emojiCompatInitializer$b0;
        this.g = f$i0;
        this.h = threadPoolExecutor0;
    }

    @Override
    public final void run() {
        this.f.d(this.g, this.h);
    }
}

