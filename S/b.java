package s;

import java.util.ArrayList;
import r.d;
import r.i;

abstract class b {
    static void a(f f0, d d0, int v) {
        int v3;
        c[] arr_c;
        int v2;
        if(v == 0) {
            v2 = f0.G0;
            arr_c = f0.J0;
            v3 = 0;
        }
        else {
            v2 = f0.H0;
            arr_c = f0.I0;
            v3 = 2;
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            c c0 = arr_c[v1];
            c0.a();
            b.b(f0, d0, v, v3, c0);
        }
    }

    // This method was un-flattened
    static void b(f f0, d d0, int v, int v1, c c0) {
        e e19;
        e e18;
        i i15;
        i i14;
        s.d d18;
        e e13;
        i i11;
        i i10;
        s.d d16;
        ArrayList arrayList1;
        int v6;
        boolean z2;
        boolean z1;
        int v2;
        e e0 = c0.a;
        e e1 = c0.c;
        e e2 = c0.b;
        e e3 = c0.d;
        e e4 = c0.e;
        float f1 = c0.k;
        boolean z = f0.M[v] == s.e.b.g;
        if(v == 0) {
            v2 = e4.m0 == 0 ? 1 : 0;
            z1 = e4.m0 == 1;
            z2 = e4.m0 == 2;
        }
        else {
            v2 = e4.n0 == 0 ? 1 : 0;
            z1 = e4.n0 == 1;
            z2 = e4.n0 == 2;
        }
        int v3 = v2;
        e e5 = e0;
        e e6;
        for(e6 = null; true; e6 = null) {
            s.d d1 = e5.J[v1];
            int v4 = z2 ? 1 : 4;
            int v5 = d1.c();
            s.e.b e$b0 = s.e.b.h;
            boolean z3 = e5.M[v] == e$b0 && e5.n[v] == 0;
            s.d d2 = d1.d;
            if(d2 != null && e5 != e0) {
                v5 += d2.c();
            }
            if(!z2 || e5 == e0 || e5 == e2) {
                v6 = v3;
            }
            else {
                v6 = v3;
                v4 = 5;
            }
            s.d d3 = d1.d;
            if(d3 != null) {
                if(e5 == e2) {
                    d0.h(d1.g, d3.g, v5, 6);
                }
                else {
                    d0.h(d1.g, d3.g, v5, 8);
                }
                d0.e(d1.g, d1.d.g, v5, (!z3 || z2 ? v4 : 5));
            }
            if(z) {
                if(e5.O() != 8 && e5.M[v] == e$b0) {
                    d0.h(e5.J[v1 + 1].g, e5.J[v1].g, 0, 5);
                }
                d0.h(e5.J[v1].g, f0.J[v1].g, 0, 8);
            }
            s.d d4 = e5.J[v1 + 1].d;
            if(d4 != null) {
                e e7 = d4.b;
                s.d d5 = e7.J[v1].d;
                if(d5 != null && d5.b == e5) {
                    e6 = e7;
                }
            }
            if(e6 == null) {
                break;
            }
            e5 = e6;
            v3 = v6;
        }
        e6 = null;
        if(e3 != null && e1.J[v1 + 1].d != null) {
            s.d d6 = e3.J[v1 + 1];
            if(e3.M[v] != s.e.b.h || e3.n[v] != 0 || z2) {
            label_64:
                if(z2) {
                    s.d d8 = d6.d;
                    if(d8.b == f0) {
                        d0.e(d6.g, d8.g, -d6.c(), 4);
                    }
                }
            }
            else {
                s.d d7 = d6.d;
                if(d7.b == f0) {
                    d0.e(d6.g, d7.g, -d6.c(), 5);
                    goto label_68;
                }
                goto label_64;
            }
        label_68:
            d0.j(d6.g, e1.J[v1 + 1].d.g, -d6.c(), 6);
        }
        if(z) {
            i i0 = f0.J[v1 + 1].g;
            s.d d9 = e1.J[v1 + 1];
            d0.h(i0, d9.g, d9.c(), 8);
        }
        ArrayList arrayList0 = c0.h;
        if(arrayList0 != null) {
            int v7 = arrayList0.size();
            if(v7 > 1) {
                float f2 = !c0.r || c0.t ? f1 : ((float)c0.j);
                float f3 = 0.0f;
                e e8 = null;
                int v8 = 0;
                while(v8 < v7) {
                    e e9 = (e)arrayList0.get(v8);
                    float f4 = e9.q0[v];
                    if(f4 < 0.0f) {
                        if(c0.t) {
                            d0.e(e9.J[v1 + 1].g, e9.J[v1].g, 0, 4);
                            ++v8;
                            continue;
                        }
                        else {
                            f4 = 1.0f;
                        }
                    }
                    if(f4 == 0.0f) {
                        d0.e(e9.J[v1 + 1].g, e9.J[v1].g, 0, 8);
                        arrayList1 = arrayList0;
                    }
                    else {
                        if(e8 == null) {
                            arrayList1 = arrayList0;
                        }
                        else {
                            s.d[] arr_d = e8.J;
                            i i1 = arr_d[v1].g;
                            i i2 = arr_d[v1 + 1].g;
                            s.d[] arr_d1 = e9.J;
                            i i3 = arr_d1[v1].g;
                            i i4 = arr_d1[v1 + 1].g;
                            arrayList1 = arrayList0;
                            r.b b0 = d0.r();
                            b0.l(f3, f2, f4, i1, i2, i3, i4);
                            d0.d(b0);
                        }
                        e8 = e9;
                        f3 = f4;
                    }
                    ++v8;
                    arrayList0 = arrayList1;
                }
            }
        }
        if(e2 != null && (e2 == e3 || z2)) {
            s.d d10 = e0.J[v1];
            i i5 = d10.d == null ? null : d10.d.g;
            s.d d11 = e1.J[v1 + 1].d;
            i i6 = d11 == null ? null : d11.g;
            s.d d12 = e2.J[v1];
            s.d d13 = e3.J[v1 + 1];
            if(i5 != null && i6 != null) {
                float f5 = v == 0 ? e4.b0 : e4.c0;
                int v9 = d12.c();
                int v10 = d13.c();
                d0.c(d12.g, i5, v9, f5, i6, d13.g, v10, 7);
            }
        }
        else if(v6 != 0 && e2 != null) {
            boolean z4 = c0.j > 0 && c0.i == c0.j;
            e e10 = e2;
            e e11 = e10;
            while(e10 != null) {
                e e12;
                for(e12 = e10.s0[v]; e12 != null && e12.O() == 8; e12 = e12.s0[v]) {
                }
                if(e12 == null && e10 != e3) {
                    e13 = e12;
                }
                else {
                    s.d d14 = e10.J[v1];
                    i i7 = d14.g;
                    i i8 = d14.d == null ? null : d14.d.g;
                    if(e11 != e10) {
                        i8 = e11.J[v1 + 1].g;
                    }
                    else if(e10 == e2 && e11 == e10) {
                        s.d d15 = e0.J[v1].d;
                        i8 = d15 == null ? null : d15.g;
                    }
                    int v11 = d14.c();
                    int v12 = e10.J[v1 + 1].c();
                    if(e12 == null) {
                        d16 = e1.J[v1 + 1].d;
                        i11 = d16 == null ? null : d16.g;
                        i10 = e10.J[v1 + 1].g;
                    }
                    else {
                        d16 = e12.J[v1];
                        i i9 = d16.g;
                        i10 = e10.J[v1 + 1].g;
                        i11 = i9;
                    }
                    if(d16 != null) {
                        v12 += d16.c();
                    }
                    if(e11 != null) {
                        v11 += e11.J[v1 + 1].c();
                    }
                    if(i7 != null && i8 != null && i11 != null && i10 != null) {
                        if(e10 == e2) {
                            v11 = e2.J[v1].c();
                        }
                        e13 = e12;
                        d0.c(i7, i8, v11, 0.5f, i11, i10, (e10 == e3 ? e3.J[v1 + 1].c() : v12), (z4 ? 8 : 5));
                    }
                }
                if(e10.O() != 8) {
                    e11 = e10;
                }
                e10 = e13;
            }
        }
        else if(z1 && e2 != null) {
            boolean z5 = c0.j > 0 && c0.i == c0.j;
            e e14 = e2;
            e e15 = e14;
            while(e14 != null) {
                e e16;
                for(e16 = e14.s0[v]; e16 != null && e16.O() == 8; e16 = e16.s0[v]) {
                }
                if(e14 == e2 || e14 == e3 || e16 == null) {
                    e19 = e15;
                }
                else {
                    e e17 = e16 == e3 ? null : e16;
                    s.d d17 = e14.J[v1];
                    i i12 = d17.g;
                    i i13 = e15.J[v1 + 1].g;
                    int v13 = d17.c();
                    int v14 = e14.J[v1 + 1].c();
                    if(e17 == null) {
                        d18 = e3.J[v1];
                        i14 = d18 == null ? null : d18.g;
                        i15 = e14.J[v1 + 1].g;
                    }
                    else {
                        d18 = e17.J[v1];
                        i14 = d18.g;
                        s.d d19 = d18.d;
                        i15 = d19 == null ? null : d19.g;
                    }
                    if(d18 != null) {
                        v14 += d18.c();
                    }
                    int v15 = e15.J[v1 + 1].c() + v13;
                    if(i12 == null || i13 == null || i14 == null || i15 == null) {
                        e18 = e17;
                        e19 = e15;
                    }
                    else {
                        e18 = e17;
                        e19 = e15;
                        d0.c(i12, i13, v15, 0.5f, i14, i15, v14, (z5 ? 8 : 4));
                    }
                    e16 = e18;
                }
                if(e14.O() == 8) {
                    e14 = e19;
                }
                e15 = e14;
                e14 = e16;
            }
            s.d d20 = e2.J[v1];
            s.d d21 = e0.J[v1].d;
            s.d d22 = e3.J[v1 + 1];
            s.d d23 = e1.J[v1 + 1].d;
            if(d21 != null) {
                if(e2 != e3) {
                    d0.e(d20.g, d21.g, d20.c(), 5);
                }
                else if(d23 != null) {
                    d0.c(d20.g, d21.g, d20.c(), 0.5f, d22.g, d23.g, d22.c(), 5);
                }
            }
            if(d23 != null && e2 != e3) {
                d0.e(d22.g, d23.g, -d22.c(), 5);
            }
        }
        if((v6 != 0 || z1) && e2 != null && e2 != e3) {
            s.d[] arr_d2 = e2.J;
            s.d d24 = arr_d2[v1];
            s.d d25 = e3.J[v1 + 1];
            i i16 = d24.d == null ? null : d24.d.g;
            i i17 = d25.d == null ? null : d25.d.g;
            if(e1 != e3) {
                s.d d26 = e1.J[v1 + 1].d;
                if(d26 != null) {
                    e6 = d26.g;
                }
                i17 = e6;
            }
            if(e2 == e3) {
                d25 = arr_d2[v1 + 1];
            }
            if(i16 != null && i17 != null) {
                int v16 = d24.c();
                int v17 = e3.J[v1 + 1].c();
                d0.c(d24.g, i16, v16, 0.5f, i17, d25.g, v17, 5);
            }
        }
    }
}

