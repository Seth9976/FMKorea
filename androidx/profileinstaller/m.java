package androidx.profileinstaller;

import android.view.Choreographer.FrameCallback;

public final class m implements Choreographer.FrameCallback {
    public final Runnable f;

    public m(Runnable runnable0) {
        this.f = runnable0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        a.b(this.f, v);
    }
}

