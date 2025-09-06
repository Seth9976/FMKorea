package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import com.facebook.AccessToken;
import com.facebook.e;
import com.facebook.internal.F;
import com.facebook.internal.G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LoginClient implements Parcelable {
    public static class Request implements Parcelable {
        static final class a implements Parcelable.Creator {
            public Request a(Parcel parcel0) {
                return new Request(parcel0, null);
            }

            public Request[] b(int v) {
                return new Request[v];
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
        private final d f;
        private Set g;
        private final b h;
        private final String i;
        private final String j;
        private boolean k;
        private String l;
        private String m;
        private String n;

        static {
            Request.CREATOR = new a();
        }

        private Request(Parcel parcel0) {
            boolean z = false;
            this.k = false;
            String s = parcel0.readString();
            b b0 = null;
            this.f = s == null ? null : d.valueOf(s);
            ArrayList arrayList0 = new ArrayList();
            parcel0.readStringList(arrayList0);
            this.g = new HashSet(arrayList0);
            String s1 = parcel0.readString();
            if(s1 != null) {
                b0 = b.valueOf(s1);
            }
            this.h = b0;
            this.i = parcel0.readString();
            this.j = parcel0.readString();
            if(parcel0.readByte() != 0) {
                z = true;
            }
            this.k = z;
            this.l = parcel0.readString();
            this.m = parcel0.readString();
            this.n = parcel0.readString();
        }

        Request(Parcel parcel0, com.facebook.login.LoginClient.a loginClient$a0) {
            this(parcel0);
        }

        String a() {
            return this.i;
        }

        String b() {
            return this.j;
        }

        String c() {
            return this.m;
        }

        b d() {
            return this.h;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        String e() {
            return this.n;
        }

        String f() {
            return this.l;
        }

        d g() {
            return this.f;
        }

        Set h() {
            return this.g;
        }

        boolean i() {
            for(Object object0: this.g) {
                if(g.b(((String)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }

        boolean j() {
            return this.k;
        }

        void k(Set set0) {
            G.i(set0, "permissions");
            this.g = set0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            String s = null;
            parcel0.writeString((this.f == null ? null : this.f.name()));
            parcel0.writeStringList(new ArrayList(this.g));
            b b0 = this.h;
            if(b0 != null) {
                s = b0.name();
            }
            parcel0.writeString(s);
            parcel0.writeString(this.i);
            parcel0.writeString(this.j);
            parcel0.writeByte(((byte)this.k));
            parcel0.writeString(this.l);
            parcel0.writeString(this.m);
            parcel0.writeString(this.n);
        }
    }

    public static class Result implements Parcelable {
        static final class com.facebook.login.LoginClient.Result.a implements Parcelable.Creator {
            public Result a(Parcel parcel0) {
                return new Result(parcel0, null);
            }

            public Result[] b(int v) {
                return new Result[v];
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

        static enum com.facebook.login.LoginClient.Result.b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String f;

            private com.facebook.login.LoginClient.Result.b(String s1) {
                this.f = s1;
            }

            String b() {
                return this.f;
            }
        }

        public static final Parcelable.Creator CREATOR;
        final com.facebook.login.LoginClient.Result.b f;
        final AccessToken g;
        final String h;
        final String i;
        final Request j;
        public Map k;
        public Map l;

        static {
            Result.CREATOR = new com.facebook.login.LoginClient.Result.a();
        }

        private Result(Parcel parcel0) {
            this.f = com.facebook.login.LoginClient.Result.b.valueOf(parcel0.readString());
            this.g = (AccessToken)parcel0.readParcelable(AccessToken.class.getClassLoader());
            this.h = parcel0.readString();
            this.i = parcel0.readString();
            this.j = (Request)parcel0.readParcelable(Request.class.getClassLoader());
            this.k = F.f0(parcel0);
            this.l = F.f0(parcel0);
        }

        Result(Parcel parcel0, com.facebook.login.LoginClient.a loginClient$a0) {
            this(parcel0);
        }

        Result(Request loginClient$Request0, com.facebook.login.LoginClient.Result.b loginClient$Result$b0, AccessToken accessToken0, String s, String s1) {
            G.i(loginClient$Result$b0, "code");
            this.j = loginClient$Request0;
            this.g = accessToken0;
            this.h = s;
            this.f = loginClient$Result$b0;
            this.i = s1;
        }

        static Result a(Request loginClient$Request0, String s) {
            return new Result(loginClient$Request0, com.facebook.login.LoginClient.Result.b.h, null, s, null);
        }

        static Result b(Request loginClient$Request0, String s, String s1) {
            return Result.c(loginClient$Request0, s, s1, null);
        }

        static Result c(Request loginClient$Request0, String s, String s1, String s2) {
            String s3 = TextUtils.join(": ", F.b(new String[]{s, s1}));
            return new Result(loginClient$Request0, com.facebook.login.LoginClient.Result.b.i, null, s3, s2);
        }

        static Result d(Request loginClient$Request0, AccessToken accessToken0) {
            return new Result(loginClient$Request0, com.facebook.login.LoginClient.Result.b.g, accessToken0, null, null);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.f.name());
            parcel0.writeParcelable(this.g, v);
            parcel0.writeString(this.h);
            parcel0.writeString(this.i);
            parcel0.writeParcelable(this.j, v);
            F.s0(parcel0, this.k);
            F.s0(parcel0, this.l);
        }
    }

    static final class com.facebook.login.LoginClient.a implements Parcelable.Creator {
        public LoginClient a(Parcel parcel0) {
            return new LoginClient(parcel0);
        }

        public LoginClient[] b(int v) {
            return new LoginClient[v];
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

    interface com.facebook.login.LoginClient.b {
        void a();

        void b();
    }

    public interface c {
        void a(Result arg1);
    }

    public static final Parcelable.Creator CREATOR;
    LoginMethodHandler[] f;
    int g;
    Fragment h;
    c i;
    com.facebook.login.LoginClient.b j;
    boolean k;
    Request l;
    Map m;
    Map n;
    private f o;
    private int p;
    private int q;

    static {
        LoginClient.CREATOR = new com.facebook.login.LoginClient.a();
    }

    public LoginClient(Parcel parcel0) {
        this.g = -1;
        this.p = 0;
        this.q = 0;
        Parcelable[] arr_parcelable = parcel0.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f = new LoginMethodHandler[arr_parcelable.length];
        for(int v = 0; v < arr_parcelable.length; ++v) {
            LoginMethodHandler[] arr_loginMethodHandler = this.f;
            LoginMethodHandler loginMethodHandler0 = (LoginMethodHandler)arr_parcelable[v];
            arr_loginMethodHandler[v] = loginMethodHandler0;
            loginMethodHandler0.l(this);
        }
        this.g = parcel0.readInt();
        this.l = (Request)parcel0.readParcelable(Request.class.getClassLoader());
        this.m = F.f0(parcel0);
        this.n = F.f0(parcel0);
    }

    public LoginClient(Fragment fragment0) {
        this.g = -1;
        this.p = 0;
        this.q = 0;
        this.h = fragment0;
    }

    void A(Fragment fragment0) {
        if(this.h != null) {
            throw new e("Can\'t set fragment once it is already set.");
        }
        this.h = fragment0;
    }

    void B(c loginClient$c0) {
        this.i = loginClient$c0;
    }

    void C(Request loginClient$Request0) {
        if(!this.n()) {
            this.b(loginClient$Request0);
        }
    }

    boolean D() {
        LoginMethodHandler loginMethodHandler0 = this.j();
        if(loginMethodHandler0.i() && !this.d()) {
            this.a("no_internet_permission", "1", false);
            return false;
        }
        int v = loginMethodHandler0.n(this.l);
        this.p = 0;
        if(v > 0) {
            this.o().d(this.l.b(), loginMethodHandler0.f());
            this.q = v;
            return v > 0;
        }
        this.o().c(this.l.b(), loginMethodHandler0.f());
        this.a("not_tried", loginMethodHandler0.f(), true);
        return v > 0;
    }

    void E() {
        if(this.g >= 0) {
            this.s(this.j().f(), "skipped", null, null, this.j().f);
        }
        LoginMethodHandler[] arr_loginMethodHandler;
        while((arr_loginMethodHandler = this.f) != null) {
            int v = this.g;
            if(v >= arr_loginMethodHandler.length - 1) {
                break;
            }
            this.g = v + 1;
            if(this.D()) {
                return;
            }
        }
        if(this.l != null) {
            this.h();
        }
    }

    void F(Result loginClient$Result0) {
        Result loginClient$Result1;
        if(loginClient$Result0.g == null) {
            throw new e("Can\'t validate without a token");
        }
        AccessToken accessToken0 = AccessToken.g();
        AccessToken accessToken1 = loginClient$Result0.g;
        try {
            if(accessToken0 == null || accessToken1 == null) {
                loginClient$Result1 = Result.b(this.l, "User logged in as different Facebook user.", null);
            }
            else if(accessToken0.r().equals(accessToken1.r())) {
                loginClient$Result1 = Result.d(this.l, loginClient$Result0.g);
            }
            else {
                loginClient$Result1 = Result.b(this.l, "User logged in as different Facebook user.", null);
            }
            this.f(loginClient$Result1);
            return;
        }
        catch(Exception exception0) {
        }
        this.f(Result.b(this.l, "Caught exception", exception0.getMessage()));
    }

    private void a(String s, String s1, boolean z) {
        if(this.m == null) {
            this.m = new HashMap();
        }
        if(this.m.containsKey(s) && z) {
            s1 = ((String)this.m.get(s)) + "," + s1;
        }
        this.m.put(s, s1);
    }

    void b(Request loginClient$Request0) {
        if(loginClient$Request0 == null) {
            return;
        }
        if(this.l != null) {
            throw new e("Attempted to authorize while a request is pending.");
        }
        if(AccessToken.s() && !this.d()) {
            return;
        }
        this.l = loginClient$Request0;
        this.f = this.m(loginClient$Request0);
        this.E();
    }

    void c() {
        if(this.g >= 0) {
            this.j().b();
        }
    }

    boolean d() {
        if(this.k) {
            return true;
        }
        if(this.e("android.permission.INTERNET") != 0) {
            h h0 = this.i();
            String s = h0.getString(com.facebook.common.d.c);
            String s1 = h0.getString(com.facebook.common.d.b);
            this.f(Result.b(this.l, s, s1));
            return false;
        }
        this.k = true;
        return true;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e(String s) {
        return this.i().checkCallingOrSelfPermission(s);
    }

    void f(Result loginClient$Result0) {
        LoginMethodHandler loginMethodHandler0 = this.j();
        if(loginMethodHandler0 != null) {
            this.r(loginMethodHandler0.f(), loginClient$Result0, loginMethodHandler0.f);
        }
        Map map0 = this.m;
        if(map0 != null) {
            loginClient$Result0.k = map0;
        }
        Map map1 = this.n;
        if(map1 != null) {
            loginClient$Result0.l = map1;
        }
        this.f = null;
        this.g = -1;
        this.l = null;
        this.m = null;
        this.p = 0;
        this.q = 0;
        this.x(loginClient$Result0);
    }

    void g(Result loginClient$Result0) {
        if(loginClient$Result0.g != null && AccessToken.s()) {
            this.F(loginClient$Result0);
            return;
        }
        this.f(loginClient$Result0);
    }

    private void h() {
        this.f(Result.b(this.l, "Login attempt failed.", null));
    }

    h i() {
        return this.h.getActivity();
    }

    LoginMethodHandler j() {
        return this.g < 0 ? null : this.f[this.g];
    }

    static String k() [...] // 潜在的解密器

    public Fragment l() {
        return this.h;
    }

    protected LoginMethodHandler[] m(Request loginClient$Request0) {
        ArrayList arrayList0 = new ArrayList();
        d d0 = loginClient$Request0.g();
        if(d0.h()) {
            arrayList0.add(new GetTokenLoginMethodHandler(this));
        }
        if(d0.i()) {
            arrayList0.add(new KatanaProxyLoginMethodHandler(this));
        }
        if(d0.g()) {
            arrayList0.add(new FacebookLiteLoginMethodHandler(this));
        }
        if(d0.b()) {
            arrayList0.add(new CustomTabLoginMethodHandler(this));
        }
        if(d0.j()) {
            arrayList0.add(new WebViewLoginMethodHandler(this));
        }
        if(d0.f()) {
            arrayList0.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] arr_loginMethodHandler = new LoginMethodHandler[arrayList0.size()];
        arrayList0.toArray(arr_loginMethodHandler);
        return arr_loginMethodHandler;
    }

    boolean n() {
        return this.l != null && this.g >= 0;
    }

    private f o() {
        if(this.o == null || !this.o.a().equals(this.l.a())) {
            this.o = new f(this.i(), this.l.a());
        }
        return this.o;
    }

    public static int p() {
        return com.facebook.internal.d.g.b();
    }

    public Request q() {
        return this.l;
    }

    private void r(String s, Result loginClient$Result0, Map map0) {
        this.s(s, loginClient$Result0.f.b(), loginClient$Result0.h, loginClient$Result0.i, map0);
    }

    private void s(String s, String s1, String s2, String s3, Map map0) {
        if(this.l == null) {
            this.o().e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
            return;
        }
        this.o().b(this.l.b(), s, s1, s2, s3, map0);
    }

    void u() {
        com.facebook.login.LoginClient.b loginClient$b0 = this.j;
        if(loginClient$b0 != null) {
            loginClient$b0.a();
        }
    }

    void w() {
        com.facebook.login.LoginClient.b loginClient$b0 = this.j;
        if(loginClient$b0 != null) {
            loginClient$b0.b();
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelableArray(this.f, v);
        parcel0.writeInt(this.g);
        parcel0.writeParcelable(this.l, v);
        F.s0(parcel0, this.m);
        F.s0(parcel0, this.n);
    }

    private void x(Result loginClient$Result0) {
        c loginClient$c0 = this.i;
        if(loginClient$c0 != null) {
            loginClient$c0.a(loginClient$Result0);
        }
    }

    public boolean y(int v, int v1, Intent intent0) {
        ++this.p;
        if(this.l != null) {
            if(intent0 != null && intent0.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                this.E();
                return false;
            }
            return this.j().m() && intent0 == null && this.p < this.q ? false : this.j().j(v, v1, intent0);
        }
        return false;
    }

    void z(com.facebook.login.LoginClient.b loginClient$b0) {
        this.j = loginClient$b0;
    }
}

