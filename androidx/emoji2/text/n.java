package androidx.emoji2.text;

import B.h;
import P.b;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.u;
import java.nio.ByteBuffer;

public final class n {
    static class a {
        private final SparseArray a;
        private p b;

        private a() {
            this(1);
        }

        a(int v) {
            this.a = new SparseArray(v);
        }

        a a(int v) {
            return this.a == null ? null : ((a)this.a.get(v));
        }

        final p b() {
            return this.b;
        }

        void c(p p0, int v, int v1) {
            a n$a0 = this.a(p0.b(v));
            if(n$a0 == null) {
                n$a0 = new a();
                int v2 = p0.b(v);
                this.a.put(v2, n$a0);
            }
            if(v1 > v) {
                n$a0.c(p0, v + 1, v1);
                return;
            }
            n$a0.b = p0;
        }
    }

    private final b a;
    private final char[] b;
    private final a c;
    private final Typeface d;

    private n(Typeface typeface0, b b0) {
        this.d = typeface0;
        this.a = b0;
        this.c = new a(0x400);
        this.b = new char[b0.k() * 2];
        this.a(b0);
    }

    private void a(b b0) {
        int v = b0.k();
        for(int v1 = 0; v1 < v; ++v1) {
            p p0 = new p(this, v1);
            p0.f();
            this.h(p0);
        }
    }

    public static n b(Typeface typeface0, ByteBuffer byteBuffer0) {
        try {
            u.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface0, m.b(byteBuffer0));
        }
        finally {
            u.b();
        }
    }

    public char[] c() {
        return this.b;
    }

    public b d() {
        return this.a;
    }

    int e() {
        return this.a.l();
    }

    a f() {
        return this.c;
    }

    Typeface g() {
        return this.d;
    }

    void h(p p0) {
        h.h(p0, "emoji metadata cannot be null");
        h.b(p0.c() > 0, "invalid metadata codepoint length");
        int v = p0.c();
        this.c.c(p0, 0, v - 1);
    }
}

