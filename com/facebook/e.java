package com.facebook;

import c1.b;
import com.facebook.internal.l;
import java.util.Random;

public class e extends RuntimeException {
    static final long serialVersionUID = 1L;

    public e() {
    }

    public e(String s) {
        class a implements com.facebook.internal.l.a {
            final String a;
            final e b;

            a(String s) {
                this.a = s;
                super();
            }

            @Override  // com.facebook.internal.l$a
            public void a(boolean z) {
                if(z) {
                    try {
                        b.c(this.a);
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }

        super(s);
        Random random0 = new Random();
        if(s != null && h.v() && random0.nextInt(100) > 50) {
            a e$a0 = new a(this, s);
            l.a(com.facebook.internal.l.b.z, e$a0);
        }
    }

    public e(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public e(Throwable throwable0) {
        super(throwable0);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }
}

