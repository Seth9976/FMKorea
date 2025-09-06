package G3;

import java.util.List;
import y3.p;

public final class t implements p {
    public final List f;
    public final boolean g;

    public t(List list0, boolean z) {
        this.f = list0;
        this.g = z;
    }

    @Override  // y3.p
    public final Object k(Object object0, Object object1) {
        return u.T(this.f, this.g, ((CharSequence)object0), ((int)(((Integer)object1))));
    }
}

