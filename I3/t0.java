package I3;

public class t0 extends x0 implements x {
    private final boolean h;

    public t0(q0 q00) {
        super(true);
        this.f0(q00);
        this.h = this.H0();
    }

    private final boolean H0() {
        r r0 = this.a0();
        s s0 = r0 instanceof s ? ((s)r0) : null;
        if(s0 != null) {
            x0 x00 = s0.A();
            if(x00 != null) {
                while(true) {
                    if(x00.T()) {
                        return true;
                    }
                    r r1 = x00.a0();
                    s s1 = r1 instanceof s ? ((s)r1) : null;
                    if(s1 == null) {
                        break;
                    }
                    x00 = s1.A();
                    if(x00 == null) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override  // I3.x0
    public boolean T() {
        return this.h;
    }

    @Override  // I3.x0
    public boolean W() {
        return true;
    }
}

