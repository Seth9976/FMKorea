package com.google.android.material.datepicker;

import C.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.Y;
import java.util.Calendar;
import z1.e;

final class MaterialCalendarGridView extends GridView {
    private final Calendar f;
    private final boolean g;

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0, int v) {
        class a extends androidx.core.view.a {
            final MaterialCalendarGridView d;

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                z0.o0(null);
            }
        }

        super(context0, attributeSet0, v);
        this.f = u.k();
        if(h.y(this.getContext())) {
            this.setNextFocusLeftId(e.a);
            this.setNextFocusRightId(e.d);
        }
        this.g = h.A(this.getContext());
        Y.o0(this, new a(this));
    }

    private void a(int v, Rect rect0) {
        switch(v) {
            case 33: {
                this.setSelection(this.b().k());
                return;
            }
            case 130: {
                this.setSelection(this.b().b());
                return;
            }
            default: {
                super.onFocusChanged(true, v, rect0);
            }
        }
    }

    public j b() {
        return (j)super.getAdapter();
    }

    @Override  // android.widget.GridView
    public Adapter getAdapter() {
        return this.b();
    }

    @Override  // android.widget.GridView
    public ListAdapter getAdapter() {
        return this.b();
    }

    @Override  // android.widget.AbsListView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b().notifyDataSetChanged();
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        j j0 = this.b();
        j0.getClass();
        int v = Math.max(j0.b(), this.getFirstVisiblePosition());
        int v1 = Math.min(j0.k(), this.getLastVisiblePosition());
        j0.d(v);
        j0.d(v1);
        throw null;
    }

    @Override  // android.widget.GridView
    protected void onFocusChanged(boolean z, int v, Rect rect0) {
        if(z) {
            this.a(v, rect0);
            return;
        }
        super.onFocusChanged(false, v, rect0);
    }

    @Override  // android.widget.GridView
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(!super.onKeyDown(v, keyEvent0)) {
            return false;
        }
        if(this.getSelectedItemPosition() != -1 && this.getSelectedItemPosition() < this.b().b()) {
            if(19 == v) {
                this.setSelection(this.b().b());
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // android.widget.GridView
    public void onMeasure(int v, int v1) {
        if(this.g) {
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(0xFFFFFF, 0x80000000));
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.height = this.getMeasuredHeight();
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.GridView
    public void setAdapter(Adapter adapter0) {
        this.setAdapter(((ListAdapter)adapter0));
    }

    @Override  // android.widget.GridView
    public final void setAdapter(ListAdapter listAdapter0) {
        if(!(listAdapter0 instanceof j)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter0);
    }

    @Override  // android.widget.GridView
    public void setSelection(int v) {
        if(v < this.b().b()) {
            super.setSelection(this.b().b());
            return;
        }
        super.setSelection(v);
    }
}

