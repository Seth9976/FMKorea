package q2;

import j2.t;
import org.json.JSONObject;

class b implements h {
    @Override  // q2.h
    public d a(t t0, JSONObject jSONObject0) {
        return b.b(t0);
    }

    static d b(t t0) {
        q2.d.b d$b0 = new q2.d.b(8, 4);
        a d$a0 = new a(true, false, false);
        return new d(t0.a() + 3600000L, d$b0, d$a0, 0, 3600, 10.0, 1.2, 60);
    }
}

