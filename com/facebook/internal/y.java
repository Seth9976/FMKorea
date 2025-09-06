package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import z3.k;

public final class y {
    private static final ConcurrentHashMap a;
    public static final y b;

    static {
        y.b = new y();
        y.a = new ConcurrentHashMap();
    }

    public static final JSONObject a(String s) {
        k.e(s, "accessToken");
        return (JSONObject)y.a.get(s);
    }

    public static final void b(String s, JSONObject jSONObject0) {
        k.e(s, "key");
        k.e(jSONObject0, "value");
        y.a.put(s, jSONObject0);
    }
}

