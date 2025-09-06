package I0;

import android.widget.PopupWindow;

public final class q implements Runnable {
    public final PopupWindow f;

    public q(PopupWindow popupWindow0) {
        this.f = popupWindow0;
    }

    @Override
    public final void run() {
        r.i(this.f);
    }
}

