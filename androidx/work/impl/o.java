package androidx.work.impl;

import androidx.lifecycle.s;
import androidx.work.impl.utils.futures.c;
import androidx.work.n.b.a;
import androidx.work.n.b;
import androidx.work.n;

public class o implements n {
    private final s c;
    private final c d;

    public o() {
        this.c = new s();
        this.d = c.s();
        this.a(n.b);
    }

    public void a(b n$b0) {
        this.c.h(n$b0);
        if(n$b0 instanceof androidx.work.n.b.c) {
            this.d.o(((androidx.work.n.b.c)n$b0));
            return;
        }
        if(n$b0 instanceof a) {
            Throwable throwable0 = ((a)n$b0).a();
            this.d.p(throwable0);
        }
    }
}

