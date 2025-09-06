package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.g;
import androidx.core.view.t.a;
import androidx.core.view.t;
import androidx.lifecycle.h.b;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import z3.k;

public abstract class h extends Activity implements a, n {
    public static abstract class androidx.core.app.h.a {
    }

    private final g f;
    private final o g;

    public h() {
        this.f = new g();
        this.g = new o(this);
    }

    @Override  // androidx.core.view.t$a
    public boolean W(KeyEvent keyEvent0) {
        k.e(keyEvent0, "event");
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        k.e(keyEvent0, "event");
        View view0 = this.getWindow().getDecorView();
        k.d(view0, "window.decorView");
        return t.d(view0, keyEvent0) ? true : t.e(this, view0, this, keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        k.e(keyEvent0, "event");
        View view0 = this.getWindow().getDecorView();
        k.d(view0, "window.decorView");
        return t.d(view0, keyEvent0) ? true : super.dispatchKeyShortcutEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        x.g.c(this);
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        k.e(bundle0, "outState");
        this.g.m(b.h);
        super.onSaveInstanceState(bundle0);
    }

    public androidx.core.app.h.a p0(Class class0) {
        k.e(class0, "extraDataClass");
        return (androidx.core.app.h.a)this.f.get(class0);
    }

    public void q0(androidx.core.app.h.a h$a0) {
        k.e(h$a0, "extraData");
        Class class0 = h$a0.getClass();
        this.f.put(class0, h$a0);
    }

    protected final boolean r0(String[] arr_s) {
        return !this.s0(arr_s);
    }

    private final boolean s0(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            String s = arr_s[0];
            switch(s.hashCode()) {
                case 0xD98C2911: {
                    return s.equals("--translation") && Build.VERSION.SDK_INT >= 0x1F;
                }
                case 0x5FD0F67: {
                    return s.equals("--dump-dumpable") ? Build.VERSION.SDK_INT >= 33 : false;
                }
                case 0x1C2B8816: {
                    return s.equals("--list-dumpables") ? Build.VERSION.SDK_INT >= 33 : false;
                }
                case 0x4519F64D: {
                    return s.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
                }
                case 1455016274: {
                    return s.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

