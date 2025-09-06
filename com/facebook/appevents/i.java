package com.facebook.appevents;

import com.facebook.internal.l;
import com.facebook.internal.p;
import com.facebook.internal.r.b;
import com.facebook.internal.r;

public abstract class i {
    public static void a() {
        static final class a implements b {
            @Override  // com.facebook.internal.r$b
            public void a() {
            }

            @Override  // com.facebook.internal.r$b
            public void b(p p0) {
                class com.facebook.appevents.i.a.a implements com.facebook.internal.l.a {
                    final a a;

                    @Override  // com.facebook.internal.l$a
                    public void a(boolean z) {
                        if(z) {
                            M0.a.c();
                        }
                    }
                }


                class com.facebook.appevents.i.a.b implements com.facebook.internal.l.a {
                    final a a;

                    @Override  // com.facebook.internal.l$a
                    public void a(boolean z) {
                        if(z) {
                            V0.a.a();
                        }
                    }
                }


                class c implements com.facebook.internal.l.a {
                    final a a;

                    @Override  // com.facebook.internal.l$a
                    public void a(boolean z) {
                        if(z) {
                            T0.c.g();
                        }
                    }
                }


                class d implements com.facebook.internal.l.a {
                    final a a;

                    @Override  // com.facebook.internal.l$a
                    public void a(boolean z) {
                        if(z) {
                            P0.a.a();
                        }
                    }
                }


                class e implements com.facebook.internal.l.a {
                    final a a;

                    @Override  // com.facebook.internal.l$a
                    public void a(boolean z) {
                        if(z) {
                            Q0.c.a();
                        }
                    }
                }

                com.facebook.appevents.i.a.a i$a$a0 = new com.facebook.appevents.i.a.a(this);
                l.a(com.facebook.internal.l.b.l, i$a$a0);
                com.facebook.appevents.i.a.b i$a$b0 = new com.facebook.appevents.i.a.b(this);
                l.a(com.facebook.internal.l.b.k, i$a$b0);
                c i$a$c0 = new c(this);
                l.a(com.facebook.internal.l.b.m, i$a$c0);
                d i$a$d0 = new d(this);
                l.a(com.facebook.internal.l.b.q, i$a$d0);
                e i$a$e0 = new e(this);
                l.a(com.facebook.internal.l.b.t, i$a$e0);
            }
        }

        Class class0 = i.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            r.h(new a());
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }
}

