package l0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import k0.g;
import k0.j;
import y3.r;
import z3.k;
import z3.l;

public final class c implements g {
    public static final class a {
        private a() {
        }

        public a(z3.g g0) {
        }
    }

    private final SQLiteDatabase f;
    private final List g;
    public static final a h;
    private static final String[] i;
    private static final String[] j;

    static {
        c.h = new a(null);
        c.i = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        c.j = new String[0];
    }

    public c(SQLiteDatabase sQLiteDatabase0) {
        k.e(sQLiteDatabase0, "delegate");
        super();
        this.f = sQLiteDatabase0;
        this.g = sQLiteDatabase0.getAttachedDbs();
    }

    @Override  // k0.g
    public void A() {
        this.f.beginTransactionNonExclusive();
    }

    @Override  // k0.g
    public int B(String s, int v, ContentValues contentValues0, String s1, Object[] arr_object) {
        k.e(s, "table");
        k.e(contentValues0, "values");
        if(contentValues0.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int v1 = contentValues0.size();
        int v2 = arr_object == null ? v1 : arr_object.length + v1;
        Object[] arr_object1 = new Object[v2];
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("UPDATE ");
        stringBuilder0.append(c.i[v]);
        stringBuilder0.append(s);
        stringBuilder0.append(" SET ");
        int v3 = 0;
        for(Object object0: contentValues0.keySet()) {
            stringBuilder0.append((v3 <= 0 ? "" : ","));
            stringBuilder0.append(((String)object0));
            arr_object1[v3] = contentValues0.get(((String)object0));
            stringBuilder0.append("=?");
            ++v3;
        }
        if(arr_object != null) {
            for(int v4 = v1; v4 < v2; ++v4) {
                arr_object1[v4] = arr_object[v4 - v1];
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(" WHERE ");
            stringBuilder0.append(s1);
        }
        String s2 = stringBuilder0.toString();
        k.d(s2, "StringBuilder().apply(builderAction).toString()");
        k0.k k0 = this.n(s2);
        k0.a.h.b(k0, arr_object1);
        return k0.m();
    }

    @Override  // k0.g
    public Cursor C(j j0) {
        static final class b extends l implements r {
            final j g;

            b(j j0) {
                this.g = j0;
                super(4);
            }

            public final SQLiteCursor b(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
                k.b(sQLiteQuery0);
                l0.g g0 = new l0.g(sQLiteQuery0);
                this.g.a(g0);
                return new SQLiteCursor(sQLiteCursorDriver0, s, sQLiteQuery0);
            }

            @Override  // y3.r
            public Object j(Object object0, Object object1, Object object2, Object object3) {
                return this.b(((SQLiteDatabase)object0), ((SQLiteCursorDriver)object1), ((String)object2), ((SQLiteQuery)object3));
            }
        }

        k.e(j0, "query");
        l0.b b0 = (SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) -> c.g(new b(j0), sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
        String s = j0.b();
        Cursor cursor0 = this.f.rawQueryWithFactory(b0, s, c.j, null);
        k.d(cursor0, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursor0;
    }

    @Override  // k0.g
    public Cursor H(String s) {
        k.e(s, "query");
        return this.C(new k0.a(s));
    }

    @Override  // k0.g
    public void I() {
        this.f.endTransaction();
    }

    @Override  // k0.g
    public String S() {
        return this.f.getPath();
    }

    @Override  // k0.g
    public boolean T() {
        return this.f.inTransaction();
    }

    @Override  // k0.g
    public boolean W() {
        return k0.b.b(this.f);
    }

    // 检测为 Lambda 实现
    public static Cursor a(j j0, SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) [...]

    // 检测为 Lambda 实现
    public static Cursor b(r r0, SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) [...]

    @Override  // k0.g
    public void c() {
        this.f.beginTransaction();
    }

    @Override
    public void close() {
        this.f.close();
    }

    public final boolean f(SQLiteDatabase sQLiteDatabase0) {
        k.e(sQLiteDatabase0, "sqLiteDatabase");
        return k.a(this.f, sQLiteDatabase0);
    }

    private static final Cursor g(r r0, SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        k.e(r0, "$tmp0");
        return (Cursor)r0.j(sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
    }

    @Override  // k0.g
    public boolean h() {
        return this.f.isOpen();
    }

    @Override  // k0.g
    public List i() {
        return this.g;
    }

    private static final Cursor j(j j0, SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        k.e(j0, "$query");
        k.b(sQLiteQuery0);
        j0.a(new l0.g(sQLiteQuery0));
        return new SQLiteCursor(sQLiteCursorDriver0, s, sQLiteQuery0);
    }

    @Override  // k0.g
    public void k(String s) {
        k.e(s, "sql");
        this.f.execSQL(s);
    }

    @Override  // k0.g
    public k0.k n(String s) {
        k.e(s, "sql");
        SQLiteStatement sQLiteStatement0 = this.f.compileStatement(s);
        k.d(sQLiteStatement0, "delegate.compileStatement(sql)");
        return new h(sQLiteStatement0);
    }

    @Override  // k0.g
    public Cursor p(j j0, CancellationSignal cancellationSignal0) {
        k.e(j0, "query");
        String s = j0.b();
        k.b(cancellationSignal0);
        l0.a a0 = (SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) -> c.j(j0, sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
        return k0.b.c(this.f, s, c.j, null, cancellationSignal0, a0);
    }

    @Override  // k0.g
    public void y() {
        this.f.setTransactionSuccessful();
    }

    @Override  // k0.g
    public void z(String s, Object[] arr_object) {
        k.e(s, "sql");
        k.e(arr_object, "bindArgs");
        this.f.execSQL(s, arr_object);
    }
}

