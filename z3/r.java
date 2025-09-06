package z3;

import E3.a;
import E3.g;

public abstract class r extends c implements g {
    private final boolean m;

    public r(Object object0, Class class0, String s, String s1, int v) {
        boolean z = false;
        super(object0, class0, s, s1, (v & 1) == 1);
        if((v & 2) == 2) {
            z = true;
        }
        this.m = z;
    }

    @Override  // z3.c
    public a b() {
        return this.m ? this : super.b();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof r) {
            return this.l().equals(((r)object0).l()) && this.i().equals(((r)object0).i()) && this.o().equals(((r)object0).o()) && k.a(this.e(), ((r)object0).e());
        }
        return object0 instanceof g ? object0.equals(this.b()) : false;
    }

    @Override
    public int hashCode() {
        return (this.l().hashCode() * 0x1F + this.i().hashCode()) * 0x1F + this.o().hashCode();
    }

    protected g p() {
        if(this.m) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (g)super.m();
    }

    @Override
    public String toString() {
        a a0 = this.b();
        return a0 == this ? "property " + this.i() + " (Kotlin reflection is not available)" : a0.toString();
    }
}

