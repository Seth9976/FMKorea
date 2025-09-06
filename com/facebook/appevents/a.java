package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.h;
import com.facebook.internal.F;
import java.io.Serializable;

public class a implements Serializable {
    static abstract class com.facebook.appevents.a.a {
    }

    static class b implements Serializable {
        private final String f;
        private final String g;
        private static final long serialVersionUID = -2488473066578201069L;

        private b(String s, String s1) {
            this.f = s;
            this.g = s1;
        }

        b(String s, String s1, com.facebook.appevents.a.a a$a0) {
            this(s, s1);
        }

        private Object readResolve() {
            return new a(this.f, this.g);
        }
    }

    private final String f;
    private final String g;
    private static final long serialVersionUID = 1L;

    public a(AccessToken accessToken0) {
        this(accessToken0.q(), h.f());
    }

    public a(String s, String s1) {
        if(F.P(s)) {
            s = null;
        }
        this.f = s;
        this.g = s1;
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof a ? F.a(((a)object0).f, this.f) && F.a(((a)object0).g, this.g) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.f == null ? 0 : this.f.hashCode();
        String s = this.g;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 ^ v;
    }

    private Object writeReplace() {
        return new b(this.f, this.g, null);
    }
}

