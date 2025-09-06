package y0;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import z3.k;

public abstract class m {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager0, Network network0) {
        k.e(connectivityManager0, "<this>");
        return connectivityManager0.getNetworkCapabilities(network0);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities0, int v) {
        k.e(networkCapabilities0, "<this>");
        return networkCapabilities0.hasCapability(v);
    }

    public static final void c(ConnectivityManager connectivityManager0, ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0) {
        k.e(connectivityManager0, "<this>");
        k.e(connectivityManager$NetworkCallback0, "networkCallback");
        connectivityManager0.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
    }
}

