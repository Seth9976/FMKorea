package x2;

import u2.b;
import u2.c;
import u2.g;

class i implements g {
    private boolean a;
    private boolean b;
    private c c;
    private final f d;

    i(f f0) {
        this.a = false;
        this.b = false;
        this.d = f0;
    }

    private void a() {
        if(this.a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    void b(c c0, boolean z) {
        this.a = false;
        this.c = c0;
        this.b = z;
    }

    @Override  // u2.g
    public g f(String s) {
        this.a();
        this.d.i(this.c, s, this.b);
        return this;
    }

    @Override  // u2.g
    public g g(boolean z) {
        this.a();
        this.d.o(this.c, z, this.b);
        return this;
    }
}

