package l0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import y3.r;

public final class b implements SQLiteDatabase.CursorFactory {
    public final r a;

    public b(r r0) {
        this.a = r0;
    }

    @Override  // android.database.sqlite.SQLiteDatabase$CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        return c.b(this.a, sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
    }
}

