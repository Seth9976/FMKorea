package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.c;
import com.facebook.e;
import com.facebook.g;
import com.facebook.h;
import com.facebook.internal.F;
import com.facebook.j;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private String h;

    WebLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
    }

    WebLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    protected Bundle o(Bundle bundle0, Request loginClient$Request0) {
        bundle0.putString("redirect_uri", this.q());
        bundle0.putString("client_id", loginClient$Request0.a());
        bundle0.putString("e2e", "{\"init\":1757108474966}");
        bundle0.putString("response_type", "token,signed_request,graph_domain");
        bundle0.putString("return_scopes", "true");
        bundle0.putString("auth_type", loginClient$Request0.c());
        bundle0.putString("login_behavior", loginClient$Request0.g().name());
        bundle0.putString("sdk", "android-9.1.1");
        if(this.r() != null) {
            bundle0.putString("sso", this.r());
        }
        bundle0.putString("cct_prefetching", "0");
        return bundle0;
    }

    protected Bundle p(Request loginClient$Request0) {
        Bundle bundle0 = new Bundle();
        if(!F.Q(loginClient$Request0.h())) {
            String s = TextUtils.join(",", loginClient$Request0.h());
            bundle0.putString("scope", s);
            this.a("scope", s);
        }
        bundle0.putString("default_audience", loginClient$Request0.d().b());
        bundle0.putString("state", this.e(loginClient$Request0.b()));
        AccessToken accessToken0 = AccessToken.g();
        String s1 = accessToken0 == null ? null : accessToken0.q();
        String s2 = "0";
        if(s1 == null || !s1.equals(this.u())) {
            F.f(this.g.i());
            this.a("access_token", "0");
        }
        else {
            bundle0.putString("access_token", s1);
            this.a("access_token", "1");
        }
        bundle0.putString("cbt", "1757108475406");
        if(h.i()) {
            s2 = "1";
        }
        bundle0.putString("ies", s2);
        return bundle0;
    }

    protected String q() {
        return "fb" + h.f() + "://authorize";
    }

    protected String r() {
        return null;
    }

    abstract c s();

    private String u() {
        return this.g.i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    protected void w(Request loginClient$Request0, Bundle bundle0, e e0) {
        String s1;
        Result loginClient$Result0;
        this.h = null;
        if(bundle0 != null) {
            if(bundle0.containsKey("e2e")) {
                this.h = bundle0.getString("e2e");
            }
            try {
                AccessToken accessToken0 = LoginMethodHandler.d(loginClient$Request0.h(), bundle0, this.s(), loginClient$Request0.a());
                loginClient$Result0 = Result.d(this.g.q(), accessToken0);
                CookieSyncManager.createInstance(this.g.i()).sync();
                this.x(accessToken0.q());
            }
            catch(e e1) {
                loginClient$Result0 = Result.b(this.g.q(), null, e1.getMessage());
            }
        }
        else if(e0 instanceof g) {
            loginClient$Result0 = Result.a(this.g.q(), "User canceled log in.");
        }
        else {
            this.h = null;
            String s = e0.getMessage();
            if(e0 instanceof j) {
                FacebookRequestError facebookRequestError0 = ((j)e0).a();
                s1 = String.format(Locale.ROOT, "%d", facebookRequestError0.c());
                s = facebookRequestError0.toString();
            }
            else {
                s1 = null;
            }
            loginClient$Result0 = Result.c(this.g.q(), null, s, s1);
        }
        if(!F.P(this.h)) {
            this.h(this.h);
        }
        this.g.g(loginClient$Result0);
    }

    private void x(String s) {
        this.g.i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
    }
}

