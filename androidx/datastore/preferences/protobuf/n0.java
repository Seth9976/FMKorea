package androidx.datastore.preferences.protobuf;

class n0 extends l0 {
    m0 A(Object object0) {
        return ((w)object0).unknownFields;
    }

    int B(m0 m00) {
        return m00.f();
    }

    int C(m0 m00) {
        return m00.g();
    }

    m0 D(m0 m00, m0 m01) {
        return m01.equals(m0.e()) ? m00 : m0.k(m00, m01);
    }

    m0 E() {
        return m0.l();
    }

    void F(Object object0, m0 m00) {
        this.G(object0, m00);
    }

    void G(Object object0, m0 m00) {
        ((w)object0).unknownFields = m00;
    }

    m0 H(m0 m00) {
        m00.j();
        return m00;
    }

    void I(m0 m00, s0 s00) {
        m00.o(s00);
    }

    void J(m0 m00, s0 s00) {
        m00.q(s00);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void a(Object object0, int v, int v1) {
        this.u(((m0)object0), v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void b(Object object0, int v, long v1) {
        this.v(((m0)object0), v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void c(Object object0, int v, Object object1) {
        this.w(((m0)object0), v, ((m0)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void d(Object object0, int v, g g0) {
        this.x(((m0)object0), v, g0);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void e(Object object0, int v, long v1) {
        this.y(((m0)object0), v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    Object f(Object object0) {
        return this.z(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    Object g(Object object0) {
        return this.A(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    int h(Object object0) {
        return this.B(((m0)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    int i(Object object0) {
        return this.C(((m0)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void j(Object object0) {
        this.A(object0).j();
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    Object k(Object object0, Object object1) {
        return this.D(((m0)object0), ((m0)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    Object n() {
        return this.E();
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void o(Object object0, Object object1) {
        this.F(object0, ((m0)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void p(Object object0, Object object1) {
        this.G(object0, ((m0)object1));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    boolean q(d0 d00) {
        return false;
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    Object r(Object object0) {
        return this.H(((m0)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void s(Object object0, s0 s00) {
        this.I(((m0)object0), s00);
    }

    @Override  // androidx.datastore.preferences.protobuf.l0
    void t(Object object0, s0 s00) {
        this.J(((m0)object0), s00);
    }

    void u(m0 m00, int v, int v1) {
        m00.n(v << 3 | 5, v1);
    }

    void v(m0 m00, int v, long v1) {
        m00.n(r0.c(v, 1), v1);
    }

    void w(m0 m00, int v, m0 m01) {
        m00.n(v << 3 | 3, m01);
    }

    void x(m0 m00, int v, g g0) {
        m00.n(v << 3 | 2, g0);
    }

    void y(m0 m00, int v, long v1) {
        m00.n(v << 3, v1);
    }

    m0 z(Object object0) {
        m0 m00 = this.A(object0);
        if(m00 == m0.e()) {
            m00 = m0.l();
            this.G(object0, m00);
        }
        return m00;
    }
}

