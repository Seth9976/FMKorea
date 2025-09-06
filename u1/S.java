package u1;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import p1.a.a;

public final class s implements b {
    public final M a;
    public final String b;
    public final Map c;
    public final a d;

    public s(M m0, String s, Map map0, a a$a0) {
        this.a = m0;
        this.b = s;
        this.c = map0;
        this.d = a$a0;
    }

    @Override  // u1.M$b
    public final Object apply(Object object0) {
        return this.a.L0(this.b, this.c, this.d, ((SQLiteDatabase)object0));
    }
}

