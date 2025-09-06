package b3;

import com.onesignal.I1.C;
import z3.k;

public final class a {
    private final C a;
    private final String b;

    public a(C i1$C0, String s) {
        k.e(i1$C0, "level");
        k.e(s, "entry");
        super();
        this.a = i1$C0;
        this.b = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return this.a == ((a)object0).a ? k.a(this.b, ((a)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "OneSignalLogEvent(level=" + this.a + ", entry=" + this.b + ')';
    }
}

