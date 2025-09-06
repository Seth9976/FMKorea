package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import m3.o;
import n0.a;
import z3.k;

public final class ProcessLifecycleInitializer implements a {
    @Override  // n0.a
    public List a() {
        return o.i();
    }

    @Override  // n0.a
    public Object b(Context context0) {
        return this.c(context0);
    }

    public n c(Context context0) {
        k.e(context0, "context");
        androidx.startup.a a0 = androidx.startup.a.e(context0);
        k.d(a0, "getInstance(context)");
        if(!a0.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name=\'androidx.lifecycle.ProcessLifecycleInitializer\'\n                   android:value=\'androidx.startup\' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        androidx.lifecycle.k.a(context0);
        w.n.b(context0);
        return w.n.a();
    }
}

