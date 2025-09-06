package l0;

import android.database.sqlite.SQLiteStatement;
import k0.k;

public final class h extends g implements k {
    private final SQLiteStatement g;

    public h(SQLiteStatement sQLiteStatement0) {
        z3.k.e(sQLiteStatement0, "delegate");
        super(sQLiteStatement0);
        this.g = sQLiteStatement0;
    }

    @Override  // k0.k
    public long d0() {
        return this.g.executeInsert();
    }

    @Override  // k0.k
    public int m() {
        return this.g.executeUpdateDelete();
    }
}

