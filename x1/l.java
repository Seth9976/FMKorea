package X1;

import java.io.Serializable;
import java.util.Objects;

public abstract class l {
    static class a implements k, Serializable {
        final k f;
        volatile transient boolean g;
        transient Object h;
        private static final long serialVersionUID;

        a(k k0) {
            this.f = (k)h.i(k0);
        }

        @Override  // X1.k
        public Object get() {
            if(!this.g) {
                synchronized(this) {
                    if(!this.g) {
                        Object object0 = this.f.get();
                        this.h = object0;
                        this.g = true;
                        return object0;
                    }
                }
            }
            return this.h;
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return this.g ? "Suppliers.memoize(" + ("<supplier that returned " + this.h + ">") + ")" : "Suppliers.memoize(" + this.f + ")";
        }
    }

    static class b implements k {
        volatile k f;
        volatile boolean g;
        Object h;

        b(k k0) {
            this.f = (k)h.i(k0);
        }

        @Override  // X1.k
        public Object get() {
            if(!this.g) {
                synchronized(this) {
                    if(!this.g) {
                        k k0 = this.f;
                        Objects.requireNonNull(k0);
                        Object object0 = k0.get();
                        this.h = object0;
                        this.g = true;
                        this.f = null;
                        return object0;
                    }
                }
            }
            return this.h;
        }

        @Override
        public String toString() {
            k k0 = this.f;
            if(k0 == null) {
                k0 = "<supplier that returned " + this.h + ">";
            }
            return "Suppliers.memoize(" + k0 + ")";
        }
    }

    static class c implements k, Serializable {
        final Object f;
        private static final long serialVersionUID;

        c(Object object0) {
            this.f = object0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof c ? f.a(this.f, ((c)object0).f) : false;
        }

        @Override  // X1.k
        public Object get() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return f.b(new Object[]{this.f});
        }

        @Override
        public String toString() {
            return "Suppliers.ofInstance(" + this.f + ")";
        }
    }

    public static k a(k k0) {
        if(!(k0 instanceof b) && !(k0 instanceof a)) {
            return k0 instanceof Serializable ? new a(k0) : new b(k0);
        }
        return k0;
    }

    public static k b(Object object0) {
        return new c(object0);
    }
}

