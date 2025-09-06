package z;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

public abstract class h {
    public static class a {
        private final int a;
        private final b[] b;

        public a(int v, b[] arr_h$b) {
            this.a = v;
            this.b = arr_h$b;
        }

        static a a(int v, b[] arr_h$b) {
            return new a(v, arr_h$b);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public static class b {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public b(Uri uri0, int v, int v1, boolean z, int v2) {
            this.a = (Uri)B.h.g(uri0);
            this.b = v;
            this.c = v1;
            this.d = z;
            this.e = v2;
        }

        static b a(Uri uri0, int v, int v1, boolean z, int v2) {
            return new b(uri0, v, v1, z, v2);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static abstract class c {
        public abstract void a(int arg1);

        public abstract void b(Typeface arg1);
    }

    public static Typeface a(Context context0, CancellationSignal cancellationSignal0, b[] arr_h$b) {
        return androidx.core.graphics.h.b(context0, cancellationSignal0, arr_h$b, 0);
    }

    public static a b(Context context0, CancellationSignal cancellationSignal0, f f0) {
        return e.e(context0, f0, cancellationSignal0);
    }

    public static Typeface c(Context context0, f f0, int v, boolean z, int v1, Handler handler0, c h$c0) {
        z.a a0 = new z.a(h$c0, handler0);
        return z ? g.e(context0, f0, a0, v, v1) : g.d(context0, f0, v, null, a0);
    }
}

