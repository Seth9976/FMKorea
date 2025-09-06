package androidx.work;

import java.util.List;

public abstract class h {
    private static final String a;

    static {
        h.a = "WM-InputMerger";
    }

    public static h a(String s) {
        try {
            return (h)Class.forName(s).getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception exception0) {
            k.e().d("WM-InputMerger", "Trouble instantiating + " + s, exception0);
            return null;
        }
    }

    public abstract d b(List arg1);
}

