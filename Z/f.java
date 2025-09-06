package z;

import B.h;
import android.util.Base64;
import java.util.List;

public final class f {
    private final String a;
    private final String b;
    private final String c;
    private final List d;
    private final int e;
    private final String f;

    public f(String s, String s1, String s2, List list0) {
        this.a = (String)h.g(s);
        this.b = (String)h.g(s1);
        this.c = (String)h.g(s2);
        this.d = (List)h.g(list0);
        this.e = 0;
        this.f = s + "-" + s1 + "-" + s2;
    }

    private String a(String s, String s1, String s2) [...] // Inlined contents

    public List b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for(int v = 0; v < this.d.size(); ++v) {
            stringBuilder0.append(" [");
            List list0 = (List)this.d.get(v);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                stringBuilder0.append(" \"");
                stringBuilder0.append(Base64.encodeToString(((byte[])list0.get(v1)), 0));
                stringBuilder0.append("\"");
            }
            stringBuilder0.append(" ]");
        }
        stringBuilder0.append("}");
        stringBuilder0.append("mCertificatesArray: " + this.e);
        return stringBuilder0.toString();
    }
}

