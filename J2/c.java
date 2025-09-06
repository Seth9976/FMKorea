package j2;

final class c extends a {
    private final String a;
    private final String b;

    c(String s, String s1) {
        if(s == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.a = s;
        this.b = s1;
    }

    @Override  // j2.z$a
    public String c() {
        return this.a;
    }

    @Override  // j2.z$a
    public String d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).c();
            if(this.a.equals(s)) {
                return this.b == null ? ((a)object0).d() == null : this.b.equals(((a)object0).d());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.a + ", firebaseInstallationId=" + this.b + "}";
    }
}

