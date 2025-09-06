package z3;

import E3.a;
import E3.d;

public abstract class i extends c implements d, h {
    private final int m;
    private final int n;

    public i(int v, Object object0, Class class0, String s, String s1, int v1) {
        super(object0, class0, s, s1, (v1 & 1) == 1);
        this.m = v;
        this.n = v1 >> 1;
    }

    @Override  // z3.h
    public int c() {
        return this.m;
    }

    @Override  // z3.c
    protected a d() {
        return v.a(this);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof i) {
            return this.i().equals(((i)object0).i()) && this.o().equals(((i)object0).o()) && this.n == ((i)object0).n && this.m == ((i)object0).m && k.a(this.e(), ((i)object0).e()) && k.a(this.l(), ((i)object0).l());
        }
        return object0 instanceof d ? object0.equals(this.b()) : false;
    }

    @Override
    public int hashCode() {
        return this.l() == null ? this.i().hashCode() * 0x1F + this.o().hashCode() : (this.l().hashCode() * 0x1F + this.i().hashCode()) * 0x1F + this.o().hashCode();
    }

    @Override
    public String toString() {
        a a0 = this.b();
        if(a0 != this) {
            return a0.toString();
        }
        return "<init>".equals(this.i()) ? "constructor (Kotlin reflection is not available)" : "function " + this.i() + " (Kotlin reflection is not available)";
    }
}

