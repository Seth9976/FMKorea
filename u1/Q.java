package u1;

import android.database.sqlite.SQLiteDatabase;

public final class q implements b {
    public final String a;
    public final p1.c.b b;
    public final long c;

    public q(String s, p1.c.b c$b0, long v) {
        this.a = s;
        this.b = c$b0;
        this.c = v;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return M.T0(this.a, this.b, this.c, ((SQLiteDatabase)object0));
    }
}

