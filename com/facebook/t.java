package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

class t extends OutputStream implements v {
    private final Map f;
    private final Handler g;
    private GraphRequest h;
    private w i;
    private int j;

    t(Handler handler0) {
        this.f = new HashMap();
        this.g = handler0;
    }

    @Override  // com.facebook.v
    public void a(GraphRequest graphRequest0) {
        this.h = graphRequest0;
        this.i = graphRequest0 == null ? null : ((w)this.f.get(graphRequest0));
    }

    void b(long v) {
        if(this.i == null) {
            w w0 = new w(this.g, this.h);
            this.i = w0;
            this.f.put(this.h, w0);
        }
        this.i.b(v);
        this.j = (int)(((long)this.j) + v);
    }

    int f() {
        return this.j;
    }

    Map g() {
        return this.f;
    }

    @Override
    public void write(int v) {
        this.b(1L);
    }

    @Override
    public void write(byte[] arr_b) {
        this.b(((long)arr_b.length));
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) {
        this.b(((long)v1));
    }
}

