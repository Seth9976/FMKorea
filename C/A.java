package c;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import z3.k;

public final class a {
    private final Set a;
    private volatile Context b;

    public a() {
        this.a = new CopyOnWriteArraySet();
    }

    public final void a(b b0) {
        k.e(b0, "listener");
        Context context0 = this.b;
        if(context0 != null) {
            b0.a(context0);
        }
        this.a.add(b0);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context0) {
        k.e(context0, "context");
        this.b = context0;
        for(Object object0: this.a) {
            ((b)object0).a(context0);
        }
    }
}

