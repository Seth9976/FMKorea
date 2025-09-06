package I0;

import K0.q;
import android.app.Activity;

public final class m implements Runnable {
    public final Activity f;
    public final q g;

    public m(Activity activity0, q q0) {
        this.f = activity0;
        this.g = q0;
    }

    @Override
    public final void run() {
        r.h(this.f, this.g);
    }
}

