package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.h.a;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class FragmentManager.6 implements l {
    final String f;
    final h g;
    final FragmentManager h;

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        if(h$a0 == a.ON_START && ((Bundle)this.h.k.get(this.f)) != null) {
            throw null;
        }
        if(h$a0 == a.ON_DESTROY) {
            this.g.c(this);
            this.h.l.remove(this.f);
        }
    }
}

