package u1;

import android.database.sqlite.SQLiteDatabase;
import m1.i;
import m1.p;

public final class m implements b {
    public final M a;
    public final i b;
    public final p c;

    public m(M m0, i i0, p p0) {
        this.a = m0;
        this.b = i0;
        this.c = p0;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return this.a.O0(this.b, this.c, ((SQLiteDatabase)object0));
    }
}

