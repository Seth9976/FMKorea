package androidx.lifecycle;

import android.os.Bundle;
import j0.d;
import z3.k;

public final class LegacySavedStateHandleController {
    public static final class a implements androidx.savedstate.a.a {
        @Override  // androidx.savedstate.a$a
        public void a(d d0) {
            k.e(d0, "owner");
            if(!(d0 instanceof M)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            L l0 = ((M)d0).getViewModelStore();
            androidx.savedstate.a a0 = d0.getSavedStateRegistry();
            for(Object object0: l0.c()) {
                H h0 = l0.b(((String)object0));
                k.b(h0);
                LegacySavedStateHandleController.a(h0, a0, d0.getLifecycle());
            }
            if(!l0.c().isEmpty()) {
                a0.i(a.class);
            }
        }
    }

    public static final LegacySavedStateHandleController a;

    static {
        LegacySavedStateHandleController.a = new LegacySavedStateHandleController();
    }

    public static final void a(H h0, androidx.savedstate.a a0, h h1) {
        k.e(h0, "viewModel");
        k.e(a0, "registry");
        k.e(h1, "lifecycle");
        SavedStateHandleController savedStateHandleController0 = (SavedStateHandleController)h0.c("androidx.lifecycle.savedstate.vm.tag");
        if(savedStateHandleController0 != null && !savedStateHandleController0.j()) {
            savedStateHandleController0.h(a0, h1);
            LegacySavedStateHandleController.a.c(a0, h1);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a a0, h h0, String s, Bundle bundle0) {
        k.e(a0, "registry");
        k.e(h0, "lifecycle");
        k.b(s);
        Bundle bundle1 = a0.b(s);
        SavedStateHandleController savedStateHandleController0 = new SavedStateHandleController(s, A.f.a(bundle1, bundle0));
        savedStateHandleController0.h(a0, h0);
        LegacySavedStateHandleController.a.c(a0, h0);
        return savedStateHandleController0;
    }

    private final void c(androidx.savedstate.a a0, h h0) {
        b h$b0 = h0.b();
        if(h$b0 != b.g && !h$b0.f(b.i)) {
            h0.a(new l() {
                @Override  // androidx.lifecycle.l
                public void c(n n0, androidx.lifecycle.h.a h$a0) {
                    k.e(n0, "source");
                    k.e(h$a0, "event");
                    if(h$a0 == androidx.lifecycle.h.a.ON_START) {
                        a0.c(this);
                        this.g.i(a.class);
                    }
                }
            });
            return;
        }
        a0.i(a.class);
    }
}

