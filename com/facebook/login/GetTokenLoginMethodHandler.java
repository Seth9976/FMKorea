package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.e;
import com.facebook.internal.F;
import com.facebook.internal.x.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    static final class c implements Parcelable.Creator {
        public GetTokenLoginMethodHandler a(Parcel parcel0) {
            return new GetTokenLoginMethodHandler(parcel0);
        }

        public GetTokenLoginMethodHandler[] b(int v) {
            return new GetTokenLoginMethodHandler[v];
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

    public static final Parcelable.Creator CREATOR;
    private com.facebook.login.c h;

    static {
        GetTokenLoginMethodHandler.CREATOR = new c();
    }

    GetTokenLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    @Override  // com.facebook.login.LoginMethodHandler
    void b() {
        com.facebook.login.c c0 = this.h;
        if(c0 != null) {
            c0.b();
            this.h.f(null);
            this.h = null;
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    String f() {
        return "get_token";
    }

    @Override  // com.facebook.login.LoginMethodHandler
    int n(Request loginClient$Request0) {
        class a implements b {
            final Request a;
            final GetTokenLoginMethodHandler b;

            a(Request loginClient$Request0) {
                this.a = loginClient$Request0;
                super();
            }

            @Override  // com.facebook.internal.x$b
            public void a(Bundle bundle0) {
                GetTokenLoginMethodHandler.this.p(this.a, bundle0);
            }
        }

        com.facebook.login.c c0 = new com.facebook.login.c(this.g.i(), loginClient$Request0.a());
        this.h = c0;
        if(!c0.g()) {
            return 0;
        }
        this.g.u();
        a getTokenLoginMethodHandler$a0 = new a(this, loginClient$Request0);
        this.h.f(getTokenLoginMethodHandler$a0);
        return 1;
    }

    void o(Request loginClient$Request0, Bundle bundle0) {
        class com.facebook.login.GetTokenLoginMethodHandler.b implements com.facebook.internal.F.a {
            final Bundle a;
            final Request b;
            final GetTokenLoginMethodHandler c;

            com.facebook.login.GetTokenLoginMethodHandler.b(Bundle bundle0, Request loginClient$Request0) {
                this.a = bundle0;
                this.b = loginClient$Request0;
                super();
            }

            @Override  // com.facebook.internal.F$a
            public void a(JSONObject jSONObject0) {
                try {
                    String s = jSONObject0.getString("id");
                    this.a.putString("com.facebook.platform.extra.USER_ID", s);
                    GetTokenLoginMethodHandler.this.q(this.b, this.a);
                }
                catch(JSONException jSONException0) {
                    LoginClient loginClient0 = GetTokenLoginMethodHandler.this.g;
                    loginClient0.f(Result.b(loginClient0.q(), "Caught exception", jSONException0.getMessage()));
                }
            }

            @Override  // com.facebook.internal.F$a
            public void b(e e0) {
                LoginClient loginClient0 = GetTokenLoginMethodHandler.this.g;
                loginClient0.f(Result.b(loginClient0.q(), "Caught exception", e0.getMessage()));
            }
        }

        String s = bundle0.getString("com.facebook.platform.extra.USER_ID");
        if(s != null && !s.isEmpty()) {
            this.q(loginClient$Request0, bundle0);
            return;
        }
        this.g.u();
        F.x(bundle0.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new com.facebook.login.GetTokenLoginMethodHandler.b(this, bundle0, loginClient$Request0));
    }

    void p(Request loginClient$Request0, Bundle bundle0) {
        com.facebook.login.c c0 = this.h;
        if(c0 != null) {
            c0.f(null);
        }
        this.h = null;
        this.g.w();
        if(bundle0 != null) {
            ArrayList arrayList0 = bundle0.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set set0 = loginClient$Request0.h();
            if(arrayList0 != null && (set0 == null || arrayList0.containsAll(set0))) {
                this.o(loginClient$Request0, bundle0);
                return;
            }
            HashSet hashSet0 = new HashSet();
            for(Object object0: set0) {
                String s = (String)object0;
                if(!arrayList0.contains(s)) {
                    hashSet0.add(s);
                }
            }
            if(!hashSet0.isEmpty()) {
                this.a("new_permissions", TextUtils.join(",", hashSet0));
            }
            loginClient$Request0.k(hashSet0);
        }
        this.g.E();
    }

    void q(Request loginClient$Request0, Bundle bundle0) {
        AccessToken accessToken0 = LoginMethodHandler.c(bundle0, com.facebook.c.j, loginClient$Request0.a());
        Result loginClient$Result0 = Result.d(this.g.q(), accessToken0);
        this.g.g(loginClient$Result0);
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
    }
}

