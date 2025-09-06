package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build.VERSION;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class d {
    private final AssetManager a;
    private final Executor b;
    private final c c;
    private final byte[] d;
    private final File e;
    private final String f;
    private final String g;
    private final String h;
    private boolean i;
    private e[] j;
    private byte[] k;

    public d(AssetManager assetManager0, Executor executor0, c i$c0, String s, String s1, String s2, File file0) {
        this.i = false;
        this.a = assetManager0;
        this.b = executor0;
        this.c = i$c0;
        this.f = s;
        this.g = s1;
        this.h = s2;
        this.e = file0;
        this.d = new byte[]{0x30, 49, 53, 0};
    }

    private d b(e[] arr_e, byte[] arr_b) {
        try(InputStream inputStream0 = this.h(this.a, this.h)) {
            if(inputStream0 != null) {
                this.j = n.q(inputStream0, n.o(inputStream0, n.b), arr_b, arr_e);
                return this;
            }
        }
        catch(FileNotFoundException fileNotFoundException0) {
            this.c.b(9, fileNotFoundException0);
        }
        catch(IOException iOException0) {
            this.c.b(7, iOException0);
        }
        catch(IllegalStateException illegalStateException0) {
            this.j = null;
            this.c.b(8, illegalStateException0);
        }
        return null;
    }

    private void c() {
        if(!this.i) {
            throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() [...] // 潜在的解密器

    public boolean e() {
        if(this.d == null) {
            this.l(3, Build.VERSION.SDK_INT);
            return false;
        }
        if(!this.e.exists()) {
            try {
                this.e.createNewFile();
            }
            catch(IOException unused_ex) {
                this.l(4, null);
                return false;
            }
        }
        else if(!this.e.canWrite()) {
            this.l(4, null);
            return false;
        }
        this.i = true;
        return true;
    }

    private InputStream f(AssetManager assetManager0) {
        try {
            return this.h(assetManager0, this.g);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            this.c.b(6, fileNotFoundException0);
            return null;
        }
        catch(IOException iOException0) {
            this.c.b(7, iOException0);
            return null;
        }
    }

    // 检测为 Lambda 实现
    private void g(int v, Object object0) [...]

    private InputStream h(AssetManager assetManager0, String s) {
        try {
            return assetManager0.openFd(s).createInputStream();
        }
        catch(FileNotFoundException fileNotFoundException0) {
            String s1 = fileNotFoundException0.getMessage();
            if(s1 != null && s1.contains("compressed")) {
                this.c.a(5, null);
            }
            return null;
        }
    }

    public d i() {
        this.c();
        if(this.d == null) {
            return this;
        }
        InputStream inputStream0 = this.f(this.a);
        if(inputStream0 != null) {
            this.j = this.j(inputStream0);
        }
        e[] arr_e = this.j;
        if(arr_e != null) {
            d d0 = this.b(arr_e, this.d);
            return d0 == null ? this : d0;
        }
        return this;
    }

    private e[] j(InputStream inputStream0) {
        e[] arr_e;
        try {
            try {
                arr_e = n.w(inputStream0, n.o(inputStream0, n.a), this.f);
                goto label_19;
            }
            catch(IOException iOException0) {
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_7;
            }
            this.c.b(7, iOException0);
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            this.c.b(7, iOException1);
        }
        return null;
        try {
        label_7:
            this.c.b(8, illegalStateException0);
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            this.c.b(7, iOException1);
        }
        return null;
        try {
        label_14:
            inputStream0.close();
        }
        catch(IOException iOException2) {
            this.c.b(7, iOException2);
        }
        throw throwable0;
        try {
        label_19:
            inputStream0.close();
        }
        catch(IOException iOException3) {
            this.c.b(7, iOException3);
        }
        return arr_e;
    }

    private static boolean k() [...] // 潜在的解密器

    private void l(int v, Object object0) {
        androidx.profileinstaller.c c0 = () -> this.c.b(v, object0);
        this.b.execute(c0);
    }

    public d m() {
        e[] arr_e = this.j;
        byte[] arr_b = this.d;
        if(arr_e != null && arr_b != null) {
            this.c();
            try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                n.E(byteArrayOutputStream0, arr_b);
                if(!n.B(byteArrayOutputStream0, arr_b, arr_e)) {
                    this.c.b(5, null);
                    this.j = null;
                    return this;
                }
                this.k = byteArrayOutputStream0.toByteArray();
            }
            catch(IOException iOException0) {
                this.c.b(7, iOException0);
            }
            catch(IllegalStateException illegalStateException0) {
                this.c.b(8, illegalStateException0);
            }
            this.j = null;
        }
        return this;
    }

    public boolean n() {
        byte[] arr_b = this.k;
        if(arr_b == null) {
            return false;
        }
        this.c();
        try {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b); FileOutputStream fileOutputStream0 = new FileOutputStream(this.e)) {
                f.l(byteArrayInputStream0, fileOutputStream0);
                this.l(1, null);
                this.k = null;
                this.j = null;
                return true;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                this.l(6, fileNotFoundException0);
            }
            catch(IOException iOException0) {
                this.l(7, iOException0);
            }
            this.k = null;
            this.j = null;
            return false;
        }
        catch(Throwable throwable0) {
            this.k = null;
            this.j = null;
            throw throwable0;
        }
    }
}

