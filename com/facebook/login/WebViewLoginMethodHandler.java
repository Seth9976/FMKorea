package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.h;
import com.facebook.internal.F;
import com.facebook.internal.H.e;
import com.facebook.internal.H.g;
import com.facebook.internal.H;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    static final class b implements Parcelable.Creator {
        public WebViewLoginMethodHandler a(Parcel parcel0) {
            return new WebViewLoginMethodHandler(parcel0);
        }

        public WebViewLoginMethodHandler[] b(int v) {
            return new WebViewLoginMethodHandler[v];
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

    static class c extends e {
        private String h;
        private String i;
        private String j;
        private d k;

        public c(Context context0, String s, Bundle bundle0) {
            super(context0, s, "oauth", bundle0);
            this.j = "fbconnect://success";
            this.k = d.l;
        }

        @Override  // com.facebook.internal.H$e
        public H a() {
            Bundle bundle0 = this.f();
            bundle0.putString("redirect_uri", this.j);
            bundle0.putString("client_id", this.c());
            bundle0.putString("e2e", this.h);
            bundle0.putString("response_type", "token,signed_request,graph_domain");
            bundle0.putString("return_scopes", "true");
            bundle0.putString("auth_type", this.i);
            bundle0.putString("login_behavior", this.k.name());
            return H.q(this.d(), "oauth", bundle0, this.g(), this.e());
        }

        public c i(String s) {
            this.i = s;
            return this;
        }

        public c j(String s) {
            this.h = s;
            return this;
        }

        public c k(boolean z) {
            this.j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public c l(d d0) {
            this.k = d0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private H i;
    private String j;

    static {
        WebViewLoginMethodHandler.CREATOR = new b();
    }

    WebViewLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
        this.j = parcel0.readString();
    }

    WebViewLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    @Override  // com.facebook.login.LoginMethodHandler
    void b() {
        H h0 = this.i;
        if(h0 != null) {
            h0.cancel();
            this.i = null;
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    String f() {
        return "web_view";
    }

    @Override  // com.facebook.login.LoginMethodHandler
    boolean i() {
        return true;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    int n(Request loginClient$Request0) {
        class a implements g {
            final Request a;
            final WebViewLoginMethodHandler b;

            a(Request loginClient$Request0) {
                this.a = loginClient$Request0;
                super();
            }

            @Override  // com.facebook.internal.H$g
            public void a(Bundle bundle0, com.facebook.e e0) {
                WebViewLoginMethodHandler.this.y(this.a, bundle0, e0);
            }
        }

        Bundle bundle0 = this.p(loginClient$Request0);
        a webViewLoginMethodHandler$a0 = new a(this, loginClient$Request0);
        this.j = "{\"init\":1757108489968}";
        this.a("e2e", "{\"init\":1757108489968}");
        h h0 = this.g.i();
        boolean z = F.K(h0);
        this.i = new c(h0, loginClient$Request0.a(), bundle0).j(this.j).k(z).i(loginClient$Request0.c()).l(loginClient$Request0.g()).h(webViewLoginMethodHandler$a0).a();
        com.facebook.internal.g g0 = new com.facebook.internal.g();
        g0.setRetainInstance(true);
        g0.s(this.i);
        g0.show(h0.P0(), "FacebookDialogFragment");
        return 1;
    }

    @Override  // com.facebook.login.WebLoginMethodHandler
    com.facebook.c s() {
        return com.facebook.c.k;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.j);
    }

    void y(Request loginClient$Request0, Bundle bundle0, com.facebook.e e0) {
        super.w(loginClient$Request0, bundle0, e0);
    }
}

