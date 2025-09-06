package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.facebook.internal.F;
import com.facebook.internal.h;
import com.facebook.internal.p;
import com.facebook.internal.r;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    static final class a implements Parcelable.Creator {
        public FacebookRequestError a(Parcel parcel0) {
            return new FacebookRequestError(parcel0, null);
        }

        public FacebookRequestError[] b(int v) {
            return new FacebookRequestError[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static enum b {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

    }

    static class c {
        private final int a;
        private final int b;

        private c(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        c(int v, int v1, a facebookRequestError$a0) {
            this(v, v1);
        }

        boolean a(int v) {
            return this.a <= v && v <= this.b;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final b f;
    private final int g;
    private final int h;
    private final int i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final JSONObject o;
    private final JSONObject p;
    private final Object q;
    private final HttpURLConnection r;
    private final e s;
    static final c t;

    static {
        FacebookRequestError.t = new c(200, 299, null);
        FacebookRequestError.CREATOR = new a();
    }

    private FacebookRequestError(int v, int v1, int v2, String s, String s1, String s2, String s3, boolean z, JSONObject jSONObject0, JSONObject jSONObject1, Object object0, HttpURLConnection httpURLConnection0, e e0) {
        boolean z1;
        this.g = v;
        this.h = v1;
        this.i = v2;
        this.j = s;
        this.k = s1;
        this.p = jSONObject0;
        this.o = jSONObject1;
        this.q = object0;
        this.r = httpURLConnection0;
        this.l = s2;
        this.m = s3;
        if(e0 == null) {
            this.s = new j(this, s1);
            z1 = false;
        }
        else {
            this.s = e0;
            z1 = true;
        }
        h h0 = FacebookRequestError.b();
        b facebookRequestError$b0 = z1 ? b.g : h0.c(v1, v2, z);
        this.f = facebookRequestError$b0;
        this.n = h0.e(facebookRequestError$b0);
    }

    public FacebookRequestError(int v, String s, String s1) {
        this(-1, v, -1, s, s1, null, null, false, null, null, null, null, null);
    }

    private FacebookRequestError(Parcel parcel0) {
        this(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), false, null, null, null, null, null);
    }

    FacebookRequestError(Parcel parcel0, a facebookRequestError$a0) {
        this(parcel0);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection0, Exception exception0) {
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection0, (exception0 instanceof e ? ((e)exception0) : new e(exception0)));
    }

    static FacebookRequestError a(JSONObject jSONObject0, Object object0, HttpURLConnection httpURLConnection0) {
        String s3;
        String s2;
        String s1;
        String s;
        int v2;
        int v1;
        boolean z1;
        try {
            if(jSONObject0.has("code")) {
                boolean z = false;
                int v = jSONObject0.getInt("code");
                Object object1 = F.C(jSONObject0, "body", "FACEBOOK_NON_JSON_RESULT");
                if(object1 != null && object1 instanceof JSONObject) {
                    if(((JSONObject)object1).has("error")) {
                        JSONObject jSONObject1 = (JSONObject)F.C(((JSONObject)object1), "error", null);
                        String s6 = jSONObject1.optString("type", null);
                        String s7 = jSONObject1.optString("message", null);
                        v1 = jSONObject1.optInt("code", -1);
                        int v4 = jSONObject1.optInt("error_subcode", -1);
                        s2 = jSONObject1.optString("error_user_msg", null);
                        s3 = jSONObject1.optString("error_user_title", null);
                        z1 = jSONObject1.optBoolean("is_transient", false);
                        z = true;
                        s = s6;
                        s1 = s7;
                        v2 = v4;
                    }
                    else if(!((JSONObject)object1).has("error_code") && (!((JSONObject)object1).has("error_msg") && !((JSONObject)object1).has("error_reason"))) {
                        z1 = false;
                        v1 = -1;
                        v2 = -1;
                        s = null;
                        s1 = null;
                        s2 = null;
                        s3 = null;
                    }
                    else {
                        String s4 = ((JSONObject)object1).optString("error_reason", null);
                        String s5 = ((JSONObject)object1).optString("error_msg", null);
                        int v3 = ((JSONObject)object1).optInt("error_code", -1);
                        v2 = ((JSONObject)object1).optInt("error_subcode", -1);
                        s1 = s5;
                        z1 = false;
                        s2 = null;
                        s3 = null;
                        v1 = v3;
                        s = s4;
                        z = true;
                    }
                    if(z) {
                        return new FacebookRequestError(v, v1, v2, s, s1, s3, s2, z1, ((JSONObject)object1), jSONObject0, object0, httpURLConnection0, null);
                    }
                }
                return FacebookRequestError.t.a(v) ? null : new FacebookRequestError(v, -1, -1, null, null, null, null, false, (jSONObject0.has("body") ? ((JSONObject)F.C(jSONObject0, "body", "FACEBOOK_NON_JSON_RESULT")) : null), jSONObject0, object0, httpURLConnection0, null);
            }
        }
        catch(JSONException unused_ex) {
        }
        return null;
    }

    static h b() {
        p p0;
        synchronized(FacebookRequestError.class) {
            p0 = r.j(com.facebook.h.f());
            if(p0 == null) {
                return h.d();
            }
        }
        return p0.c();
    }

    public int c() {
        return this.h;
    }

    public String d() {
        return this.k == null ? this.s.getLocalizedMessage() : this.k;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.j;
    }

    public e f() {
        return this.s;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.i;
    }

    @Override
    public String toString() {
        return "{HttpStatus: " + this.g + ", errorCode: " + this.h + ", subErrorCode: " + this.i + ", errorType: " + this.j + ", errorMessage: " + this.d() + "}";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.g);
        parcel0.writeInt(this.h);
        parcel0.writeInt(this.i);
        parcel0.writeString(this.j);
        parcel0.writeString(this.k);
        parcel0.writeString(this.l);
        parcel0.writeString(this.m);
    }
}

