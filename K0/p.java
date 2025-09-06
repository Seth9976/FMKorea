package K0;

import I0.a;
import I0.v;
import java.util.Locale;
import org.json.JSONObject;
import z3.g;
import z3.k;

public final class p {
    private final boolean a;
    private final j b;
    private Integer c;
    private Integer d;

    public p() {
        this(false, null, null, null, 15, null);
    }

    public p(JSONObject jSONObject0) {
        k.e(jSONObject0, "params");
        boolean z = jSONObject0.optBoolean("animated", false);
        String s = jSONObject0.optString("animationLoop", "infinite");
        k.d(s, "params.optString(\"animationLoop\", \"infinite\")");
        String s1 = s.toUpperCase(Locale.ROOT);
        k.d(s1, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        this(z, j.valueOf(s1), v.d(a.c0(jSONObject0, "backgroundColor")), v.d(a.c0(jSONObject0, "backgroundColorDark")));
    }

    public p(boolean z, j j0, Integer integer0, Integer integer1) {
        k.e(j0, "loop");
        super();
        this.a = z;
        this.b = j0;
        this.c = integer0;
        this.d = integer1;
    }

    public p(boolean z, j j0, Integer integer0, Integer integer1, int v, g g0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            j0 = j.g;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        if((v & 8) != 0) {
            integer1 = null;
        }
        this(z, j0, integer0, integer1);
    }

    public final Integer a() {
        return this.c;
    }

    public final Integer b() {
        return this.d;
    }

    public final boolean c() {
        return this.a;
    }

    public final void d(Integer integer0) {
        this.c = integer0;
    }

    public final void e(Integer integer0) {
        this.d = integer0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(this.a != ((p)object0).a) {
            return false;
        }
        if(this.b != ((p)object0).b) {
            return false;
        }
        return k.a(this.c, ((p)object0).c) ? k.a(this.d, ((p)object0).d) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        if(v) {
            v = 1;
        }
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Integer integer0 = this.d;
        if(integer0 != null) {
            v2 = integer0.hashCode();
        }
        return ((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v2;
    }

    @Override
    public String toString() {
        return "SplashScreenConfig(animated=" + this.a + ", loop=" + this.b + ", backgroundColor=" + this.c + ", backgroundColorDark=" + this.d + ")";
    }
}

