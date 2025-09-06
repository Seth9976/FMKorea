package P1;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

public abstract class b {
    public static TypedValue a(Context context0, int v) {
        TypedValue typedValue0 = new TypedValue();
        return context0.getTheme().resolveAttribute(v, typedValue0, true) ? typedValue0 : null;
    }

    public static boolean b(Context context0, int v, boolean z) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null || typedValue0.type != 18 ? z : typedValue0.data != 0;
    }

    public static int c(Context context0, int v, int v1) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null || typedValue0.type != 16 ? v1 : typedValue0.data;
    }

    public static int d(Context context0, int v, String s) {
        return b.e(context0, v, s).data;
    }

    public static TypedValue e(Context context0, int v, String s) {
        TypedValue typedValue0 = b.a(context0, v);
        if(typedValue0 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context0.getResources().getResourceName(v)));
        }
        return typedValue0;
    }

    public static TypedValue f(View view0, int v) {
        return b.e(view0.getContext(), v, view0.getClass().getCanonicalName());
    }
}

