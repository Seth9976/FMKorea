package N1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.vectordrawable.graphics.drawable.b;
import androidx.vectordrawable.graphics.drawable.h;
import java.util.List;

public final class l extends i {
    private j u;
    private k v;
    private Drawable w;

    l(Context context0, c c0, j j0, k k0) {
        super(context0, c0);
        this.y(j0);
        this.x(k0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = new Rect();
        if(!this.getBounds().isEmpty() && this.isVisible() && canvas0.getClipBounds(rect0)) {
            if(this.w()) {
                Drawable drawable0 = this.w;
                if(drawable0 != null) {
                    drawable0.setBounds(this.getBounds());
                    a.n(this.w, this.g.c[0]);
                    this.w.draw(canvas0);
                    return;
                }
            }
            canvas0.save();
            this.u.g(canvas0, this.getBounds(), this.h(), this.k(), this.j());
            int v1 = this.g.g;
            int v2 = this.getAlpha();
            if(v1 == 0) {
                this.u.d(canvas0, this.r, 0.0f, 1.0f, this.g.d, v2, 0);
            }
            else {
                N1.j.a j$a0 = (N1.j.a)this.v.b.get(0);
                List list0 = this.v.b;
                N1.j.a j$a1 = (N1.j.a)list0.get(list0.size() - 1);
                v2 = 0;
                this.u.d(canvas0, this.r, j$a1.b, j$a0.a + 1.0f, this.g.d, 0, v1);
            }
            for(int v = 0; v < this.v.b.size(); ++v) {
                N1.j.a j$a2 = (N1.j.a)this.v.b.get(v);
                j j0 = this.u;
                int v3 = this.getAlpha();
                j0.c(canvas0, this.r, j$a2, v3);
                if(v > 0 && v1 > 0) {
                    N1.j.a j$a3 = (N1.j.a)this.v.b.get(v - 1);
                    this.u.d(canvas0, this.r, j$a3.b, j$a2.a, this.g.d, v2, v1);
                }
            }
            canvas0.restore();
        }
    }

    @Override  // N1.i
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.u.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.u.f();
    }

    @Override  // N1.i
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override  // N1.i
    public boolean i() {
        return super.i();
    }

    @Override  // N1.i
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override  // N1.i
    public boolean j() {
        return super.j();
    }

    @Override  // N1.i
    public boolean k() {
        return super.k();
    }

    @Override  // N1.i
    public void m(b b0) {
        super.m(b0);
    }

    @Override  // N1.i
    public boolean q(boolean z, boolean z1, boolean z2) {
        return super.q(z, z1, z2);
    }

    @Override  // N1.i
    boolean r(boolean z, boolean z1, boolean z2) {
        boolean z3 = super.r(z, z1, z2);
        if(this.w()) {
            Drawable drawable0 = this.w;
            if(drawable0 != null) {
                return drawable0.setVisible(z, z1);
            }
        }
        if(!this.isRunning()) {
            this.v.a();
        }
        if(z && z2) {
            this.v.g();
        }
        return z3;
    }

    @Override  // N1.i
    public boolean s(b b0) {
        return super.s(b0);
    }

    @Override  // N1.i
    public void setAlpha(int v) {
        super.setAlpha(v);
    }

    @Override  // N1.i
    public void setColorFilter(ColorFilter colorFilter0) {
        super.setColorFilter(colorFilter0);
    }

    @Override  // N1.i
    public boolean setVisible(boolean z, boolean z1) {
        return super.setVisible(z, z1);
    }

    @Override  // N1.i
    public void start() {
        super.start();
    }

    @Override  // N1.i
    public void stop() {
        super.stop();
    }

    static l t(Context context0, g g0, d d0) {
        l l0 = new l(context0, g0, d0, new e(g0));
        l0.z(h.b(context0.getResources(), z1.d.b, null));
        return l0;
    }

    k u() {
        return this.v;
    }

    j v() {
        return this.u;
    }

    private boolean w() {
        return this.h != null && this.h.a(this.f.getContentResolver()) == 0.0f;
    }

    void x(k k0) {
        this.v = k0;
        k0.e(this);
    }

    void y(j j0) {
        this.u = j0;
    }

    public void z(Drawable drawable0) {
        this.w = drawable0;
    }
}

