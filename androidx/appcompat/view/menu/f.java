package androidx.appcompat.view.menu;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.c;
import e.g;

class f implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, a {
    private e f;
    private c g;
    androidx.appcompat.view.menu.c h;
    private a i;

    public f(e e0) {
        this.f = e0;
    }

    public void a() {
        c c0 = this.g;
        if(c0 != null) {
            c0.dismiss();
        }
    }

    @Override  // androidx.appcompat.view.menu.j$a
    public void b(e e0, boolean z) {
        if(z || e0 == this.f) {
            this.a();
        }
        a j$a0 = this.i;
        if(j$a0 != null) {
            j$a0.b(e0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.j$a
    public boolean c(e e0) {
        return this.i == null ? false : this.i.c(e0);
    }

    public void d(IBinder iBinder0) {
        e e0 = this.f;
        androidx.appcompat.app.c.a c$a0 = new androidx.appcompat.app.c.a(e0.w());
        androidx.appcompat.view.menu.c c0 = new androidx.appcompat.view.menu.c(c$a0.b(), g.j);
        this.h = c0;
        c0.g(this);
        this.f.b(this.h);
        c$a0.c(this.h.a(), this);
        View view0 = e0.A();
        if(view0 == null) {
            c$a0.e(e0.y()).q(e0.z());
        }
        else {
            c$a0.d(view0);
        }
        c$a0.k(this);
        c c1 = c$a0.a();
        this.g = c1;
        c1.setOnDismissListener(this);
        WindowManager.LayoutParams windowManager$LayoutParams0 = this.g.getWindow().getAttributes();
        windowManager$LayoutParams0.type = 1003;
        if(iBinder0 != null) {
            windowManager$LayoutParams0.token = iBinder0;
        }
        windowManager$LayoutParams0.flags |= 0x20000;
        this.g.show();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface0, int v) {
        this.f.O(((androidx.appcompat.view.menu.g)this.h.a().getItem(v)), 0);
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface0) {
        this.h.b(this.f, true);
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        if(v == 4 || v == 82) {
            if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                Window window0 = this.g.getWindow();
                if(window0 != null) {
                    View view0 = window0.getDecorView();
                    if(view0 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState0 = view0.getKeyDispatcherState();
                        if(keyEvent$DispatcherState0 != null) {
                            keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                            return true;
                        }
                    }
                }
            }
            else if(keyEvent0.getAction() == 1 && !keyEvent0.isCanceled()) {
                Window window1 = this.g.getWindow();
                if(window1 != null) {
                    View view1 = window1.getDecorView();
                    if(view1 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState1 = view1.getKeyDispatcherState();
                        if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0)) {
                            this.f.e(true);
                            dialogInterface0.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f.performShortcut(v, keyEvent0, 0);
    }
}

