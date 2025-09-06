package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import n0.a;

public final class WorkManagerInitializer implements a {
    private static final String a;

    static {
        WorkManagerInitializer.a = "WM-WrkMgrInitializer";
    }

    @Override  // n0.a
    public List a() {
        return Collections.emptyList();
    }

    @Override  // n0.a
    public Object b(Context context0) {
        return this.c(context0);
    }

    public u c(Context context0) {
        k.e().a("WM-WrkMgrInitializer", "Initializing WorkManager with default configuration.");
        u.g(context0, new b().a());
        return u.f(context0);
    }
}

