package K2;

import androidx.privacysandbox.ads.adservices.topics.d;
import z3.k;

public final class o {
    private final String a;
    private final String b;
    private final int c;
    private final long d;

    public o(String s, String s1, int v, long v1) {
        k.e(s, "sessionId");
        k.e(s1, "firstSessionId");
        super();
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        if(!k.a(this.a, ((o)object0).a)) {
            return false;
        }
        if(!k.a(this.b, ((o)object0).b)) {
            return false;
        }
        return this.c == ((o)object0).c ? this.d == ((o)object0).d : false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c) * 0x1F + d.a(this.d);
    }

    @Override
    public String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}

