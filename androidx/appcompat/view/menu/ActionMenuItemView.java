package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import e.j;
import j.e;

public class ActionMenuItemView extends A implements View.OnClickListener, a, androidx.appcompat.widget.ActionMenuView.a {
    class androidx.appcompat.view.menu.ActionMenuItemView.a extends O {
        final ActionMenuItemView o;

        @Override  // androidx.appcompat.widget.O
        public e b() {
            b actionMenuItemView$b0 = ActionMenuItemView.this.r;
            return actionMenuItemView$b0 == null ? null : actionMenuItemView$b0.a();
        }

        @Override  // androidx.appcompat.widget.O
        protected boolean c() {
            androidx.appcompat.view.menu.e.b e$b0 = ActionMenuItemView.this.p;
            if(e$b0 != null && e$b0.a(ActionMenuItemView.this.m)) {
                e e0 = this.b();
                return e0 != null && e0.a();
            }
            return false;
        }
    }

    public static abstract class b {
        public abstract e a();
    }

    g m;
    private CharSequence n;
    private Drawable o;
    androidx.appcompat.view.menu.e.b p;
    private O q;
    b r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;

    public ActionMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ActionMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Resources resources0 = context0.getResources();
        this.s = this.t();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.v, v, 0);
        this.u = typedArray0.getDimensionPixelSize(j.w, 0);
        typedArray0.recycle();
        this.w = (int)(resources0.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.v = -1;
        this.setSaveEnabled(false);
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$a
    public boolean a() {
        return this.s();
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$a
    public boolean b() {
        return this.s() && this.m.getIcon() == null;
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public boolean d() {
        return true;
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public void e(g g0, int v) {
        this.m = g0;
        this.setIcon(g0.getIcon());
        this.setTitle(g0.i(this));
        this.setId(g0.getItemId());
        this.setVisibility((g0.isVisible() ? 0 : 8));
        this.setEnabled(g0.isEnabled());
        if(g0.hasSubMenu() && this.q == null) {
            this.q = new androidx.appcompat.view.menu.ActionMenuItemView.a(this);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public g getItemData() {
        return this.m;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        androidx.appcompat.view.menu.e.b e$b0 = this.p;
        if(e$b0 != null) {
            e$b0.a(this.m);
        }
    }

    @Override  // android.widget.TextView
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.s = this.t();
        this.u();
    }

    @Override  // androidx.appcompat.widget.A
    protected void onMeasure(int v, int v1) {
        boolean z = this.s();
        if(z) {
            int v2 = this.v;
            if(v2 >= 0) {
                super.setPadding(v2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
            }
        }
        super.onMeasure(v, v1);
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = this.getMeasuredWidth();
        int v6 = v3 == 0x80000000 ? Math.min(v4, this.u) : this.u;
        if(v3 != 0x40000000 && this.u > 0 && v5 < v6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), v1);
        }
        if(!z && this.o != null) {
            super.setPadding((this.getMeasuredWidth() - this.o.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    @Override  // android.widget.TextView
    public void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(null);
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return !this.m.hasSubMenu() || (this.q == null || !this.q.onTouch(this, motionEvent0)) ? super.onTouchEvent(motionEvent0) : true;
    }

    public boolean s() {
        return !TextUtils.isEmpty(this.getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if(this.t != z) {
            this.t = z;
            g g0 = this.m;
            if(g0 != null) {
                g0.c();
            }
        }
    }

    public void setIcon(Drawable drawable0) {
        this.o = drawable0;
        if(drawable0 != null) {
            int v = drawable0.getIntrinsicWidth();
            int v1 = drawable0.getIntrinsicHeight();
            int v2 = this.w;
            if(v > v2) {
                v1 = (int)(((float)v1) * (((float)v2) / ((float)v)));
                v = v2;
            }
            if(v1 > v2) {
                v = (int)(((float)v) * (((float)v2) / ((float)v1)));
            }
            else {
                v2 = v1;
            }
            drawable0.setBounds(0, 0, v, v2);
        }
        this.setCompoundDrawables(drawable0, null, null, null);
        this.u();
    }

    public void setItemInvoker(androidx.appcompat.view.menu.e.b e$b0) {
        this.p = e$b0;
    }

    @Override  // android.widget.TextView
    public void setPadding(int v, int v1, int v2, int v3) {
        this.v = v;
        super.setPadding(v, v1, v2, v3);
    }

    public void setPopupCallback(b actionMenuItemView$b0) {
        this.r = actionMenuItemView$b0;
    }

    public void setTitle(CharSequence charSequence0) {
        this.n = charSequence0;
        this.u();
    }

    private boolean t() {
        Configuration configuration0 = this.getContext().getResources().getConfiguration();
        return configuration0.screenWidthDp >= 480 || configuration0.screenWidthDp >= 640 && configuration0.screenHeightDp >= 480 || configuration0.orientation == 2;
    }

    private void u() {
        int v = !TextUtils.isEmpty(this.n) & (this.o == null || this.m.B() && (this.s || this.t) ? 1 : 0);
        CharSequence charSequence0 = null;
        this.setText((v == 0 ? null : this.n));
        CharSequence charSequence1 = this.m.getContentDescription();
        if(TextUtils.isEmpty(charSequence1)) {
            this.setContentDescription((v == 0 ? this.m.getTitle() : null));
        }
        else {
            this.setContentDescription(charSequence1);
        }
        CharSequence charSequence2 = this.m.getTooltipText();
        if(TextUtils.isEmpty(charSequence2)) {
            if(v == 0) {
                charSequence0 = this.m.getTitle();
            }
            h0.a(this, charSequence0);
            return;
        }
        h0.a(this, charSequence2);
    }
}

