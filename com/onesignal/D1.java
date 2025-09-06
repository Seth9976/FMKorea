package com.onesignal;

import e3.c;
import h3.b;
import h3.d;
import org.json.JSONArray;
import org.json.JSONObject;

public class d1 {
    private c a;
    private JSONArray b;
    private String c;
    private long d;
    private Float e;

    public d1(c c0, JSONArray jSONArray0, String s, long v, float f) {
        this.a = c0;
        this.b = jSONArray0;
        this.c = s;
        this.d = v;
        this.e = f;
    }

    public static d1 a(b b0) {
        c c0 = c.i;
        if(b0.b() != null) {
            d d0 = b0.b();
            if(d0.a() != null && d0.a().b() != null && d0.a().b().length() > 0) {
                return new d1(c.g, d0.a().b(), b0.a(), b0.c(), b0.d());
            }
            return d0.b() == null || d0.b().b() == null || d0.b().b().length() <= 0 ? new d1(c0, null, b0.a(), b0.c(), b0.d()) : new d1(c.h, d0.b().b(), b0.a(), b0.c(), b0.d());
        }
        return new d1(c0, null, b0.a(), b0.c(), b0.d());
    }

    public c b() {
        return this.a;
    }

    public JSONObject c() {
        JSONObject jSONObject0 = new JSONObject();
        if(this.b != null && this.b.length() > 0) {
            jSONObject0.put("notification_ids", this.b);
        }
        jSONObject0.put("id", this.c);
        if(((float)this.e) > 0.0f) {
            jSONObject0.put("weight", this.e);
        }
        long v = this.d;
        if(v > 0L) {
            jSONObject0.put("timestamp", v);
        }
        return jSONObject0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (this.a.equals(((d1)object0).a) && this.b.equals(((d1)object0).b) && this.c.equals(((d1)object0).c) && this.d == ((d1)object0).d && this.e.equals(((d1)object0).e));
    }

    @Override
    public int hashCode() {
        Object[] arr_object = {this.a, this.b, this.c, this.d, this.e};
        int v = 1;
        for(int v1 = 0; v1 < 5; ++v1) {
            Object object0 = arr_object[v1];
            v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    @Override
    public String toString() {
        return "OutcomeEvent{session=" + this.a + ", notificationIds=" + this.b + ", name=\'" + this.c + '\'' + ", timestamp=" + this.d + ", weight=" + this.e + '}';
    }
}

