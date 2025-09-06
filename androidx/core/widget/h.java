package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

public abstract class h {
    static abstract class a {
        static boolean a(PopupWindow popupWindow0) {
            return popupWindow0.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow0) {
            return popupWindow0.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow0, boolean z) {
            popupWindow0.setOverlapAnchor(z);
        }

        static void d(PopupWindow popupWindow0, int v) {
            popupWindow0.setWindowLayoutType(v);
        }
    }

    public static void a(PopupWindow popupWindow0, boolean z) {
        a.c(popupWindow0, z);
    }

    public static void b(PopupWindow popupWindow0, int v) {
        a.d(popupWindow0, v);
    }

    public static void c(PopupWindow popupWindow0, View view0, int v, int v1, int v2) {
        popupWindow0.showAsDropDown(view0, v, v1, v2);
    }
}

