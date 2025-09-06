package T0;

import android.text.TextUtils;
import b1.a;
import com.facebook.h;
import java.io.File;
import java.nio.charset.Charset;

public abstract class e {
    public static File a() {
        Class class0 = e.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            File file0 = new File(h.e().getFilesDir(), "facebook_ml/");
            return !file0.exists() && !file0.mkdirs() ? null : file0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static String b(String s) {
        Class class0 = e.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return TextUtils.join(" ", s.trim().split("\\s+"));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static int[] c(String s, int v) {
        Class class0 = e.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            int[] arr_v = new int[v];
            byte[] arr_b = e.b(s).getBytes(Charset.forName("UTF-8"));
            for(int v1 = 0; v1 < v; ++v1) {
                arr_v[v1] = v1 < arr_b.length ? arr_b[v1] & 0xFF : 0;
            }
            return arr_v;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }
}

