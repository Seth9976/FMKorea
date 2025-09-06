package com.facebook.internal;

import com.facebook.FacebookRequestError.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import l3.m;
import l3.r;
import m3.F;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.g;

public final class h {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final h a(JSONArray jSONArray0) {
            if(jSONArray0 == null) {
                return null;
            }
            int v = jSONArray0.length();
            Map map0 = null;
            Map map1 = null;
            Map map2 = null;
            String s = null;
            String s1 = null;
            String s2 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v1);
                if(jSONObject0 != null) {
                    String s3 = jSONObject0.optString("name");
                    if(s3 != null) {
                        if(G3.h.n(s3, "other", true)) {
                            s = jSONObject0.optString("recovery_message", null);
                            map0 = this.d(jSONObject0);
                        }
                        else if(G3.h.n(s3, "transient", true)) {
                            s1 = jSONObject0.optString("recovery_message", null);
                            map1 = this.d(jSONObject0);
                        }
                        else if(G3.h.n(s3, "login_recoverable", true)) {
                            s2 = jSONObject0.optString("recovery_message", null);
                            map2 = this.d(jSONObject0);
                        }
                    }
                }
            }
            return new h(map0, map1, map2, s, s1, s2);
        }

        public final h b() {
            synchronized(this) {
                if(h.g == null) {
                    h.g = h.h.c();
                }
                h h0 = h.g;
                if(h0 != null) {
                    return h0;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
        }

        private final h c() {
            return new h(null, F.j(new m[]{r.a(2, null), r.a(4, null), r.a(9, null), r.a(17, null), r.a(341, null)}), F.j(new m[]{r.a(102, null), r.a(190, null), r.a(412, null)}), null, null, null);
        }

        private final Map d(JSONObject jSONObject0) {
            HashSet hashSet0;
            JSONArray jSONArray0 = jSONObject0.optJSONArray("items");
            if(jSONArray0.length() == 0) {
                return null;
            }
            Map map0 = new HashMap();
            int v = jSONArray0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                if(jSONObject1 != null) {
                    int v2 = jSONObject1.optInt("code");
                    if(v2 != 0) {
                        JSONArray jSONArray1 = jSONObject1.optJSONArray("subcodes");
                        if(jSONArray1 == null || jSONArray1.length() <= 0) {
                            hashSet0 = null;
                        }
                        else {
                            hashSet0 = new HashSet();
                            int v3 = jSONArray1.length();
                            for(int v4 = 0; v4 < v3; ++v4) {
                                int v5 = jSONArray1.optInt(v4);
                                if(v5 != 0) {
                                    hashSet0.add(v5);
                                }
                            }
                        }
                        map0.put(v2, hashSet0);
                    }
                }
            }
            return map0;
        }
    }

    private final Map a;
    private final Map b;
    private final Map c;
    private final String d;
    private final String e;
    private final String f;
    private static h g;
    public static final a h;

    static {
        h.h = new a(null);
    }

    public h(Map map0, Map map1, Map map2, String s, String s1, String s2) {
        this.a = map0;
        this.b = map1;
        this.c = map2;
        this.d = s;
        this.e = s1;
        this.f = s2;
    }

    public final b c(int v, int v1, boolean z) {
        if(z) {
            return b.h;
        }
        if(this.a != null && this.a.containsKey(v)) {
            Set set0 = (Set)this.a.get(v);
            if(set0 == null || set0.contains(v1)) {
                return b.g;
            }
        }
        if(this.c != null && this.c.containsKey(v)) {
            Set set1 = (Set)this.c.get(v);
            if(set1 == null || set1.contains(v1)) {
                return b.f;
            }
        }
        if(this.b != null && this.b.containsKey(v)) {
            Set set2 = (Set)this.b.get(v);
            return set2 != null && !set2.contains(v1) ? b.g : b.h;
        }
        return b.g;
    }

    public static final h d() {
        synchronized(h.class) {
            return h.h.b();
        }
    }

    public final String e(b facebookRequestError$b0) {
        if(facebookRequestError$b0 != null) {
            switch(facebookRequestError$b0) {
                case 1: {
                    return this.d;
                }
                case 2: {
                    return this.f;
                }
                case 3: {
                    return this.e;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }
}

