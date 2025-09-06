package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import j0.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import z3.g;
import z3.k;

public final class Recreator implements l {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final class b implements c {
        private final Set a;

        public b(androidx.savedstate.a a0) {
            k.e(a0, "registry");
            super();
            this.a = new LinkedHashSet();
            a0.h("androidx.savedstate.Restarter", this);
        }

        @Override  // androidx.savedstate.a$c
        public Bundle a() {
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle0;
        }

        public final void b(String s) {
            k.e(s, "className");
            this.a.add(s);
        }
    }

    private final d f;
    public static final a g;

    static {
        Recreator.g = new a(null);
    }

    public Recreator(d d0) {
        k.e(d0, "owner");
        super();
        this.f = d0;
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, androidx.lifecycle.h.a h$a0) {
        k.e(n0, "source");
        k.e(h$a0, "event");
        if(h$a0 != androidx.lifecycle.h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        n0.getLifecycle().c(this);
        Bundle bundle0 = this.f.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getStringArrayList("classes_to_restore");
        if(arrayList0 == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for(Object object0: arrayList0) {
            this.h(((String)object0));
        }
    }

    private final void h(String s) {
        androidx.savedstate.a.a a$a0;
        Constructor constructor0;
        Class class0;
        try {
            class0 = Class.forName(s, false, Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.a.a.class);
            k.d(class0, "{\n                Class.…class.java)\n            }");
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Class " + s + " wasn\'t found", classNotFoundException0);
        }
        try {
            constructor0 = class0.getDeclaredConstructor(null);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalStateException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        constructor0.setAccessible(true);
        try {
            Object object0 = constructor0.newInstance(null);
            k.d(object0, "{\n                constr…wInstance()\n            }");
            a$a0 = (androidx.savedstate.a.a)object0;
        }
        catch(Exception exception0) {
            throw new RuntimeException("Failed to instantiate " + s, exception0);
        }
        a$a0.a(this.f);
    }
}

