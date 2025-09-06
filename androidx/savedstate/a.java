package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import j0.d;
import java.util.Map.Entry;
import z3.g;
import z3.k;

public final class a {
    public interface androidx.savedstate.a.a {
        void a(d arg1);
    }

    static final class b {
        private b() {
        }

        public b(g g0) {
        }
    }

    public interface c {
        Bundle a();
    }

    private final l.b a;
    private boolean b;
    private Bundle c;
    private boolean d;
    private androidx.savedstate.Recreator.b e;
    private boolean f;
    private static final b g;

    static {
        a.g = new b(null);
    }

    public a() {
        this.a = new l.b();
        this.f = true;
    }

    public final Bundle b(String s) {
        k.e(s, "key");
        if(!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(s);
            Bundle bundle2 = this.c;
            if(bundle2 != null) {
                bundle2.remove(s);
            }
            if(this.c == null || this.c.isEmpty()) {
                this.c = null;
            }
            return bundle1;
        }
        return null;
    }

    public final c c(String s) {
        k.e(s, "key");
        for(Object object0: this.a) {
            k.d(((Map.Entry)object0), "components");
            String s1 = (String)((Map.Entry)object0).getKey();
            c a$c0 = (c)((Map.Entry)object0).getValue();
            if(k.a(s1, s)) {
                return a$c0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    // 检测为 Lambda 实现
    private static final void d(a a0, n n0, androidx.lifecycle.h.a h$a0) [...]

    public final void e(h h0) {
        k.e(h0, "lifecycle");
        if(this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        h0.a((n n0, androidx.lifecycle.h.a h$a0) -> {
            k.e(this, "this$0");
            k.e(n0, "<anonymous parameter 0>");
            k.e(h$a0, "event");
            if(h$a0 == androidx.lifecycle.h.a.ON_START) {
                this.f = true;
                return;
            }
            if(h$a0 == androidx.lifecycle.h.a.ON_STOP) {
                this.f = false;
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle0) {
        if(!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if(this.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.c = bundle0 == null ? null : bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        this.d = true;
    }

    public final void g(Bundle bundle0) {
        k.e(bundle0, "outBundle");
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = this.c;
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        l.b.d b$d0 = this.a.d();
        k.d(b$d0, "this.components.iteratorWithAdditions()");
        while(b$d0.hasNext()) {
            Object object0 = b$d0.next();
            bundle1.putBundle(((String)((Map.Entry)object0).getKey()), ((c)((Map.Entry)object0).getValue()).a());
        }
        if(!bundle1.isEmpty()) {
            bundle0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
        }
    }

    public final void h(String s, c a$c0) {
        k.e(s, "key");
        k.e(a$c0, "provider");
        if(((c)this.a.i(s, a$c0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class class0) {
        androidx.savedstate.Recreator.b recreator$b1;
        k.e(class0, "clazz");
        if(!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        androidx.savedstate.Recreator.b recreator$b0 = this.e == null ? new androidx.savedstate.Recreator.b(this) : this.e;
        try {
            this.e = recreator$b0;
            class0.getDeclaredConstructor(null);
            recreator$b1 = this.e;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalArgumentException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        if(recreator$b1 != null) {
            String s = class0.getName();
            k.d(s, "clazz.name");
            recreator$b1.b(s);
        }
    }
}

