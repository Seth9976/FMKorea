package k0;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

public interface g extends Closeable {
    void A();

    int B(String arg1, int arg2, ContentValues arg3, String arg4, Object[] arg5);

    Cursor C(j arg1);

    Cursor H(String arg1);

    void I();

    String S();

    boolean T();

    boolean W();

    void c();

    boolean h();

    List i();

    void k(String arg1);

    k n(String arg1);

    Cursor p(j arg1, CancellationSignal arg2);

    void y();

    void z(String arg1, Object[] arg2);
}

