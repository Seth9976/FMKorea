package com.onesignal;

import org.json.JSONObject;

class y1 {
    public static enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");

        private String f;

        private a(String s1) {
            this.f = s1;
        }

        public static a b(String s) {
            a[] arr_y1$a = a.values();
            for(int v = 0; v < arr_y1$a.length; ++v) {
                a y1$a0 = arr_y1$a[v];
                if(y1$a0.f.equalsIgnoreCase(s)) {
                    return y1$a0;
                }
            }
            return a.j;
        }

        @Override
        public String toString() {
            return this.f;
        }
    }

    public static enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");

        private String f;

        private b(String s1) {
            this.f = s1;
        }

        public boolean b() [...] // 潜在的解密器

        public static b f(String s) {
            b[] arr_y1$b = b.values();
            for(int v = 0; v < arr_y1$b.length; ++v) {
                b y1$b0 = arr_y1$b[v];
                if(y1$b0.f.equalsIgnoreCase(s)) {
                    return y1$b0;
                }
            }
            return b.i;
        }

        @Override
        public String toString() {
            return this.f;
        }
    }

    String a;
    public a b;
    public String c;
    public b d;
    public Object e;

    y1(JSONObject jSONObject0) {
        this.a = jSONObject0.getString("id");
        this.b = a.b(jSONObject0.getString("kind"));
        this.c = jSONObject0.optString("property", null);
        this.d = b.f(jSONObject0.getString("operator"));
        this.e = jSONObject0.opt("value");
    }

    @Override
    public String toString() {
        return "OSTrigger{triggerId=\'" + this.a + '\'' + ", kind=" + this.b + ", property=\'" + this.c + '\'' + ", operatorType=" + this.d + ", value=" + this.e + '}';
    }
}

