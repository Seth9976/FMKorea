package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public abstract class k {
    public static int a(Context context0, int v, int v1) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.resourceId == 0 ? v1 : v;
    }

    public static boolean b(TypedArray typedArray0, int v, int v1, boolean z) {
        return typedArray0.getBoolean(v, typedArray0.getBoolean(v1, z));
    }

    public static Drawable c(TypedArray typedArray0, int v, int v1) {
        Drawable drawable0 = typedArray0.getDrawable(v);
        return drawable0 == null ? typedArray0.getDrawable(v1) : drawable0;
    }

    public static int d(TypedArray typedArray0, int v, int v1, int v2) {
        return typedArray0.getInt(v, typedArray0.getInt(v1, v2));
    }

    public static boolean e(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v, boolean z) {
        return k.r(xmlPullParser0, s) ? typedArray0.getBoolean(v, z) : z;
    }

    public static int f(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v, int v1) {
        return k.r(xmlPullParser0, s) ? typedArray0.getColor(v, v1) : v1;
    }

    public static ColorStateList g(TypedArray typedArray0, XmlPullParser xmlPullParser0, Resources.Theme resources$Theme0, String s, int v) {
        if(k.r(xmlPullParser0, s)) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(v, typedValue0);
            int v1 = typedValue0.type;
            if(v1 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index " + v + ": " + typedValue0);
            }
            return v1 < 28 || v1 > 0x1F ? c.d(typedArray0.getResources(), typedArray0.getResourceId(v, 0), resources$Theme0) : k.h(typedValue0);
        }
        return null;
    }

    private static ColorStateList h(TypedValue typedValue0) {
        return ColorStateList.valueOf(typedValue0.data);
    }

    public static d i(TypedArray typedArray0, XmlPullParser xmlPullParser0, Resources.Theme resources$Theme0, String s, int v, int v1) {
        if(k.r(xmlPullParser0, s)) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(v, typedValue0);
            if(typedValue0.type >= 28 && typedValue0.type <= 0x1F) {
                return d.b(typedValue0.data);
            }
            d d0 = d.g(typedArray0.getResources(), typedArray0.getResourceId(v, 0), resources$Theme0);
            return d0 == null ? d.b(v1) : d0;
        }
        return d.b(v1);
    }

    public static float j(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v, float f) {
        return k.r(xmlPullParser0, s) ? typedArray0.getFloat(v, f) : f;
    }

    public static int k(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v, int v1) {
        return k.r(xmlPullParser0, s) ? typedArray0.getInt(v, v1) : v1;
    }

    public static int l(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v, int v1) {
        return k.r(xmlPullParser0, s) ? typedArray0.getResourceId(v, v1) : v1;
    }

    public static String m(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v) {
        return k.r(xmlPullParser0, s) ? typedArray0.getString(v) : null;
    }

    public static int n(TypedArray typedArray0, int v, int v1, int v2) {
        return typedArray0.getResourceId(v, typedArray0.getResourceId(v1, v2));
    }

    public static String o(TypedArray typedArray0, int v, int v1) {
        String s = typedArray0.getString(v);
        return s == null ? typedArray0.getString(v1) : s;
    }

    public static CharSequence p(TypedArray typedArray0, int v, int v1) {
        CharSequence charSequence0 = typedArray0.getText(v);
        return charSequence0 == null ? typedArray0.getText(v1) : charSequence0;
    }

    public static CharSequence[] q(TypedArray typedArray0, int v, int v1) {
        CharSequence[] arr_charSequence = typedArray0.getTextArray(v);
        return arr_charSequence == null ? typedArray0.getTextArray(v1) : arr_charSequence;
    }

    public static boolean r(XmlPullParser xmlPullParser0, String s) {
        return xmlPullParser0.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }

    public static TypedArray s(Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, int[] arr_v) {
        return resources$Theme0 == null ? resources0.obtainAttributes(attributeSet0, arr_v) : resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v, 0, 0);
    }

    public static TypedValue t(TypedArray typedArray0, XmlPullParser xmlPullParser0, String s, int v) {
        return k.r(xmlPullParser0, s) ? typedArray0.peekValue(v) : null;
    }
}

