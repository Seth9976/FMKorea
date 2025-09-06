package B0;

import android.app.Activity;
import co.median.android.d;

public final class w implements Runnable {
    public final Activity f;
    public final String g;

    public w(Activity activity0, String s) {
        this.f = activity0;
        this.g = s;
    }

    @Override
    public final void run() {
        d.C(this.f, this.g);
    }
}

