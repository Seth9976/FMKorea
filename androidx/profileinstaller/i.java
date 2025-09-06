package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import e0.m;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class i {
    class a implements c {
        a() {
            super();
        }

        @Override  // androidx.profileinstaller.i$c
        public void a(int v, Object object0) {
        }

        @Override  // androidx.profileinstaller.i$c
        public void b(int v, Object object0) {
        }
    }

    class b implements c {
        b() {
            super();
        }

        @Override  // androidx.profileinstaller.i$c
        public void a(int v, Object object0) {
            String s;
            switch(v) {
                case 1: {
                    s = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
                    break;
                }
                case 2: {
                    s = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                    break;
                }
                case 3: {
                    s = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                    break;
                }
                case 4: {
                    s = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                    break;
                }
                case 5: {
                    s = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                    break;
                }
                default: {
                    s = "";
                }
            }
            Log.d("ProfileInstaller", s);
        }

        @Override  // androidx.profileinstaller.i$c
        public void b(int v, Object object0) {
            String s;
            switch(v) {
                case 1: {
                    s = "RESULT_INSTALL_SUCCESS";
                    break;
                }
                case 2: {
                    s = "RESULT_ALREADY_INSTALLED";
                    break;
                }
                case 3: {
                    s = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                }
                case 4: {
                    s = "RESULT_NOT_WRITABLE";
                    break;
                }
                case 5: {
                    s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                }
                case 6: {
                    s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                }
                case 7: {
                    s = "RESULT_IO_EXCEPTION";
                    break;
                }
                case 8: {
                    s = "RESULT_PARSE_EXCEPTION";
                    break;
                }
                case 10: {
                    s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                }
                case 11: {
                    s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                }
                default: {
                    s = "";
                }
            }
            if(v != 6 && v != 7 && v != 8) {
                Log.d("ProfileInstaller", s);
                return;
            }
            Log.e("ProfileInstaller", s, ((Throwable)object0));
        }
    }

    public interface c {
        void a(int arg1, Object arg2);

        void b(int arg1, Object arg2);
    }

    private static final c a;
    static final c b;

    static {
        i.a = new a();
        i.b = new b();
    }

    static boolean b(File file0) {
        return new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(Context context0, Executor executor0, c i$c0) {
        i.b(context0.getFilesDir());
        i.g(executor0, i$c0, 11, null);
    }

    static boolean d(PackageInfo packageInfo0, File file0, c i$c0) {
        File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z = false;
        if(!file1.exists()) {
            return false;
        }
        try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file1))) {
            if(dataInputStream0.readLong() == packageInfo0.lastUpdateTime) {
                goto label_10;
            }
            return z;
        }
        catch(IOException unused_ex) {
            return false;
        }
    label_10:
        i$c0.b(2, null);
        return true;
    }

    static void f(PackageInfo packageInfo0, File file0) {
        File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file1))) {
            dataOutputStream0.writeLong(packageInfo0.lastUpdateTime);
        }
        catch(IOException unused_ex) {
        }
    }

    static void g(Executor executor0, c i$c0, int v, Object object0) {
        executor0.execute(new h(i$c0, v, object0));
    }

    private static boolean h(AssetManager assetManager0, String s, PackageInfo packageInfo0, File file0, String s1, Executor executor0, c i$c0) {
        d d0 = new d(assetManager0, executor0, i$c0, s1, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", s), "primary.prof"));
        if(!d0.e()) {
            return false;
        }
        boolean z = d0.i().m().n();
        if(z) {
            i.f(packageInfo0, file0);
        }
        return z;
    }

    public static void i(Context context0) {
        i.j(context0, new m(), i.a);
    }

    public static void j(Context context0, Executor executor0, c i$c0) {
        i.k(context0, executor0, i$c0, false);
    }

    static void k(Context context0, Executor executor0, c i$c0, boolean z) {
        Context context1 = context0.getApplicationContext();
        ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
        AssetManager assetManager0 = context1.getAssets();
        String s = new File(applicationInfo0.sourceDir).getName();
        PackageManager packageManager0 = context0.getPackageManager();
        boolean z1 = false;
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.fmkorea.m.fmk", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            i$c0.b(7, packageManager$NameNotFoundException0);
            o.c(context0, false);
            return;
        }
        File file0 = context0.getFilesDir();
        if(!z && i.d(packageInfo0, file0, i$c0)) {
            Log.d("ProfileInstaller", "Skipping profile installation for com.fmkorea.m.fmk");
            o.c(context0, false);
            return;
        }
        Log.d("ProfileInstaller", "Installing profile for com.fmkorea.m.fmk");
        if(i.h(assetManager0, "com.fmkorea.m.fmk", packageInfo0, file0, s, executor0, i$c0) && z) {
            z1 = true;
        }
        o.c(context0, z1);
    }

    static void l(Context context0, Executor executor0, c i$c0) {
        PackageInfo packageInfo0;
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            packageInfo0 = packageManager0.getPackageInfo("com.fmkorea.m.fmk", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            i.g(executor0, i$c0, 7, packageManager$NameNotFoundException0);
            return;
        }
        i.f(packageInfo0, context0.getFilesDir());
        i.g(executor0, i$c0, 10, null);
    }
}

