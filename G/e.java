package g;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

public class e extends b {
    static class a extends d {
        int[][] J;

        a(a e$a0, e e0, Resources resources0) {
            super(e$a0, e0, resources0);
            if(e$a0 != null) {
                this.J = e$a0.J;
                return;
            }
            this.J = new int[this.f()][];
        }

        int A(int[] arr_v) {
            int[][] arr2_v = this.J;
            int v = this.h();
            for(int v1 = 0; v1 < v; ++v1) {
                if(StateSet.stateSetMatches(arr2_v[v1], arr_v)) {
                    return v1;
                }
            }
            return -1;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            return new e(this, resources0);
        }

        @Override  // g.b$d
        public void o(int v, int v1) {
            super.o(v, v1);
            int[][] arr2_v = new int[v1][];
            System.arraycopy(this.J, 0, arr2_v, 0, v);
            this.J = arr2_v;
        }

        @Override  // g.b$d
        void r() {
            int[][] arr2_v = this.J;
            int[][] arr2_v1 = new int[arr2_v.length][];
            for(int v = arr2_v.length - 1; v >= 0; --v) {
                int[] arr_v = this.J[v];
                arr2_v1[v] = arr_v == null ? null : ((int[])arr_v.clone());
            }
            this.J = arr2_v1;
        }

        int z(int[] arr_v, Drawable drawable0) {
            int v = this.a(drawable0);
            this.J[v] = arr_v;
            return v;
        }
    }

    private a r;
    private boolean s;

    public e() {
        this(null, null);
    }

    e(a e$a0) {
        if(e$a0 != null) {
            this.h(e$a0);
        }
    }

    e(a e$a0, Resources resources0) {
        this.h(new a(e$a0, this, resources0));
        this.onStateChange(this.getState());
    }

    @Override  // g.b
    public void applyTheme(Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
        this.onStateChange(this.getState());
    }

    @Override  // g.b
    d b() {
        return this.k();
    }

    @Override  // g.b
    void h(d b$d0) {
        super.h(b$d0);
        if(b$d0 instanceof a) {
            this.r = (a)b$d0;
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public void j(int[] arr_v, Drawable drawable0) {
        if(drawable0 != null) {
            this.r.z(arr_v, drawable0);
            this.onStateChange(this.getState());
        }
    }

    a k() {
        return new a(this.r, this, null);
    }

    int[] l(AttributeSet attributeSet0) {
        int v = attributeSet0.getAttributeCount();
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = attributeSet0.getAttributeNameResource(v1);
            if(v3 != 0 && v3 != 0x10100D0 && v3 != 0x1010199) {
                if(!attributeSet0.getAttributeBooleanValue(v1, false)) {
                    v3 = -v3;
                }
                arr_v[v2] = v3;
                ++v2;
            }
        }
        return StateSet.trimStateSet(arr_v, v2);
    }

    @Override  // g.b
    public Drawable mutate() {
        if(!this.s && super.mutate() == this) {
            this.r.r();
            this.s = true;
        }
        return this;
    }

    @Override  // g.b
    protected boolean onStateChange(int[] arr_v) {
        boolean z = super.onStateChange(arr_v);
        int v = this.r.A(arr_v);
        if(v < 0) {
            v = this.r.A(StateSet.WILD_CARD);
        }
        return this.g(v) || z;
    }
}

