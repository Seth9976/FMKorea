package N1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.Y;
import com.google.android.material.internal.q;
import java.util.Arrays;
import z1.j;
import z1.k;

public abstract class b extends ProgressBar {
    class a implements Runnable {
        final b f;

        @Override
        public void run() {
            b.this.k();
        }
    }

    class N1.b.b implements Runnable {
        final b f;

        @Override
        public void run() {
            b.this.j();
            b.this.l = -1L;
        }
    }

    class c extends androidx.vectordrawable.graphics.drawable.b {
        final b b;

        @Override  // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable0) {
            b.this.setIndeterminate(false);
            int v = b.this.g;
            boolean z = b.this.h;
            b.this.o(v, z);
        }
    }

    class d extends androidx.vectordrawable.graphics.drawable.b {
        final b b;

        @Override  // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable0) {
            super.b(drawable0);
            if(!b.this.n) {
                b.this.setVisibility(b.this.o);
            }
        }
    }

    N1.c f;
    private int g;
    private boolean h;
    private boolean i;
    private final int j;
    private final int k;
    private long l;
    N1.a m;
    private boolean n;
    private int o;
    private final Runnable p;
    private final Runnable q;
    private final androidx.vectordrawable.graphics.drawable.b r;
    private final androidx.vectordrawable.graphics.drawable.b s;
    static final int t;

    static {
        b.t = j.x;
    }

    protected b(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(V1.a.c(context0, attributeSet0, v, b.t), attributeSet0, v);
        this.l = -1L;
        this.n = false;
        this.o = 4;
        this.p = () -> {
            if(b.this.k > 0) {
                b.this.l = SystemClock.uptimeMillis();
            }
            b.this.setVisibility(0);
        };
        this.q = new N1.b.b(this);
        this.r = new c(this);
        this.s = new d(this);
        Context context1 = this.getContext();
        this.f = this.i(context1, attributeSet0);
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.h0, v, v1, new int[0]);
        this.j = typedArray0.getInt(k.n0, -1);
        this.k = Math.min(typedArray0.getInt(k.l0, -1), 1000);
        typedArray0.recycle();
        this.m = new N1.a();
        this.i = true;
    }

    @Override  // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return this.isIndeterminate() ? this.getIndeterminateDrawable() : this.getProgressDrawable();
    }

    private N1.j getCurrentDrawingDelegate() {
        if(this.isIndeterminate()) {
            return this.getIndeterminateDrawable() == null ? null : this.getIndeterminateDrawable().v();
        }
        return this.getProgressDrawable() == null ? null : this.getProgressDrawable().w();
    }

    public int getHideAnimationBehavior() {
        return this.f.f;
    }

    public l getIndeterminateDrawable() {
        return (l)super.getIndeterminateDrawable();
    }

    @Override  // android.widget.ProgressBar
    public Drawable getIndeterminateDrawable() {
        return this.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f.g;
    }

    public h getProgressDrawable() {
        return (h)super.getProgressDrawable();
    }

    @Override  // android.widget.ProgressBar
    public Drawable getProgressDrawable() {
        return this.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f.e;
    }

    public int getTrackColor() {
        return this.f.d;
    }

    public int getTrackCornerRadius() {
        return this.f.b;
    }

    public int getTrackThickness() {
        return this.f.a;
    }

    protected void h(boolean z) {
        if(!this.i) {
            return;
        }
        ((i)this.getCurrentDrawable()).q(this.q(), false, z);
    }

    abstract N1.c i(Context arg1, AttributeSet arg2);

    @Override  // android.view.View
    public void invalidate() {
        super.invalidate();
        if(this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }

    private void j() {
        ((i)this.getCurrentDrawable()).q(false, false, true);
        if(this.m()) {
            this.setVisibility(4);
        }
    }

    // 检测为 Lambda 实现
    private void k() [...]

    boolean l() {
        for(View view0 = this; true; view0 = (View)viewParent0) {
            if(view0.getVisibility() != 0) {
                return false;
            }
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 == null) {
                return this.getWindowVisibility() == 0;
            }
            if(!(viewParent0 instanceof View)) {
                return true;
            }
        }
    }

    // 去混淆评级： 低(30)
    private boolean m() {
        return (this.getProgressDrawable() == null || !this.getProgressDrawable().isVisible()) && (this.getIndeterminateDrawable() == null || !this.getIndeterminateDrawable().isVisible());
    }

    private void n() {
        if(this.getProgressDrawable() != null && this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().u().d(this.r);
        }
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().m(this.s);
        }
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().m(this.s);
        }
    }

    public void o(int v, boolean z) {
        if(!this.isIndeterminate()) {
            super.setProgress(v);
            if(this.getProgressDrawable() != null && !z) {
                this.getProgressDrawable().jumpToCurrentState();
            }
        }
        else if(this.getProgressDrawable() != null) {
            this.g = v;
            this.h = z;
            this.n = true;
            if(this.getIndeterminateDrawable().isVisible() && this.m.a(this.getContext().getContentResolver()) != 0.0f) {
                this.getIndeterminateDrawable().u().f();
                return;
            }
            l l0 = this.getIndeterminateDrawable();
            this.r.b(l0);
        }
    }

    @Override  // android.widget.ProgressBar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n();
        if(this.q()) {
            this.k();
        }
    }

    @Override  // android.widget.ProgressBar
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.q);
        this.removeCallbacks(this.p);
        ((i)this.getCurrentDrawable()).i();
        this.p();
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.ProgressBar
    protected void onDraw(Canvas canvas0) {
        synchronized(this) {
            int v1 = canvas0.save();
            if(this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            if(this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                canvas0.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
            }
            this.getCurrentDrawable().draw(canvas0);
            canvas0.restoreToCount(v1);
        }
    }

    @Override  // android.widget.ProgressBar
    protected void onMeasure(int v, int v1) {
        synchronized(this) {
            N1.j j0 = this.getCurrentDrawingDelegate();
            if(j0 == null) {
                return;
            }
            this.setMeasuredDimension((j0.f() >= 0 ? j0.f() + this.getPaddingLeft() + this.getPaddingRight() : View.getDefaultSize(this.getSuggestedMinimumWidth(), v)), (j0.e() >= 0 ? j0.e() + this.getPaddingTop() + this.getPaddingBottom() : View.getDefaultSize(this.getSuggestedMinimumHeight(), v1)));
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        this.h(v == 0);
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.h(false);
    }

    private void p() {
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().s(this.s);
            this.getIndeterminateDrawable().u().h();
        }
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().s(this.s);
        }
    }

    // 去混淆评级： 低(20)
    boolean q() {
        return Y.R(this) && this.getWindowVisibility() == 0 && this.l();
    }

    public void setAnimatorDurationScaleProvider(N1.a a0) {
        this.m = a0;
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().h = a0;
        }
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().h = a0;
        }
    }

    public void setHideAnimationBehavior(int v) {
        this.f.f = v;
        this.invalidate();
    }

    @Override  // android.widget.ProgressBar
    public void setIndeterminate(boolean z) {
        synchronized(this) {
            if(z == this.isIndeterminate()) {
                return;
            }
            i i0 = (i)this.getCurrentDrawable();
            if(i0 != null) {
                i0.i();
            }
            super.setIndeterminate(z);
            i i1 = (i)this.getCurrentDrawable();
            if(i1 != null) {
                i1.q(this.q(), false, false);
            }
            if(i1 instanceof l && this.q()) {
                ((l)i1).u().g();
            }
            this.n = false;
        }
    }

    @Override  // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable0) {
        if(drawable0 == null) {
            super.setIndeterminateDrawable(null);
            return;
        }
        if(!(drawable0 instanceof l)) {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
        ((i)drawable0).i();
        super.setIndeterminateDrawable(drawable0);
    }

    public void setIndicatorColor(int[] arr_v) {
        if(arr_v.length == 0) {
            arr_v = new int[]{H1.a.b(this.getContext(), z1.a.n, -1)};
        }
        if(!Arrays.equals(this.getIndicatorColor(), arr_v)) {
            this.f.c = arr_v;
            this.getIndeterminateDrawable().u().c();
            this.invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int v) {
        N1.c c0 = this.f;
        if(c0.g != v) {
            c0.g = v;
            c0.e();
            this.invalidate();
        }
    }

    @Override  // android.widget.ProgressBar
    public void setProgress(int v) {
        synchronized(this) {
            if(this.isIndeterminate()) {
                return;
            }
            this.o(v, false);
        }
    }

    @Override  // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable0) {
        if(drawable0 == null) {
            super.setProgressDrawable(null);
            return;
        }
        if(!(drawable0 instanceof h)) {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
        ((h)drawable0).i();
        super.setProgressDrawable(((h)drawable0));
        ((h)drawable0).A(((float)this.getProgress()) / ((float)this.getMax()));
    }

    public void setShowAnimationBehavior(int v) {
        this.f.e = v;
        this.invalidate();
    }

    public void setTrackColor(int v) {
        N1.c c0 = this.f;
        if(c0.d != v) {
            c0.d = v;
            this.invalidate();
        }
    }

    public void setTrackCornerRadius(int v) {
        N1.c c0 = this.f;
        if(c0.b != v) {
            c0.b = Math.min(v, c0.a / 2);
            this.invalidate();
        }
    }

    public void setTrackThickness(int v) {
        N1.c c0 = this.f;
        if(c0.a != v) {
            c0.a = v;
            this.requestLayout();
        }
    }

    public void setVisibilityAfterHide(int v) {
        if(v != 0 && v != 4 && v != 8) {
            throw new IllegalArgumentException("The component\'s visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.o = v;
    }
}

