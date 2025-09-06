package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.h;
import com.facebook.AccessToken;
import com.facebook.c;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    static final class a implements Parcelable.Creator {
        public DeviceAuthMethodHandler a(Parcel parcel0) {
            return new DeviceAuthMethodHandler(parcel0);
        }

        public DeviceAuthMethodHandler[] b(int v) {
            return new DeviceAuthMethodHandler[v];
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
    private static ScheduledThreadPoolExecutor h;

    static {
        DeviceAuthMethodHandler.CREATOR = new a();
    }

    protected DeviceAuthMethodHandler(Parcel parcel0) {
        super(parcel0);
    }

    DeviceAuthMethodHandler(LoginClient loginClient0) {
        super(loginClient0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.login.LoginMethodHandler
    String f() {
        return "device_auth";
    }

    @Override  // com.facebook.login.LoginMethodHandler
    int n(Request loginClient$Request0) {
        this.u(loginClient$Request0);
        return 1;
    }

    protected DeviceAuthDialog o() {
        return new DeviceAuthDialog();
    }

    public static ScheduledThreadPoolExecutor p() {
        synchronized(DeviceAuthMethodHandler.class) {
            if(DeviceAuthMethodHandler.h == null) {
                DeviceAuthMethodHandler.h = new ScheduledThreadPoolExecutor(1);
            }
            return DeviceAuthMethodHandler.h;
        }
    }

    public void q() {
        Result loginClient$Result0 = Result.a(this.g.q(), "User canceled log in.");
        this.g.g(loginClient$Result0);
    }

    public void r(Exception exception0) {
        Result loginClient$Result0 = Result.b(this.g.q(), null, exception0.getMessage());
        this.g.g(loginClient$Result0);
    }

    public void s(String s, String s1, String s2, Collection collection0, Collection collection1, Collection collection2, c c0, Date date0, Date date1, Date date2) {
        AccessToken accessToken0 = new AccessToken(s, s1, s2, collection0, collection1, collection2, c0, date0, date1, date2);
        Result loginClient$Result0 = Result.d(this.g.q(), accessToken0);
        this.g.g(loginClient$Result0);
    }

    private void u(Request loginClient$Request0) {
        h h0 = this.g.i();
        if(h0 != null && !h0.isFinishing()) {
            DeviceAuthDialog deviceAuthDialog0 = this.o();
            deviceAuthDialog0.show(h0.P0(), "login_with_facebook");
            deviceAuthDialog0.M(loginClient$Request0);
        }
    }

    @Override  // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
    }
}

