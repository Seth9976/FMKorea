package i0;

import G3.h;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import g0.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import k0.g;
import k0.j;
import m3.o;
import z3.k;

public abstract class b {
    public static final void a(g g0) {
        k.e(g0, "db");
        List list0 = o.c();
        Cursor cursor0 = g0.H("SELECT name FROM sqlite_master WHERE type = \'trigger\'");
        try {
            while(true) {
                if(!cursor0.moveToNext()) {
                    goto label_11;
                }
                list0.add(cursor0.getString(0));
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            w3.b.a(cursor0, throwable0);
            throw throwable1;
        }
    label_11:
        w3.b.a(cursor0, null);
        for(Object object0: o.a(list0)) {
            String s = (String)object0;
            k.d(s, "triggerName");
            if(h.u(s, "room_fts_content_sync_", false, 2, null)) {
                g0.k("DROP TRIGGER IF EXISTS " + s);
            }
        }
    }

    public static final Cursor b(u u0, j j0, boolean z, CancellationSignal cancellationSignal0) {
        k.e(u0, "db");
        k.e(j0, "sqLiteQuery");
        Cursor cursor0 = u0.x(j0, cancellationSignal0);
        if(z && cursor0 instanceof AbstractWindowedCursor) {
            int v = ((AbstractWindowedCursor)cursor0).getCount();
            return (((AbstractWindowedCursor)cursor0).hasWindow() ? ((AbstractWindowedCursor)cursor0).getWindow().getNumRows() : v) >= v ? cursor0 : a.a(cursor0);
        }
        return cursor0;
    }

    public static final int c(File file0) {
        int v;
        k.e(file0, "databaseFile");
        FileChannel fileChannel0 = new FileInputStream(file0).getChannel();
        try {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            fileChannel0.tryLock(60L, 4L, true);
            fileChannel0.position(60L);
            if(fileChannel0.read(byteBuffer0) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBuffer0.rewind();
            v = byteBuffer0.getInt();
        }
        catch(Throwable throwable0) {
            w3.b.a(fileChannel0, throwable0);
            throw throwable0;
        }
        w3.b.a(fileChannel0, null);
        return v;
    }
}

