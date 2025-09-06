package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import e.f;
import e.j;

public class ActionBarContainer extends FrameLayout {
    static abstract class a {
        public static void a(ActionBarContainer actionBarContainer0) {
            actionBarContainer0.invalidateOutline();
        }
    }

    private boolean f;
    private View g;
    private View h;
    private View i;
    Drawable j;
    Drawable k;
    Drawable l;
    boolean m;
    boolean n;
    private int o;

    public ActionBarContainer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setBackground(new b(this));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.a);
        this.j = typedArray0.getDrawable(j.b);
        this.k = typedArray0.getDrawable(j.d);
        this.o = typedArray0.getDimensionPixelSize(j.j, -1);
        boolean z = true;
        if(this.getId() == f.H) {
            this.m = true;
            this.l = typedArray0.getDrawable(j.c);
        }
        typedArray0.recycle();
        if(!this.m) {
            if(this.j != null || this.k != null) {
                z = false;
            }
        }
        else if(this.l != null) {
            z = false;
        }
        this.setWillNotDraw(z);
    }

    private int a(View view0) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        return view0.getMeasuredHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
    }

    private boolean b(View view0) {
        return view0 == null || view0.getVisibility() == 8 || view0.getMeasuredHeight() == 0;
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.j != null && this.j.isStateful()) {
            this.j.setState(this.getDrawableState());
        }
        if(this.k != null && this.k.isStateful()) {
            this.k.setState(this.getDrawableState());
        }
        if(this.l != null && this.l.isStateful()) {
            this.l.setState(this.getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.g;
    }

    @Override  // android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.j;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
        }
        Drawable drawable2 = this.l;
        if(drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    @Override  // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = this.findViewById(f.a);
        this.i = this.findViewById(f.f);
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        super.onHoverEvent(motionEvent0);
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.f || super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.FrameLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        View view0 = this.g;
        int v4 = 1;
        int v5 = 0;
        boolean z1 = view0 != null && view0.getVisibility() != 8;
        if(view0 != null && view0.getVisibility() != 8) {
            int v6 = this.getMeasuredHeight();
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            view0.layout(v, v6 - view0.getMeasuredHeight() - frameLayout$LayoutParams0.bottomMargin, v2, v6 - frameLayout$LayoutParams0.bottomMargin);
        }
        if(this.m) {
            Drawable drawable0 = this.l;
            if(drawable0 == null) {
                v4 = 0;
            }
            else {
                drawable0.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
        }
        else {
            if(this.j != null) {
                if(this.h.getVisibility() == 0) {
                    this.j.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                }
                else if(this.i == null || this.i.getVisibility() != 0) {
                    this.j.setBounds(0, 0, 0, 0);
                }
                else {
                    this.j.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                }
                v5 = 1;
            }
            this.n = z1;
            if(z1) {
                Drawable drawable1 = this.k;
                if(drawable1 == null) {
                    v4 = v5;
                }
                else {
                    drawable1.setBounds(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
                }
            }
            else {
                v4 = v5;
            }
        }
        if(v4 != 0) {
            this.invalidate();
        }
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        int v4;
        if(this.h == null && View.MeasureSpec.getMode(v1) == 0x80000000) {
            int v2 = this.o;
            if(v2 >= 0) {
                v1 = View.MeasureSpec.makeMeasureSpec(Math.min(v2, View.MeasureSpec.getSize(v1)), 0x80000000);
            }
        }
        super.onMeasure(v, v1);
        if(this.h == null) {
            return;
        }
        int v3 = View.MeasureSpec.getMode(v1);
        if(this.g != null && this.g.getVisibility() != 8 && v3 != 0x40000000) {
            if(this.b(this.h)) {
                v4 = this.b(this.i) ? 0 : this.a(this.i);
            }
            else {
                v4 = this.a(this.h);
            }
            int v5 = v3 == 0x80000000 ? View.MeasureSpec.getSize(v1) : 0x7FFFFFFF;
            this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(v4 + this.a(this.g), v5));
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        super.onTouchEvent(motionEvent0);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable0) {
        Drawable drawable1 = this.j;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            this.unscheduleDrawable(this.j);
        }
        this.j = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            View view0 = this.h;
            if(view0 != null) {
                this.j.setBounds(view0.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        boolean z = false;
        if(!this.m) {
            if(this.j == null && this.k == null) {
                z = true;
            }
        }
        else if(this.l == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable0) {
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            this.unscheduleDrawable(this.l);
        }
        this.l = drawable0;
        boolean z = false;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            if(this.m) {
                Drawable drawable2 = this.l;
                if(drawable2 != null) {
                    drawable2.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                }
            }
        }
        if(!this.m) {
            if(this.j == null && this.k == null) {
                z = true;
            }
        }
        else if(this.l == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable0) {
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            this.unscheduleDrawable(this.k);
        }
        this.k = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            if(this.n) {
                Drawable drawable2 = this.k;
                if(drawable2 != null) {
                    drawable2.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
                }
            }
        }
        boolean z = false;
        if(!this.m) {
            if(this.j == null && this.k == null) {
                z = true;
            }
        }
        else if(this.l == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.invalidate();
        a.a(this);
    }

    public void setTabContainer(W w0) {
        View view0 = this.g;
        if(view0 != null) {
            this.removeView(view0);
        }
        this.g = w0;
    }

    public void setTransitioning(boolean z) {
        this.f = z;
        this.setDescendantFocusability((z ? 0x60000 : 0x40000));
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.j;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.setVisible(v == 0, false);
        }
        Drawable drawable2 = this.l;
        if(drawable2 != null) {
            drawable2.setVisible(v == 0, false);
        }
    }

    @Override  // android.view.ViewGroup
    public ActionMode startActionModeForChild(View view0, ActionMode.Callback actionMode$Callback0) {
        return null;
    }

    @Override  // android.view.ViewGroup
    public ActionMode startActionModeForChild(View view0, ActionMode.Callback actionMode$Callback0, int v) {
        return v == 0 ? null : super.startActionModeForChild(view0, actionMode$Callback0, v);
    }

    // 去混淆评级： 中等(70)
    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return drawable0 == this.j && !this.m || drawable0 == this.k && this.n || drawable0 == this.l && this.m || super.verifyDrawable(drawable0);
    }
}

