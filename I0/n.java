package I0;

import K0.q;
import android.widget.PopupWindow.OnDismissListener;

public final class n implements PopupWindow.OnDismissListener {
    public final q f;

    public n(q q0) {
        this.f = q0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        r.f(this.f);
    }
}

