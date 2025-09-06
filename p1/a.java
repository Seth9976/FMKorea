package P1;

import android.graphics.Typeface;

public final class a extends f {
    public interface P1.a.a {
        void a(Typeface arg1);
    }

    private final Typeface a;
    private final P1.a.a b;
    private boolean c;

    public a(P1.a.a a$a0, Typeface typeface0) {
        this.a = typeface0;
        this.b = a$a0;
    }

    @Override  // P1.f
    public void a(int v) {
        this.d(this.a);
    }

    @Override  // P1.f
    public void b(Typeface typeface0, boolean z) {
        this.d(typeface0);
    }

    public void c() {
        this.c = true;
    }

    private void d(Typeface typeface0) {
        if(!this.c) {
            this.b.a(typeface0);
        }
    }
}

