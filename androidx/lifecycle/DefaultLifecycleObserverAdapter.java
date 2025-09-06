package androidx.lifecycle;

import z3.k;

public final class DefaultLifecycleObserverAdapter implements l {
    public abstract class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[androidx.lifecycle.h.a.values().length];
            try {
                arr_v[androidx.lifecycle.h.a.ON_CREATE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[androidx.lifecycle.h.a.ON_START.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[androidx.lifecycle.h.a.ON_RESUME.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[androidx.lifecycle.h.a.ON_PAUSE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[androidx.lifecycle.h.a.ON_STOP.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[androidx.lifecycle.h.a.ON_DESTROY.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[androidx.lifecycle.h.a.ON_ANY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    private final d f;
    private final l g;

    public DefaultLifecycleObserverAdapter(d d0, l l0) {
        k.e(d0, "defaultLifecycleObserver");
        super();
        this.f = d0;
        this.g = l0;
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, androidx.lifecycle.h.a h$a0) {
        k.e(n0, "source");
        k.e(h$a0, "event");
        switch(h$a0) {
            case 1: {
                this.f.b(n0);
                break;
            }
            case 2: {
                this.f.g(n0);
                break;
            }
            case 3: {
                this.f.a(n0);
                break;
            }
            case 4: {
                this.f.d(n0);
                break;
            }
            case 5: {
                this.f.e(n0);
                break;
            }
            case 6: {
                this.f.f(n0);
                break;
            }
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
        }
        l l0 = this.g;
        if(l0 != null) {
            l0.c(n0, h$a0);
        }
    }
}

