package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import e.f;
import e.j;

public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, a {
    private g f;
    private ImageView g;
    private RadioButton h;
    private TextView i;
    private CheckBox j;
    private TextView k;
    private ImageView l;
    private ImageView m;
    private LinearLayout n;
    private Drawable o;
    private int p;
    private Context q;
    private boolean r;
    private Drawable s;
    private boolean t;
    private LayoutInflater u;
    private boolean v;

    public ListMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.D);
    }

    public ListMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        c0 c00 = c0.v(this.getContext(), attributeSet0, j.b2, v, 0);
        this.o = c00.g(j.d2);
        this.p = c00.n(j.c2, -1);
        this.r = c00.a(j.e2, false);
        this.q = context0;
        this.s = c00.g(j.f2);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, new int[]{0x1010129}, e.a.z, 0);
        this.t = typedArray0.hasValue(0);
        c00.x();
        typedArray0.recycle();
    }

    private void a(View view0) {
        this.b(view0, -1);
    }

    @Override  // android.widget.AbsListView$SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect0) {
        if(this.m != null && this.m.getVisibility() == 0) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.m.getLayoutParams();
            rect0.top += this.m.getHeight() + linearLayout$LayoutParams0.topMargin + linearLayout$LayoutParams0.bottomMargin;
        }
    }

    private void b(View view0, int v) {
        LinearLayout linearLayout0 = this.n;
        if(linearLayout0 != null) {
            linearLayout0.addView(view0, v);
            return;
        }
        this.addView(view0, v);
    }

    private void c() {
        CheckBox checkBox0 = (CheckBox)this.getInflater().inflate(e.g.h, this, false);
        this.j = checkBox0;
        this.a(checkBox0);
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public boolean d() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public void e(g g0, int v) {
        this.f = g0;
        this.setVisibility((g0.isVisible() ? 0 : 8));
        this.setTitle(g0.i(this));
        this.setCheckable(g0.isCheckable());
        this.h(g0.A(), g0.g());
        this.setIcon(g0.getIcon());
        this.setEnabled(g0.isEnabled());
        this.setSubMenuArrowVisible(g0.hasSubMenu());
        this.setContentDescription(g0.getContentDescription());
    }

    private void f() {
        ImageView imageView0 = (ImageView)this.getInflater().inflate(e.g.i, this, false);
        this.g = imageView0;
        this.b(imageView0, 0);
    }

    private void g() {
        RadioButton radioButton0 = (RadioButton)this.getInflater().inflate(e.g.k, this, false);
        this.h = radioButton0;
        this.a(radioButton0);
    }

    private LayoutInflater getInflater() {
        if(this.u == null) {
            this.u = LayoutInflater.from(this.getContext());
        }
        return this.u;
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public g getItemData() {
        return this.f;
    }

    public void h(boolean z, char c) {
        int v = !z || !this.f.A() ? 8 : 0;
        if(v == 0) {
            this.k.setText(this.f.h());
        }
        if(this.k.getVisibility() != v) {
            this.k.setVisibility(v);
        }
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.setBackground(this.o);
        TextView textView0 = (TextView)this.findViewById(f.M);
        this.i = textView0;
        int v = this.p;
        if(v != -1) {
            textView0.setTextAppearance(this.q, v);
        }
        this.k = (TextView)this.findViewById(f.F);
        ImageView imageView0 = (ImageView)this.findViewById(f.I);
        this.l = imageView0;
        if(imageView0 != null) {
            imageView0.setImageDrawable(this.s);
        }
        this.m = (ImageView)this.findViewById(f.r);
        this.n = (LinearLayout)this.findViewById(f.l);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        if(this.g != null && this.r) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.g.getLayoutParams();
            int v2 = viewGroup$LayoutParams0.height;
            if(v2 > 0 && linearLayout$LayoutParams0.width <= 0) {
                linearLayout$LayoutParams0.width = v2;
            }
        }
        super.onMeasure(v, v1);
    }

    public void setCheckable(boolean z) {
        CheckBox checkBox0;
        RadioButton radioButton0;
        if(!z && this.h == null && this.j == null) {
            return;
        }
        if(this.f.m()) {
            if(this.h == null) {
                this.g();
            }
            radioButton0 = this.h;
            checkBox0 = this.j;
        }
        else {
            if(this.j == null) {
                this.c();
            }
            radioButton0 = this.j;
            checkBox0 = this.h;
        }
        if(z) {
            radioButton0.setChecked(this.f.isChecked());
            if(radioButton0.getVisibility() != 0) {
                radioButton0.setVisibility(0);
            }
            if(checkBox0 != null && checkBox0.getVisibility() != 8) {
                checkBox0.setVisibility(8);
            }
        }
        else {
            CheckBox checkBox1 = this.j;
            if(checkBox1 != null) {
                checkBox1.setVisibility(8);
            }
            RadioButton radioButton1 = this.h;
            if(radioButton1 != null) {
                radioButton1.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        RadioButton radioButton0;
        if(this.f.m()) {
            if(this.h == null) {
                this.g();
            }
            radioButton0 = this.h;
        }
        else {
            if(this.j == null) {
                this.c();
            }
            radioButton0 = this.j;
        }
        radioButton0.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView0 = this.m;
        if(imageView0 != null) {
            imageView0.setVisibility((this.t || !z ? 8 : 0));
        }
    }

    public void setIcon(Drawable drawable0) {
        boolean z = this.f.z() || this.v;
        if(!z && !this.r) {
            return;
        }
        ImageView imageView0 = this.g;
        if(imageView0 == null && drawable0 == null && !this.r) {
            return;
        }
        if(imageView0 == null) {
            this.f();
        }
        if(drawable0 == null && !this.r) {
            this.g.setVisibility(8);
            return;
        }
        ImageView imageView1 = this.g;
        if(!z) {
            drawable0 = null;
        }
        imageView1.setImageDrawable(drawable0);
        if(this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView0 = this.l;
        if(imageView0 != null) {
            imageView0.setVisibility((z ? 0 : 8));
        }
    }

    public void setTitle(CharSequence charSequence0) {
        if(charSequence0 != null) {
            this.i.setText(charSequence0);
            if(this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
        else if(this.i.getVisibility() != 8) {
            this.i.setVisibility(8);
        }
    }
}

