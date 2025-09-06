package u1;

import android.database.sqlite.SQLiteDatabase;
import m1.p;

public final class o implements b {
    public final long a;
    public final p b;

    public o(long v, p p0) {
        this.a = v;
        this.b = p0;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return M.U0(this.a, this.b, ((SQLiteDatabase)object0));
    }
}

