package e2;

import android.os.StrictMode.ThreadPolicy.Builder;

public abstract class a {
    public static StrictMode.ThreadPolicy.Builder a(StrictMode.ThreadPolicy.Builder strictMode$ThreadPolicy$Builder0) {
        return strictMode$ThreadPolicy$Builder0.detectUnbufferedIo();
    }
}

