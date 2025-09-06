package B0;

import I0.h;
import co.median.android.d;
import org.json.JSONObject;

public final class t implements Runnable {
    public final h f;
    public final String g;
    public final JSONObject h;

    public t(h h0, String s, JSONObject jSONObject0) {
        this.f = h0;
        this.g = s;
        this.h = jSONObject0;
    }

    @Override
    public final void run() {
        d.B(this.f, this.g, this.h);
    }
}

