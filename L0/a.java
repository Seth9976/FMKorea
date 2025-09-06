package l0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import k0.j;

public final class a implements SQLiteDatabase.CursorFactory {
    public final j a;

    public a(j j0) {
        this.a = j0;
    }

    @Override  // android.database.sqlite.SQLiteDatabase$CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        return c.a(this.a, sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
    }
}

