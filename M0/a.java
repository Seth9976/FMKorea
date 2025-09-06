package m0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import z3.g;
import z3.k;

public final class a {
    public static final class m0.a.a {
        private m0.a.a() {
        }

        public m0.a.a(g g0) {
        }

        public static final Lock a(m0.a.a a$a0, String s) {
            return a$a0.b(s);
        }

        private final Lock b(String s) {
            synchronized(a.f) {
                Map map1 = a.f;
                ReentrantLock reentrantLock0 = map1.get(s);
                if(reentrantLock0 == null) {
                    reentrantLock0 = new ReentrantLock();
                    map1.put(s, reentrantLock0);
                }
                return reentrantLock0;
            }
        }
    }

    private final boolean a;
    private final File b;
    private final Lock c;
    private FileChannel d;
    public static final m0.a.a e;
    private static final Map f;

    static {
        a.e = new m0.a.a(null);
        a.f = new HashMap();
    }

    public a(String s, File file0, boolean z) {
        k.e(s, "name");
        k.e(file0, "lockDir");
        super();
        this.a = z;
        File file1 = new File(file0, s + ".lck");
        this.b = file1;
        String s1 = file1.getAbsolutePath();
        k.d(s1, "lockFile.absolutePath");
        this.c = m0.a.a.a(a.e, s1);
    }

    public final void b(boolean z) {
        this.c.lock();
        if(z) {
            try {
                File file0 = this.b.getParentFile();
                if(file0 != null) {
                    file0.mkdirs();
                }
                FileChannel fileChannel0 = new FileOutputStream(this.b).getChannel();
                fileChannel0.lock();
                this.d = fileChannel0;
                return;
            }
            catch(IOException iOException0) {
            }
            this.d = null;
            Log.w("SupportSQLiteLock", "Unable to grab file lock.", iOException0);
        }
    }

    public static void c(a a0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = a0.a;
        }
        a0.b(z);
    }

    public final void d() {
        FileChannel fileChannel0 = this.d;
        if(fileChannel0 != null) {
            try {
                fileChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        this.c.unlock();
    }
}

