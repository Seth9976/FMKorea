package l0;

import android.database.sqlite.SQLiteProgram;
import k0.i;
import z3.k;

public class g implements i {
    private final SQLiteProgram f;

    public g(SQLiteProgram sQLiteProgram0) {
        k.e(sQLiteProgram0, "delegate");
        super();
        this.f = sQLiteProgram0;
    }

    @Override  // k0.i
    public void D(int v, byte[] arr_b) {
        k.e(arr_b, "value");
        this.f.bindBlob(v, arr_b);
    }

    @Override  // k0.i
    public void P(int v) {
        this.f.bindNull(v);
    }

    @Override
    public void close() {
        this.f.close();
    }

    @Override  // k0.i
    public void l(int v, String s) {
        k.e(s, "value");
        this.f.bindString(v, s);
    }

    @Override  // k0.i
    public void q(int v, double f) {
        this.f.bindDouble(v, f);
    }

    @Override  // k0.i
    public void x(int v, long v1) {
        this.f.bindLong(v, v1);
    }
}

