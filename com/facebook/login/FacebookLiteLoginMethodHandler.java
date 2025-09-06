package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.w;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    static final class a implements Parcelable.Creator {
        public FacebookLiteLoginMethodHandler a(Parcel parcel0) {
            return new FacebookLiteLoginMethodHandler(parcel0);
        }

        public FacebookLiteLoginMethodHandler[] b(int v) {
            return new FacebookLiteLoginMethodHandler[v];
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
        FacebookLiteLoginMethodHandler.CREATOR = new a();
    }

    FacebookLiteLoginMethodHandler(Parcel parcel0) {
        super(parcel0);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    String f() {
        return "fb_lite_login";
    }

    @Override  // com.facebook.login.LoginMethodHandler
    int n(Request loginClient$Request0) {
        Intent intent0 = w.j(this.g.i(), loginClient$Request0.a(), loginClient$Request0.h(), "{\"init\":1757108482890}", loginClient$Request0.j(), loginClient$Request0.i(), loginClient$Request0.d(), this.e(loginClient$Request0.b()), loginClient$Request0.c());
        this.a("e2e", "{\"init\":1757108482890}");
        return this.s(intent0, LoginClient.p());
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
    }
}

