package k0;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.List;
import z3.k;

public final class f {
    public static final f a;

    static {
        f.a = new f();
    }

    public static final List a(Cursor cursor0) {
        k.e(cursor0, "cursor");
        List list0 = cursor0.getNotificationUris();
        k.b(list0);
        return list0;
    }

    public static final void b(Cursor cursor0, ContentResolver contentResolver0, List list0) {
        k.e(cursor0, "cursor");
        k.e(contentResolver0, "cr");
        k.e(list0, "uris");
        cursor0.setNotificationUris(contentResolver0, list0);
    }
}

