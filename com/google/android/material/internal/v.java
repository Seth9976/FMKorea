package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;

public abstract class v {
    static abstract class a {
        static Rect a(WindowManager windowManager0) {
            Display display0 = windowManager0.getDefaultDisplay();
            Point point0 = new Point();
            display0.getRealSize(point0);
            Rect rect0 = new Rect();
            rect0.right = point0.x;
            rect0.bottom = point0.y;
            return rect0;
        }
    }

    static abstract class b {
        static Rect a(WindowManager windowManager0) {
            return x.a(w.a(windowManager0));
        }
    }

    static {
    }

    public static Rect a(Context context0) {
        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
        return Build.VERSION.SDK_INT < 30 ? a.a(windowManager0) : b.a(windowManager0);
    }
}

