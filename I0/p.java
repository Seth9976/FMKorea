package I0;

import K0.q;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import z3.t;

public final class p implements Runnable {
    public final PopupWindow f;
    public final ViewGroup g;
    public final t h;
    public final q i;

    public p(PopupWindow popupWindow0, ViewGroup viewGroup0, t t0, q q0) {
        this.f = popupWindow0;
        this.g = viewGroup0;
        this.h = t0;
        this.i = q0;
    }

    @Override
    public final void run() {
        r.k(this.f, this.g, this.h, this.i);
    }
}

