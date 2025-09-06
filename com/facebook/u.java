package com.facebook;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

class u extends FilterOutputStream implements v {
    private final Map f;
    private final m g;
    private final long h;
    private long i;
    private long j;
    private long k;
    private w l;

    u(OutputStream outputStream0, m m0, Map map0, long v) {
        super(outputStream0);
        this.g = m0;
        this.f = map0;
        this.k = v;
        this.h = h.r();
    }

    @Override  // com.facebook.v
    public void a(GraphRequest graphRequest0) {
        this.l = graphRequest0 == null ? null : ((w)this.f.get(graphRequest0));
    }

    private void b(long v) {
        w w0 = this.l;
        if(w0 != null) {
            w0.a(v);
        }
        long v1 = this.i + v;
        this.i = v1;
        if(v1 >= this.j + this.h || v1 >= this.k) {
            this.f();
        }
    }

    @Override
    public void close() {
        super.close();
        Iterator iterator0 = this.f.values().iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
        this.f();
    }

    private void f() {
        if(this.i > this.j) {
            for(Object object0: this.g.o()) {
                a m$a0 = (a)object0;
            }
            this.j = this.i;
        }
    }

    @Override
    public void write(int v) {
        this.out.write(v);
        this.b(1L);
    }

    @Override
    public void write(byte[] arr_b) {
        this.out.write(arr_b);
        this.b(((long)arr_b.length));
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) {
        this.out.write(arr_b, v, v1);
        this.b(((long)v1));
    }
}

