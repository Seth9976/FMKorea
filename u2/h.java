package U2;

import O2.b;
import java.nio.charset.StandardCharsets;

final class h {
    private final String a;
    private l b;
    private final StringBuilder c;
    int d;
    private int e;
    private k f;
    private int g;

    h(String s) {
        byte[] arr_b = s.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = (char)(arr_b[v] & 0xFF);
            if(v1 == 0x3F && s.charAt(v) != 0x3F) {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            stringBuilder0.append(((char)v1));
        }
        this.a = stringBuilder0.toString();
        this.b = l.f;
        this.c = new StringBuilder(s.length());
        this.e = -1;
    }

    public int a() {
        return this.c.length();
    }

    public StringBuilder b() {
        return this.c;
    }

    public char c() {
        return this.a.charAt(this.d);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.h() - this.d;
    }

    public k g() {
        return this.f;
    }

    private int h() {
        return this.a.length() - this.g;
    }

    public boolean i() {
        return this.d < this.h();
    }

    public void j() {
        this.e = -1;
    }

    public void k() {
        this.f = null;
    }

    public void l(b b0, b b1) {
    }

    public void m(int v) {
        this.g = v;
    }

    public void n(l l0) {
        this.b = l0;
    }

    public void o(int v) {
        this.e = v;
    }

    public void p() {
        this.q(this.a());
    }

    public void q(int v) {
        if(this.f == null || v > this.f.a()) {
            this.f = k.l(v, this.b, null, null, true);
        }
    }

    public void r(char c) {
        this.c.append(c);
    }

    public void s(String s) {
        this.c.append(s);
    }
}

