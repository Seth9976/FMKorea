package j2;

import java.io.File;
import l2.B;

final class b extends r {
    private final B a;
    private final String b;
    private final File c;

    b(B b0, String s, File file0) {
        if(b0 == null) {
            throw new NullPointerException("Null report");
        }
        this.a = b0;
        if(s == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = s;
        if(file0 == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file0;
    }

    @Override  // j2.r
    public B b() {
        return this.a;
    }

    @Override  // j2.r
    public File c() {
        return this.c;
    }

    @Override  // j2.r
    public String d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof r) {
            B b0 = ((r)object0).b();
            if(this.a.equals(b0)) {
                String s = ((r)object0).d();
                if(this.b.equals(s)) {
                    File file0 = ((r)object0).c();
                    return this.c.equals(file0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}

