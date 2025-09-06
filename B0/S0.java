package B0;

import I0.h;
import I0.l;
import android.text.TextUtils;
import android.util.Log;
import co.median.android.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class s0 {
    private final h a;
    private final Map b;
    private final List c;
    private static final String d = "B0.s0";

    static {
    }

    public s0(h h0) {
        this.b = new HashMap();
        this.c = new ArrayList();
        this.a = h0;
    }

    public boolean a(String s) {
        return this.c.contains(s);
    }

    public void b(String s, JSONObject jSONObject0) {
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(this.c.contains(s)) {
                this.c(s, jSONObject0);
            }
            else {
                this.b.put(s, jSONObject0);
            }
        }
    }

    private void c(String s, JSONObject jSONObject0) {
        if(this.a != null && ((MainActivity)this.a).y2()) {
            try {
                String s1 = l.b(s, jSONObject0);
                this.a.a(s1);
            }
            catch(Exception exception0) {
                Log.d("B0.s0", "launchCallbackEvent: ", exception0);
            }
        }
    }

    public void d(String s) {
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            this.c.add(s);
            if(this.b.containsKey(s)) {
                this.c(s, ((JSONObject)this.b.remove(s)));
            }
        }
    }

    public void e(String s) {
        this.c.remove(s);
    }
}

