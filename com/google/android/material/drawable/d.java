package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

public abstract class d {
    static abstract class a {
        static void a(Outline outline0, Path path0) {
            outline0.setConvexPath(path0);
        }
    }

    static abstract class b {
        static void a(Outline outline0, Path path0) {
            e.a(outline0, path0);
        }
    }

    public static Drawable a(Drawable drawable0, Drawable drawable1) {
        return d.b(drawable0, drawable1, -1, -1);
    }

    public static Drawable b(Drawable drawable0, Drawable drawable1, int v, int v1) {
        if(drawable0 == null) {
            return drawable1;
        }
        if(drawable1 == null) {
            return drawable0;
        }
        if(v == -1) {
            v = d.h(drawable0, drawable1);
        }
        if(v1 == -1) {
            v1 = d.g(drawable0, drawable1);
        }
        if(v > drawable0.getIntrinsicWidth() || v1 > drawable0.getIntrinsicHeight()) {
            float f = ((float)v) / ((float)v1);
            if(f >= ((float)drawable0.getIntrinsicWidth()) / ((float)drawable0.getIntrinsicHeight())) {
                int v2 = drawable0.getIntrinsicWidth();
                v1 = (int)(((float)v2) / f);
                v = v2;
            }
            else {
                v1 = drawable0.getIntrinsicHeight();
                v = (int)(f * ((float)v1));
            }
        }
        Drawable drawable2 = new LayerDrawable(new Drawable[]{drawable0, drawable1});
        ((LayerDrawable)drawable2).setLayerSize(1, v, v1);
        ((LayerDrawable)drawable2).setLayerGravity(1, 17);
        return drawable2;
    }

    public static Drawable c(Drawable drawable0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return d.d(drawable0, colorStateList0, porterDuff$Mode0, false);
    }

    private static Drawable d(Drawable drawable0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0, boolean z) {
        if(drawable0 == null) {
            return null;
        }
        if(colorStateList0 != null) {
            drawable0 = drawable0.mutate();
            if(porterDuff$Mode0 != null) {
                androidx.core.graphics.drawable.a.p(drawable0, porterDuff$Mode0);
                return drawable0;
            }
        }
        else if(z) {
            drawable0.mutate();
        }
        return drawable0;
    }

    public static int[] e(int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == 0x10100A0) {
                return arr_v;
            }
            if(v1 == 0) {
                int[] arr_v1 = (int[])arr_v.clone();
                arr_v1[v] = 0x10100A0;
                return arr_v1;
            }
        }
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v2[arr_v.length] = 0x10100A0;
        return arr_v2;
    }

    public static ColorStateList f(Drawable drawable0) {
        if(drawable0 instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable)drawable0).getColor());
        }
        return Build.VERSION.SDK_INT < 29 || !com.google.android.material.drawable.a.a(drawable0) ? null : ((ColorStateListDrawable)drawable0).getColorStateList();
    }

    private static int g(Drawable drawable0, Drawable drawable1) {
        int v = drawable1.getIntrinsicHeight();
        return v == -1 ? drawable0.getIntrinsicHeight() : v;
    }

    private static int h(Drawable drawable0, Drawable drawable1) {
        int v = drawable1.getIntrinsicWidth();
        return v == -1 ? drawable0.getIntrinsicWidth() : v;
    }

    public static AttributeSet i(Context context0, int v, CharSequence charSequence0) {
        try {
            XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if(!TextUtils.equals(xmlResourceParser0.getName(), charSequence0)) {
                throw new XmlPullParserException("Must have a <" + charSequence0 + "> start tag");
            }
            return Xml.asAttributeSet(xmlResourceParser0);
        }
        catch(XmlPullParserException | IOException xmlPullParserException0) {
        }
        Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException("Can\'t load badge resource ID #0x" + Integer.toHexString(v));
        resources$NotFoundException0.initCause(xmlPullParserException0);
        throw resources$NotFoundException0;
    }

    public static void j(Outline outline0, Path path0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            b.a(outline0, path0);
            return;
        }
        if(v >= 29) {
            try {
                a.a(outline0, path0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        else if(path0.isConvex()) {
            a.a(outline0, path0);
        }
    }

    public static PorterDuffColorFilter k(Drawable drawable0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(drawable0.getState(), 0), porterDuff$Mode0);
    }
}

