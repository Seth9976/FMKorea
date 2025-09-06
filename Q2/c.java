package q2;

import android.text.TextUtils;
import g2.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import n2.a;
import n2.b;
import org.json.JSONObject;

class c implements k {
    private final String a;
    private final b b;
    private final f c;

    public c(String s, b b0) {
        this(s, b0, f.f());
    }

    c(String s, b b0, f f0) {
        if(s == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = f0;
        this.b = b0;
        this.a = s;
    }

    @Override  // q2.k
    public JSONObject a(j j0, boolean z) {
        if(z) {
            try {
                Map map0 = this.f(j0);
                a a0 = this.b(this.d(map0), j0);
                this.c.b("Requesting settings from " + this.a);
                this.c.i("Settings query params were: " + map0);
                return this.g(a0.c());
            }
            catch(IOException iOException0) {
                this.c.e("Settings request failed.", iOException0);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    private a b(a a0, j j0) {
        this.c(a0, "X-CRASHLYTICS-GOOGLE-APP-ID", j0.a);
        this.c(a0, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.c(a0, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.4.0");
        this.c(a0, "Accept", "application/json");
        this.c(a0, "X-CRASHLYTICS-DEVICE-MODEL", j0.b);
        this.c(a0, "X-CRASHLYTICS-OS-BUILD-VERSION", j0.c);
        this.c(a0, "X-CRASHLYTICS-OS-DISPLAY-VERSION", j0.d);
        this.c(a0, "X-CRASHLYTICS-INSTALLATION-ID", j0.e.a().c());
        return a0;
    }

    private void c(a a0, String s, String s1) {
        if(s1 != null) {
            a0.d(s, s1);
        }
    }

    // 去混淆评级： 低(20)
    protected a d(Map map0) {
        return this.b.a(this.a, map0).d("User-Agent", "Crashlytics Android SDK/18.4.0").d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    private JSONObject e(String s) {
        try {
            return new JSONObject(s);
        }
        catch(Exception exception0) {
            this.c.l("Failed to parse settings JSON from " + this.a, exception0);
            this.c.k("Settings response " + s);
            return null;
        }
    }

    private Map f(j j0) {
        Map map0 = new HashMap();
        map0.put("build_version", j0.h);
        map0.put("display_version", j0.g);
        map0.put("source", Integer.toString(j0.i));
        String s = j0.f;
        if(!TextUtils.isEmpty(s)) {
            map0.put("instance", s);
        }
        return map0;
    }

    JSONObject g(n2.c c0) {
        int v = c0.b();
        this.c.i("Settings response code was: " + v);
        if(this.h(v)) {
            return this.e(c0.a());
        }
        this.c.d("Settings request failed; (status: " + v + ") from " + this.a);
        return null;
    }

    boolean h(int v) {
        return v == 200 || v == 201 || v == 202 || v == 203;
    }
}

