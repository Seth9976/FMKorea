package androidx.profileinstaller;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;

abstract class a {
    static abstract class androidx.profileinstaller.a.a {
        static File a(Context context0) {
            return context0.getCodeCacheDir();
        }
    }

    static abstract class b {
        static File a(Context context0) {
            return context0.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return false;
            }
            boolean z = true;
            for(int v = 0; v < arr_file.length; ++v) {
                z = a.a(arr_file[v]) && z;
            }
            return z;
        }
        file0.delete();
        return true;
    }

    static void b(Context context0, androidx.profileinstaller.ProfileInstallReceiver.a profileInstallReceiver$a0) {
        if(a.a((Build.VERSION.SDK_INT < 24 ? androidx.profileinstaller.a.a.a(context0) : b.a(context0)))) {
            profileInstallReceiver$a0.b(14, null);
            return;
        }
        profileInstallReceiver$a0.b(15, null);
    }
}

