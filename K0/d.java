package k0;

import android.content.Context;
import java.io.File;
import z3.k;

public final class d {
    public static final d a;

    static {
        d.a = new d();
    }

    public static final File a(Context context0) {
        k.e(context0, "context");
        File file0 = context0.getNoBackupFilesDir();
        k.d(file0, "context.noBackupFilesDir");
        return file0;
    }
}

