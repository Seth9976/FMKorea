package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

public abstract class b {
    static abstract class a {
        static void a(CheckedTextView checkedTextView0, ColorStateList colorStateList0) {
            checkedTextView0.setCheckMarkTintList(colorStateList0);
        }

        static void b(CheckedTextView checkedTextView0, PorterDuff.Mode porterDuff$Mode0) {
            checkedTextView0.setCheckMarkTintMode(porterDuff$Mode0);
        }
    }

    public static Drawable a(CheckedTextView checkedTextView0) {
        return checkedTextView0.getCheckMarkDrawable();
    }

    public static void b(CheckedTextView checkedTextView0, ColorStateList colorStateList0) {
        a.a(checkedTextView0, colorStateList0);
    }

    public static void c(CheckedTextView checkedTextView0, PorterDuff.Mode porterDuff$Mode0) {
        a.b(checkedTextView0, porterDuff$Mode0);
    }
}

