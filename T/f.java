package t;

import java.util.ArrayList;
import java.util.List;

public class f implements d {
    static enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE;

    }

    public d a;
    public boolean b;
    public boolean c;
    m d;
    a e;
    int f;
    public int g;
    int h;
    g i;
    public boolean j;
    List k;
    List l;

    public f(m m0) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = a.f;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = m0;
    }

    @Override  // t.d
    public void a(d d0) {
        for(Object object0: this.l) {
            if(!((f)object0).j) {
                return;
            }
            if(false) {
                break;
            }
        }
        this.c = true;
        d d1 = this.a;
        if(d1 != null) {
            d1.a(this);
        }
        if(this.b) {
            this.d.a(this);
            return;
        }
        f f0 = null;
        int v = 0;
        for(Object object1: this.l) {
            f f1 = (f)object1;
            if(!(f1 instanceof g)) {
                ++v;
                f0 = f1;
            }
        }
        if(f0 != null && v == 1 && f0.j) {
            g g0 = this.i;
            if(g0 != null) {
                if(g0.j) {
                    this.f = this.h * g0.g;
                    goto label_30;
                }
                return;
            }
        label_30:
            this.d(f0.g + this.f);
        }
        d d2 = this.a;
        if(d2 != null) {
            d2.a(this);
        }
    }

    public void b(d d0) {
        this.k.add(d0);
        if(this.j) {
            d0.a(d0);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int v) {
        if(this.j) {
            return;
        }
        this.j = true;
        this.g = v;
        for(Object object0: this.k) {
            ((d)object0).a(((d)object0));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.d.b.r());
        stringBuilder0.append(":");
        stringBuilder0.append(this.e);
        stringBuilder0.append("(");
        Integer integer0 = this.j ? this.g : "unresolved";
        stringBuilder0.append(integer0);
        stringBuilder0.append(") <t=");
        stringBuilder0.append(this.l.size());
        stringBuilder0.append(":d=");
        stringBuilder0.append(this.k.size());
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

