package B0;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.a;
import co.median.android.MainActivity;

public final class j0 implements a {
    public final MainActivity a;

    public j0(MainActivity mainActivity0) {
        this.a = mainActivity0;
    }

    @Override  // androidx.activity.result.a
    public final void a(Object object0) {
        this.a.E2(((ActivityResult)object0));
    }
}

