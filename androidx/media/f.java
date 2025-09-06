package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;

final class f implements c {
    final MediaSessionManager.RemoteUserInfo a;

    f(MediaSessionManager.RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
        this.a = mediaSessionManager$RemoteUserInfo0;
    }

    f(String s, int v, int v1) {
        this.a = e.a(s, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? this.a.equals(((f)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return B.c.b(new Object[]{this.a});
    }
}

