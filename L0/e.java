package l0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import k0.h.a;

public final class e implements DatabaseErrorHandler {
    public final a a;
    public final b b;

    public e(a h$a0, b d$b0) {
        this.a = h$a0;
        this.b = d$b0;
    }

    @Override  // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase0) {
        c.a(this.a, this.b, sQLiteDatabase0);
    }
}

