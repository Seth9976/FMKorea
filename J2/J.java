package j2;

import L2.b.a;
import L2.b;
import g2.f;

public class j implements b {
    private final u a;
    private String b;

    public j(u u0) {
        this.b = null;
        this.a = u0;
    }

    @Override  // L2.b
    public boolean a() {
        return this.a.d();
    }

    @Override  // L2.b
    public a b() {
        return a.f;
    }

    @Override  // L2.b
    public void c(L2.b.b b$b0) {
        f.f().b("App Quality Sessions session changed: " + b$b0);
        this.b = b$b0.a();
    }

    public String d() {
        return this.b;
    }
}

