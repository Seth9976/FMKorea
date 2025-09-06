package m1;

import android.content.Context;
import java.io.Closeable;
import u1.d;

abstract class v implements Closeable {
    interface a {
        a a(Context arg1);

        v build();
    }

    abstract d a();

    abstract u b();

    @Override
    public void close() {
        this.a().close();
    }
}

