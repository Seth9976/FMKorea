package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public abstract class h {
    static abstract class a {
        public static Handler a(Looper looper0) {
            return Handler.createAsync(looper0);
        }
    }

    public static Handler a(Looper looper0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return a.a(looper0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, null, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException illegalAccessException0) {
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", illegalAccessException0);
            return new Handler(looper0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(!(throwable0 instanceof Error)) {
                throw new RuntimeException(throwable0);
            }
            throw (Error)throwable0;
        }
    }
}

