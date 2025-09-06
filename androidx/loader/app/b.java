package androidx.loader.app;

import androidx.appcompat.app.E;
import androidx.collection.h;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class b extends a {
    static class androidx.loader.app.b.a extends H {
        static final class androidx.loader.app.b.a.a implements androidx.lifecycle.I.b {
            @Override  // androidx.lifecycle.I$b
            public H a(Class class0) {
                return new androidx.loader.app.b.a();
            }

            @Override  // androidx.lifecycle.I$b
            public H b(Class class0, W.a a0) {
                return J.b(this, class0, a0);
            }
        }

        private h d;
        private boolean e;
        private static final androidx.lifecycle.I.b f;

        static {
            androidx.loader.app.b.a.f = new androidx.loader.app.b.a.a();
        }

        androidx.loader.app.b.a() {
            this.d = new h();
            this.e = false;
        }

        @Override  // androidx.lifecycle.H
        protected void d() {
            super.d();
            if(this.d.l() <= 0) {
                this.d.c();
                return;
            }
            E.a(this.d.m(0));
            throw null;
        }

        public void f(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
            if(this.d.l() > 0) {
                printWriter0.print(s);
                printWriter0.println("Loaders:");
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s);
                stringBuilder0.append("    ");
                if(this.d.l() > 0) {
                    E.a(this.d.m(0));
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(this.d.j(0));
                    printWriter0.print(": ");
                    throw null;
                }
            }
        }

        static androidx.loader.app.b.a g(L l0) {
            return (androidx.loader.app.b.a)new I(l0, androidx.loader.app.b.a.f).a(androidx.loader.app.b.a.class);
        }

        void h() {
            if(this.d.l() <= 0) {
                return;
            }
            E.a(this.d.m(0));
            throw null;
        }
    }

    private final n a;
    private final androidx.loader.app.b.a b;

    static {
    }

    b(n n0, L l0) {
        this.a = n0;
        this.b = androidx.loader.app.b.a.g(l0);
    }

    @Override  // androidx.loader.app.a
    public void a(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.b.f(s, fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // androidx.loader.app.a
    public void c() {
        this.b.h();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("LoaderManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        B.b.a(this.a, stringBuilder0);
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }
}

