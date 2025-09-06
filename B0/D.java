package B0;

import android.view.View.OnClickListener;
import android.view.View;
import z3.u;

public final class d implements View.OnClickListener {
    public final u f;
    public final e g;

    public d(u u0, e e0) {
        this.f = u0;
        this.g = e0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        e.i(this.f, this.g, view0);
    }
}

