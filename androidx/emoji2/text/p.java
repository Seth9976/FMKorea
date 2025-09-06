package androidx.emoji2.text;

import P.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class p {
    private final int a;
    private final n b;
    private volatile int c;
    private static final ThreadLocal d;

    static {
        p.d = new ThreadLocal();
    }

    p(n n0, int v) {
        this.c = 0;
        this.b = n0;
        this.a = v;
    }

    public void a(Canvas canvas0, float f, float f1, Paint paint0) {
        Typeface typeface0 = paint0.getTypeface();
        paint0.setTypeface(this.b.g());
        canvas0.drawText(this.b.c(), this.a * 2, 2, f, f1, paint0);
        paint0.setTypeface(typeface0);
    }

    public int b(int v) {
        return this.g().h(v);
    }

    public int c() {
        return this.g().i();
    }

    public int d() {
        return this.c & 3;
    }

    public int e() {
        return this.g().k();
    }

    public int f() {
        return this.g().l();
    }

    private a g() {
        ThreadLocal threadLocal0 = p.d;
        a a0 = (a)threadLocal0.get();
        if(a0 == null) {
            a0 = new a();
            threadLocal0.set(a0);
        }
        this.b.d().j(a0, this.a);
        return a0;
    }

    public short h() {
        return this.g().m();
    }

    public int i() {
        return this.g().n();
    }

    public boolean j() {
        return this.g().j();
    }

    public boolean k() {
        return (this.c & 4) > 0;
    }

    public void l(boolean z) {
        int v = this.d();
        if(z) {
            this.c = v | 4;
            return;
        }
        this.c = v;
    }

    public void m(boolean z) {
        int v = this.c & 4;
        this.c = z ? v | 2 : v | 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(", id:");
        stringBuilder0.append(Integer.toHexString(this.f()));
        stringBuilder0.append(", codepoints:");
        int v = this.c();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(Integer.toHexString(this.b(v1)));
            stringBuilder0.append(" ");
        }
        return stringBuilder0.toString();
    }
}

