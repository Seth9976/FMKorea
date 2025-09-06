package U2;

final class n extends c {
    @Override  // U2.c
    public void a(h h0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        while(h0.i()) {
            int v = h0.c();
            ++h0.d;
            this.c(((char)v), stringBuilder0);
            if(stringBuilder0.length() % 3 == 0) {
                c.g(h0, stringBuilder0);
                if(j.n(h0.d(), h0.d, 3) != 3) {
                    h0.o(0);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        this.f(h0, stringBuilder0);
    }

    @Override  // U2.c
    int c(char c, StringBuilder stringBuilder0) {
        switch(c) {
            case 13: {
                stringBuilder0.append('\u0000');
                return 1;
            }
            case 0x20: {
                stringBuilder0.append('\u0003');
                return 1;
            }
            case 42: {
                stringBuilder0.append('\u0001');
                return 1;
            }
            case 62: {
                stringBuilder0.append('\u0002');
                return 1;
            }
            default: {
                if(c >= 0x30 && c <= 57) {
                    stringBuilder0.append(((char)(c - 44)));
                    return 1;
                }
                if(c >= 65 && c <= 90) {
                    stringBuilder0.append(((char)(c - 51)));
                    return 1;
                }
                j.e(c);
                return 1;
            }
        }
    }

    @Override  // U2.c
    public int e() [...] // Inlined contents

    @Override  // U2.c
    void f(h h0, StringBuilder stringBuilder0) {
        h0.p();
        int v = h0.g().a() - h0.a();
        h0.d -= stringBuilder0.length();
        if(h0.f() > 1 || v > 1 || h0.f() != v) {
            h0.r('þ');
        }
        if(h0.e() < 0) {
            h0.o(0);
        }
    }
}

