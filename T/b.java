package t;

import java.util.ArrayList;
import s.e;
import s.f;
import s.h;
import s.i;
import s.k;
import s.l;

public class b {
    public static class a {
        public s.e.b a;
        public s.e.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;

    }

    public interface t.b.b {
        void a();

        void b(e arg1, a arg2);
    }

    private final ArrayList a;
    private a b;
    private f c;

    public b(f f0) {
        this.a = new ArrayList();
        this.b = new a();
        this.c = f0;
    }

    private boolean a(t.b.b b$b0, e e0, boolean z) {
        this.b.a = e0.y();
        this.b.b = e0.M();
        this.b.c = e0.P();
        this.b.d = e0.v();
        a b$a0 = this.b;
        b$a0.i = false;
        b$a0.j = z;
        boolean z1 = b$a0.b == s.e.b.h && e0.Q > 0.0f;
        if(b$a0.a == s.e.b.h && e0.Q > 0.0f && e0.n[0] == 4) {
            b$a0.a = s.e.b.f;
        }
        if(z1 && e0.n[1] == 4) {
            b$a0.b = s.e.b.f;
        }
        b$b0.b(e0, b$a0);
        e0.E0(this.b.e);
        e0.h0(this.b.f);
        e0.g0(this.b.h);
        e0.b0(this.b.g);
        this.b.j = false;
        return this.b.i;
    }

    private void b(f f0) {
        int v = f0.w0.size();
        t.b.b b$b0 = f0.U0();
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = (e)f0.w0.get(v1);
            if(!(e0 instanceof h) && (!e0.e.e.j || !e0.f.e.j)) {
                s.e.b e$b0 = e0.s(0);
                s.e.b e$b1 = e0.s(1);
                if(e$b0 != s.e.b.h || e0.l == 1 || e$b1 != s.e.b.h || e0.m == 1) {
                    this.a(b$b0, e0, false);
                }
            }
        }
        b$b0.a();
    }

    private void c(f f0, String s, int v, int v1) {
        f0.u0(0);
        f0.t0(0);
        f0.E0(v);
        f0.h0(v1);
        f0.u0(f0.E());
        f0.t0(f0.D());
        this.c.K0();
    }

    public long d(f f0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8) {
        int v41;
        int v40;
        int v32;
        int v31;
        int v39;
        int v22;
        int v28;
        int v16;
        boolean z2;
        t.b.b b$b0 = f0.U0();
        int v9 = f0.w0.size();
        int v10 = f0.P();
        int v11 = f0.v();
        boolean z = k.b(v, 0x80);
        int v12 = z || k.b(v, 0x40) ? 1 : 0;
        if(v12 != 0) {
            int v13 = 0;
            while(v13 < v9) {
                e e0 = (e)f0.w0.get(v13);
                boolean z1 = e0.y() == s.e.b.h && e0.M() == s.e.b.h && e0.t() > 0.0f;
                if((!e0.V() || !z1) && ((!e0.X() || !z1) && !(e0 instanceof l) && !e0.V() && !e0.X())) {
                    ++v13;
                }
                else {
                    v12 = 0;
                    if(true) {
                        break;
                    }
                }
            }
        }
        if((v12 & ((v3 != 0x40000000 || v5 != 0x40000000) && !z ? 0 : 1)) == 0) {
            z2 = false;
            v16 = 0;
        }
        else {
            int v14 = Math.min(f0.C(), v4);
            int v15 = Math.min(f0.B(), v6);
            if(v3 == 0x40000000 && f0.P() != v14) {
                f0.E0(v14);
                f0.X0();
            }
            if(v5 == 0x40000000 && f0.v() != v15) {
                f0.h0(v15);
                f0.X0();
            }
            if(v3 != 0x40000000 || v5 != 0x40000000) {
                z2 = f0.S0(z);
                if(v3 == 0x40000000) {
                    z2 &= f0.T0(z, 0);
                    v16 = 1;
                }
                else {
                    v16 = 0;
                }
                if(v5 == 0x40000000) {
                    z2 &= f0.T0(z, 1);
                    ++v16;
                }
            }
            else {
                z2 = f0.R0(z);
                v16 = 2;
            }
            if(z2) {
                f0.I0(v3 == 0x40000000, v5 == 0x40000000);
            }
        }
        if(!z2 || v16 != 2) {
            if(v9 > 0) {
                this.b(f0);
            }
            int v17 = f0.V0();
            int v18 = this.a.size();
            if(v9 > 0) {
                this.c(f0, "First pass", v10, v11);
            }
            if(v18 > 0) {
                boolean z3 = f0.y() == s.e.b.g;
                boolean z4 = f0.M() == s.e.b.g;
                int v19 = Math.max(f0.P(), this.c.E());
                int v20 = Math.max(f0.v(), this.c.D());
                int v21 = 0;
                boolean z5 = false;
                while(v21 < v18) {
                    e e1 = (e)this.a.get(v21);
                    if(e1 instanceof l) {
                        int v23 = e1.P();
                        v22 = v17;
                        int v24 = e1.v();
                        boolean z6 = this.a(b$b0, e1, true);
                        int v25 = e1.P();
                        int v26 = z5 | z6;
                        int v27 = e1.v();
                        if(v25 == v23) {
                            v28 = v26;
                        }
                        else {
                            e1.E0(v25);
                            if(z3 && e1.I() > v19) {
                                v19 = Math.max(v19, e1.I() + e1.m(s.d.b.i).c());
                            }
                            v28 = 1;
                        }
                        if(v27 != v24) {
                            e1.h0(v27);
                            if(z4 && e1.p() > v20) {
                                v20 = Math.max(v20, e1.p() + e1.m(s.d.b.j).c());
                            }
                            v28 = 1;
                        }
                        z5 = v28 | ((l)e1).V0();
                    }
                    else {
                        v22 = v17;
                    }
                    v21 += true;
                    v17 = v22;
                }
                for(int v29 = 0; v29 < 2; ++v29) {
                    int v30 = 0;
                    while(v30 < v18) {
                        e e2 = (e)this.a.get(v30);
                        if((!(e2 instanceof i) || e2 instanceof l) && !(e2 instanceof h) && e2.O() != 8 && (!e2.e.e.j || !e2.f.e.j) && !(e2 instanceof l)) {
                            int v33 = e2.P();
                            int v34 = e2.v();
                            v31 = v18;
                            int v35 = e2.n();
                            v32 = v29;
                            int v36 = z5 | this.a(b$b0, e2, true);
                            int v37 = e2.P();
                            int v38 = e2.v();
                            if(v37 == v33) {
                                v39 = v36;
                            }
                            else {
                                e2.E0(v37);
                                if(z3 && e2.I() > v19) {
                                    v19 = Math.max(v19, e2.I() + e2.m(s.d.b.i).c());
                                }
                                v39 = 1;
                            }
                            if(v38 != v34) {
                                e2.h0(v38);
                                if(z4 && e2.p() > v20) {
                                    v20 = Math.max(v20, e2.p() + e2.m(s.d.b.j).c());
                                }
                                v39 = 1;
                            }
                            z5 = !e2.S() || v35 == e2.n() ? v39 : true;
                        }
                        else {
                            v31 = v18;
                            v32 = v29;
                        }
                        ++v30;
                        v18 = v31;
                        v29 = v32;
                    }
                    if(z5) {
                        this.c(f0, "intermediate pass", v10, v11);
                        z5 = false;
                    }
                }
                if(z5) {
                    this.c(f0, "2nd pass", v10, v11);
                    if(f0.P() < v19) {
                        f0.E0(v19);
                        v40 = 1;
                    }
                    else {
                        v40 = 0;
                    }
                    if(f0.v() < v20) {
                        f0.h0(v20);
                        v41 = 1;
                    }
                    else {
                        v41 = v40;
                    }
                    if(v41 != 0) {
                        this.c(f0, "3rd pass", v10, v11);
                    }
                }
            }
            f0.g1(v17);
        }
        return 0L;
    }

    public void e(f f0) {
        this.a.clear();
        int v = f0.w0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = (e)f0.w0.get(v1);
            if(e0.y() == s.e.b.h || (e0.y() == s.e.b.i || e0.M() == s.e.b.h || e0.M() == s.e.b.i)) {
                this.a.add(e0);
            }
        }
        f0.X0();
    }
}

