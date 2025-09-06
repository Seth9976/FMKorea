package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;

public abstract class a {
    static abstract class androidx.core.graphics.a.a {
        static ColorFilter a(int v, Object object0) {
            return new BlendModeColorFilter(v, ((BlendMode)object0));
        }
    }

    public static ColorFilter a(int v, b b0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Object object0 = androidx.core.graphics.c.b.a(b0);
            return object0 == null ? null : androidx.core.graphics.a.a.a(v, object0);
        }
        PorterDuff.Mode porterDuff$Mode0 = c.a(b0);
        return porterDuff$Mode0 != null ? new PorterDuffColorFilter(v, porterDuff$Mode0) : null;
    }
}

