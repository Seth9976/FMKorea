package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookRequestError;
import com.facebook.c;
import com.facebook.e;
import com.facebook.g;
import com.facebook.h;
import com.facebook.internal.F;
import com.facebook.internal.f;
import com.facebook.j;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    static final class a implements Parcelable.Creator {
        public CustomTabLoginMethodHandler a(Parcel parcel0) {
            return new CustomTabLoginMethodHandler(parcel0);
        }

        public CustomTabLoginMethodHandler[] b(int v) {
            return new CustomTabLoginMethodHandler[v];
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

    public static final Parcelable.Creator CREATOR = null;
    private String i;
    private String j;
    private String k;
    public static boolean l = false;

    static {
        CustomTabLoginMethodHandler.CREATOR = new a();
    }

    CustomTabLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
        this.k = "";
        this.j = parcel0.readString();
    }

    CustomTabLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
        this.j = "17bn9pimc8ssn60i7f0f";
        CustomTabLoginMethodHandler.l = false;
        this.k = f.c(this.z());
    }

    private void A(String s, Request loginClient$Request0) {
        if(s != null && (s.startsWith("fbconnect://cct.") || s.startsWith(super.q()))) {
            Uri uri0 = Uri.parse(s);
            Bundle bundle0 = F.a0(uri0.getQuery());
            bundle0.putAll(F.a0(uri0.getFragment()));
            if(!this.B(bundle0)) {
                super.w(loginClient$Request0, null, new e("Invalid state parameter"));
                return;
            }
            String s1 = bundle0.getString("error");
            if(s1 == null) {
                s1 = bundle0.getString("error_type");
            }
            String s2 = bundle0.getString("error_msg");
            if(s2 == null) {
                s2 = bundle0.getString("error_message");
            }
            if(s2 == null) {
                s2 = bundle0.getString("error_description");
            }
            String s3 = bundle0.getString("error_code");
            int v = -1;
            if(!F.P(s3)) {
                try {
                    v = Integer.parseInt(s3);
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            if(F.P(s1) && F.P(s2) && v == -1) {
                super.w(loginClient$Request0, bundle0, null);
                return;
            }
            if(s1 != null && (s1.equals("access_denied") || s1.equals("OAuthAccessDeniedException"))) {
                super.w(loginClient$Request0, null, new g());
                return;
            }
            if(v == 4201) {
                super.w(loginClient$Request0, null, new g());
                return;
            }
            super.w(loginClient$Request0, null, new j(new FacebookRequestError(v, s1, s2), s2));
        }
    }

    private boolean B(Bundle bundle0) {
        try {
            String s = bundle0.getString("state");
            return s == null ? false : new JSONObject(s).getString("7_challenge").equals(this.j);
        }
        catch(JSONException unused_ex) {
            return false;
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    String f() {
        return "custom_tab";
    }

    @Override  // com.facebook.login.LoginMethodHandler
    boolean j(int v, int v1, Intent intent0) {
        if(intent0 != null && intent0.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
            return super.j(v, v1, intent0);
        }
        if(v != 1) {
            return super.j(v, v1, intent0);
        }
        Request loginClient$Request0 = this.g.q();
        if(v1 == -1) {
            this.A(intent0.getStringExtra("CustomTabMainActivity.extra_url"), loginClient$Request0);
            return true;
        }
        super.w(loginClient$Request0, null, new g());
        return false;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    protected void k(JSONObject jSONObject0) {
        jSONObject0.put("7_challenge", this.j);
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public boolean m() {
        return super.m();
    }

    @Override  // com.facebook.login.LoginMethodHandler
    int n(Request loginClient$Request0) {
        if(this.q().isEmpty()) {
            return 0;
        }
        Bundle bundle0 = this.o(this.p(loginClient$Request0), loginClient$Request0);
        if(CustomTabLoginMethodHandler.l) {
            bundle0.putString("cct_over_app_switch", "1");
        }
        if(h.q) {
            com.facebook.login.a.b(com.facebook.internal.e.a("oauth", bundle0));
        }
        Intent intent0 = new Intent(this.g.i(), CustomTabMainActivity.class);
        intent0.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent0.putExtra("CustomTabMainActivity.extra_params", bundle0);
        intent0.putExtra("CustomTabMainActivity.extra_chromePackage", this.y());
        this.g.l().startActivityForResult(intent0, 1);
        return 1;
    }

    @Override  // com.facebook.login.WebLoginMethodHandler
    protected String q() {
        return this.k;
    }

    @Override  // com.facebook.login.WebLoginMethodHandler
    protected String r() {
        return "chrome_custom_tab";
    }

    @Override  // com.facebook.login.WebLoginMethodHandler
    c s() {
        return c.l;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.j);
    }

    private String y() {
        String s = this.i;
        if(s != null) {
            return s;
        }
        String s1 = f.a();
        this.i = s1;
        return s1;
    }

    private String z() {
        return super.q();
    }
}

