package com.google.android.material.button;

import C.z.f;
import C.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.Y;
import androidx.core.view.v;
import com.google.android.material.internal.q;
import com.google.android.material.internal.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import z1.j;
import z1.k;

public class MaterialButtonToggleGroup extends LinearLayout {
    class a implements Comparator {
        final MaterialButtonToggleGroup f;

        public int a(MaterialButton materialButton0, MaterialButton materialButton1) {
            int v = Boolean.valueOf(materialButton0.isChecked()).compareTo(Boolean.valueOf(materialButton1.isChecked()));
            if(v != 0) {
                return v;
            }
            int v1 = Boolean.valueOf(materialButton0.isPressed()).compareTo(Boolean.valueOf(materialButton1.isPressed()));
            return v1 == 0 ? MaterialButtonToggleGroup.this.indexOfChild(materialButton0).compareTo(MaterialButtonToggleGroup.this.indexOfChild(materialButton1)) : v1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.a(((MaterialButton)object0), ((MaterialButton)object1));
        }
    }

    static class c {
        S1.c a;
        S1.c b;
        S1.c c;
        S1.c d;
        private static final S1.c e;

        static {
            c.e = new S1.a(0.0f);
        }

        c(S1.c c0, S1.c c1, S1.c c2, S1.c c3) {
            this.a = c0;
            this.b = c2;
            this.c = c3;
            this.d = c1;
        }

        public static c a(c materialButtonToggleGroup$c0) {
            return new c(c.e, materialButtonToggleGroup$c0.d, c.e, materialButtonToggleGroup$c0.c);
        }

        // 去混淆评级： 低(20)
        public static c b(c materialButtonToggleGroup$c0, View view0) {
            return t.g(view0) ? c.c(materialButtonToggleGroup$c0) : c.d(materialButtonToggleGroup$c0);
        }

        public static c c(c materialButtonToggleGroup$c0) {
            return new c(materialButtonToggleGroup$c0.a, materialButtonToggleGroup$c0.d, c.e, c.e);
        }

        public static c d(c materialButtonToggleGroup$c0) {
            return new c(c.e, c.e, materialButtonToggleGroup$c0.b, materialButtonToggleGroup$c0.c);
        }

        // 去混淆评级： 低(20)
        public static c e(c materialButtonToggleGroup$c0, View view0) {
            return t.g(view0) ? c.d(materialButtonToggleGroup$c0) : c.c(materialButtonToggleGroup$c0);
        }

        public static c f(c materialButtonToggleGroup$c0) {
            return new c(materialButtonToggleGroup$c0.a, c.e, materialButtonToggleGroup$c0.b, c.e);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup arg1, int arg2, boolean arg3);
    }

    class e implements com.google.android.material.button.MaterialButton.a {
        final MaterialButtonToggleGroup a;

        private e() {
        }

        e(a materialButtonToggleGroup$a0) {
        }

        @Override  // com.google.android.material.button.MaterialButton$a
        public void a(MaterialButton materialButton0, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    private final List f;
    private final e g;
    private final LinkedHashSet h;
    private final Comparator i;
    private Integer[] j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final int n;
    private Set o;
    private static final int p;

    static {
        MaterialButtonToggleGroup.p = j.v;
    }

    public MaterialButtonToggleGroup(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.y);
    }

    public MaterialButtonToggleGroup(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, MaterialButtonToggleGroup.p), attributeSet0, v);
        this.f = new ArrayList();
        this.g = new e(this, null);
        this.h = new LinkedHashSet();
        this.i = new a(this);
        this.k = false;
        this.o = new HashSet();
        TypedArray typedArray0 = q.i(this.getContext(), attributeSet0, k.C3, v, MaterialButtonToggleGroup.p, new int[0]);
        this.setSingleSelection(typedArray0.getBoolean(k.G3, false));
        this.n = typedArray0.getResourceId(k.E3, -1);
        this.m = typedArray0.getBoolean(k.F3, false);
        this.setChildrenDrawingOrderEnabled(true);
        this.setEnabled(typedArray0.getBoolean(k.D3, true));
        typedArray0.recycle();
        Y.x0(this, 1);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        class b extends androidx.core.view.a {
            final MaterialButtonToggleGroup d;

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                z0.p0(f.a(0, 1, MaterialButtonToggleGroup.this.i(view0), 1, false, ((MaterialButton)view0).isChecked()));
            }
        }

        if(!(view0 instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
        this.setGeneratedIdIfNeeded(((MaterialButton)view0));
        this.setupButtonChild(((MaterialButton)view0));
        this.e(((MaterialButton)view0).getId(), ((MaterialButton)view0).isChecked());
        S1.k k0 = ((MaterialButton)view0).getShapeAppearanceModel();
        c materialButtonToggleGroup$c0 = new c(k0.r(), k0.j(), k0.t(), k0.l());
        this.f.add(materialButtonToggleGroup$c0);
        ((MaterialButton)view0).setEnabled(this.isEnabled());
        Y.o0(((MaterialButton)view0), new b(this));
    }

    public void b(d materialButtonToggleGroup$d0) {
        this.h.add(materialButtonToggleGroup$d0);
    }

    private void c() {
        int v = this.getFirstVisibleChildIndex();
        if(v == -1) {
            return;
        }
        for(int v1 = v + 1; v1 < this.getChildCount(); ++v1) {
            MaterialButton materialButton0 = this.h(v1);
            int v2 = Math.min(materialButton0.getStrokeWidth(), this.h(v1 - 1).getStrokeWidth());
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = this.d(materialButton0);
            if(this.getOrientation() == 0) {
                v.c(linearLayout$LayoutParams0, 0);
                v.d(linearLayout$LayoutParams0, -v2);
                linearLayout$LayoutParams0.topMargin = 0;
            }
            else {
                linearLayout$LayoutParams0.bottomMargin = 0;
                linearLayout$LayoutParams0.topMargin = -v2;
                v.d(linearLayout$LayoutParams0, 0);
            }
            materialButton0.setLayoutParams(linearLayout$LayoutParams0);
        }
        this.n(v);
    }

    private LinearLayout.LayoutParams d(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : new LinearLayout.LayoutParams(viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        this.r();
        super.dispatchDraw(canvas0);
    }

    private void e(int v, boolean z) {
        if(v == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + -1);
            return;
        }
        HashSet hashSet0 = new HashSet(this.o);
        if(z && !hashSet0.contains(v)) {
            if(this.l && !hashSet0.isEmpty()) {
                hashSet0.clear();
            }
            hashSet0.add(v);
            this.q(hashSet0);
            return;
        }
        if(!z && hashSet0.contains(v)) {
            if(!this.m || hashSet0.size() > 1) {
                hashSet0.remove(v);
            }
            this.q(hashSet0);
        }
    }

    public void f() {
        this.q(new HashSet());
    }

    private void g(int v, boolean z) {
        for(Object object0: this.h) {
            ((d)object0).a(this, v, z);
        }
    }

    public int getCheckedButtonId() {
        return this.l && !this.o.isEmpty() ? this.o.iterator().next() : -1;
    }

    public List getCheckedButtonIds() {
        List list0 = new ArrayList();
        for(int v = 0; v < this.getChildCount(); ++v) {
            int v1 = this.h(v).getId();
            if(this.o.contains(v1)) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        Integer[] arr_integer = this.j;
        if(arr_integer != null && v1 < arr_integer.length) {
            return (int)arr_integer[v1];
        }
        Log.w("MButtonToggleGroup", "Child order wasn\'t updated");
        return v1;
    }

    private int getFirstVisibleChildIndex() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.k(v1)) {
                return v1;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            if(this.k(v)) {
                return v;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof MaterialButton && this.k(v)) {
                ++v1;
            }
        }
        return v1;
    }

    private MaterialButton h(int v) {
        return (MaterialButton)this.getChildAt(v);
    }

    private int i(View view0) {
        if(!(view0 instanceof MaterialButton)) {
            return -1;
        }
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) == view0) {
                return v1;
            }
            if(this.getChildAt(v) instanceof MaterialButton && this.k(v)) {
                ++v1;
            }
        }
        return -1;
    }

    private c j(int v, int v1, int v2) {
        c materialButtonToggleGroup$c0 = (c)this.f.get(v);
        if(v1 == v2) {
            return materialButtonToggleGroup$c0;
        }
        boolean z = this.getOrientation() == 0;
        if(v == v1) {
            return z ? c.e(materialButtonToggleGroup$c0, this) : c.f(materialButtonToggleGroup$c0);
        }
        if(v == v2) {
            return z ? c.b(materialButtonToggleGroup$c0, this) : c.a(materialButtonToggleGroup$c0);
        }
        return null;
    }

    private boolean k(int v) {
        return this.getChildAt(v).getVisibility() != 8;
    }

    public boolean l() {
        return this.l;
    }

    void m(MaterialButton materialButton0, boolean z) {
        if(this.k) {
            return;
        }
        this.e(materialButton0.getId(), z);
    }

    private void n(int v) {
        if(this.getChildCount() != 0 && v != -1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.h(v).getLayoutParams();
            if(this.getOrientation() == 1) {
                linearLayout$LayoutParams0.topMargin = 0;
                linearLayout$LayoutParams0.bottomMargin = 0;
                return;
            }
            v.c(linearLayout$LayoutParams0, 0);
            v.d(linearLayout$LayoutParams0, 0);
            linearLayout$LayoutParams0.leftMargin = 0;
            linearLayout$LayoutParams0.rightMargin = 0;
        }
    }

    private void o(int v, boolean z) {
        View view0 = this.findViewById(v);
        if(view0 instanceof MaterialButton) {
            this.k = true;
            ((MaterialButton)view0).setChecked(z);
            this.k = false;
        }
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int v = this.n;
        if(v != -1) {
            this.q(Collections.singleton(v));
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        z.P0(accessibilityNodeInfo0).o0(C.z.e.b(1, this.getVisibleButtonCount(), false, (this.l() ? 1 : 2)));
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        this.s();
        this.c();
        super.onMeasure(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        if(view0 instanceof MaterialButton) {
            ((MaterialButton)view0).setOnPressedChangeListenerInternal(null);
        }
        int v = this.indexOfChild(view0);
        if(v >= 0) {
            this.f.remove(v);
        }
        this.s();
        this.c();
    }

    private static void p(S1.k.b k$b0, c materialButtonToggleGroup$c0) {
        if(materialButtonToggleGroup$c0 == null) {
            k$b0.o(0.0f);
            return;
        }
        k$b0.B(materialButtonToggleGroup$c0.a).t(materialButtonToggleGroup$c0.d).F(materialButtonToggleGroup$c0.b).x(materialButtonToggleGroup$c0.c);
    }

    private void q(Set set0) {
        Set set1 = this.o;
        this.o = new HashSet(set0);
        for(int v = 0; v < this.getChildCount(); ++v) {
            int v1 = this.h(v).getId();
            this.o(v1, set0.contains(v1));
            if(set1.contains(v1) != set0.contains(v1)) {
                this.g(v1, set0.contains(v1));
            }
        }
        this.invalidate();
    }

    private void r() {
        TreeMap treeMap0 = new TreeMap(this.i);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            treeMap0.put(this.h(v1), v1);
        }
        this.j = (Integer[])treeMap0.values().toArray(new Integer[0]);
    }

    void s() {
        int v = this.getChildCount();
        int v1 = this.getFirstVisibleChildIndex();
        int v2 = this.getLastVisibleChildIndex();
        for(int v3 = 0; v3 < v; ++v3) {
            MaterialButton materialButton0 = this.h(v3);
            if(materialButton0.getVisibility() != 8) {
                S1.k.b k$b0 = materialButton0.getShapeAppearanceModel().v();
                MaterialButtonToggleGroup.p(k$b0, this.j(v3, v1, v2));
                materialButton0.setShapeAppearanceModel(k$b0.m());
            }
        }
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for(int v = 0; v < this.getChildCount(); ++v) {
            this.h(v).setEnabled(z);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton0) {
        if(materialButton0.getId() == -1) {
            materialButton0.setId(Y.k());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.m = z;
    }

    public void setSingleSelection(int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        if(this.l != z) {
            this.l = z;
            this.f();
        }
        this.t();
    }

    private void setupButtonChild(MaterialButton materialButton0) {
        materialButton0.setMaxLines(1);
        materialButton0.setEllipsize(TextUtils.TruncateAt.END);
        materialButton0.setCheckable(true);
        materialButton0.setOnPressedChangeListenerInternal(this.g);
        materialButton0.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            Class class0 = this.l ? RadioButton.class : ToggleButton.class;
            this.h(v).setA11yClassName(class0.getName());
        }
    }
}

