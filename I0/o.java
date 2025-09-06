package I0;

import android.view.View.OnClickListener;
import android.view.View;
import android.widget.PopupWindow;

public final class o implements View.OnClickListener {
    public final PopupWindow f;

    public o(PopupWindow popupWindow0) {
        this.f = popupWindow0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        r.j(this.f, view0);
    }
}

