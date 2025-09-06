package X1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public abstract class d {
    static abstract class a {
    }

    public static final class b {
        static class X1.d.b.a {
            String a;
            Object b;
            X1.d.b.a c;

            private X1.d.b.a() {
            }

            X1.d.b.a(a d$a0) {
            }
        }

        private final String a;
        private final X1.d.b.a b;
        private X1.d.b.a c;
        private boolean d;
        private boolean e;

        private b(String s) {
            X1.d.b.a d$b$a0 = new X1.d.b.a(null);
            this.b = d$b$a0;
            this.c = d$b$a0;
            this.d = false;
            this.e = false;
            this.a = (String)h.i(s);
        }

        b(String s, a d$a0) {
            this(s);
        }

        private X1.d.b.a a() {
            X1.d.b.a d$b$a0 = new X1.d.b.a(null);
            this.c.c = d$b$a0;
            this.c = d$b$a0;
            return d$b$a0;
        }

        private b b(Object object0) {
            this.a().b = object0;
            return this;
        }

        public b c(Object object0) {
            return this.b(object0);
        }

        private static boolean d(Object object0) {
            if(object0 instanceof CharSequence) {
                return ((CharSequence)object0).length() == 0;
            }
            if(object0 instanceof Collection) {
                return ((Collection)object0).isEmpty();
            }
            if(object0 instanceof Map) {
                return ((Map)object0).isEmpty();
            }
            return object0 instanceof g ? !((g)object0).c() : object0.getClass().isArray() && Array.getLength(object0) == 0;
        }

        @Override
        public String toString() {
            boolean z = this.d;
            boolean z1 = this.e;
            StringBuilder stringBuilder0 = new StringBuilder(0x20);
            stringBuilder0.append(this.a);
            stringBuilder0.append('{');
            X1.d.b.a d$b$a0 = this.b.c;
            String s = "";
            while(d$b$a0 != null) {
                Object object0 = d$b$a0.b;
                if(object0 != null) {
                    if(!z1 || !b.d(object0)) {
                    label_13:
                        stringBuilder0.append(s);
                        String s1 = d$b$a0.a;
                        if(s1 != null) {
                            stringBuilder0.append(s1);
                            stringBuilder0.append('=');
                        }
                        if(object0 == null || !object0.getClass().isArray()) {
                            stringBuilder0.append(object0);
                        }
                        else {
                            String s2 = Arrays.deepToString(new Object[]{object0});
                            stringBuilder0.append(s2, 1, s2.length() - 1);
                        }
                        s = ", ";
                    }
                }
                else if(!z) {
                    goto label_13;
                }
                d$b$a0 = d$b$a0.c;
            }
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }
    }

    public static b a(Object object0) {
        return new b(object0.getClass().getSimpleName(), null);
    }
}

