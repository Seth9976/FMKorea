package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public interface a {
    }

    private int f;
    private int g;
    private WeakReference h;
    private LayoutInflater i;

    public ViewStubCompat(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ViewStubCompat(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = 0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.W3, v, 0);
        this.g = typedArray0.getResourceId(j.Z3, -1);
        this.f = typedArray0.getResourceId(j.Y3, 0);
        this.setId(typedArray0.getResourceId(j.X3, -1));
        typedArray0.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    public View a() {
        ViewParent viewParent0 = this.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if(this.f == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        View view0 = (this.i == null ? LayoutInflater.from(this.getContext()) : this.i).inflate(this.f, ((ViewGroup)viewParent0), false);
        int v = this.g;
        if(v != -1) {
            view0.setId(v);
        }
        int v1 = ((ViewGroup)viewParent0).indexOfChild(this);
        ((ViewGroup)viewParent0).removeViewInLayout(this);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            ((ViewGroup)viewParent0).addView(view0, v1);
        }
        else {
            ((ViewGroup)viewParent0).addView(view0, v1, viewGroup$LayoutParams0);
        }
        this.h = new WeakReference(view0);
        return view0;
    }

    @Override  // android.view.View
    protected void dispatchDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
    }

    public int getInflatedId() {
        return this.g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.i;
    }

    public int getLayoutResource() {
        return this.f;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int v) {
        this.g = v;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater0) {
        this.i = layoutInflater0;
    }

    public void setLayoutResource(int v) {
        this.f = v;
    }

    public void setOnInflateListener(a viewStubCompat$a0) {
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        WeakReference weakReference0 = this.h;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            if(view0 == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view0.setVisibility(v);
            return;
        }
        super.setVisibility(v);
        if(v == 0 || v == 4) {
            this.a();
        }
    }
}

