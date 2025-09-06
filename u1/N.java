package u1;

import android.database.sqlite.SQLiteDatabase;
import m1.p;

public final class n implements b {
    public final M a;
    public final p b;

    public n(M m0, p p0) {
        this.a = m0;
        this.b = p0;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return this.a.G0(this.b, ((SQLiteDatabase)object0));
    }
}

