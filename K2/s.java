package K2;

import androidx.privacysandbox.ads.adservices.topics.d;
import z3.g;
import z3.k;

public final class s {
    private final String a;
    private final String b;
    private final int c;
    private long d;
    private f e;
    private String f;

    public s(String s, String s1, int v, long v1, f f0, String s2) {
        k.e(s, "sessionId");
        k.e(s1, "firstSessionId");
        k.e(f0, "dataCollectionStatus");
        k.e(s2, "firebaseInstallationId");
        super();
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = f0;
        this.f = s2;
    }

    public s(String s, String s1, int v, long v1, f f0, String s2, int v2, g g0) {
        this(s, s1, v, v1, ((v2 & 16) == 0 ? f0 : new f(null, null, 0.0, 7, null)), ((v2 & 0x20) == 0 ? s2 : ""));
    }

    public final f a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s)) {
            return false;
        }
        if(!k.a(this.a, ((s)object0).a)) {
            return false;
        }
        if(!k.a(this.b, ((s)object0).b)) {
            return false;
        }
        if(this.c != ((s)object0).c) {
            return false;
        }
        if(this.d != ((s)object0).d) {
            return false;
        }
        return k.a(this.e, ((s)object0).e) ? k.a(this.f, ((s)object0).f) : false;
    }

    public final int f() {
        return this.c;
    }

    public final void g(String s) {
        k.e(s, "<set-?>");
        this.f = s;
    }

    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c) * 0x1F + d.a(this.d)) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ')';
    }
}

