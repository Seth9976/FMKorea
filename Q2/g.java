package q2;

import g2.f;
import j2.t;
import org.json.JSONObject;

public class g {
    private final t a;

    g(t t0) {
        this.a = t0;
    }

    private static h a(int v) {
        if(v != 3) {
            f.f().d("Could not determine SettingsJsonTransform for settings version " + v + ". Using default settings values.");
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject0) {
        return g.a(jSONObject0.getInt("settings_version")).a(this.a, jSONObject0);
    }
}

