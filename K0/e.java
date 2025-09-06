package k0;

import android.database.Cursor;
import android.os.Bundle;
import z3.k;

public final class e {
    public static final e a;

    static {
        e.a = new e();
    }

    public static final void a(Cursor cursor0, Bundle bundle0) {
        k.e(cursor0, "cursor");
        k.e(bundle0, "extras");
        cursor0.setExtras(bundle0);
    }
}

