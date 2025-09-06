package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

public abstract class c {
    static abstract class a {
        static ColorStateList a(CompoundButton compoundButton0) {
            return compoundButton0.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton0) {
            return compoundButton0.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton0, ColorStateList colorStateList0) {
            compoundButton0.setButtonTintList(colorStateList0);
        }

        static void d(CompoundButton compoundButton0, PorterDuff.Mode porterDuff$Mode0) {
            compoundButton0.setButtonTintMode(porterDuff$Mode0);
        }
    }

    static abstract class b {
        static Drawable a(CompoundButton compoundButton0) {
            return compoundButton0.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton0) {
        return b.a(compoundButton0);
    }

    public static ColorStateList b(CompoundButton compoundButton0) {
        return a.a(compoundButton0);
    }

    public static PorterDuff.Mode c(CompoundButton compoundButton0) {
        return a.b(compoundButton0);
    }

    public static void d(CompoundButton compoundButton0, ColorStateList colorStateList0) {
        a.c(compoundButton0, colorStateList0);
    }

    public static void e(CompoundButton compoundButton0, PorterDuff.Mode porterDuff$Mode0) {
        a.d(compoundButton0, porterDuff$Mode0);
    }
}

