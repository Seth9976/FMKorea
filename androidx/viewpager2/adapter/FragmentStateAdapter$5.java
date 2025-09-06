package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.h.a;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class FragmentStateAdapter.5 implements l {
    final Handler f;
    final Runnable g;

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        if(h$a0 == a.ON_DESTROY) {
            this.f.removeCallbacks(this.g);
            n0.getLifecycle().c(this);
        }
    }
}

