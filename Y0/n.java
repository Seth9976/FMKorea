package y0;

import android.net.ConnectivityManager;
import android.net.Network;
import z3.k;

public abstract class n {
    public static final Network a(ConnectivityManager connectivityManager0) {
        k.e(connectivityManager0, "<this>");
        return connectivityManager0.getActiveNetwork();
    }
}

