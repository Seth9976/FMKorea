package androidx.preference;

import C.z;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

public class k extends l {
    class a extends androidx.core.view.a {
        final k d;

        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            k.this.g.g(view0, z0);
            int v = k.this.f.d0(view0);
            g recyclerView$g0 = k.this.f.getAdapter();
            if(!(recyclerView$g0 instanceof i)) {
                return;
            }
            if(((i)recyclerView$g0).A(v) == null) {
            }
        }

        @Override  // androidx.core.view.a
        public boolean j(View view0, int v, Bundle bundle0) {
            return k.this.g.j(view0, v, bundle0);
        }
    }

    final RecyclerView f;
    final androidx.core.view.a g;
    final androidx.core.view.a h;

    public k(RecyclerView recyclerView0) {
        super(recyclerView0);
        this.g = super.n();
        this.h = new a(this);
        this.f = recyclerView0;
    }

    @Override  // androidx.recyclerview.widget.l
    public androidx.core.view.a n() {
        return this.h;
    }
}

