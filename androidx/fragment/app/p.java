package androidx.fragment.app;

import B.a;
import android.content.res.Configuration;

public final class p implements a {
    public final FragmentManager a;

    public p(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // B.a
    public final void a(Object object0) {
        this.a.Q0(((Configuration)object0));
    }
}

