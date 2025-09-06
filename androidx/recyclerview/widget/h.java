package androidx.recyclerview.widget;

import java.util.List;

class h {
    interface a {
        void a(b arg1);

        b b(int arg1, int arg2, int arg3, Object arg4);
    }

    final a a;

    h(a h$a0) {
        this.a = h$a0;
    }

    private int a(List list0) {
        int v = list0.size() - 1;
        boolean z = false;
        while(v >= 0) {
            if(((b)list0.get(v)).a != 8) {
                z = true;
            }
            else if(z) {
                return v;
            }
            --v;
        }
        return -1;
    }

    void b(List list0) {
        int v;
        while((v = this.a(list0)) != -1) {
            this.d(list0, v, v + 1);
        }
    }

    private void c(List list0, int v, b a$b0, int v1, b a$b1) {
        int v2 = a$b0.d;
        int v3 = a$b1.b;
        int v4 = v2 >= v3 ? 0 : -1;
        int v5 = a$b0.b;
        if(v5 < v3) {
            ++v4;
        }
        if(v3 <= v5) {
            a$b0.b = v5 + a$b1.d;
        }
        int v6 = a$b1.b;
        if(v6 <= v2) {
            a$b0.d = v2 + a$b1.d;
        }
        a$b1.b = v6 + v4;
        list0.set(v, a$b1);
        list0.set(v1, a$b0);
    }

    private void d(List list0, int v, int v1) {
        Object object0 = list0.get(v);
        Object object1 = list0.get(v1);
        switch(((b)object1).a) {
            case 1: {
                this.c(list0, v, ((b)object0), v1, ((b)object1));
                return;
            }
            case 2: {
                this.e(list0, v, ((b)object0), v1, ((b)object1));
                return;
            }
            case 4: {
                this.f(list0, v, ((b)object0), v1, ((b)object1));
            }
        }
    }

    void e(List list0, int v, b a$b0, int v1, b a$b1) {
        boolean z1;
        int v2 = a$b0.b;
        int v3 = a$b0.d;
        boolean z = false;
        if(v2 >= v3) {
            if(a$b1.b != v3 + 1 || a$b1.d != v2 - v3) {
                z1 = true;
            }
            else {
                z1 = true;
                z = true;
            }
        }
        else if(a$b1.b == v2 && a$b1.d == v3 - v2) {
            z1 = false;
            z = true;
        }
        else {
            z1 = false;
        }
        int v4 = a$b1.b;
        if(v3 < v4) {
            a$b1.b = v4 - 1;
        }
        else {
            int v5 = a$b1.d;
            if(v3 < v4 + v5) {
                a$b1.d = v5 - 1;
                a$b0.a = 2;
                a$b0.d = 1;
                if(a$b1.d == 0) {
                    list0.remove(v1);
                    this.a.a(a$b1);
                }
                return;
            }
        }
        int v6 = a$b0.b;
        int v7 = a$b1.b;
        b a$b2 = null;
        if(v6 <= v7) {
            a$b1.b = v7 + 1;
        }
        else {
            int v8 = a$b1.d;
            if(v6 < v7 + v8) {
                a$b2 = this.a.b(2, v6 + 1, v7 + v8 - v6, null);
                a$b1.d = a$b0.b - a$b1.b;
            }
        }
        if(z) {
            list0.set(v, a$b1);
            list0.remove(v1);
            this.a.a(a$b0);
            return;
        }
        if(z1) {
            if(a$b2 != null) {
                int v9 = a$b0.b;
                if(v9 > a$b2.b) {
                    a$b0.b = v9 - a$b2.d;
                }
                int v10 = a$b0.d;
                if(v10 > a$b2.b) {
                    a$b0.d = v10 - a$b2.d;
                }
            }
            int v11 = a$b0.b;
            if(v11 > a$b1.b) {
                a$b0.b = v11 - a$b1.d;
            }
            int v12 = a$b0.d;
            if(v12 > a$b1.b) {
                a$b0.d = v12 - a$b1.d;
            }
        }
        else {
            if(a$b2 != null) {
                int v13 = a$b0.b;
                if(v13 >= a$b2.b) {
                    a$b0.b = v13 - a$b2.d;
                }
                int v14 = a$b0.d;
                if(v14 >= a$b2.b) {
                    a$b0.d = v14 - a$b2.d;
                }
            }
            int v15 = a$b0.b;
            if(v15 >= a$b1.b) {
                a$b0.b = v15 - a$b1.d;
            }
            int v16 = a$b0.d;
            if(v16 >= a$b1.b) {
                a$b0.d = v16 - a$b1.d;
            }
        }
        list0.set(v, a$b1);
        if(a$b0.b == a$b0.d) {
            list0.remove(v1);
        }
        else {
            list0.set(v1, a$b0);
        }
        if(a$b2 != null) {
            list0.add(v, a$b2);
        }
    }

    void f(List list0, int v, b a$b0, int v1, b a$b1) {
        b a$b3;
        int v2 = a$b0.d;
        int v3 = a$b1.b;
        b a$b2 = null;
        if(v2 < v3) {
            a$b1.b = v3 - 1;
            a$b3 = null;
        }
        else {
            int v4 = a$b1.d;
            if(v2 < v3 + v4) {
                a$b1.d = v4 - 1;
                a$b3 = this.a.b(4, a$b0.b, 1, a$b1.c);
            }
            else {
                a$b3 = null;
            }
        }
        int v5 = a$b0.b;
        int v6 = a$b1.b;
        if(v5 <= v6) {
            a$b1.b = v6 + 1;
        }
        else {
            int v7 = a$b1.d;
            if(v5 < v6 + v7) {
                int v8 = v6 + v7 - v5;
                a$b2 = this.a.b(4, v5 + 1, v8, a$b1.c);
                a$b1.d -= v8;
            }
        }
        list0.set(v1, a$b0);
        if(a$b1.d > 0) {
            list0.set(v, a$b1);
        }
        else {
            list0.remove(v);
            this.a.a(a$b1);
        }
        if(a$b3 != null) {
            list0.add(v, a$b3);
        }
        if(a$b2 != null) {
            list0.add(v, a$b2);
        }
    }
}

