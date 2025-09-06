package androidx.core.content;

import B.c;
import android.content.Context;
import android.os.Process;
import androidx.core.app.f;

public abstract class d {
    public static int a(Context context0, String s, int v, int v1, String s1) {
        if(context0.checkPermission(s, v, v1) == -1) {
            return -1;
        }
        String s2 = f.c(s);
        if(s2 == null) {
            return 0;
        }
        if(s1 == null) {
            String[] arr_s = context0.getPackageManager().getPackagesForUid(v1);
            if(arr_s != null && arr_s.length > 0) {
                s1 = arr_s[0];
                return (Process.myUid() != v1 || !c.a("com.fmkorea.m.fmk", s1) ? f.b(context0, s2, s1) : f.a(context0, v1, s2, s1)) == 0 ? 0 : -2;
            }
            return -1;
        }
        return (Process.myUid() != v1 || !c.a("com.fmkorea.m.fmk", s1) ? f.b(context0, s2, s1) : f.a(context0, v1, s2, s1)) == 0 ? 0 : -2;
    }

    public static int b(Context context0, String s) {
        return d.a(context0, s, Process.myPid(), Process.myUid(), "com.fmkorea.m.fmk");
    }
}

