package B0;

import androidx.activity.result.a;
import co.median.android.MainActivity;
import co.median.android.d;
import java.util.Map;

public final class s implements a {
    public final d a;
    public final MainActivity b;

    public s(d d0, MainActivity mainActivity0) {
        this.a = d0;
        this.b = mainActivity0;
    }

    @Override  // androidx.activity.result.a
    public final void a(Object object0) {
        this.a.A(this.b, ((Map)object0));
    }
}

