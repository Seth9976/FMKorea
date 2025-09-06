package S1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.drawable.e;

class q extends o {
    q(View view0) {
        this.k(view0);
    }

    @Override  // S1.o
    void b(View view0) {
        view0.setClipToOutline(!this.i());
        if(this.i()) {
            view0.invalidate();
            return;
        }
        view0.invalidateOutline();
    }

    @Override  // S1.o
    boolean i() {
        return this.a;
    }

    private void k(View view0) {
        class a extends ViewOutlineProvider {
            final q a;

            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                if(!q.this.e.isEmpty()) {
                    e.a(outline0, q.this.e);
                }
            }
        }

        view0.setOutlineProvider(new a(this));
    }
}

