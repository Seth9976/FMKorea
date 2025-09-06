package y;

import android.net.ConnectivityManager;

public abstract class a {
    public static boolean a(ConnectivityManager connectivityManager0) {
        return connectivityManager0.isActiveNetworkMetered();
    }
}

