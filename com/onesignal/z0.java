package com.onesignal;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;
import z3.k;

public final class Z0 {
    private final Context a;
    private final JSONObject b;

    public Z0(Context context0, JSONObject jSONObject0) {
        k.e(context0, "context");
        k.e(jSONObject0, "fcmPayload");
        super();
        this.a = context0;
        this.b = jSONObject0;
    }

    public final boolean a() {
        return Y0.a.a(this.a) && this.b() == null;
    }

    public final Uri b() {
        Y0 y00 = Y0.a;
        if(!y00.a(this.a)) {
            return null;
        }
        if(y00.b(this.a)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(this.b.optString("custom"));
        if(jSONObject0.has("u")) {
            String s = jSONObject0.optString("u");
            if(!k.a(s, "")) {
                k.d(s, "url");
                int v = s.length() - 1;
                int v1 = 0;
                boolean z = false;
                while(v1 <= v) {
                    boolean z1 = k.f(s.charAt((z ? v : v1)), 0x20) <= 0;
                    if(z) {
                        if(!z1) {
                            break;
                        }
                        --v;
                    }
                    else if(z1) {
                        ++v1;
                    }
                    else {
                        z = true;
                    }
                }
                return Uri.parse(s.subSequence(v1, v + 1).toString());
            }
        }
        return null;
    }
}

