package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class u {
    private static long a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;

    static {
        Class class0 = String.class;
        Class class1 = Trace.class;
        if(Build.VERSION.SDK_INT < 29) {
            try {
                u.a = class1.getField("TRACE_TAG_APP").getLong(null);
                Class class2 = Long.TYPE;
                u.b = class1.getMethod("isTagEnabled", class2);
                Class class3 = Integer.TYPE;
                u.c = class1.getMethod("asyncTraceBegin", class2, class0, class3);
                u.d = class1.getMethod("asyncTraceEnd", class2, class0, class3);
                u.e = class1.getMethod("traceCounter", class2, class0, class3);
            }
            catch(Exception exception0) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", exception0);
            }
        }
    }

    public static void a(String s) {
        Trace.beginSection(s);
    }

    public static void b() {
        Trace.endSection();
    }
}

