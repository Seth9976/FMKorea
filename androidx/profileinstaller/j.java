package androidx.profileinstaller;

import android.content.Context;

public final class j implements Runnable {
    public final ProfileInstallerInitializer f;
    public final Context g;

    public j(ProfileInstallerInitializer profileInstallerInitializer0, Context context0) {
        this.f = profileInstallerInitializer0;
        this.g = context0;
    }

    @Override
    public final void run() {
        this.f.i(this.g);
    }
}

