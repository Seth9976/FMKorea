package androidx.core.text;

import java.util.Locale;

public abstract class p {
    static class a implements c {
        private final boolean a;
        static final a b;

        static {
            a.b = new a(true);
        }

        private a(boolean z) {
            this.a = z;
        }

        @Override  // androidx.core.text.p$c
        public int a(CharSequence charSequence0, int v, int v1) {
            int v2 = v1 + v;
            boolean z = false;
            while(v < v2) {
                switch(p.a(Character.getDirectionality(charSequence0.charAt(v)))) {
                    case 0: {
                        if(this.a) {
                            return 0;
                        }
                        z = true;
                        break;
                    }
                    case 1: {
                        if(!this.a) {
                            return 1;
                        }
                        z = true;
                    }
                }
                ++v;
            }
            return z ? this.a : 2;
        }
    }

    static class b implements c {
        static final b a;

        static {
            b.a = new b();
        }

        @Override  // androidx.core.text.p$c
        public int a(CharSequence charSequence0, int v, int v1) {
            int v2 = v1 + v;
            int v3 = 2;
            while(v < v2 && v3 == 2) {
                v3 = p.b(Character.getDirectionality(charSequence0.charAt(v)));
                ++v;
            }
            return v3;
        }
    }

    interface c {
        int a(CharSequence arg1, int arg2, int arg3);
    }

    static abstract class d implements o {
        private final c a;

        d(c p$c0) {
            this.a = p$c0;
        }

        @Override  // androidx.core.text.o
        public boolean a(CharSequence charSequence0, int v, int v1) {
            if(charSequence0 == null || v < 0 || v1 < 0 || charSequence0.length() - v1 < v) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? this.b() : this.c(charSequence0, v, v1);
        }

        protected abstract boolean b();

        private boolean c(CharSequence charSequence0, int v, int v1) {
            switch(this.a.a(charSequence0, v, v1)) {
                case 0: {
                    return true;
                }
                case 1: {
                    return false;
                }
                default: {
                    return this.b();
                }
            }
        }
    }

    static class e extends d {
        private final boolean b;

        e(c p$c0, boolean z) {
            super(p$c0);
            this.b = z;
        }

        @Override  // androidx.core.text.p$d
        protected boolean b() {
            return this.b;
        }
    }

    static class f extends d {
        static final f b;

        static {
            f.b = new f();
        }

        f() {
            super(null);
        }

        @Override  // androidx.core.text.p$d
        protected boolean b() {
            return q.a(Locale.getDefault()) == 1;
        }
    }

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;

    static {
        p.a = new e(null, false);
        p.b = new e(null, true);
        p.c = new e(b.a, false);
        p.d = new e(b.a, true);
        p.e = new e(a.b, false);
        p.f = f.b;
    }

    static int a(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 0;
            }
            default: {
                return v == 2 ? 0 : 2;
            }
        }
    }

    static int b(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                break;
            }
            default: {
                if(v != 2) {
                    switch(v) {
                        case 14: 
                        case 15: {
                            return 1;
                        }
                        case 16: 
                        case 17: {
                            break;
                        }
                        default: {
                            return 2;
                        }
                    }
                }
            }
        }
        return 0;
    }
}

