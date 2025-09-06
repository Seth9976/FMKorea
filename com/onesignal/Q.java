package com.onesignal;

import l3.u;
import z3.g;
import z3.k;
import z3.l;

public abstract class q {
    public static final class a {
        public abstract class com.onesignal.q.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[b.values().length];
                arr_v[b.f.ordinal()] = 1;
                arr_v[b.g.ordinal()] = 2;
                com.onesignal.q.a.a.a = arr_v;
            }
        }

        private a() {
        }

        public a(g g0) {
        }

        public final b a() {
            return q.b;
        }

        public final void b(Runnable runnable0) {
            static final class com.onesignal.q.a.b extends l implements y3.a {
                final Runnable g;

                com.onesignal.q.a.b(Runnable runnable0) {
                    this.g = runnable0;
                    super(0);
                }

                @Override  // y3.a
                public Object a() {
                    this.b();
                    return u.a;
                }

                public final void b() {
                    this.g.run();
                }
            }

            k.e(runnable0, "runnable");
            switch(com.onesignal.q.a.a.a[this.a().ordinal()]) {
                case 1: {
                    OSUtils.S(runnable0);
                    return;
                }
                case 2: {
                    o3.a.b(false, false, null, null, 0, new com.onesignal.q.a.b(runnable0), 0x1F, null);
                }
            }
        }
    }

    public static enum b {
        MainUI,
        Background;

        private static final b[] b() [...] // Inlined contents
    }

    public static final a a;
    private static b b;

    static {
        q.a = new a(null);
        q.b = b.f;
    }
}

