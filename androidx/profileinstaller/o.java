package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.concurrent.futures.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public abstract class o {
    static abstract class a {
        static PackageInfo a(PackageManager packageManager0, Context context0) {
            return packageManager0.getPackageInfo("com.fmkorea.m.fmk", PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {
        final int a;
        final int b;
        final long c;
        final long d;

        b(int v, int v1, long v2, long v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        static b a(File file0) {
            try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file0))) {
                return new b(dataInputStream0.readInt(), dataInputStream0.readInt(), dataInputStream0.readLong(), dataInputStream0.readLong());
            }
        }

        void b(File file0) {
            file0.delete();
            try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file0))) {
                dataOutputStream0.writeInt(this.a);
                dataOutputStream0.writeInt(this.b);
                dataOutputStream0.writeLong(this.c);
                dataOutputStream0.writeLong(this.d);
            }
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return this == object0 ? true : object0 != null && object0 instanceof b && (this.b == ((b)object0).b && this.c == ((b)object0).c && this.a == ((b)object0).a && this.d == ((b)object0).d);
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.b, this.c, this.a, this.d});
        }
    }

    public static class c {
        final int a;
        private final boolean b;
        private final boolean c;

        c(int v, boolean z, boolean z1) {
            this.a = v;
            this.c = z1;
            this.b = z;
        }
    }

    private static final d a;
    private static final Object b;
    private static c c;

    static {
        o.a = d.v();
        o.b = new Object();
        o.c = null;
    }

    private static long a(Context context0) {
        PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT < 33 ? packageManager0.getPackageInfo("com.fmkorea.m.fmk", 0).lastUpdateTime : a.a(packageManager0, context0).lastUpdateTime;
    }

    private static c b(int v, boolean z, boolean z1) {
        c o$c0 = new c(v, z, z1);
        o.c = o$c0;
        o.a.r(o$c0);
        return o.c;
    }

    static c c(Context context0, boolean z) {
        b o$b0;
        long v4;
        if(!z) {
            c o$c0 = o.c;
            if(o$c0 != null) {
                return o$c0;
            }
        }
        synchronized(o.b) {
            if(!z) {
                c o$c1 = o.c;
                if(o$c1 != null) {
                    return o$c1;
                }
            }
            int v1 = 0;
            if(Build.VERSION.SDK_INT >= 28 && Build.VERSION.SDK_INT != 30) {
                File file0 = new File(new File("/data/misc/profiles/ref/", "com.fmkorea.m.fmk"), "primary.prof");
                long v2 = file0.length();
                boolean z1 = file0.exists() && v2 > 0L;
                File file1 = new File(new File("/data/misc/profiles/cur/0/", "com.fmkorea.m.fmk"), "primary.prof");
                long v3 = file1.length();
                boolean z2 = file1.exists() && v3 > 0L;
                try {
                    v4 = o.a(context0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    return o.b(0x10000, z1, z2);
                }
                File file2 = new File(context0.getFilesDir(), "profileInstalled");
                if(file2.exists()) {
                    try {
                        o$b0 = b.a(file2);
                    }
                    catch(IOException unused_ex) {
                        return o.b(0x20000, z1, z2);
                    }
                }
                else {
                    o$b0 = null;
                }
                if(o$b0 == null || o$b0.c != v4) {
                label_38:
                    if(z1) {
                        v1 = 1;
                    }
                    else if(z2) {
                        v1 = 2;
                    }
                }
                else {
                    int v5 = o$b0.b;
                    if(v5 != 2) {
                        v1 = v5;
                        goto label_43;
                    }
                    goto label_38;
                }
            label_43:
                if(z && z2 && v1 != 1) {
                    v1 = 2;
                }
                if(o$b0 != null && o$b0.b == 2 && v1 == 1 && v2 < o$b0.d) {
                    v1 = 3;
                }
                b o$b1 = new b(1, v1, v4, v3);
                if(o$b0 == null || !o$b0.equals(o$b1)) {
                    try {
                        o$b1.b(file2);
                    }
                    catch(IOException unused_ex) {
                        v1 = 0x30000;
                    }
                }
                return o.b(v1, z1, z2);
            }
        }
        return o.b(0x40000, false, false);
    }
}

