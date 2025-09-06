package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;

public final class b {
    c a;

    public b(MediaSessionManager.RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
        this.a = new f(mediaSessionManager$RemoteUserInfo0);
    }

    public b(String s, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a = new f(s, v, v1);
            return;
        }
        this.a = new g(s, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

