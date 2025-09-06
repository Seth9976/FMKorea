package D0;

import W1.c.a;
import W1.e;
import android.app.Activity;

public final class b implements a {
    public final Activity a;
    public final String b;

    public b(Activity activity0, String s) {
        this.a = activity0;
        this.b = s;
    }

    @Override  // W1.c$a
    public final void onConsentInfoUpdateFailure(e e0) {
        D0.e.L(this.a, this.b, e0);
    }
}

