package b2;

import java.util.concurrent.Executor;

public final class c implements Executor {
    public static final c f;

    static {
        c.f = new c();
    }

    // 检测为 Lambda 实现
    @Override
    public final void execute(Runnable runnable0) [...]
}

