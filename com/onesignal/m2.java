package com.onesignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class m2 {
    private String a;
    private JSONObject b;
    private JSONObject c;
    private static final Object d;
    private static final String[] e;
    private static final Set f;

    static {
        m2.d = new Object();
        String[] arr_s = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        m2.e = arr_s;
        m2.f = new HashSet(Arrays.asList(arr_s));
    }

    m2(String s, boolean z) {
        this.a = s;
        if(z) {
            this.n();
            return;
        }
        this.b = new JSONObject();
        this.c = new JSONObject();
    }

    protected abstract void a();

    void b() {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("lat", null);
            hashMap0.put("long", null);
            hashMap0.put("loc_acc", null);
            hashMap0.put("loc_type", null);
            hashMap0.put("loc_bg", null);
            hashMap0.put("loc_time_stamp", null);
            this.u(this.c, hashMap0);
            HashMap hashMap1 = new HashMap();
            hashMap1.put("loc_bg", null);
            hashMap1.put("loc_time_stamp", null);
            this.u(this.b, hashMap1);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    m2 c(String s) {
        m2 m20 = this.p(s);
        try {
            m20.b = this.j();
            m20.c = this.m();
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return m20;
    }

    JSONObject d(m2 m20, boolean z) {
        this.a();
        m20.a();
        Set set0 = this.k(m20);
        JSONObject jSONObject0 = m2.e(this.c, m20.c, null, set0);
        if(!z && jSONObject0.toString().equals("{}")) {
            return null;
        }
        try {
            if(!jSONObject0.has("app_id")) {
                jSONObject0.put("app_id", this.c.optString("app_id"));
            }
            if(this.c.has("email_auth_hash")) {
                jSONObject0.put("email_auth_hash", this.c.optString("email_auth_hash"));
            }
            if(this.c.has("sms_auth_hash")) {
                jSONObject0.put("sms_auth_hash", this.c.optString("sms_auth_hash"));
            }
            if(this.c.has("external_user_id_auth_hash") && !jSONObject0.has("external_user_id_auth_hash")) {
                jSONObject0.put("external_user_id_auth_hash", this.c.optString("external_user_id_auth_hash"));
                return jSONObject0;
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return jSONObject0;
    }

    private static JSONObject e(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, Set set0) {
        synchronized(m2.d) {
        }
        return G.b(jSONObject0, jSONObject1, jSONObject2, set0);
    }

    JSONObject f(m2 m20, Set set0) {
        synchronized(m2.d) {
        }
        return G.b(this.b, m20.b, null, set0);
    }

    JSONObject g(JSONObject jSONObject0, Set set0) {
        synchronized(m2.d) {
        }
        return G.b(this.b, jSONObject0, this.b, set0);
    }

    JSONObject h(JSONObject jSONObject0, Set set0) {
        synchronized(m2.d) {
        }
        return G.b(this.c, jSONObject0, this.c, set0);
    }

    public D i() {
        try {
            return new D(this.j());
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
            return new D();
        }
    }

    JSONObject j() {
        synchronized(m2.d) {
        }
        return new JSONObject(this.b.toString());
    }

    private Set k(m2 m20) {
        try {
            if(this.b.optLong("loc_time_stamp") != m20.b.getLong("loc_time_stamp")) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("loc_bg", m20.b.opt("loc_bg"));
                hashMap0.put("loc_time_stamp", m20.b.opt("loc_time_stamp"));
                this.u(m20.c, hashMap0);
                return m2.f;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public D l() {
        try {
            return new D(this.m());
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
            return new D();
        }
    }

    public JSONObject m() {
        synchronized(m2.d) {
        }
        return new JSONObject(this.c.toString());
    }

    private void n() {
        boolean z;
        String s = S1.f("I1", "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.a, null);
        if(s == null) {
            int v = 1;
            this.x(new JSONObject());
            try {
                int v1 = this.a.equals("CURRENT_STATE") ? S1.c("I1", "ONESIGNAL_SUBSCRIPTION", 1) : S1.c("I1", "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                if(v1 == -2) {
                    z = false;
                }
                else {
                    v = v1;
                    z = true;
                }
                HashMap hashMap0 = new HashMap();
                hashMap0.put("subscribableStatus", v);
                hashMap0.put("userSubscribePref", Boolean.valueOf(z));
                this.u(this.b, hashMap0);
            }
            catch(JSONException unused_ex) {
            }
        }
        else {
            try {
                this.x(new JSONObject(s));
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
        }
        String s1 = S1.f("I1", "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.a, null);
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(s1 == null) {
                jSONObject0.put("identifier", S1.f("I1", "GT_REGISTRATION_ID", null));
            }
            else {
                jSONObject0 = new JSONObject(s1);
            }
        }
        catch(JSONException jSONException1) {
            jSONException1.printStackTrace();
        }
        this.z(jSONObject0);
    }

    void o(JSONObject jSONObject0, JSONObject jSONObject1) {
        JSONObject jSONObject3;
        JSONObject jSONObject2;
        if(!jSONObject0.has("tags")) {
            return;
        }
        try {
            jSONObject2 = this.m();
            if(!jSONObject2.has("tags")) {
                jSONObject3 = new JSONObject();
                goto label_9;
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
            return;
        }
        try {
            jSONObject3 = new JSONObject(jSONObject2.optString("tags"));
            goto label_9;
        }
        catch(JSONException unused_ex) {
            try {
                jSONObject3 = new JSONObject();
            label_9:
                JSONObject jSONObject4 = jSONObject0.optJSONObject("tags");
                Iterator iterator0 = jSONObject4.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    if("".equals(jSONObject4.optString(s))) {
                        jSONObject3.remove(s);
                    }
                    else if(jSONObject1 == null || !jSONObject1.has(s)) {
                        jSONObject3.put(s, jSONObject4.optString(s));
                    }
                }
                Object object1 = m2.d;
                synchronized(object1) {
                    if(jSONObject3.toString().equals("{}")) {
                        this.c.remove("tags");
                    }
                    else {
                        this.c.put("tags", jSONObject3);
                    }
                }
                return;
            }
            catch(JSONException jSONException0) {
            }
        }
        jSONException0.printStackTrace();
    }

    abstract m2 p(String arg1);

    void q() {
        synchronized(m2.d) {
            try {
                if(this.c.has("external_user_id_auth_hash")) {
                    if(this.c.has("external_user_id") && this.c.get("external_user_id").toString() == "") {
                        this.c.remove("external_user_id_auth_hash");
                    }
                    else if(!this.c.has("external_user_id")) {
                        this.c.remove("external_user_id_auth_hash");
                    }
                }
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
        }
        S1.m("I1", "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.a, this.c.toString());
        S1.m("I1", "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.a, this.b.toString());
    }

    void r(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 != null) {
            m2.e(this.b, jSONObject0, this.b, null);
        }
        if(jSONObject1 != null) {
            m2.e(this.c, jSONObject1, this.c, null);
            this.o(jSONObject1, null);
        }
        if(jSONObject0 != null || jSONObject1 != null) {
            this.q();
        }
    }

    void s(String s, Object object0) {
        synchronized(m2.d) {
            this.b.put(s, object0);
        }
    }

    void t(String s, Object object0) {
        synchronized(m2.d) {
            this.c.put(s, object0);
        }
    }

    @Override
    public String toString() {
        return "UserState{persistKey=\'" + this.a + '\'' + ", dependValues=" + this.b + ", syncValues=" + this.c + '}';
    }

    private void u(JSONObject jSONObject0, HashMap hashMap0) {
        synchronized(m2.d) {
            for(Object object1: hashMap0.entrySet()) {
                jSONObject0.put(((String)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue());
            }
        }
    }

    void v(String s) {
        synchronized(m2.d) {
            this.b.remove(s);
        }
    }

    void w(String s) {
        synchronized(m2.d) {
            this.c.remove(s);
        }
    }

    public void x(JSONObject jSONObject0) {
        synchronized(m2.d) {
            this.b = jSONObject0;
        }
    }

    void y(d n$d0) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("lat", n$d0.a);
            hashMap0.put("long", n$d0.b);
            hashMap0.put("loc_acc", n$d0.c);
            hashMap0.put("loc_type", n$d0.d);
            this.u(this.c, hashMap0);
            HashMap hashMap1 = new HashMap();
            hashMap1.put("loc_bg", n$d0.e);
            hashMap1.put("loc_time_stamp", n$d0.f);
            this.u(this.b, hashMap1);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    public void z(JSONObject jSONObject0) {
        synchronized(m2.d) {
            this.c = jSONObject0;
        }
    }
}

