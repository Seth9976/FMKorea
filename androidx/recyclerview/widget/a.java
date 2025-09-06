package androidx.recyclerview.widget;

import B.e;
import B.f;
import java.util.ArrayList;
import java.util.List;

class a implements androidx.recyclerview.widget.h.a {
    interface androidx.recyclerview.widget.a.a {
        void a(int arg1, int arg2);

        void b(b arg1);

        void c(int arg1, int arg2, Object arg3);

        void d(b arg1);

        B e(int arg1);

        void f(int arg1, int arg2);

        void g(int arg1, int arg2);

        void h(int arg1, int arg2);
    }

    static class b {
        int a;
        int b;
        Object c;
        int d;

        b(int v, int v1, int v2, Object object0) {
            this.a = v;
            this.b = v1;
            this.d = v2;
            this.c = object0;
        }

        String a() {
            switch(this.a) {
                case 1: {
                    return "add";
                }
                case 2: {
                    return "rm";
                }
                case 4: {
                    return "up";
                }
                case 8: {
                    return "mv";
                }
                default: {
                    return "??";
                }
            }
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null && this.getClass() == object0.getClass()) {
                int v = this.a;
                if(v != ((b)object0).a) {
                    return false;
                }
                if(v == 8 && Math.abs(this.d - this.b) == 1 && this.d == ((b)object0).b && this.b == ((b)object0).d) {
                    return true;
                }
                if(this.d != ((b)object0).d) {
                    return false;
                }
                if(this.b != ((b)object0).b) {
                    return false;
                }
                return this.c == null ? ((b)object0).c == null : this.c.equals(((b)object0).c);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (this.a * 0x1F + this.b) * 0x1F + this.d;
        }

        @Override
        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + this.a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
        }
    }

    private e a;
    final ArrayList b;
    final ArrayList c;
    final androidx.recyclerview.widget.a.a d;
    Runnable e;
    final boolean f;
    final h g;
    private int h;

    a(androidx.recyclerview.widget.a.a a$a0) {
        this(a$a0, false);
    }

    a(androidx.recyclerview.widget.a.a a$a0, boolean z) {
        this.a = new f(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = 0;
        this.d = a$a0;
        this.f = z;
        this.g = new h(this);
    }

    @Override  // androidx.recyclerview.widget.h$a
    public void a(b a$b0) {
        if(!this.f) {
            a$b0.c = null;
            this.a.a(a$b0);
        }
    }

    @Override  // androidx.recyclerview.widget.h$a
    public b b(int v, int v1, int v2, Object object0) {
        b a$b0 = (b)this.a.b();
        if(a$b0 == null) {
            return new b(v, v1, v2, object0);
        }
        a$b0.a = v;
        a$b0.b = v1;
        a$b0.d = v2;
        a$b0.c = object0;
        return a$b0;
    }

    private void c(b a$b0) {
        this.s(a$b0);
    }

    private void d(b a$b0) {
        this.s(a$b0);
    }

    public int e(int v) {
        int v1 = this.b.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            b a$b0 = (b)this.b.get(v2);
            switch(a$b0.a) {
                case 1: {
                    if(a$b0.b <= v) {
                        v += a$b0.d;
                    }
                    break;
                }
                case 2: {
                    int v3 = a$b0.b;
                    if(v3 <= v) {
                        int v4 = a$b0.d;
                        if(v3 + v4 > v) {
                            return -1;
                        }
                        v -= v4;
                    }
                    break;
                }
                case 8: {
                    int v5 = a$b0.b;
                    if(v5 == v) {
                        v = a$b0.d;
                    }
                    else {
                        if(v5 < v) {
                            --v;
                        }
                        if(a$b0.d <= v) {
                            ++v;
                        }
                    }
                }
            }
        }
        return v;
    }

    // This method was un-flattened
    private void f(b a$b0) {
        int v5;
        int v = a$b0.b;
        int v1 = a$b0.d + v;
        int v2 = -1;
        int v3 = v;
        int v4 = 0;
        while(v3 < v1) {
            if(this.d.e(v3) != null || this.h(v3)) {
            label_13:
                if(v2 == 0) {
                    this.k(this.b(2, v, v4, null));
                    v5 = 1;
                    v3 -= v4;
                    v1 -= v4;
                    v4 = 1;
                    goto label_22;
                }
                else {
                    v5 = 1;
                }
            }
            else {
                if(v2 == 1) {
                    this.s(this.b(2, v, v4, null));
                    v5 = 0;
                    v3 -= v4;
                    v1 -= v4;
                    v4 = 1;
                    goto label_22;
                }
                else {
                    v5 = 0;
                    goto label_21;
                }
                goto label_13;
            }
        label_21:
            ++v4;
        label_22:
            ++v3;
            v2 = v5;
        }
        if(v4 != a$b0.d) {
            this.a(a$b0);
            a$b0 = this.b(2, v, v4, null);
        }
        if(v2 == 0) {
            this.k(a$b0);
            return;
        }
        this.s(a$b0);
    }

    private void g(b a$b0) {
        int v = a$b0.b;
        int v1 = a$b0.d + v;
        int v2 = 0;
        int v3 = -1;
        int v4 = v;
        while(v < v1) {
            if(this.d.e(v) != null || this.h(v)) {
                if(v3 == 0) {
                    this.k(this.b(4, v4, v2, a$b0.c));
                    v4 = v;
                    v2 = 0;
                }
                v3 = 1;
            }
            else {
                if(v3 == 1) {
                    this.s(this.b(4, v4, v2, a$b0.c));
                    v4 = v;
                    v2 = 0;
                }
                v3 = 0;
            }
            ++v2;
            ++v;
        }
        if(v2 != a$b0.d) {
            Object object0 = a$b0.c;
            this.a(a$b0);
            a$b0 = this.b(4, v4, v2, object0);
        }
        if(v3 == 0) {
            this.k(a$b0);
            return;
        }
        this.s(a$b0);
    }

    private boolean h(int v) {
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            b a$b0 = (b)this.c.get(v2);
            int v3 = a$b0.a;
            if(v3 == 8) {
                if(this.n(a$b0.d, v2 + 1) == v) {
                    return true;
                }
            }
            else if(v3 == 1) {
                int v4 = a$b0.b;
                int v5 = a$b0.d + v4;
                while(v4 < v5) {
                    if(this.n(v4, v2 + 1) == v) {
                        return true;
                    }
                    ++v4;
                }
            }
        }
        return false;
    }

    void i() {
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            b a$b0 = (b)this.c.get(v1);
            this.d.d(a$b0);
        }
        this.u(this.c);
        this.h = 0;
    }

    void j() {
        this.i();
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            b a$b0 = (b)this.b.get(v1);
            switch(a$b0.a) {
                case 1: {
                    this.d.d(a$b0);
                    this.d.g(a$b0.b, a$b0.d);
                    break;
                }
                case 2: {
                    this.d.d(a$b0);
                    this.d.h(a$b0.b, a$b0.d);
                    break;
                }
                case 4: {
                    this.d.d(a$b0);
                    this.d.c(a$b0.b, a$b0.d, a$b0.c);
                    break;
                }
                case 8: {
                    this.d.d(a$b0);
                    this.d.a(a$b0.b, a$b0.d);
                }
            }
            Runnable runnable0 = this.e;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
        this.u(this.b);
        this.h = 0;
    }

    private void k(b a$b0) {
        int v3;
        int v = a$b0.a;
        if(v == 1 || v == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v1 = this.w(a$b0.b, v);
        int v2 = a$b0.b;
        switch(a$b0.a) {
            case 2: {
                v3 = 0;
                break;
            }
            case 4: {
                v3 = 1;
                break;
            }
            default: {
                throw new IllegalArgumentException("op should be remove or update." + a$b0);
            }
        }
        int v5 = 1;
        for(int v4 = 1; v4 < a$b0.d; ++v4) {
            int v6 = this.w(a$b0.b + v3 * v4, a$b0.a);
            int v7 = a$b0.a;
            switch(v7) {
                case 2: {
                    if(v6 == v1) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                case 4: {
                    if(v6 == v1 + 1) {
                        ++v5;
                        continue;
                    }
                }
            }
            b a$b1 = this.b(v7, v1, v5, a$b0.c);
            this.l(a$b1, v2);
            this.a(a$b1);
            if(a$b0.a == 4) {
                v2 += v5;
            }
            v5 = 1;
            v1 = v6;
        }
        Object object0 = a$b0.c;
        this.a(a$b0);
        if(v5 > 0) {
            b a$b2 = this.b(a$b0.a, v1, v5, object0);
            this.l(a$b2, v2);
            this.a(a$b2);
        }
    }

    void l(b a$b0, int v) {
        this.d.b(a$b0);
        switch(a$b0.a) {
            case 2: {
                this.d.h(v, a$b0.d);
                return;
            }
            case 4: {
                this.d.c(v, a$b0.d, a$b0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
        }
    }

    int m(int v) {
        return this.n(v, 0);
    }

    int n(int v, int v1) {
        int v2 = this.c.size();
        while(v1 < v2) {
            b a$b0 = (b)this.c.get(v1);
            int v3 = a$b0.a;
            if(v3 == 8) {
                int v4 = a$b0.b;
                if(v4 == v) {
                    v = a$b0.d;
                }
                else {
                    if(v4 < v) {
                        --v;
                    }
                    if(a$b0.d <= v) {
                        ++v;
                    }
                }
            }
            else {
                int v5 = a$b0.b;
                if(v5 <= v) {
                    switch(v3) {
                        case 1: {
                            v += a$b0.d;
                            break;
                        }
                        case 2: {
                            int v6 = a$b0.d;
                            if(v < v5 + v6) {
                                return -1;
                            }
                            v -= v6;
                        }
                    }
                }
            }
            ++v1;
        }
        return v;
    }

    boolean o(int v) {
        return (v & this.h) != 0;
    }

    boolean p() {
        return this.b.size() > 0;
    }

    // 去混淆评级： 低(20)
    boolean q() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }

    boolean r(int v, int v1, Object object0) {
        if(v1 < 1) {
            return false;
        }
        b a$b0 = this.b(4, v, v1, object0);
        this.b.add(a$b0);
        this.h |= 4;
        return this.b.size() == 1;
    }

    private void s(b a$b0) {
        this.c.add(a$b0);
        switch(a$b0.a) {
            case 1: {
                this.d.g(a$b0.b, a$b0.d);
                return;
            }
            case 2: {
                this.d.f(a$b0.b, a$b0.d);
                return;
            }
            case 4: {
                this.d.c(a$b0.b, a$b0.d, a$b0.c);
                return;
            }
            case 8: {
                this.d.a(a$b0.b, a$b0.d);
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + a$b0);
            }
        }
    }

    void t() {
        this.g.b(this.b);
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            b a$b0 = (b)this.b.get(v1);
            switch(a$b0.a) {
                case 1: {
                    this.c(a$b0);
                    break;
                }
                case 2: {
                    this.f(a$b0);
                    break;
                }
                case 4: {
                    this.g(a$b0);
                    break;
                }
                case 8: {
                    this.d(a$b0);
                }
            }
            Runnable runnable0 = this.e;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
        this.b.clear();
    }

    void u(List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.a(((b)list0.get(v1)));
        }
        list0.clear();
    }

    void v() {
        this.u(this.b);
        this.u(this.c);
        this.h = 0;
    }

    private int w(int v, int v1) {
        int v7;
        int v6;
        for(int v2 = this.c.size() - 1; v2 >= 0; --v2) {
            b a$b0 = (b)this.c.get(v2);
            int v3 = a$b0.a;
            if(v3 == 8) {
                int v4 = a$b0.b;
                int v5 = a$b0.d;
                if(v4 < v5) {
                    v6 = v4;
                    v7 = v5;
                }
                else {
                    v7 = v4;
                    v6 = v5;
                }
                if(v < v6 || v > v7) {
                    if(v < v4) {
                        if(v1 == 1) {
                            a$b0.b = v4 + 1;
                            a$b0.d = v5 + 1;
                        }
                        else if(v1 == 2) {
                            a$b0.b = v4 - 1;
                            a$b0.d = v5 - 1;
                        }
                    }
                }
                else if(v6 == v4) {
                    if(v1 == 1) {
                        a$b0.d = v5 + 1;
                    }
                    else if(v1 == 2) {
                        a$b0.d = v5 - 1;
                    }
                    ++v;
                }
                else {
                    if(v1 == 1) {
                        a$b0.b = v4 + 1;
                    }
                    else if(v1 == 2) {
                        a$b0.b = v4 - 1;
                    }
                    --v;
                }
            }
            else {
                int v8 = a$b0.b;
                if(v8 > v) {
                    if(v1 == 1) {
                        a$b0.b = v8 + 1;
                    }
                    else if(v1 == 2) {
                        a$b0.b = v8 - 1;
                    }
                }
                else if(v3 == 1) {
                    v -= a$b0.d;
                }
                else if(v3 == 2) {
                    v += a$b0.d;
                }
            }
        }
        for(int v9 = this.c.size() - 1; v9 >= 0; --v9) {
            b a$b1 = (b)this.c.get(v9);
            if(a$b1.a != 8) {
                if(a$b1.d <= 0) {
                    this.c.remove(v9);
                    this.a(a$b1);
                }
            }
            else if(a$b1.d == a$b1.b || a$b1.d < 0) {
                this.c.remove(v9);
                this.a(a$b1);
            }
        }
        return v;
    }
}

