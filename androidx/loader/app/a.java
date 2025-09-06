package androidx.loader.app;

import androidx.lifecycle.M;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public abstract void a(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public static a b(n n0) {
        return new b(n0, ((M)n0).getViewModelStore());
    }

    public abstract void c();
}

