package androidx.work.impl;

import android.content.Context;
import java.io.File;
import z3.k;

public final class a {
    public static final a a;

    static {
        a.a = new a();
    }

    public final File a(Context context0) {
        k.e(context0, "context");
        File file0 = context0.getNoBackupFilesDir();
        k.d(file0, "context.noBackupFilesDir");
        return file0;
    }
}

