package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.appevents.m;
import com.facebook.c;
import com.facebook.e;
import com.facebook.internal.F;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {
    Map f;
    protected LoginClient g;

    LoginMethodHandler(Parcel parcel0) {
        this.f = F.f0(parcel0);
    }

    LoginMethodHandler(LoginClient loginClient0) {
        this.g = loginClient0;
    }

    protected void a(String s, Object object0) {
        if(this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(s, (object0 == null ? null : object0.toString()));
    }

    void b() {
    }

    static AccessToken c(Bundle bundle0, c c0, String s) {
        Date date0 = F.s(bundle0, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList arrayList0 = bundle0.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String s1 = bundle0.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date date1 = F.s(bundle0, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if(F.P(s1)) {
            return null;
        }
        String s2 = bundle0.getString("com.facebook.platform.extra.USER_ID");
        String s3 = bundle0.getString("graph_domain");
        return new AccessToken(s1, s, s2, arrayList0, null, null, c0, date0, new Date(), date1, s3);
    }

    public static AccessToken d(Collection collection0, Bundle bundle0, c c0, String s) {
        Date date0 = F.s(bundle0, "expires_in", new Date());
        String s1 = bundle0.getString("access_token");
        Date date1 = F.s(bundle0, "data_access_expiration_time", new Date(0L));
        String s2 = bundle0.getString("granted_scopes");
        Collection collection1 = F.P(s2) ? collection0 : new ArrayList(Arrays.asList(s2.split(",")));
        String s3 = bundle0.getString("denied_scopes");
        ArrayList arrayList0 = F.P(s3) ? null : new ArrayList(Arrays.asList(s3.split(",")));
        String s4 = bundle0.getString("expired_scopes");
        ArrayList arrayList1 = F.P(s4) ? null : new ArrayList(Arrays.asList(s4.split(",")));
        if(F.P(s1)) {
            return null;
        }
        String s5 = bundle0.getString("graph_domain");
        return new AccessToken(s1, s, LoginMethodHandler.g(bundle0.getString("signed_request")), collection1, arrayList0, arrayList1, c0, date0, new Date(), date1, s5);
    }

    protected String e(String s) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("0_auth_logger_id", s);
            jSONObject0.put("3_method", this.f());
            this.k(jSONObject0);
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + jSONException0.getMessage());
            return jSONObject0.toString();
        }
    }

    abstract String f();

    static String g(String s) {
        if(s == null || s.isEmpty()) {
            throw new e("Authorization response does not contain the signed_request");
        }
        String[] arr_s = s.split("\\.");
        if(arr_s.length == 2) {
            try {
                return new JSONObject(new String(Base64.decode(arr_s[1], 0), "UTF-8")).getString("user_id");
            }
            catch(UnsupportedEncodingException | JSONException unused_ex) {
            }
        }
        throw new e("Failed to retrieve user_id from signed_request");
    }

    protected void h(String s) {
        String s1 = this.g.q().a();
        m m0 = new m(this.g.i(), s1);
        Bundle bundle0 = new Bundle();
        bundle0.putString("fb_web_login_e2e", s);
        bundle0.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle0.putString("app_id", s1);
        m0.k("fb_dialogs_web_login_dialog_complete", null, bundle0);
    }

    boolean i() {
        return false;
    }

    boolean j(int v, int v1, Intent intent0) {
        return false;
    }

    void k(JSONObject jSONObject0) {
    }

    void l(LoginClient loginClient0) {
        if(this.g != null) {
            throw new e("Can\'t set LoginClient if it is already set.");
        }
        this.g = loginClient0;
    }

    public boolean m() {
        return false;
    }

    abstract int n(Request arg1);

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        F.s0(parcel0, this.f);
    }
}

