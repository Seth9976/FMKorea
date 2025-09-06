package S2;

import java.util.ArrayList;
import java.util.List;

public final class c {
    private final a a;
    private final List b;

    public c(a a0) {
        this.a = a0;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        arrayList0.add(new b(a0, new int[]{1}));
    }

    private b a(int v) {
        if(v >= this.b.size()) {
            b b0 = (b)this.b.get(this.b.size() - 1);
            for(int v1 = this.b.size(); v1 <= v; ++v1) {
                int[] arr_v = {1, this.a.c(v1 - 1 + this.a.d())};
                b0 = b0.g(new b(this.a, arr_v));
                this.b.add(b0);
            }
        }
        return (b)this.b.get(v);
    }

    public void b(int[] arr_v, int v) {
        if(v == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int v1 = arr_v.length - v;
        if(v1 <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b b0 = this.a(v);
        int[] arr_v1 = new int[v1];
        System.arraycopy(arr_v, 0, arr_v1, 0, v1);
        int[] arr_v2 = new b(this.a, arr_v1).h(v, 1).b(b0)[1].d();
        int v2 = v - arr_v2.length;
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_v[v1 + v3] = 0;
        }
        System.arraycopy(arr_v2, 0, arr_v, v1 + v2, arr_v2.length);
    }
}

