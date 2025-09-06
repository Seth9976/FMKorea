package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import s.e;
import s.i;

public abstract class c extends View {
    protected int[] f;
    protected int g;
    protected Context h;
    protected i i;
    protected boolean j;
    protected String k;
    private View[] l;
    private HashMap m;

    public c(Context context0) {
        super(context0);
        this.f = new int[0x20];
        this.j = false;
        this.l = null;
        this.m = new HashMap();
        this.h = context0;
        this.g(null);
    }

    public c(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new int[0x20];
        this.j = false;
        this.l = null;
        this.m = new HashMap();
        this.h = context0;
        this.g(attributeSet0);
    }

    private void a(String s) {
        if(s == null || s.length() == 0 || this.h == null) {
            return;
        }
        String s1 = s.trim();
        if(this.getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout0 = (ConstraintLayout)this.getParent();
        }
        int v = this.f(s1);
        if(v != 0) {
            this.m.put(v, s1);
            this.b(v);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + s1 + "\"");
    }

    private void b(int v) {
        if(v == this.getId()) {
            return;
        }
        int[] arr_v = this.f;
        if(this.g + 1 > arr_v.length) {
            this.f = Arrays.copyOf(arr_v, arr_v.length * 2);
        }
        int v1 = this.g;
        this.f[v1] = v;
        this.g = v1 + 1;
    }

    protected void c() {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null && viewParent0 instanceof ConstraintLayout) {
            this.d(((ConstraintLayout)viewParent0));
        }
    }

    protected void d(ConstraintLayout constraintLayout0) {
        int v = this.getVisibility();
        float f = this.getElevation();
        for(int v1 = 0; v1 < this.g; ++v1) {
            View view0 = constraintLayout0.h(this.f[v1]);
            if(view0 != null) {
                view0.setVisibility(v);
                if(f > 0.0f) {
                    view0.setTranslationZ(view0.getTranslationZ() + f);
                }
            }
        }
    }

    private int e(ConstraintLayout constraintLayout0, String s) {
        if(s != null && constraintLayout0 != null) {
            Resources resources0 = this.h.getResources();
            if(resources0 == null) {
                return 0;
            }
            int v = constraintLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = constraintLayout0.getChildAt(v1);
                if(view0.getId() != -1) {
                    try {
                        String s1 = null;
                        s1 = resources0.getResourceEntryName(view0.getId());
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                    if(s.equals(s1)) {
                        return view0.getId();
                    }
                }
            }
        }
        return 0;
    }

    private int f(String s) {
        ConstraintLayout constraintLayout0 = this.getParent() instanceof ConstraintLayout ? ((ConstraintLayout)this.getParent()) : null;
        int v = 0;
        if(this.isInEditMode() && constraintLayout0 != null) {
            Object object0 = constraintLayout0.f(0, s);
            if(object0 instanceof Integer) {
                v = (int)(((Integer)object0));
            }
        }
        if(v == 0 && constraintLayout0 != null) {
            v = this.e(constraintLayout0, s);
        }
        if(v == 0) {
            try {
                v = h.class.getField(s).getInt(null);
            }
            catch(Exception unused_ex) {
            }
        }
        return v == 0 ? this.h.getResources().getIdentifier(s, "id", "com.fmkorea.m.fmk") : v;
    }

    protected void g(AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, androidx.constraintlayout.widget.i.a1);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == androidx.constraintlayout.widget.i.t1) {
                    String s = typedArray0.getString(v2);
                    this.k = s;
                    this.setIds(s);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f, this.g);
    }

    public abstract void h(e arg1, boolean arg2);

    public void i(ConstraintLayout constraintLayout0) {
    }

    public void j(ConstraintLayout constraintLayout0) {
    }

    public void k(ConstraintLayout constraintLayout0) {
    }

    public void l(ConstraintLayout constraintLayout0) {
        if(this.isInEditMode()) {
            this.setIds(this.k);
        }
        i i0 = this.i;
        if(i0 == null) {
            return;
        }
        i0.b();
        for(int v = 0; v < this.g; ++v) {
            int v1 = this.f[v];
            View view0 = constraintLayout0.h(v1);
            if(view0 == null) {
                String s = (String)this.m.get(v1);
                int v2 = this.e(constraintLayout0, s);
                if(v2 != 0) {
                    this.f[v] = v2;
                    this.m.put(v2, s);
                    view0 = constraintLayout0.h(v2);
                }
            }
            if(view0 != null) {
                this.i.a(constraintLayout0.i(view0));
            }
        }
        this.i.c(constraintLayout0.h);
    }

    public void m() {
        if(this.i == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof b) {
            ((b)viewGroup$LayoutParams0).n0 = (e)this.i;
        }
    }

    @Override  // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.k;
        if(s != null) {
            this.setIds(s);
        }
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(this.j) {
            super.onMeasure(v, v1);
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    protected void setIds(String s) {
        this.k = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.g = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.a(s.substring(v, v1));
            v = v1 + 1;
        }
        this.a(s.substring(v));
    }

    public void setReferencedIds(int[] arr_v) {
        this.k = null;
        this.g = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            this.b(arr_v[v]);
        }
    }
}

