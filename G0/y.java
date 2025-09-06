package g0;

import android.content.Context;
import android.util.Log;
import i0.b;
import i0.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import k0.h;
import m0.a;
import z3.k;

public final class y implements g, h {
    private final Context f;
    private final String g;
    private final File h;
    private final Callable i;
    private final int j;
    private final h k;
    private f l;
    private boolean m;

    public y(Context context0, String s, File file0, Callable callable0, int v, h h0) {
        k.e(context0, "context");
        k.e(h0, "delegate");
        super();
        this.f = context0;
        this.g = s;
        this.h = file0;
        this.i = callable0;
        this.j = v;
        this.k = h0;
    }

    @Override  // k0.h
    public k0.g G() {
        if(!this.m) {
            this.j(true);
            this.m = true;
        }
        return this.a().G();
    }

    @Override  // g0.g
    public h a() {
        return this.k;
    }

    private final void b(File file0, boolean z) {
        InputStream inputStream0;
        ReadableByteChannel readableByteChannel0;
        if(this.g == null) {
            if(this.h != null) {
                readableByteChannel0 = new FileInputStream(this.h).getChannel();
                k.d(readableByteChannel0, "FileInputStream(copyFromFile).channel");
                goto label_16;
            }
            Callable callable0 = this.i;
            if(callable0 == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                inputStream0 = (InputStream)callable0.call();
            }
            catch(Exception exception0) {
                throw new IOException("inputStreamCallable exception on call", exception0);
            }
            readableByteChannel0 = Channels.newChannel(inputStream0);
            k.d(readableByteChannel0, "newChannel(inputStream)");
        }
        else {
            readableByteChannel0 = Channels.newChannel(this.f.getAssets().open(this.g));
            k.d(readableByteChannel0, "newChannel(context.assets.open(copyFromAssetPath))");
        }
    label_16:
        File file1 = File.createTempFile("room-copy-helper", ".tmp", this.f.getCacheDir());
        file1.deleteOnExit();
        FileChannel fileChannel0 = new FileOutputStream(file1).getChannel();
        k.d(fileChannel0, "output");
        c.a(readableByteChannel0, fileChannel0);
        File file2 = file0.getParentFile();
        if(file2 != null && !file2.exists() && !file2.mkdirs()) {
            throw new IOException("Failed to create directories for " + file0.getAbsolutePath());
        }
        k.d(file1, "intermediateFile");
        this.f(file1, z);
        if(!file1.renameTo(file0)) {
            throw new IOException("Failed to move intermediate file (" + file1.getAbsolutePath() + ") to destination (" + file0.getAbsolutePath() + ").");
        }
    }

    @Override  // k0.h
    public void close() {
        synchronized(this) {
            this.a().close();
            this.m = false;
        }
    }

    private final void f(File file0, boolean z) {
        f f0 = this.l;
        if(f0 == null) {
            k.p("databaseConfiguration");
            f0 = null;
        }
        f0.getClass();
    }

    public final void g(f f0) {
        k.e(f0, "databaseConfiguration");
        this.l = f0;
    }

    @Override  // k0.h
    public String getDatabaseName() {
        return this.a().getDatabaseName();
    }

    private final void j(boolean z) {
        String s = this.getDatabaseName();
        if(s == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File file0 = this.f.getDatabasePath(s);
        f f0 = this.l;
        f f1 = null;
        if(f0 == null) {
            k.p("databaseConfiguration");
            f0 = null;
        }
        File file1 = this.f.getFilesDir();
        k.d(file1, "context.filesDir");
        a a0 = new a(s, file1, f0.s);
        try {
            a.c(a0, false, 1, null);
            if(!file0.exists()) {
                try {
                    k.d(file0, "databaseFile");
                    this.b(file0, z);
                }
                catch(IOException iOException0) {
                    throw new RuntimeException("Unable to copy database file.", iOException0);
                }
                return;
            }
            try {
                k.d(file0, "databaseFile");
                int v1 = b.c(file0);
            }
            catch(IOException iOException1) {
                Log.w("ROOM", "Unable to read database version.", iOException1);
                return;
            }
            if(v1 == this.j) {
                return;
            }
            f f2 = this.l;
            if(f2 == null) {
                k.p("databaseConfiguration");
            }
            else {
                f1 = f2;
            }
            if(f1.a(v1, this.j)) {
                return;
            }
            if(this.f.deleteDatabase(s)) {
                try {
                    this.b(file0, z);
                }
                catch(IOException iOException2) {
                    Log.w("ROOM", "Unable to copy database file.", iOException2);
                }
            }
            else {
                Log.w("ROOM", "Failed to delete database file (" + s + ") for a copy destructive migration.");
            }
        }
        finally {
            a0.d();
        }
    }

    @Override  // k0.h
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a().setWriteAheadLoggingEnabled(z);
    }
}

