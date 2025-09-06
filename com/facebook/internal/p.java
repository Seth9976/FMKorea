package com.facebook.internal;

import G3.h;
import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import m3.o;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.g;
import z3.k;

public final class p {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final class b {
        public static final class com.facebook.internal.p.b.a {
            private com.facebook.internal.p.b.a() {
            }

            public com.facebook.internal.p.b.a(g g0) {
            }

            public final b a(JSONObject jSONObject0) {
                k.e(jSONObject0, "dialogConfigJSON");
                String s = jSONObject0.optString("name");
                Uri uri0 = null;
                if(F.P(s)) {
                    return null;
                }
                k.d(s, "dialogNameWithFeature");
                List list0 = h.Y(s, new String[]{"|"}, false, 0, 6, null);
                if(list0.size() != 2) {
                    return null;
                }
                Object object0 = o.r(list0);
                Object object1 = o.x(list0);
                if(!F.P(((String)object0)) && !F.P(((String)object1))) {
                    String s1 = jSONObject0.optString("url");
                    if(!F.P(s1)) {
                        uri0 = Uri.parse(s1);
                    }
                    return new b(((String)object0), ((String)object1), uri0, this.b(jSONObject0.optJSONArray("versions")), null);
                }
                return null;
            }

            private final int[] b(JSONArray jSONArray0) {
                if(jSONArray0 != null) {
                    int v = jSONArray0.length();
                    int[] arr_v = new int[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        int v2 = -1;
                        int v3 = jSONArray0.optInt(v1, -1);
                        if(v3 == -1) {
                            String s = jSONArray0.optString(v1);
                            if(!F.P(s)) {
                                try {
                                    k.d(s, "versionString");
                                    v2 = Integer.parseInt(s);
                                }
                                catch(NumberFormatException numberFormatException0) {
                                    F.U("FacebookSDK", numberFormatException0);
                                }
                                v3 = v2;
                            }
                        }
                        arr_v[v1] = v3;
                    }
                    return arr_v;
                }
                return null;
            }
        }

        private final String a;
        private final String b;
        private final Uri c;
        private final int[] d;
        public static final com.facebook.internal.p.b.a e;

        static {
            b.e = new com.facebook.internal.p.b.a(null);
        }

        private b(String s, String s1, Uri uri0, int[] arr_v) {
            this.a = s;
            this.b = s1;
            this.c = uri0;
            this.d = arr_v;
        }

        public b(String s, String s1, Uri uri0, int[] arr_v, g g0) {
            this(s, s1, uri0, arr_v);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    private final boolean a;
    private final String b;
    private final boolean c;
    private final int d;
    private final EnumSet e;
    private final Map f;
    private final boolean g;
    private final com.facebook.internal.h h;
    private final String i;
    private final String j;
    private final boolean k;
    private final boolean l;
    private final JSONArray m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final String q;
    private final String r;
    private final String s;
    public static final a t;

    static {
        p.t = new a(null);
    }

    public p(boolean z, String s, boolean z1, int v, EnumSet enumSet0, Map map0, boolean z2, com.facebook.internal.h h0, String s1, String s2, boolean z3, boolean z4, JSONArray jSONArray0, String s3, boolean z5, boolean z6, String s4, String s5, String s6) {
        k.e(s, "nuxContent");
        k.e(enumSet0, "smartLoginOptions");
        k.e(map0, "dialogConfigurations");
        k.e(h0, "errorClassification");
        k.e(s1, "smartLoginBookmarkIconURL");
        k.e(s2, "smartLoginMenuIconURL");
        k.e(s3, "sdkUpdateMessage");
        super();
        this.a = z;
        this.b = s;
        this.c = z1;
        this.d = v;
        this.e = enumSet0;
        this.f = map0;
        this.g = z2;
        this.h = h0;
        this.i = s1;
        this.j = s2;
        this.k = z3;
        this.l = z4;
        this.m = jSONArray0;
        this.n = s3;
        this.o = z5;
        this.p = z6;
        this.q = s4;
        this.r = s5;
        this.s = s6;
    }

    public final boolean a() {
        return this.g;
    }

    public final boolean b() {
        return this.l;
    }

    public final com.facebook.internal.h c() {
        return this.h;
    }

    public final JSONArray d() {
        return this.m;
    }

    public final boolean e() {
        return this.k;
    }

    public final String f() {
        return this.q;
    }

    public final String g() {
        return this.s;
    }

    public final String h() {
        return this.n;
    }

    public final int i() {
        return this.d;
    }

    public final EnumSet j() {
        return this.e;
    }

    public final String k() {
        return this.r;
    }

    public final boolean l() {
        return this.a;
    }
}

