package com.facebook.appevents;

import S0.c.b;
import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.F;
import com.facebook.internal.a;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class o {
    private List a;
    private List b;
    private int c;
    private a d;
    private String e;
    private final int f;
    private static final String g = "o";

    static {
    }

    public o(a a0, String s) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.f = 1000;
        this.d = a0;
        this.e = s;
    }

    public void a(c c0) {
        synchronized(this) {
            if(b1.a.d(this)) {
                return;
            }
            try {
                if(this.a.size() + this.b.size() >= this.e()) {
                    ++this.c;
                }
                else {
                    this.a.add(c0);
                }
            }
            catch(Throwable throwable0) {
                b1.a.b(throwable0, this);
            }
        }
    }

    public void b(boolean z) {
        synchronized(this) {
            if(b1.a.d(this)) {
                return;
            }
            try {
                if(z) {
                    this.a.addAll(this.b);
                }
                this.b.clear();
                this.c = 0;
                return;
            }
            catch(Throwable throwable0) {
            }
            b1.a.b(throwable0, this);
        }
    }

    public int c() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(b1.a.d(this)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return 0;
        }
        try {
            int v1 = this.a.size();
            FIN.finallyExec$NT(v);
            return v1;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            FIN.finallyExec$NT(v);
            return 0;
        }
    }

    public List d() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(b1.a.d(this)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            List list0 = this.a;
            this.a = new ArrayList();
            FIN.finallyExec$NT(v);
            return list0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            FIN.finallyExec$NT(v);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    protected int e() {
        return b1.a.d(this) ? 0 : 1000;
    }

    public int f(GraphRequest graphRequest0, Context context0, boolean z, boolean z1) {
        JSONArray jSONArray0;
        int v1;
        if(b1.a.d(this)) {
            return 0;
        }
        try {
            synchronized(this) {
                v1 = this.c;
                P0.a.d(this.a);
                this.b.addAll(this.a);
                this.a.clear();
                jSONArray0 = new JSONArray();
                for(Object object0: this.b) {
                    c c0 = (c)object0;
                    if(!c0.f()) {
                        F.V("o", "Event with invalid checksum: " + c0.toString());
                    }
                    else if(z || !c0.b()) {
                        jSONArray0.put(c0.c());
                    }
                }
                if(jSONArray0.length() == 0) {
                    return 0;
                }
            }
            this.g(graphRequest0, context0, v1, jSONArray0, z1);
            return jSONArray0.length();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return 0;
        }
    }

    private void g(GraphRequest graphRequest0, Context context0, int v, JSONArray jSONArray0, boolean z) {
        JSONObject jSONObject0;
        if(b1.a.d(this)) {
            return;
        }
        try {
            try {
                jSONObject0 = S0.c.a(b.g, this.d, this.e, z, context0);
                if(this.c > 0) {
                    jSONObject0.put("num_skipped_events", v);
                }
            }
            catch(JSONException unused_ex) {
                jSONObject0 = new JSONObject();
            }
            graphRequest0.X(jSONObject0);
            Bundle bundle0 = graphRequest0.y() == null ? new Bundle() : graphRequest0.y();
            String s = jSONArray0.toString();
            if(s != null) {
                bundle0.putString("custom_events", s);
                graphRequest0.b0(s);
            }
            graphRequest0.Z(bundle0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }
}

