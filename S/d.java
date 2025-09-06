package s;

import java.util.HashSet;
import r.c;
import r.i;

public class d {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.l.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;

    }

    private HashSet a;
    public final e b;
    public final b c;
    public d d;
    public int e;
    int f;
    i g;

    public d(e e0, b d$b0) {
        this.a = null;
        this.e = 0;
        this.f = -1;
        this.b = e0;
        this.c = d$b0;
    }

    public boolean a(d d0, int v) {
        return this.b(d0, v, -1, false);
    }

    public boolean b(d d0, int v, int v1, boolean z) {
        if(d0 == null) {
            this.l();
            return true;
        }
        if(!z && !this.k(d0)) {
            return false;
        }
        this.d = d0;
        if(d0.a == null) {
            d0.a = new HashSet();
        }
        this.d.a.add(this);
        this.e = v > 0 ? v : 0;
        this.f = v1;
        return true;
    }

    public int c() {
        if(this.b.O() == 8) {
            return 0;
        }
        return this.f <= -1 || (this.d == null || this.d.b.O() != 8) ? this.e : this.f;
    }

    public final d d() {
        switch(a.a[this.c.ordinal()]) {
            case 2: {
                return this.b.D;
            }
            case 3: {
                return this.b.B;
            }
            case 4: {
                return this.b.E;
            }
            case 5: {
                return this.b.C;
            }
            case 1: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return null;
            }
            default: {
                throw new AssertionError(this.c.name());
            }
        }
    }

    public e e() {
        return this.b;
    }

    public i f() {
        return this.g;
    }

    public d g() {
        return this.d;
    }

    public b h() {
        return this.c;
    }

    public boolean i() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return false;
        }
        for(Object object0: hashSet0) {
            if(((d)object0).d().j()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean j() {
        return this.d != null;
    }

    public boolean k(d d0) {
        if(d0 == null) {
            return false;
        }
        b d$b0 = d0.h();
        b d$b1 = this.c;
        if(d$b0 == d$b1) {
            return d$b1 != b.k || d0.e().S() && this.e().S();
        }
        switch(a.a[d$b1.ordinal()]) {
            case 1: {
                return d$b0 != b.k && d$b0 != b.m && d$b0 != b.n;
            }
            case 2: 
            case 3: {
                boolean z = d$b0 == b.g || d$b0 == b.i;
                return d0.e() instanceof h ? z || d$b0 == b.m : z;
            }
            case 4: 
            case 5: {
                boolean z1 = d$b0 == b.h || d$b0 == b.j;
                return d0.e() instanceof h ? z1 || d$b0 == b.n : z1;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return false;
            }
            default: {
                throw new AssertionError(this.c.name());
            }
        }
    }

    public void l() {
        d d0 = this.d;
        if(d0 != null) {
            HashSet hashSet0 = d0.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
            }
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public void m(c c0) {
        i i0 = this.g;
        if(i0 == null) {
            this.g = new i(r.i.a.f, null);
            return;
        }
        i0.d();
    }

    public void n(int v) {
        if(this.j()) {
            this.f = v;
        }
    }

    @Override
    public String toString() {
        return this.b.r() + ":" + this.c.toString();
    }
}

