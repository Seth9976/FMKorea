package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import androidx.core.graphics.drawable.a;
import androidx.core.view.Y;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

abstract class u {
    static void a(TextInputLayout textInputLayout0, CheckableImageButton checkableImageButton0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(drawable0 != null) {
            drawable0 = drawable0.mutate();
            if(colorStateList0 == null || !colorStateList0.isStateful()) {
                a.o(drawable0, colorStateList0);
            }
            else {
                a.o(drawable0, ColorStateList.valueOf(colorStateList0.getColorForState(u.c(textInputLayout0, checkableImageButton0), colorStateList0.getDefaultColor())));
            }
            if(porterDuff$Mode0 != null) {
                a.p(drawable0, porterDuff$Mode0);
            }
        }
        if(checkableImageButton0.getDrawable() != drawable0) {
            checkableImageButton0.setImageDrawable(drawable0);
        }
    }

    static ImageView.ScaleType b(int v) {
        switch(v) {
            case 0: {
                return ImageView.ScaleType.FIT_XY;
            }
            case 1: {
                return ImageView.ScaleType.FIT_START;
            }
            case 2: {
                return ImageView.ScaleType.FIT_CENTER;
            }
            case 3: {
                return ImageView.ScaleType.FIT_END;
            }
            case 5: {
                return ImageView.ScaleType.CENTER_CROP;
            }
            case 6: {
                return ImageView.ScaleType.CENTER_INSIDE;
            }
            default: {
                return ImageView.ScaleType.CENTER;
            }
        }
    }

    private static int[] c(TextInputLayout textInputLayout0, CheckableImageButton checkableImageButton0) {
        int[] arr_v = textInputLayout0.getDrawableState();
        int[] arr_v1 = checkableImageButton0.getDrawableState();
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        return arr_v2;
    }

    static void d(TextInputLayout textInputLayout0, CheckableImageButton checkableImageButton0, ColorStateList colorStateList0) {
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(checkableImageButton0.getDrawable() != null && colorStateList0 != null && colorStateList0.isStateful()) {
            int v = colorStateList0.getColorForState(u.c(textInputLayout0, checkableImageButton0), colorStateList0.getDefaultColor());
            Drawable drawable1 = drawable0.mutate();
            a.o(drawable1, ColorStateList.valueOf(v));
            checkableImageButton0.setImageDrawable(drawable1);
        }
    }

    static void e(CheckableImageButton checkableImageButton0) {
    }

    private static void f(CheckableImageButton checkableImageButton0, View.OnLongClickListener view$OnLongClickListener0) {
        boolean z = Y.O(checkableImageButton0);
        boolean z1 = false;
        int v = 1;
        if(z || view$OnLongClickListener0 != null) {
            z1 = true;
        }
        checkableImageButton0.setFocusable(z1);
        checkableImageButton0.setClickable(z);
        checkableImageButton0.setPressable(z);
        checkableImageButton0.setLongClickable(view$OnLongClickListener0 != null);
        if(!z1) {
            v = 2;
        }
        Y.x0(checkableImageButton0, v);
    }

    static void g(CheckableImageButton checkableImageButton0, int v) {
        checkableImageButton0.setMinimumWidth(v);
        checkableImageButton0.setMinimumHeight(v);
    }

    static void h(CheckableImageButton checkableImageButton0, View.OnClickListener view$OnClickListener0, View.OnLongClickListener view$OnLongClickListener0) {
        checkableImageButton0.setOnClickListener(view$OnClickListener0);
        u.f(checkableImageButton0, view$OnLongClickListener0);
    }

    static void i(CheckableImageButton checkableImageButton0, View.OnLongClickListener view$OnLongClickListener0) {
        checkableImageButton0.setOnLongClickListener(view$OnLongClickListener0);
        u.f(checkableImageButton0, view$OnLongClickListener0);
    }

    static void j(CheckableImageButton checkableImageButton0, ImageView.ScaleType imageView$ScaleType0) {
        checkableImageButton0.setScaleType(imageView$ScaleType0);
    }
}

