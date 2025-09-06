package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.c0;

public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, b, k {
    private e f;
    private int g;
    private static final int[] h;

    static {
        ExpandedMenuView.h = new int[]{0x10100D4, 0x1010129};
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010074);
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        this.setOnItemClickListener(this);
        c0 c00 = c0.v(context0, attributeSet0, ExpandedMenuView.h, v, 0);
        if(c00.s(0)) {
            this.setBackgroundDrawable(c00.g(0));
        }
        if(c00.s(1)) {
            this.setDivider(c00.g(1));
        }
        c00.x();
    }

    @Override  // androidx.appcompat.view.menu.e$b
    public boolean a(g g0) {
        return this.f.O(g0, 0);
    }

    @Override  // androidx.appcompat.view.menu.k
    public void b(e e0) {
        this.f = e0;
    }

    public int getWindowAnimations() {
        return this.g;
    }

    @Override  // android.widget.ListView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a(((g)this.getAdapter().getItem(v)));
    }
}

