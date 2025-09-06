package s;

import java.util.ArrayList;
import java.util.Arrays;

public class g extends l {
    class a {
        private int a;
        private e b;
        int c;
        private d d;
        private d e;
        private d f;
        private d g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        final g r;

        public a(int v, d d0, d d1, d d2, d d3, int v1) {
            this.b = null;
            this.c = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.a = v;
            this.d = d0;
            this.e = d1;
            this.f = d2;
            this.g = d3;
            this.h = g0.P0();
            this.i = g0.R0();
            this.j = g0.Q0();
            this.k = g0.O0();
            this.q = v1;
        }

        static e a(a g$a0) {
            return g$a0.b;
        }

        public void b(e e0) {
            int v = 0;
            if(this.a == 0) {
                int v1 = g.this.B1(e0, this.q);
                if(e0.y() == b.h) {
                    ++this.p;
                    v1 = 0;
                }
                int v2 = g.this.X0;
                if(e0.O() != 8) {
                    v = v2;
                }
                this.l += v1 + v;
                int v3 = g.this.A1(e0, this.q);
                if(this.b == null || this.c < v3) {
                    this.b = e0;
                    this.c = v3;
                    this.m = v3;
                }
            }
            else {
                int v4 = g.this.B1(e0, this.q);
                int v5 = g.this.A1(e0, this.q);
                if(e0.M() == b.h) {
                    ++this.p;
                    v5 = 0;
                }
                int v6 = g.this.Y0;
                if(e0.O() != 8) {
                    v = v6;
                }
                this.m += v5 + v;
                if(this.b == null || this.c < v4) {
                    this.b = e0;
                    this.c = v4;
                    this.l = v4;
                }
            }
            ++this.o;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int v, boolean z1) {
            e e4;
            int v1 = this.o;
            for(int v2 = 0; v2 < v1 && this.n + v2 < g.this.j1; ++v2) {
                e e0 = g.this.i1[this.n + v2];
                if(e0 != null) {
                    e0.Z();
                }
            }
            if(v1 != 0 && this.b != null) {
                boolean z2 = z1 && v == 0;
                int v4 = -1;
                int v5 = -1;
                for(int v3 = 0; v3 < v1; ++v3) {
                    int v6 = z ? v1 - 1 - v3 : v3;
                    if(this.n + v6 >= g.this.j1) {
                        break;
                    }
                    if(g.this.i1[this.n + v6].O() == 0) {
                        if(v4 == -1) {
                            v4 = v3;
                        }
                        v5 = v3;
                    }
                }
                e e1 = null;
                if(this.a == 0) {
                    e e2 = this.b;
                    e2.y0(g.this.M0);
                    e2.C.a(this.e, (v <= 0 ? this.i : this.i + g.this.Y0));
                    if(z1) {
                        e2.E.a(this.g, this.k);
                    }
                    if(v > 0) {
                        this.e.b.E.a(e2.C, 0);
                    }
                    if(g.this.a1 == 3 && !e2.S()) {
                        int v7 = 0;
                        while(v7 < v1) {
                            int v8 = z ? v1 - 1 - v7 : v7;
                            if(this.n + v8 >= g.this.j1) {
                                break;
                            }
                            e e3 = g.this.i1[this.n + v8];
                            if(e3.S()) {
                                e4 = e3;
                                goto label_43;
                            }
                            ++v7;
                        }
                    }
                    e4 = e2;
                label_43:
                    int v9 = 0;
                    while(v9 < v1) {
                        int v10 = z ? v1 - 1 - v9 : v9;
                        if(this.n + v10 >= g.this.j1) {
                            return;
                        }
                        e e5 = g.this.i1[this.n + v10];
                        if(v9 == 0) {
                            e5.j(e5.B, this.d, this.h);
                        }
                        if(v10 == 0) {
                            int v11 = g.this.L0;
                            float f = g.this.R0;
                            if(this.n == 0 && g.this.N0 != -1) {
                                v11 = g.this.N0;
                                f = g.this.T0;
                            }
                            else if(z1 && g.this.P0 != -1) {
                                v11 = g.this.P0;
                                f = g.this.V0;
                            }
                            e5.j0(v11);
                            e5.i0(f);
                        }
                        if(v9 == v1 - 1) {
                            e5.j(e5.D, this.f, this.j);
                        }
                        if(e1 != null) {
                            e5.B.a(e1.D, g.this.X0);
                            if(v9 == v4) {
                                e5.B.n(this.h);
                            }
                            e1.D.a(e5.B, 0);
                            if(v9 == v5 + 1) {
                                e1.D.n(this.j);
                            }
                        }
                        if(e5 != e2) {
                            if(g.this.a1 != 3 || !e4.S() || e5 == e4 || !e5.S()) {
                                switch(g.this.a1) {
                                    case 0: {
                                        e5.C.a(e2.C, 0);
                                        break;
                                    }
                                    case 1: {
                                        e5.E.a(e2.E, 0);
                                        break;
                                    }
                                    default: {
                                        if(z2) {
                                            e5.C.a(this.e, this.i);
                                            e5.E.a(this.g, this.k);
                                        }
                                        else {
                                            e5.C.a(e2.C, 0);
                                            e5.E.a(e2.E, 0);
                                        }
                                    }
                                }
                            }
                            else {
                                e5.F.a(e4.F, 0);
                            }
                        }
                        ++v9;
                        e1 = e5;
                    }
                }
                else {
                    e e6 = this.b;
                    e6.j0(g.this.L0);
                    int v12 = v <= 0 ? this.h : this.h + g.this.X0;
                    if(z) {
                        e6.D.a(this.f, v12);
                        if(z1) {
                            e6.B.a(this.d, this.j);
                        }
                        if(v > 0) {
                            this.f.b.B.a(e6.D, 0);
                        }
                    }
                    else {
                        e6.B.a(this.d, v12);
                        if(z1) {
                            e6.D.a(this.f, this.j);
                        }
                        if(v > 0) {
                            this.d.b.D.a(e6.B, 0);
                        }
                    }
                    int v13 = 0;
                    while(v13 < v1 && this.n + v13 < g.this.j1) {
                        e e7 = g.this.i1[this.n + v13];
                        if(v13 == 0) {
                            e7.j(e7.C, this.e, this.i);
                            int v14 = g.this.M0;
                            float f1 = g.this.S0;
                            if(this.n == 0 && g.this.O0 != -1) {
                                v14 = g.this.O0;
                                f1 = g.this.U0;
                            }
                            else if(z1 && g.this.Q0 != -1) {
                                v14 = g.this.Q0;
                                f1 = g.this.W0;
                            }
                            e7.y0(v14);
                            e7.x0(f1);
                        }
                        if(v13 == v1 - 1) {
                            e7.j(e7.E, this.g, this.k);
                        }
                        if(e1 != null) {
                            e7.C.a(e1.E, g.this.Y0);
                            if(v13 == v4) {
                                e7.C.n(this.i);
                            }
                            e1.E.a(e7.C, 0);
                            if(v13 == v5 + 1) {
                                e1.E.n(this.k);
                            }
                        }
                        if(e7 != e6) {
                            if(z) {
                                int v15 = g.this.Z0;
                                if(v15 == 0) {
                                    e7.D.a(e6.D, 0);
                                }
                                else {
                                    switch(v15) {
                                        case 1: {
                                            e7.B.a(e6.B, 0);
                                            break;
                                        }
                                        case 2: {
                                            e7.B.a(e6.B, 0);
                                            e7.D.a(e6.D, 0);
                                        }
                                    }
                                }
                            }
                            else {
                                int v16 = g.this.Z0;
                                if(v16 == 0) {
                                    e7.B.a(e6.B, 0);
                                }
                                else {
                                    switch(v16) {
                                        case 1: {
                                            e7.D.a(e6.D, 0);
                                            break;
                                        }
                                        case 2: {
                                            if(z2) {
                                                e7.B.a(this.d, this.h);
                                                e7.D.a(this.f, this.j);
                                            }
                                            else {
                                                e7.B.a(e6.B, 0);
                                                e7.D.a(e6.D, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ++v13;
                        e1 = e7;
                    }
                }
            }
        }

        public int e() {
            return this.a == 1 ? this.m - g.this.Y0 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - g.this.X0 : this.l;
        }

        public void g(int v) {
            int v1 = this.p;
            if(v1 == 0) {
                return;
            }
            int v2 = this.o;
            int v3 = v / v1;
            for(int v4 = 0; v4 < v2 && this.n + v4 < g.this.j1; ++v4) {
                e e0 = g.this.i1[this.n + v4];
                if(this.a != 0) {
                    if(e0 != null && e0.M() == b.h && e0.m == 0) {
                        b e$b1 = e0.y();
                        int v6 = e0.P();
                        g.this.T0(e0, e$b1, v6, b.f, v3);
                    }
                }
                else if(e0 != null && e0.y() == b.h && e0.l == 0) {
                    b e$b0 = e0.M();
                    int v5 = e0.v();
                    g.this.T0(e0, b.f, v3, e$b0, v5);
                }
            }
            this.h();
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int v = this.o;
            for(int v1 = 0; v1 < v && this.n + v1 < g.this.j1; ++v1) {
                e e0 = g.this.i1[this.n + v1];
                if(this.a == 0) {
                    int v2 = e0.P();
                    this.l += v2 + (e0.O() == 8 ? 0 : g.this.X0);
                    int v3 = g.this.A1(e0, this.q);
                    if(this.b == null || this.c < v3) {
                        this.b = e0;
                        this.c = v3;
                        this.m = v3;
                    }
                }
                else {
                    int v4 = g.this.B1(e0, this.q);
                    int v5 = g.this.A1(e0, this.q);
                    this.m += v5 + (e0.O() == 8 ? 0 : g.this.Y0);
                    if(this.b == null || this.c < v4) {
                        this.b = e0;
                        this.c = v4;
                        this.l = v4;
                    }
                }
            }
        }

        public void i(int v) {
            this.n = v;
        }

        public void j(int v, d d0, d d1, d d2, d d3, int v1, int v2, int v3, int v4, int v5) {
            this.a = v;
            this.d = d0;
            this.e = d1;
            this.f = d2;
            this.g = d3;
            this.h = v1;
            this.i = v2;
            this.j = v3;
            this.k = v4;
            this.q = v5;
        }
    }

    private int L0;
    private int M0;
    private int N0;
    private int O0;
    private int P0;
    private int Q0;
    private float R0;
    private float S0;
    private float T0;
    private float U0;
    private float V0;
    private float W0;
    private int X0;
    private int Y0;
    private int Z0;
    private int a1;
    private int b1;
    private int c1;
    private int d1;
    private ArrayList e1;
    private e[] f1;
    private e[] g1;
    private int[] h1;
    private e[] i1;
    private int j1;

    public g() {
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = 0.5f;
        this.S0 = 0.5f;
        this.T0 = 0.5f;
        this.U0 = 0.5f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.X0 = 0;
        this.Y0 = 0;
        this.Z0 = 2;
        this.a1 = 2;
        this.b1 = 0;
        this.c1 = -1;
        this.d1 = 0;
        this.e1 = new ArrayList();
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.j1 = 0;
    }

    private final int A1(e e0, int v) {
        if(e0 == null) {
            return 0;
        }
        if(e0.M() == b.h) {
            int v1 = e0.m;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return e0.v();
                }
                case 2: {
                    int v2 = (int)(e0.t * ((float)v));
                    if(v2 != e0.v()) {
                        this.T0(e0, e0.y(), e0.P(), b.f, v2);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)e0.P()) * e0.Q + 0.5f);
                }
                default: {
                    return e0.v();
                }
            }
        }
        return e0.v();
    }

    private final int B1(e e0, int v) {
        if(e0 == null) {
            return 0;
        }
        if(e0.y() == b.h) {
            int v1 = e0.l;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return e0.P();
                }
                case 2: {
                    int v2 = (int)(e0.q * ((float)v));
                    if(v2 != e0.P()) {
                        b e$b0 = e0.M();
                        int v3 = e0.v();
                        this.T0(e0, b.f, v2, e$b0, v3);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)e0.v()) * e0.Q + 0.5f);
                }
                default: {
                    return e0.P();
                }
            }
        }
        return e0.P();
    }

    private void C1(e[] arr_e, int v, int v1, int v2, int[] arr_v) {
        boolean z;
        int v7;
        int v6;
        if(v1 == 0) {
            int v3 = this.c1;
            if(v3 <= 0) {
                v3 = 0;
                int v5 = 0;
                for(int v4 = 0; v4 < v; ++v4) {
                    if(v4 > 0) {
                        v5 += this.X0;
                    }
                    e e0 = arr_e[v4];
                    if(e0 != null) {
                        v5 += this.B1(e0, v2);
                        if(v5 > v2) {
                            break;
                        }
                        ++v3;
                    }
                }
            }
            v6 = v3;
            v7 = 0;
        }
        else {
            v7 = this.c1;
            if(v7 <= 0) {
                v7 = 0;
                int v9 = 0;
                for(int v8 = 0; v8 < v; ++v8) {
                    if(v8 > 0) {
                        v9 += this.Y0;
                    }
                    e e1 = arr_e[v8];
                    if(e1 != null) {
                        v9 += this.A1(e1, v2);
                        if(v9 > v2) {
                            break;
                        }
                        ++v7;
                    }
                }
            }
            v6 = 0;
        }
        if(this.h1 == null) {
            this.h1 = new int[2];
        }
        if((v7 != 0 || v1 != 1) && (v6 != 0 || v1 != 0)) {
            z = false;
            goto label_41;
        }
    alab1:
        while(true) {
            while(true) {
            label_40:
                z = true;
            label_41:
                if(z) {
                    break alab1;
                }
                if(v1 == 0) {
                    v7 = (int)Math.ceil(((float)v) / ((float)v6));
                }
                else {
                    v6 = (int)Math.ceil(((float)v) / ((float)v7));
                }
                e[] arr_e1 = this.g1;
                if(arr_e1 == null || arr_e1.length < v6) {
                    this.g1 = new e[v6];
                }
                else {
                    Arrays.fill(arr_e1, null);
                }
                e[] arr_e2 = this.f1;
                if(arr_e2 == null || arr_e2.length < v7) {
                    this.f1 = new e[v7];
                }
                else {
                    Arrays.fill(arr_e2, null);
                }
                for(int v10 = 0; v10 < v6; ++v10) {
                    for(int v11 = 0; v11 < v7; ++v11) {
                        int v12 = v1 == 1 ? v10 * v7 + v11 : v11 * v6 + v10;
                        if(v12 < arr_e.length) {
                            e e2 = arr_e[v12];
                            if(e2 != null) {
                                int v13 = this.B1(e2, v2);
                                e e3 = this.g1[v10];
                                if(e3 == null || e3.P() < v13) {
                                    this.g1[v10] = e2;
                                }
                                int v14 = this.A1(e2, v2);
                                e e4 = this.f1[v11];
                                if(e4 == null || e4.v() < v14) {
                                    this.f1[v11] = e2;
                                }
                            }
                        }
                    }
                }
                int v16 = 0;
                for(int v15 = 0; v15 < v6; ++v15) {
                    e e5 = this.g1[v15];
                    if(e5 != null) {
                        if(v15 > 0) {
                            v16 += this.X0;
                        }
                        v16 += this.B1(e5, v2);
                    }
                }
                int v18 = 0;
                for(int v17 = 0; v17 < v7; ++v17) {
                    e e6 = this.f1[v17];
                    if(e6 != null) {
                        if(v17 > 0) {
                            v18 += this.Y0;
                        }
                        v18 += this.A1(e6, v2);
                    }
                }
                arr_v[0] = v16;
                arr_v[1] = v18;
                if(v1 == 0) {
                    if(v16 <= v2 || v6 <= 1) {
                        continue;
                    }
                    break;
                }
                else {
                    goto label_102;
                }
                break alab1;
            }
            --v6;
            goto label_41;
        label_102:
            if(v18 <= v2 || v7 <= 1) {
                goto label_40;
            }
            --v7;
            goto label_41;
        }
        int[] arr_v1 = this.h1;
        arr_v1[0] = v6;
        arr_v1[1] = v7;
    }

    private void D1(e[] arr_e, int v, int v1, int v2, int[] arr_v) {
        int v26;
        d d8;
        int v24;
        int v23;
        d d6;
        int v3;
        if(v == 0) {
            return;
        }
        this.e1.clear();
        a g$a0 = new a(this, v1, this.B, this.C, this.D, this.E, v2);
        this.e1.add(g$a0);
        if(v1 == 0) {
            v3 = 0;
            int v4 = 0;
            int v5 = 0;
            while(v5 < v) {
                e e0 = arr_e[v5];
                int v6 = this.B1(e0, v2);
                if(e0.y() == b.h) {
                    ++v3;
                }
                if(((v4 == v2 || this.X0 + v4 + v6 > v2) && a.a(g$a0) != null || v5 <= 0 || (this.c1 <= 0 || v5 % this.c1 != 0) ? (v4 == v2 || this.X0 + v4 + v6 > v2) && a.a(g$a0) != null : true)) {
                    g$a0 = new a(this, 0, this.B, this.C, this.D, this.E, v2);
                    g$a0.i(v5);
                    this.e1.add(g$a0);
                }
                else if(v5 > 0) {
                    v4 += this.X0 + v6;
                    goto label_23;
                }
                v4 = v6;
            label_23:
                g$a0.b(e0);
                ++v5;
            }
        }
        else {
            v3 = 0;
            int v7 = 0;
            int v8 = 0;
            while(v8 < v) {
                e e1 = arr_e[v8];
                int v9 = this.A1(e1, v2);
                if(e1.M() == b.h) {
                    ++v3;
                }
                if(((v7 == v2 || this.Y0 + v7 + v9 > v2) && a.a(g$a0) != null || v8 <= 0 || (this.c1 <= 0 || v8 % this.c1 != 0) ? (v7 == v2 || this.Y0 + v7 + v9 > v2) && a.a(g$a0) != null : true)) {
                    g$a0 = new a(this, v1, this.B, this.C, this.D, this.E, v2);
                    g$a0.i(v8);
                    this.e1.add(g$a0);
                }
                else if(v8 > 0) {
                    v7 += this.Y0 + v9;
                    goto label_44;
                }
                v7 = v9;
            label_44:
                g$a0.b(e1);
                ++v8;
            }
        }
        int v10 = this.e1.size();
        d d0 = this.B;
        d d1 = this.C;
        d d2 = this.D;
        d d3 = this.E;
        int v11 = this.P0();
        int v12 = this.R0();
        int v13 = this.Q0();
        int v14 = this.O0();
        if(v3 > 0 && (this.y() == b.g || this.M() == b.g)) {
            for(int v15 = 0; v15 < v10; ++v15) {
                a g$a1 = (a)this.e1.get(v15);
                if(v1 == 0) {
                    g$a1.g(v2 - g$a1.f());
                }
                else {
                    g$a1.g(v2 - g$a1.e());
                }
            }
        }
        int v16 = v12;
        int v17 = v13;
        int v18 = 0;
        int v19 = 0;
        int v20 = 0;
        int v21 = v11;
        d d4 = d1;
        d d5 = d0;
        int v22 = v14;
        while(v20 < v10) {
            a g$a2 = (a)this.e1.get(v20);
            if(v1 == 0) {
                if(v20 < v10 - 1) {
                    d6 = a.a(((a)this.e1.get(v20 + 1))).C;
                    v23 = 0;
                }
                else {
                    d6 = this.E;
                    v23 = this.O0();
                }
                d d7 = a.a(g$a2).E;
                v24 = v20;
                g$a2.j(0, d5, d4, d2, d6, v21, v16, v17, v23, v2);
                int v25 = Math.max(v19, g$a2.f());
                v18 += g$a2.e();
                if(v24 > 0) {
                    v18 += this.Y0;
                }
                v19 = v25;
                v16 = 0;
                d4 = d7;
                d8 = d2;
                d3 = d6;
                v22 = v23;
            }
            else {
                v24 = v20;
                if(v24 < v10 - 1) {
                    d8 = a.a(((a)this.e1.get(v24 + 1))).B;
                    v26 = 0;
                }
                else {
                    d8 = this.D;
                    v26 = this.Q0();
                }
                d d9 = a.a(g$a2).D;
                g$a2.j(v1, d5, d4, d8, d3, v21, v16, v26, v22, v2);
                v19 += g$a2.f();
                int v27 = Math.max(v18, g$a2.e());
                if(v24 > 0) {
                    v19 += this.X0;
                }
                v18 = v27;
                v21 = 0;
                v17 = v26;
                d5 = d9;
            }
            v20 = v24 + 1;
            d2 = d8;
        }
        arr_v[0] = v19;
        arr_v[1] = v18;
    }

    private void E1(e[] arr_e, int v, int v1, int v2, int[] arr_v) {
        a g$a0;
        if(v == 0) {
            return;
        }
        if(this.e1.size() == 0) {
            g$a0 = new a(this, v1, this.B, this.C, this.D, this.E, v2);
            this.e1.add(g$a0);
        }
        else {
            a g$a1 = (a)this.e1.get(0);
            g$a1.c();
            g$a0 = g$a1;
            g$a0.j(v1, this.B, this.C, this.D, this.E, this.P0(), this.R0(), this.Q0(), this.O0(), v2);
        }
        for(int v3 = 0; v3 < v; ++v3) {
            g$a0.b(arr_e[v3]);
        }
        arr_v[0] = g$a0.f();
        arr_v[1] = g$a0.e();
    }

    public void F1(float f) {
        this.T0 = f;
    }

    public void G1(int v) {
        this.N0 = v;
    }

    public void H1(float f) {
        this.U0 = f;
    }

    public void I1(int v) {
        this.O0 = v;
    }

    public void J1(int v) {
        this.Z0 = v;
    }

    public void K1(float f) {
        this.R0 = f;
    }

    public void L1(int v) {
        this.X0 = v;
    }

    public void M1(int v) {
        this.L0 = v;
    }

    public void N1(float f) {
        this.V0 = f;
    }

    public void O1(int v) {
        this.P0 = v;
    }

    public void P1(float f) {
        this.W0 = f;
    }

    public void Q1(int v) {
        this.Q0 = v;
    }

    public void R1(int v) {
        this.c1 = v;
    }

    @Override  // s.l
    public void S0(int v, int v1, int v2, int v3) {
        int[] arr_v1;
        boolean z;
        int v15;
        int v12;
        if(this.x0 > 0 && !this.U0()) {
            this.X0(0, 0);
            this.W0(false);
            return;
        }
        int v4 = this.P0();
        int v5 = this.Q0();
        int v6 = this.R0();
        int v7 = this.O0();
        int[] arr_v = new int[2];
        int v8 = v1 - v4 - v5;
        int v9 = this.d1;
        if(v9 == 1) {
            v8 = v3 - v6 - v7;
        }
        if(v9 == 0) {
            if(this.L0 == -1) {
                this.L0 = 0;
            }
            if(this.M0 == -1) {
                this.M0 = 0;
            }
        }
        else {
            if(this.L0 == -1) {
                this.L0 = 0;
            }
            if(this.M0 == -1) {
                this.M0 = 0;
            }
        }
        e[] arr_e = this.w0;
        int v11 = 0;
        for(int v10 = 0; true; ++v10) {
            v12 = this.x0;
            if(v10 >= v12) {
                break;
            }
            if(this.w0[v10].O() == 8) {
                ++v11;
            }
        }
        if(v11 > 0) {
            arr_e = new e[v12 - v11];
            int v14 = 0;
            for(int v13 = 0; v13 < this.x0; ++v13) {
                e e0 = this.w0[v13];
                if(e0.O() != 8) {
                    arr_e[v14] = e0;
                    ++v14;
                }
            }
            v15 = v14;
        }
        else {
            v15 = v12;
        }
        this.i1 = arr_e;
        this.j1 = v15;
        switch(this.b1) {
            case 0: {
                arr_v1 = arr_v;
                z = true;
                this.E1(arr_e, v15, this.d1, v8, arr_v);
                break;
            }
            case 1: {
                z = true;
                arr_v1 = arr_v;
                this.D1(arr_e, v15, this.d1, v8, arr_v);
                break;
            }
            case 2: {
                z = true;
                arr_v1 = arr_v;
                this.C1(arr_e, v15, this.d1, v8, arr_v);
                break;
            }
            default: {
                z = true;
                arr_v1 = arr_v;
            }
        }
        int v16 = arr_v1[0] + v4 + v5;
        int v17 = arr_v1[1] + v6 + v7;
        if(v == 0x40000000) {
            v16 = v1;
        }
        else if(v == 0x80000000) {
            v16 = Math.min(v16, v1);
        }
        else if(v != 0) {
            v16 = 0;
        }
        if(v2 == 0x40000000) {
            v17 = v3;
        }
        else if(v2 == 0x80000000) {
            v17 = Math.min(v17, v3);
        }
        else if(v2 != 0) {
            v17 = 0;
        }
        this.X0(v16, v17);
        this.E0(v16);
        this.h0(v17);
        if(this.x0 <= 0) {
            z = false;
        }
        this.W0(z);
    }

    public void S1(int v) {
        this.d1 = v;
    }

    public void T1(int v) {
        this.a1 = v;
    }

    public void U1(float f) {
        this.S0 = f;
    }

    public void V1(int v) {
        this.Y0 = v;
    }

    public void W1(int v) {
        this.M0 = v;
    }

    public void X1(int v) {
        this.b1 = v;
    }

    @Override  // s.e
    public void f(r.d d0) {
        super.f(d0);
        boolean z = this.G() == null ? false : ((f)this.G()).a1();
        int v = this.b1;
    alab1:
        switch(v) {
            case 0: {
                if(this.e1.size() > 0) {
                    ((a)this.e1.get(0)).d(z, 0, true);
                }
                break;
            }
            case 1: {
                int v1 = this.e1.size();
                for(int v2 = 0; true; ++v2) {
                    if(v2 >= v1) {
                        break alab1;
                    }
                    ((a)this.e1.get(v2)).d(z, v2, v2 == v1 - 1);
                }
            }
            default: {
                if(v == 2) {
                    this.z1(z);
                }
            }
        }
        this.W0(false);
    }

    private void z1(boolean z) {
        if(this.h1 != null && this.g1 != null && this.f1 != null) {
            for(int v = 0; v < this.j1; ++v) {
                this.i1[v].Z();
            }
            int[] arr_v = this.h1;
            int v1 = arr_v[0];
            int v2 = arr_v[1];
            e e0 = null;
            for(int v3 = 0; v3 < v1; ++v3) {
                e e1 = this.g1[(z ? v1 - v3 - 1 : v3)];
                if(e1 != null && e1.O() != 8) {
                    if(v3 == 0) {
                        e1.j(e1.B, this.B, this.P0());
                        e1.j0(this.L0);
                        e1.i0(this.R0);
                    }
                    if(v3 == v1 - 1) {
                        e1.j(e1.D, this.D, this.Q0());
                    }
                    if(v3 > 0) {
                        e1.j(e1.B, e0.D, this.X0);
                        e0.j(e0.D, e1.B, 0);
                    }
                    e0 = e1;
                }
            }
            for(int v4 = 0; v4 < v2; ++v4) {
                e e2 = this.f1[v4];
                if(e2 != null && e2.O() != 8) {
                    if(v4 == 0) {
                        e2.j(e2.C, this.C, this.R0());
                        e2.y0(this.M0);
                        e2.x0(this.S0);
                    }
                    if(v4 == v2 - 1) {
                        e2.j(e2.E, this.E, this.O0());
                    }
                    if(v4 > 0) {
                        e2.j(e2.C, e0.E, this.Y0);
                        e0.j(e0.E, e2.C, 0);
                    }
                    e0 = e2;
                }
            }
            for(int v5 = 0; v5 < v1; ++v5) {
                for(int v6 = 0; v6 < v2; ++v6) {
                    int v7 = this.d1 == 1 ? v5 * v2 + v6 : v6 * v1 + v5;
                    e[] arr_e = this.i1;
                    if(v7 < arr_e.length) {
                        e e3 = arr_e[v7];
                        if(e3 != null && e3.O() != 8) {
                            e e4 = this.g1[v5];
                            e e5 = this.f1[v6];
                            if(e3 != e4) {
                                e3.j(e3.B, e4.B, 0);
                                e3.j(e3.D, e4.D, 0);
                            }
                            if(e3 != e5) {
                                e3.j(e3.C, e5.C, 0);
                                e3.j(e3.E, e5.E, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}

