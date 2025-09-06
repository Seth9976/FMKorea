package com.google.android.material.snackbar;

import M1.h;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.Y;
import z1.a;
import z1.c;
import z1.e;

public class SnackbarContentLayout extends LinearLayout {
    private TextView f;
    private Button g;
    private final TimeInterpolator h;
    private int i;

    public SnackbarContentLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h = h.g(context0, a.J, A1.a.b);
    }

    private static void a(View view0, int v, int v1) {
        if(Y.U(view0)) {
            Y.C0(view0, Y.E(view0), v, Y.D(view0), v1);
            return;
        }
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), v1);
    }

    private boolean b(int v, int v1, int v2) {
        boolean z;
        if(v == this.getOrientation()) {
            z = false;
        }
        else {
            this.setOrientation(v);
            z = true;
        }
        if(this.f.getPaddingTop() == v1 && this.f.getPaddingBottom() == v2) {
            return z;
        }
        SnackbarContentLayout.a(this.f, v1, v2);
        return true;
    }

    public Button getActionView() {
        return this.g;
    }

    public TextView getMessageView() {
        return this.f;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView)this.findViewById(e.N);
        this.g = (Button)this.findViewById(e.M);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.getOrientation() == 1) {
            return;
        }
        int v2 = this.getResources().getDimensionPixelSize(c.l);
        int v3 = this.getResources().getDimensionPixelSize(c.k);
        Layout layout0 = this.f.getLayout();
        boolean z = layout0 != null && layout0.getLineCount() > 1;
        if(!z || this.i <= 0 || this.g.getMeasuredWidth() <= this.i) {
            if(!z) {
                v2 = v3;
            }
            if(this.b(0, v2, v2)) {
                super.onMeasure(v, v1);
            }
        }
        else if(this.b(1, v2, v2 - v3)) {
            super.onMeasure(v, v1);
        }
    }

    public void setMaxInlineActionWidth(int v) {
        this.i = v;
    }
}

