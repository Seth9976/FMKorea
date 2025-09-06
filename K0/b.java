package k0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import z3.k;

public final class b {
    public static final b a;

    static {
        b.a = new b();
    }

    public static final boolean a(File file0) {
        k.e(file0, "file");
        return SQLiteDatabase.deleteDatabase(file0);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase0) {
        k.e(sQLiteDatabase0, "sQLiteDatabase");
        return sQLiteDatabase0.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase0, String s, String[] arr_s, String s1, CancellationSignal cancellationSignal0, SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0) {
        k.e(sQLiteDatabase0, "sQLiteDatabase");
        k.e(s, "sql");
        k.e(arr_s, "selectionArgs");
        k.e(cancellationSignal0, "cancellationSignal");
        k.e(sQLiteDatabase$CursorFactory0, "cursorFactory");
        Cursor cursor0 = sQLiteDatabase0.rawQueryWithFactory(sQLiteDatabase$CursorFactory0, s, arr_s, s1, cancellationSignal0);
        k.d(cursor0, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursor0;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper0, boolean z) {
        k.e(sQLiteOpenHelper0, "sQLiteOpenHelper");
        sQLiteOpenHelper0.setWriteAheadLoggingEnabled(z);
    }
}

