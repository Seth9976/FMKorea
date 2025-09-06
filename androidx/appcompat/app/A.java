package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.view.b;
import e.j;

public abstract class a {
    public static abstract class androidx.appcompat.app.a.a extends ViewGroup.MarginLayoutParams {
        public int a;

        public androidx.appcompat.app.a.a(int v, int v1) {
            super(v, v1);
            this.a = 0x800013;
        }

        public androidx.appcompat.app.a.a(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.t);
            this.a = typedArray0.getInt(j.u, 0);
            typedArray0.recycle();
        }

        public androidx.appcompat.app.a.a(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
        }

        public androidx.appcompat.app.a.a(androidx.appcompat.app.a.a a$a0) {
            super(a$a0);
            this.a = a$a0.a;
        }
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean arg1);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration0) {
    }

    void n() {
    }

    public abstract boolean o(int arg1, KeyEvent arg2);

    public boolean p(KeyEvent keyEvent0) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean arg1);

    public abstract void s(boolean arg1);

    public abstract void t(boolean arg1);

    public abstract void u(int arg1);

    public abstract void v(Drawable arg1);

    public abstract void w(boolean arg1);

    public abstract void x(CharSequence arg1);

    public abstract void y();

    public b z(androidx.appcompat.view.b.a b$a0) {
        return null;
    }
}

