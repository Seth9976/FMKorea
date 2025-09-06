package w0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import u0.b;
import y.a;
import y0.m;
import y0.n;
import z0.c;

public abstract class k {
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        z3.k.d("WM-NetworkStateTracker", "tagWithPrefix(\"NetworkStateTracker\")");
        k.a = "WM-NetworkStateTracker";
    }

    public static final h a(Context context0, c c0) {
        z3.k.e(context0, "context");
        z3.k.e(c0, "taskExecutor");
        return Build.VERSION.SDK_INT >= 24 ? new j(context0, c0) : new l(context0, c0);
    }

    // 去混淆评级： 低(20)
    public static final String b() [...] // 潜在的解密器

    public static final b c(ConnectivityManager connectivityManager0) {
        z3.k.e(connectivityManager0, "<this>");
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        boolean z = false;
        boolean z1 = networkInfo0 != null && networkInfo0.isConnected();
        boolean z2 = k.d(connectivityManager0);
        boolean z3 = a.a(connectivityManager0);
        if(networkInfo0 != null && !networkInfo0.isRoaming()) {
            z = true;
        }
        return new b(z1, z2, z3, z);
    }

    public static final boolean d(ConnectivityManager connectivityManager0) {
        z3.k.e(connectivityManager0, "<this>");
        try {
            NetworkCapabilities networkCapabilities0 = m.a(connectivityManager0, n.a(connectivityManager0));
            if(networkCapabilities0 != null) {
                return m.b(networkCapabilities0, 16);
            }
        }
        catch(SecurityException securityException0) {
            androidx.work.k.e().d("WM-NetworkStateTracker", "Unable to validate active network", securityException0);
        }
        return false;
    }
}

