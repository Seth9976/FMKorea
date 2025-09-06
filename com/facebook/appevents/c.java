package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.e;
import com.facebook.internal.F;
import com.facebook.internal.v;
import com.facebook.q;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class c implements Serializable {
    static abstract class a {
    }

    static abstract class b implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

    }

    static class com.facebook.appevents.c.c implements Serializable {
        private final String f;
        private final boolean g;
        private final boolean h;
        private final String i;
        private static final long serialVersionUID = 20160803001L;

        private com.facebook.appevents.c.c(String s, boolean z, boolean z1, String s1) {
            this.f = s;
            this.g = z;
            this.h = z1;
            this.i = s1;
        }

        com.facebook.appevents.c.c(String s, boolean z, boolean z1, String s1, a c$a0) {
            this(s, z, z1, s1);
        }

        private Object readResolve() {
            return new c(this.f, this.g, this.h, this.i, null);
        }
    }

    private final JSONObject f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final String j;
    private static final HashSet k = null;
    private static final long serialVersionUID = 1L;

    static {
        c.k = new HashSet();
    }

    public c(String s, String s1, Double double0, Bundle bundle0, boolean z, boolean z1, UUID uUID0) {
        this.g = z;
        this.h = z1;
        this.i = s1;
        this.f = this.d(s, s1, double0, bundle0, uUID0);
        this.j = this.a();
    }

    private c(String s, boolean z, boolean z1, String s1) {
        JSONObject jSONObject0 = new JSONObject(s);
        this.f = jSONObject0;
        this.g = z;
        this.i = jSONObject0.optString("_eventName");
        this.j = s1;
        this.h = z1;
    }

    c(String s, boolean z, boolean z1, String s1, a c$a0) {
        this(s, z, z1, s1);
    }

    private String a() {
        return c.g(this.f.toString());
    }

    public boolean b() {
        return this.g;
    }

    public JSONObject c() {
        return this.f;
    }

    private JSONObject d(String s, String s1, Double double0, Bundle bundle0, UUID uUID0) {
        c.h(s1);
        JSONObject jSONObject0 = new JSONObject();
        String s2 = V0.a.e(s1);
        jSONObject0.put("_eventName", s2);
        jSONObject0.put("_eventName_md5", c.g(s2));
        jSONObject0.put("_logTime", System.currentTimeMillis() / 1000L);
        jSONObject0.put("_ui", s);
        if(uUID0 != null) {
            jSONObject0.put("_session_id", uUID0);
        }
        if(bundle0 != null) {
            Map map0 = this.i(bundle0);
            for(Object object0: map0.keySet()) {
                jSONObject0.put(((String)object0), map0.get(((String)object0)));
            }
        }
        if(double0 != null) {
            jSONObject0.put("_valueToSum", ((double)double0));
        }
        if(this.h) {
            jSONObject0.put("_inBackground", "1");
        }
        if(this.g) {
            jSONObject0.put("_implicitlyLogged", "1");
            return jSONObject0;
        }
        v.i(q.j, "AppEvents", "Created app event \'%s\'", new Object[]{jSONObject0.toString()});
        return jSONObject0;
    }

    public String e() {
        return this.i;
    }

    public boolean f() {
        return this.j == null ? true : this.a().equals(this.j);
    }

    private static String g(String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            byte[] arr_b = s.getBytes("UTF-8");
            messageDigest0.update(arr_b, 0, arr_b.length);
            return S0.b.c(messageDigest0.digest());
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            F.U("Failed to generate checksum: ", noSuchAlgorithmException0);
            return "0";
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            F.U("Failed to generate checksum: ", unsupportedEncodingException0);
            return "1";
        }
    }

    private static void h(String s) {
        if(s != null && s.length() != 0 && s.length() <= 40) {
            HashSet hashSet0 = c.k;
            synchronized(hashSet0) {
                boolean z = hashSet0.contains(s);
            }
            if(!z) {
                if(!s.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                    throw new e(String.format("Skipping event named \'%s\' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", s));
                }
                synchronized(hashSet0) {
                    hashSet0.add(s);
                }
                return;
            }
            return;
        }
        if(s == null) {
            s = "<None Provided>";
        }
        throw new e(String.format(Locale.ROOT, "Identifier \'%s\' must be less than %d characters", s, 40));
    }

    private Map i(Bundle bundle0) {
        Map map0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            c.h(s);
            Object object1 = bundle0.get(s);
            if(!(object1 instanceof String) && !(object1 instanceof Number)) {
                throw new e(String.format("Parameter value \'%s\' for key \'%s\' should be a string or a numeric type.", object1, s));
            }
            map0.put(s, object1.toString());
        }
        R0.a.c(map0);
        V0.a.f(map0, this.i);
        P0.a.c(map0, this.i);
        return map0;
    }

    @Override
    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", this.f.optString("_eventName"), Boolean.valueOf(this.g), this.f.toString());
    }

    private Object writeReplace() {
        return new com.facebook.appevents.c.c(this.f.toString(), this.g, this.h, this.j, null);
    }
}

