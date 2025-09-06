package O0;

import org.json.JSONObject;

public final class c {
    public static enum a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int f;

        private a(int v1) {
            this.f = v1;
        }

        public int b() {
            return this.f;
        }
    }

    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    c(JSONObject jSONObject0) {
        this.a = jSONObject0.getString("class_name");
        this.b = jSONObject0.optInt("index", -1);
        this.c = jSONObject0.optInt("id");
        this.d = jSONObject0.optString("text");
        this.e = jSONObject0.optString("tag");
        this.f = jSONObject0.optString("description");
        this.g = jSONObject0.optString("hint");
        this.h = jSONObject0.optInt("match_bitmask");
    }
}

