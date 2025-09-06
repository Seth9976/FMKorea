package i0;

import G3.h;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build.VERSION;
import android.util.Log;
import m3.i;
import w3.b;
import z3.k;

public abstract class a {
    public static final Cursor a(Cursor cursor0) {
        Cursor cursor1;
        k.e(cursor0, "c");
        try {
            cursor1 = new MatrixCursor(cursor0.getColumnNames(), cursor0.getCount());
            while(true) {
                if(!cursor0.moveToNext()) {
                    goto label_27;
                }
                Object[] arr_object = new Object[cursor0.getColumnCount()];
                int v = cursor0.getColumnCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    switch(cursor0.getType(v1)) {
                        case 0: {
                            arr_object[v1] = null;
                            break;
                        }
                        case 1: {
                            arr_object[v1] = cursor0.getLong(v1);
                            break;
                        }
                        case 2: {
                            arr_object[v1] = cursor0.getDouble(v1);
                            break;
                        }
                        case 3: {
                            arr_object[v1] = cursor0.getString(v1);
                            break;
                        }
                        case 4: {
                            arr_object[v1] = cursor0.getBlob(v1);
                            break;
                        }
                        default: {
                            throw new IllegalStateException();
                        }
                    }
                }
                ((MatrixCursor)cursor1).addRow(arr_object);
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            b.a(cursor0, throwable0);
            throw throwable1;
        }
    label_27:
        b.a(cursor0, null);
        return cursor1;
    }

    private static final int b(Cursor cursor0, String s) {
        if(Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if(s.length() == 0) {
            return -1;
        }
        String[] arr_s = cursor0.getColumnNames();
        k.d(arr_s, "columnNames");
        return a.c(arr_s, s);
    }

    public static final int c(String[] arr_s, String s) {
        k.e(arr_s, "columnNames");
        k.e(s, "name");
        int v = 0;
        for(int v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v];
            if(s1.length() >= s.length() + 2) {
                if(h.m(s1, '.' + s, false, 2, null)) {
                    return v1;
                }
                if(s1.charAt(0) == 0x60 && h.m(s1, '.' + s + '`', false, 2, null)) {
                    return v1;
                }
            }
            ++v;
        }
        return -1;
    }

    public static final int d(Cursor cursor0, String s) {
        k.e(cursor0, "c");
        k.e(s, "name");
        int v = cursor0.getColumnIndex(s);
        if(v >= 0) {
            return v;
        }
        int v1 = cursor0.getColumnIndex('`' + s + '`');
        return v1 >= 0 ? v1 : a.b(cursor0, s);
    }

    public static final int e(Cursor cursor0, String s) {
        String s1;
        k.e(cursor0, "c");
        k.e(s, "name");
        int v = a.d(cursor0, s);
        if(v >= 0) {
            return v;
        }
        try {
            String[] arr_s = cursor0.getColumnNames();
            k.d(arr_s, "c.columnNames");
            s1 = i.s(arr_s, null, null, null, 0, null, null, 0x3F, null);
        }
        catch(Exception exception0) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", exception0);
            s1 = "unknown";
        }
        throw new IllegalArgumentException("column \'" + s + "\' does not exist. Available columns: " + s1);
    }
}

