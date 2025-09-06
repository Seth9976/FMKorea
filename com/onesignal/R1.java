package com.onesignal;

import android.content.Context;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.k;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.List;

class r1 {
    interface b {
        void a(String arg1, c arg2);
    }

    interface com.onesignal.r1.c {
        void c();
    }

    private final com.onesignal.r1.c a;
    private static final String b = "com.onesignal.r1";

    static {
    }

    r1(com.onesignal.r1.c r1$c0) {
        this.a = r1$c0;
    }

    boolean b(Context context0) {
        class a extends k {
            final FragmentManager a;
            final r1 b;

            a(FragmentManager fragmentManager0) {
                this.a = fragmentManager0;
                super();
            }

            @Override  // androidx.fragment.app.FragmentManager$k
            public void e(FragmentManager fragmentManager0, Fragment fragment0) {
                super.e(fragmentManager0, fragment0);
                if(fragment0 instanceof androidx.fragment.app.c) {
                    this.a.w1(this);
                    r1.this.a.c();
                }
            }
        }

        if(context0 instanceof d) {
            FragmentManager fragmentManager0 = ((d)context0).P0();
            fragmentManager0.g1(new a(this, fragmentManager0), true);
            List list0 = fragmentManager0.t0();
            int v = list0.size();
            if(v > 0) {
                Fragment fragment0 = (Fragment)list0.get(v - 1);
                return fragment0.isVisible() && fragment0 instanceof androidx.fragment.app.c;
            }
        }
        return false;
    }

    boolean c() {
        if(I1.Z() == null) {
            I1.p1(C.i, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if(this.b(I1.Z())) {
                I1.p1(C.i, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            I1.p1(C.j, "AppCompatActivity is not used in this app, skipping \'isDialogFragmentShowing\' check: " + noClassDefFoundError0);
        }
        com.onesignal.a a0 = com.onesignal.b.b();
        boolean z = D1.j(new WeakReference(I1.Z()));
        if(z && a0 != null) {
            a0.d("com.onesignal.r1", this.a);
            I1.p1(C.i, "OSSystemConditionObserver keyboard up detected");
        }
        return !z;
    }
}

