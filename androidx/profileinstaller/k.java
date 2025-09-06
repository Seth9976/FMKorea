package androidx.profileinstaller;

import android.content.Context;

public final class k implements Runnable {
    public final Context f;

    public k(Context context0) {
        this.f = context0;
    }

    @Override
    public final void run() {
        ProfileInstallerInitializer.l(this.f);
    }
}

