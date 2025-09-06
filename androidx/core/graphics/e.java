package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

public final class e {
    static abstract class a {
        static Insets a(int v, int v1, int v2, int v3) {
            return Insets.of(v, v1, v2, v3);
        }
    }

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final e e;

    static {
        e.e = new e(0, 0, 0, 0);
    }

    private e(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public static e a(e e0, e e1) {
        return e.b(Math.max(e0.a, e1.a), Math.max(e0.b, e1.b), Math.max(e0.c, e1.c), Math.max(e0.d, e1.d));
    }

    public static e b(int v, int v1, int v2, int v3) {
        return v != 0 || v1 != 0 || v2 != 0 || v3 != 0 ? new e(v, v1, v2, v3) : e.e;
    }

    public static e c(Rect rect0) {
        return e.b(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public static e d(Insets insets0) {
        return e.b(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(e.class != class0 || this.d != ((e)object0).d) {
                return false;
            }
            if(this.a != ((e)object0).a) {
                return false;
            }
            return this.c == ((e)object0).c ? this.b == ((e)object0).b : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}

