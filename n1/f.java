package N1;

import android.content.Context;
import android.util.AttributeSet;
import z1.a;
import z1.j;

public class f extends b {
    public static final int u;

    static {
        f.u = j.r;
    }

    public f(Context context0) {
        this(context0, null);
    }

    public f(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.i);
    }

    public f(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v, f.u);
        this.s();
    }

    public int getIndicatorDirection() {
        return ((g)this.f).j;
    }

    public int getIndicatorInset() {
        return ((g)this.f).i;
    }

    public int getIndicatorSize() {
        return ((g)this.f).h;
    }

    @Override  // N1.b
    c i(Context context0, AttributeSet attributeSet0) {
        return this.r(context0, attributeSet0);
    }

    g r(Context context0, AttributeSet attributeSet0) {
        return new g(context0, attributeSet0);
    }

    private void s() {
        d d0 = new d(((g)this.f));
        this.setIndeterminateDrawable(l.t(this.getContext(), ((g)this.f), d0));
        this.setProgressDrawable(h.v(this.getContext(), ((g)this.f), d0));
    }

    public void setIndicatorDirection(int v) {
        ((g)this.f).j = v;
        this.invalidate();
    }

    public void setIndicatorInset(int v) {
        c c0 = this.f;
        if(((g)c0).i != v) {
            ((g)c0).i = v;
            this.invalidate();
        }
    }

    public void setIndicatorSize(int v) {
        int v1 = Math.max(v, this.getTrackThickness() * 2);
        c c0 = this.f;
        if(((g)c0).h != v1) {
            ((g)c0).h = v1;
            ((g)c0).e();
            this.requestLayout();
            this.invalidate();
        }
    }

    @Override  // N1.b
    public void setTrackThickness(int v) {
        super.setTrackThickness(v);
        ((g)this.f).e();
    }
}

