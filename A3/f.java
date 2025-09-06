package a3;

import Z2.a;
import Z2.b;
import Z2.c;

public final class f {
    private b a;
    private a b;
    private c c;
    private int d;
    private a3.b e;

    public f() {
        this.d = -1;
    }

    public a3.b a() {
        return this.e;
    }

    public static boolean b(int v) {
        return v >= 0 && v < 8;
    }

    public void c(a a0) {
        this.b = a0;
    }

    public void d(int v) {
        this.d = v;
    }

    public void e(a3.b b0) {
        this.e = b0;
    }

    public void f(b b0) {
        this.a = b0;
    }

    public void g(c c0) {
        this.c = c0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(200);
        stringBuilder0.append("<<\n");
        stringBuilder0.append(" mode: ");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\n ecLevel: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append("\n version: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append("\n maskPattern: ");
        stringBuilder0.append(this.d);
        if(this.e == null) {
            stringBuilder0.append("\n matrix: null\n");
        }
        else {
            stringBuilder0.append("\n matrix:\n");
            stringBuilder0.append(this.e);
        }
        stringBuilder0.append(">>\n");
        return stringBuilder0.toString();
    }
}

