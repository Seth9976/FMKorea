package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import androidx.core.view.s;
import e.d;

public class i {
    class a implements PopupWindow.OnDismissListener {
        final i f;

        @Override  // android.widget.PopupWindow$OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    private final Context a;
    private final e b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private androidx.appcompat.view.menu.j.a i;
    private h j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    public i(Context context0, e e0, View view0, boolean z, int v) {
        this(context0, e0, view0, z, v, 0);
    }

    public i(Context context0, e e0, View view0, boolean z, int v, int v1) {
        this.g = 0x800003;
        this.l = () -> {
            i.this.j = null;
            PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = i.this.k;
            if(popupWindow$OnDismissListener0 != null) {
                popupWindow$OnDismissListener0.onDismiss();
            }
        };
        this.a = context0;
        this.b = e0;
        this.f = view0;
        this.c = z;
        this.d = v;
        this.e = v1;
    }

    private h a() {
        Display display0 = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        Point point0 = new Point();
        display0.getRealSize(point0);
        h h0 = Math.min(point0.x, point0.y) >= this.a.getResources().getDimensionPixelSize(d.a) ? new b(this.a, this.f, this.d, this.e, this.c) : new l(this.a, this.b, this.f, this.d, this.e, this.c);
        h0.m(this.b);
        h0.v(this.l);
        h0.q(this.f);
        h0.g(this.i);
        h0.s(this.h);
        h0.t(this.g);
        return h0;
    }

    public void b() {
        if(this.d()) {
            this.j.dismiss();
        }
    }

    public h c() {
        if(this.j == null) {
            this.j = this.a();
        }
        return this.j;
    }

    public boolean d() {
        return this.j != null && this.j.a();
    }

    // 检测为 Lambda 实现
    protected void e() [...]

    public void f(View view0) {
        this.f = view0;
    }

    public void g(boolean z) {
        this.h = z;
        h h0 = this.j;
        if(h0 != null) {
            h0.s(z);
        }
    }

    public void h(int v) {
        this.g = v;
    }

    public void i(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.k = popupWindow$OnDismissListener0;
    }

    public void j(androidx.appcompat.view.menu.j.a j$a0) {
        this.i = j$a0;
        h h0 = this.j;
        if(h0 != null) {
            h0.g(j$a0);
        }
    }

    public void k() {
        if(!this.m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    private void l(int v, int v1, boolean z, boolean z1) {
        h h0 = this.c();
        h0.w(z1);
        if(z) {
            if((s.b(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                v -= this.f.getWidth();
            }
            h0.u(v);
            h0.x(v1);
            int v2 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            h0.r(new Rect(v - v2, v1 - v2, v + v2, v1 + v2));
        }
        h0.show();
    }

    public boolean m() {
        if(this.d()) {
            return true;
        }
        if(this.f == null) {
            return false;
        }
        this.l(0, 0, false, false);
        return true;
    }

    public boolean n(int v, int v1) {
        if(this.d()) {
            return true;
        }
        if(this.f == null) {
            return false;
        }
        this.l(v, v1, true, true);
        return true;
    }
}

