package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView.B;

public class l extends B {
    private final Drawable t;
    private ColorStateList u;
    private final SparseArray v;
    private boolean w;
    private boolean x;

    l(View view0) {
        super(view0);
        SparseArray sparseArray0 = new SparseArray(4);
        this.v = sparseArray0;
        TextView textView0 = (TextView)view0.findViewById(0x1020016);
        sparseArray0.put(0x1020016, textView0);
        sparseArray0.put(0x1020010, view0.findViewById(0x1020010));
        sparseArray0.put(0x1020006, view0.findViewById(0x1020006));
        View view1 = view0.findViewById(o.a);
        sparseArray0.put(o.a, view1);
        sparseArray0.put(0x102003E, view0.findViewById(0x102003E));
        this.t = view0.getBackground();
        if(textView0 != null) {
            this.u = textView0.getTextColors();
        }
    }

    public View M(int v) {
        View view0 = (View)this.v.get(v);
        if(view0 != null) {
            return view0;
        }
        View view1 = this.a.findViewById(v);
        if(view1 != null) {
            this.v.put(v, view1);
        }
        return view1;
    }

    public boolean N() {
        return this.w;
    }

    public boolean O() {
        return this.x;
    }

    void P() {
        Drawable drawable0 = this.a.getBackground();
        Drawable drawable1 = this.t;
        if(drawable0 != drawable1) {
            Y.s0(this.a, drawable1);
        }
        TextView textView0 = (TextView)this.M(0x1020016);
        if(textView0 != null && this.u != null && !textView0.getTextColors().equals(this.u)) {
            textView0.setTextColor(this.u);
        }
    }

    public void Q(boolean z) {
        this.w = z;
    }

    public void R(boolean z) {
        this.x = z;
    }
}

