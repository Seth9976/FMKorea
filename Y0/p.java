package y0;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import z3.k;

public abstract class p {
    public static final void a(ConnectivityManager connectivityManager0, ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0) {
        k.e(connectivityManager0, "<this>");
        k.e(connectivityManager$NetworkCallback0, "networkCallback");
        connectivityManager0.registerDefaultNetworkCallback(connectivityManager$NetworkCallback0);
    }
}

