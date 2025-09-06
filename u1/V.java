package u1;

import android.database.Cursor;
import java.util.List;
import m1.p;

public final class v implements b {
    public final M a;
    public final List b;
    public final p c;

    public v(M m0, List list0, p p0) {
        this.a = m0;
        this.b = list0;
        this.c = p0;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return this.a.M0(this.b, this.c, ((Cursor)object0));
    }
}

