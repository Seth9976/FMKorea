package co.median.android;

import android.webkit.GeolocationPermissions.Callback;

public final class h implements a {
    public final k a;
    public final GeolocationPermissions.Callback b;
    public final String c;

    public h(k k0, GeolocationPermissions.Callback geolocationPermissions$Callback0, String s) {
        this.a = k0;
        this.b = geolocationPermissions$Callback0;
        this.c = s;
    }

    @Override  // co.median.android.n$a
    public final void a(boolean z) {
        this.a.e(this.b, this.c, z);
    }
}

