package o2;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class f {
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;

    public f(Context context0) {
        File file0 = context0.getFilesDir();
        this.a = file0;
        File file1 = f.q(new File(file0, ".com.google.firebase.crashlytics.files.v2;" + f.u(Application.getProcessName())));
        this.b = file1;
        this.c = f.q(new File(file1, "open-sessions"));
        this.d = f.q(new File(file1, "reports"));
        this.e = f.q(new File(file1, "priority-reports"));
        this.f = f.q(new File(file1, "native-reports"));
    }

    private void a(File file0) {
        if(file0.exists() && f.s(file0)) {
            g2.f.f().b("Deleted previous Crashlytics file system: " + file0.getPath());
        }
    }

    public void b() {
        this.a(new File(this.a, ".com.google.firebase.crashlytics"));
        this.a(new File(this.a, ".com.google.firebase.crashlytics-ndk"));
        this.a(new File(this.a, ".com.google.firebase.crashlytics.files.v1"));
    }

    public boolean c(String s) {
        return f.s(new File(this.c, s));
    }

    public List d() {
        return f.t(this.c.list());
    }

    public File e(String s) {
        return new File(this.b, s);
    }

    public List f(FilenameFilter filenameFilter0) {
        return f.t(this.b.listFiles(filenameFilter0));
    }

    public File g(String s) {
        return new File(this.f, s);
    }

    public List h() {
        return f.t(this.f.listFiles());
    }

    public File i(String s) {
        return f.r(new File(this.n(s), "native"));
    }

    public File j(String s) {
        return new File(this.e, s);
    }

    public List k() {
        return f.t(this.e.listFiles());
    }

    public File l(String s) {
        return new File(this.d, s);
    }

    public List m() {
        return f.t(this.d.listFiles());
    }

    private File n(String s) {
        return f.r(new File(this.c, s));
    }

    public File o(String s, String s1) {
        return new File(this.n(s), s1);
    }

    public List p(String s, FilenameFilter filenameFilter0) {
        return f.t(this.n(s).listFiles(filenameFilter0));
    }

    private static File q(File file0) {
        synchronized(f.class) {
            if(file0.exists()) {
                if(file0.isDirectory()) {
                    return file0;
                }
                g2.f.f().b("Unexpected non-directory file: " + file0 + "; deleting file and creating new directory.");
                file0.delete();
            }
            if(!file0.mkdirs()) {
                g2.f.f().d("Could not create Crashlytics-specific directory: " + file0);
            }
            return file0;
        }
    }

    private static File r(File file0) {
        file0.mkdirs();
        return file0;
    }

    static boolean s(File file0) {
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                f.s(arr_file[v]);
            }
        }
        return file0.delete();
    }

    private static List t(Object[] arr_object) {
        return arr_object == null ? Collections.emptyList() : Arrays.asList(arr_object);
    }

    static String u(String s) {
        return s.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private static boolean v() [...] // 潜在的解密器
}

