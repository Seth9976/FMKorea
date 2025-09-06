package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k {
    public static final class a extends e {
        @Override  // androidx.lifecycle.e
        public void onActivityCreated(Activity activity0, Bundle bundle0) {
            z3.k.e(activity0, "activity");
            x.g.c(activity0);
        }
    }

    public static final k a;
    private static final AtomicBoolean b;

    static {
        k.a = new k();
        k.b = new AtomicBoolean(false);
    }

    public static final void a(Context context0) {
        z3.k.e(context0, "context");
        if(k.b.getAndSet(true)) {
            return;
        }
        Context context1 = context0.getApplicationContext();
        z3.k.c(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).registerActivityLifecycleCallbacks(new a());
    }
}

