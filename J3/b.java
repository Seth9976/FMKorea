package j3;

import android.database.Cursor;

public abstract class b {
    public static void a(Cursor cursor0) {
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
    }
}

