package l2;

import g2.e;

final class y extends a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final e f;

    y(String s, String s1, String s2, String s3, int v, e e0) {
        if(s == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = s1;
        if(s2 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = s2;
        if(s3 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = s3;
        this.e = v;
        if(e0 == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = e0;
    }

    @Override  // l2.D$a
    public String a() {
        return this.a;
    }

    @Override  // l2.D$a
    public int c() {
        return this.e;
    }

    @Override  // l2.D$a
    public e d() {
        return this.f;
    }

    @Override  // l2.D$a
    public String e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).a();
            if(this.a.equals(s)) {
                String s1 = ((a)object0).f();
                if(this.b.equals(s1)) {
                    String s2 = ((a)object0).g();
                    if(this.c.equals(s2)) {
                        String s3 = ((a)object0).e();
                        if(this.d.equals(s3)) {
                            int v = ((a)object0).c();
                            if(this.e == v) {
                                e e0 = ((a)object0).d();
                                return this.f.equals(e0);
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // l2.D$a
    public String f() {
        return this.b;
    }

    @Override  // l2.D$a
    public String g() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}

