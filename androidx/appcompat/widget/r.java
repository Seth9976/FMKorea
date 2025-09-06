package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import e.j;

class r extends PopupWindow {
    private boolean a;
    private static final boolean b;

    static {
        r.b = false;
    }

    public r(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a(context0, attributeSet0, v, v1);
    }

    private void a(Context context0, AttributeSet attributeSet0, int v, int v1) {
        c0 c00 = c0.v(context0, attributeSet0, j.g2, v, v1);
        if(c00.s(j.i2)) {
            this.b(c00.a(2, false));
        }
        this.setBackgroundDrawable(c00.g(j.h2));
        c00.x();
    }

    private void b(boolean z) {
        if(r.b) {
            this.a = z;
            return;
        }
        h.a(this, z);
    }

    @Override  // android.widget.PopupWindow
    public void showAsDropDown(View view0, int v, int v1) {
        if(r.b && this.a) {
            v1 -= view0.getHeight();
        }
        super.showAsDropDown(view0, v, v1);
    }

    @Override  // android.widget.PopupWindow
    public void showAsDropDown(View view0, int v, int v1, int v2) {
        if(r.b && this.a) {
            v1 -= view0.getHeight();
        }
        super.showAsDropDown(view0, v, v1, v2);
    }

    @Override  // android.widget.PopupWindow
    public void update(View view0, int v, int v1, int v2, int v3) {
        if(r.b && this.a) {
            v1 -= view0.getHeight();
        }
        super.update(view0, v, v1, v2, v3);
    }
}

