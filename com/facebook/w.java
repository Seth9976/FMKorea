package com.facebook;

import android.os.Handler;

class w {
    private final GraphRequest a;
    private final Handler b;
    private final long c;
    private long d;
    private long e;
    private long f;

    w(Handler handler0, GraphRequest graphRequest0) {
        this.a = graphRequest0;
        this.b = handler0;
        this.c = h.r();
    }

    void a(long v) {
        this.d += v;
    }

    void b(long v) {
        this.f += v;
    }

    void c() {
    }
}

