package K0;

import I0.a;
import I0.v;
import org.json.JSONObject;
import z3.k;

public final class o {
    private final boolean a;
    private Integer b;
    private Integer c;

    public o() {
        this(false, null, null);
    }

    public o(JSONObject jSONObject0) {
        k.e(jSONObject0, "params");
        this(jSONObject0.optBoolean("animated", false), v.d(a.c0(jSONObject0, "indicatorColor")), v.d(a.c0(jSONObject0, "indicatorColorDark")));
    }

    public o(boolean z, Integer integer0, Integer integer1) {
        this.a = z;
        this.b = integer0;
        this.c = integer1;
    }

    public final Integer a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final void c(Integer integer0) {
        this.b = integer0;
    }

    public final void d(Integer integer0) {
        this.c = integer0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        if(this.a != ((o)object0).a) {
            return false;
        }
        return k.a(this.b, ((o)object0).b) ? k.a(this.c, ((o)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        if(v) {
            v = 1;
        }
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Integer integer0 = this.c;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return "SpinnerConfig(animated=" + this.a + ", progressColor=" + this.b + ", progressColorDark=" + this.c + ")";
    }
}

