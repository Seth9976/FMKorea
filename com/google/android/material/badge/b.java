package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.ParcelableSparseArray;

public abstract class b {
    public static final boolean a;

    static {
        b.a = false;
    }

    public static void a(a a0, View view0, FrameLayout frameLayout0) {
        b.e(a0, view0, frameLayout0);
        if(a0.i() != null) {
            a0.i().setForeground(a0);
            return;
        }
        if(b.a) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
        view0.getOverlay().add(a0);
    }

    public static SparseArray b(Context context0, ParcelableSparseArray parcelableSparseArray0) {
        SparseArray sparseArray0 = new SparseArray(parcelableSparseArray0.size());
        for(int v = 0; v < parcelableSparseArray0.size(); ++v) {
            int v1 = parcelableSparseArray0.keyAt(v);
            State badgeState$State0 = (State)parcelableSparseArray0.valueAt(v);
            sparseArray0.put(v1, (badgeState$State0 == null ? null : a.d(context0, badgeState$State0)));
        }
        return sparseArray0;
    }

    public static ParcelableSparseArray c(SparseArray sparseArray0) {
        ParcelableSparseArray parcelableSparseArray0 = new ParcelableSparseArray();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            int v1 = sparseArray0.keyAt(v);
            a a0 = (a)sparseArray0.valueAt(v);
            parcelableSparseArray0.put(v1, (a0 == null ? null : a0.s()));
        }
        return parcelableSparseArray0;
    }

    public static void d(a a0, View view0) {
        if(a0 == null) {
            return;
        }
        if(!b.a && a0.i() == null) {
            view0.getOverlay().remove(a0);
            return;
        }
        a0.i().setForeground(null);
    }

    public static void e(a a0, View view0, FrameLayout frameLayout0) {
        Rect rect0 = new Rect();
        view0.getDrawingRect(rect0);
        a0.setBounds(rect0);
        a0.P(view0, frameLayout0);
    }

    public static void f(Rect rect0, float f, float f1, float f2, float f3) {
        rect0.set(((int)(f - f2)), ((int)(f1 - f3)), ((int)(f + f2)), ((int)(f1 + f3)));
    }
}

