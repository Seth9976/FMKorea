package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.h;
import com.facebook.internal.f;
import com.facebook.internal.w;
import java.util.List;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    static final class a implements Parcelable.Creator {
        public KatanaProxyLoginMethodHandler a(Parcel parcel0) {
            return new KatanaProxyLoginMethodHandler(parcel0);
        }

        public KatanaProxyLoginMethodHandler[] b(int v) {
            return new KatanaProxyLoginMethodHandler[v];
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

    static {
        KatanaProxyLoginMethodHandler.CREATOR = new a();
    }

    KatanaProxyLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    String f() {
        return "katana_proxy_auth";
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public boolean m() {
        return true;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    int n(Request loginClient$Request0) {
        boolean z = h.r && f.a() != null && loginClient$Request0.g().b();
        List list0 = w.n(this.g.i(), loginClient$Request0.a(), loginClient$Request0.h(), "{\"init\":1757108489016}", loginClient$Request0.j(), loginClient$Request0.i(), loginClient$Request0.d(), this.e(loginClient$Request0.b()), loginClient$Request0.c(), z);
        this.a("e2e", "{\"init\":1757108489016}");
        for(int v = 0; v < list0.size(); ++v) {
            if(this.s(((Intent)list0.get(v)), LoginClient.p())) {
                return v + 1;
            }
        }
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
    }
}

