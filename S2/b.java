package S2;

final class b {
    private final a a;
    private final int[] b;

    b(a a0, int[] arr_v) {
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = a0;
        int v = 1;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            while(v < arr_v.length && arr_v[v] == 0) {
                ++v;
            }
            if(v == arr_v.length) {
                this.b = new int[]{0};
                return;
            }
            int[] arr_v1 = new int[arr_v.length - v];
            this.b = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, arr_v1.length);
            return;
        }
        this.b = arr_v;
    }

    b a(b b0) {
        if(!this.a.equals(b0.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(this.f()) {
            return b0;
        }
        if(b0.f()) {
            return this;
        }
        int[] arr_v = this.b;
        int[] arr_v1 = b0.b;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = a.a(arr_v1[v1 - v], arr_v[v1]);
        }
        return new b(this.a, arr_v3);
    }

    b[] b(b b0) {
        if(!this.a.equals(b0.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(b0.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b b1 = this.a.e();
        int v = b0.c(b0.e());
        int v1 = this.a.f(v);
        b b2;
        for(b2 = this; b2.e() >= b0.e() && !b2.f(); b2 = b2.a(b3)) {
            int v2 = b2.e() - b0.e();
            int v3 = b2.c(b2.e());
            int v4 = this.a.h(v3, v1);
            b b3 = b0.h(v2, v4);
            b1 = b1.a(this.a.b(v2, v4));
        }
        return new b[]{b1, b2};
    }

    int c(int v) {
        return this.b[this.b.length - 1 - v];
    }

    int[] d() {
        return this.b;
    }

    int e() {
        return this.b.length - 1;
    }

    boolean f() {
        return this.b[0] == 0;
    }

    b g(b b0) {
        if(!this.a.equals(b0.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if(!this.f() && !b0.f()) {
            int[] arr_v = this.b;
            int[] arr_v1 = b0.b;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v2[v + v2] = a.a(arr_v2[v + v2], this.a.h(v1, arr_v1[v2]));
                }
            }
            return new b(this.a, arr_v2);
        }
        return this.a.e();
    }

    b h(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.a.e();
        }
        int[] arr_v = new int[v + this.b.length];
        for(int v2 = 0; v2 < this.b.length; ++v2) {
            arr_v[v2] = this.a.h(this.b[v2], v1);
        }
        return new b(this.a, arr_v);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.e() * 8);
        for(int v = this.e(); v >= 0; --v) {
            int v1 = this.c(v);
            if(v1 != 0) {
                if(v1 < 0) {
                    stringBuilder0.append(" - ");
                    v1 = -v1;
                }
                else if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" + ");
                }
                if(v == 0 || v1 != 1) {
                    int v2 = this.a.g(v1);
                    if(v2 == 0) {
                        stringBuilder0.append('1');
                    }
                    else if(v2 == 1) {
                        stringBuilder0.append('a');
                    }
                    else {
                        stringBuilder0.append("a^");
                        stringBuilder0.append(v2);
                    }
                }
                if(v != 0) {
                    if(v == 1) {
                        stringBuilder0.append('x');
                    }
                    else {
                        stringBuilder0.append("x^");
                        stringBuilder0.append(v);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }
}

